
parser grammar ModelParser;

@header {
    package decimill.parser;
    import decimill.*;
    import decimill.expression.*;
    import decimill.model.*;
    import org.apache.commons.lang3.StringUtils;
}

tokens {
    InlineStart, BlockStart, EOL, Character,
    Word, Text, ID,  Int, Dbl, Procent, Allowed, Str,
    Dot, Colon, Comma, Quote, FromTo, Refinement,
    Equals, PlusEq, MinusEq, TimesEq, DivEq, Plus, Minus, Times, Div, Power, LowerThan, GreaterThan, IsEqual,
    LBracket, RBracket, UBracket, LParent, RParent, LCurly, RCurly,
    InlineEnd, BlockEnd, WS, BNL, ERR
}

@members {
    Model model;
    Rewriter rewriter;
    boolean inline;
}

parse [Model m, Rewriter r]

    @init {
        model = m;
        rewriter = r;
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
    : nodeDeclaration                       { rewriter.rewriteModelNode($nodeDeclaration.ctx, model, $nodeDeclaration.node); }
    | varDeclaration                        
    | refinement                            { rewriter.rewriteModelNode($refinement.ctx, model, $refinement.node); }
    | assignment
    ;

blockCode
    : ( nodeDeclaration | refinement | assignment )+
    ;

nodeDeclaration returns [Node node]
    : name                                  { $node = model.addNodeByNameIfNotExists($name.text); }
    ;

varDeclaration
    : variable
    ;

refinement returns [Node node]
    @init {
        Node parent;
        Node child;
    }
    : name                                  { parent = model.addNodeByNameIfNotExists($name.text); }
        Refinement name                     { child = model.addNodeByNameIfNotExists($name.text); parent.addChild(child); }
        ( Comma name                        { child = model.addNodeByNameIfNotExists($name.text); parent.addChild(child); }
        )*                                  { $node = parent; }
    ;

name
    : Word | Text
    ;

namespace
    : Word
    ;

assignment
    : variable Equals expression            { model.assign($variable.node.toReference(), $expression.node); }
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
    : id = ID                               { $node = new RefNode(model.getNamespace(), $id.text); }
    | id =ID LBracket namespace RBracket    { $node = new RefNode(model.getNamespace(), $id.text, $namespace.text); }
    ;

reference returns [RefNode node]
    : namespace Dot id = ID          { $node = new RefNode($namespace.text, $id.text); }
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