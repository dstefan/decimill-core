
parser grammar ScenarioParser;

@header {
    package decimill.parser;
    import decimill.*;
    import decimill.expression.*;
    import decimill.scenario.*;
}

tokens {
    InlineStart, BlockStart, EOL, Character, 
    Word, Text, ID, Int, Dbl, Procent, Allowed, Str,
    Dot, Colon, Comma, Quote, FromTo, Refinement,
    Equals, PlusEq, MinusEq, TimesEq, DivEq, Plus, Minus, Times, Div, Power, LowerThan, GreaterThan, IsEqual,
    LBracket, RBracket, UBracket, LParent, RParent, LCurly, RCurly,
    InlineEnd, BlockEnd, WS, BNL, ERR
}

@members {
    Scenario scenario;
}

parse [Scenario s]

    @init {
        scenario = s;
    }

    : element+ EOF
    ;

element
    : ( str )+
    | InlineStart inlineCode InlineEnd
    | BlockStart blockCode ( BlockEnd | EOF )
    ;

str
    : Character+ EOL?
    ;

inlineCode
    : change | assignment
    ;

blockCode
    : ( change | assignment )+
    ;

name
    : Word | Text
    ;

namespace
    : Word
    ;

change
    : reference
        ( Equals expression                 { scenario.addChange($reference.node.toReference(), $expression.node); }
        | PlusEq expression                 { scenario.addChange($reference.node.toReference(), new PlusNode($reference.node, $expression.node)); }
        | MinusEq expression                { scenario.addChange($reference.node.toReference(), new MinusNode($reference.node, $expression.node)); }
        | TimesEq expression                { scenario.addChange($reference.node.toReference(), new TimesNode($reference.node, $expression.node)); }
        | DivEq expression                  { scenario.addChange($reference.node.toReference(), new DivNode($reference.node, $expression.node)); }
        )
    ;

assignment
    : variable Equals expression            { scenario.assign($variable.text, $expression.node); }
    ;

expression returns [ExprNode node]
    : expr_add                              { $node = $expr_add.node; }
    ;

expr_add returns [ExprNode node]
    : expr_sub                              { $node = $expr_sub.node; }
        ( Plus expr_sub                     { $node = new PlusNode($node, $expr_sub.node); }
        )*
    ;

expr_sub returns [ExprNode node]
    : expr_mult                             { $node = $expr_mult.node; }
        ( Minus expr_mult                   { $node = new MinusNode($node, $expr_mult.node); }
        )*
    ;

expr_mult returns [ExprNode node]
    : expr_div                              { $node = $expr_div.node; }
        ( Times expr_div                    { $node = new TimesNode($node, $expr_div.node); }
        )*
    ;

expr_div returns [ExprNode node]
    : expr_pow                              { $node = $expr_pow.node; }
        ( Div expr_pow                      { $node = new DivNode($node, $expr_pow.node); }
        )*
    ;

expr_pow returns [ExprNode node]
    : expr_lt                               { $node = $expr_lt.node; }
        ( Power expr_lt                     { $node = new PowNode($node, $expr_lt.node); }
        )*
    ;

expr_lt returns [ExprNode node]
    : expr_gt                               { $node = $expr_gt.node; }
        ( LowerThan expr_gt                 { $node = new LTNode($node, $expr_gt.node); }
        )*
    ;

expr_gt returns [ExprNode node]
    : expr_eq                               { $node = $expr_eq.node; }
        ( GreaterThan expr_eq               { $node = new GTNode($node, $expr_eq.node); }
        )*
    ;

expr_eq returns [ExprNode node]
    : expr_atom                             { $node = $expr_atom.node; }
        ( IsEqual expr_atom                 { $node = new EQNode($node, $expr_atom.node); }
        )*
    ;

expr_atom returns [ExprNode node]
    : variable                              { $node = $variable.node; }
    | reference                             { $node = $reference.node; }
    | function                              { $node = $function.node; }
    | constant                              { $node = $constant.node; }
    | array                                 { $node = $array.node; }
    | assoc_array                           { $node = $assoc_array.node; }
    | LParent expression RParent            { $node = $expression.node; }
    ;

variable returns [RefNode node]
    : id = ID                               { $node = new RefNode(scenario.getNamespace(), $id.text); }
    ;

reference returns [RefNode node]
    : nmsp = Word Dot id = ID               { $node = new RefNode($nmsp.text, $id.text); }
    | nmsp = Word Dot id = ID
        LBracket field = Word RBracket      { $node = new RefNode($nmsp.text, $id.text, $field.text); }
    ;

function returns [FuncNode node]
    @init {
        ArrayList<ExprNode> params = new ArrayList<>();
    }
    : id = ID LParent
        ( expression                        { params.add($expression.node); }
            ( Comma expression              { params.add($expression.node); }
            )*
        )? RParent                          { $node = new FuncNode($id.text, params); }
    ;

constant returns [ExprNode node]
    : num_int                               { $node = new IntegerNode($num_int.value); }
    | num_double                            { $node = new DoubleNode($num_double.value); }
    | num_procent                           { $node = new DoubleNode($num_procent.value); }
    | dist                                  { $node = $dist.node; }
    ;

array returns [ExprNode node]
    @init {
        ArrayNode array = new ArrayNode();
    }
    : LCurly expression                     { array.add($expression.node); }
        ( Comma expression                  { array.add($expression.node); }
        )* RCurly                           { $node = array; }
    ;

assoc_array returns [ExprNode node]
    @init {
        AssocArrayNode array = new AssocArrayNode();
    }
    : LCurly namespace Colon expression     { array.put($namespace.text, $expression.node); }
        ( Comma namespace Colon expression  { array.put($namespace.text, $expression.node); }
        )* RCurly                           { $node = array; }
    ;

num_int returns [Integer value]
    : i = Int                               { $value = Integer.parseInt($i.text); }
    ;

num_double returns [Double value]
    : d = Dbl                               { $value = Double.parseDouble($d.text); }
    ;

num_procent returns [Double value]
    : v = ( Dbl | Int ) Procent                        { $value = Double.parseDouble($v.text) / 100; }
    ;

dist returns [ExprNode node]
    : LBracket lb = val Comma ub = val RBracket                     { $node = new Dist90CINode(Double.parseDouble($lb.text), Double.parseDouble($ub.text)); }
    | LBracket a = val Comma b = val Comma c = val RBracket         { $node = new DistTriangNode(Double.parseDouble($a.text), Double.parseDouble($b.text), Double.parseDouble($c.text)); }
    | LBracket a = val Comma b = val UBracket                       { $node = new DistUnifNode(Double.parseDouble($a.text), Double.parseDouble($b.text)); }
    ;

val
    : Int | Dbl
    ;