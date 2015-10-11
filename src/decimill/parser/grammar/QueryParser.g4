
parser grammar QueryParser;

@header {
    package decimill.parser;
    import decimill.*;
    import decimill.lang.*;
    import decimill.query.*;
    import decimill.expression.*;
    import org.apache.commons.lang3.StringUtils;
}

@members {
    Context context;
    QueryCompiler compiler;
    Rewriter rewriter;
    int offset;
    String carriage;
}

tokens {
    InlineStart, BlockStart, EOL, Character,
    Word, Text, ID, Int, Dbl, Procent, Allowed, Str,
    Dot, Colon, Comma, Quote, FromTo, Refinement,
    Equals, PlusEq, MinusEq, TimesEq, DivEq, Plus, Minus, Times, Div, Power, LowerThan, GreaterThan, IsEqual,
    LBracket, RBracket, UBracket, LParent, RParent, LCurly, RCurly,
    InlineEnd, BlockEnd, WS, BNL, ERR
}

parse [Context c, QueryCompiler q, Rewriter r]

    @init {
        context = c;
        compiler = q;
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
    : period
    | assign
    | assignAndPrint {
        try {
            rewriter.rewriteQueryInline($assignAndPrint.ctx, $assignAndPrint.value);
        } catch (RuntimeException e) {
            throw new CompilerException(e.getMessage(), $assignAndPrint.start.getLine(), $assignAndPrint.start.getCharPositionInLine());
        }
    }
    | evalAndPrint {
        try {
            rewriter.rewriteQueryInline($evalAndPrint.ctx, $evalAndPrint.value);
        } catch (RuntimeException e) {
            throw new CompilerException(e.getMessage(), $evalAndPrint.start.getLine(), $evalAndPrint.start.getCharPositionInLine());
        }
    }
    | refAssignment
    ;

blockCode
    :   ( assign
        | assignAndPrint {
            try {
                rewriter.rewriteQueryBlock($assignAndPrint.ctx, $assignAndPrint.value);
            } catch (RuntimeException e) {
                throw new CompilerException(e.getMessage(), $assignAndPrint.start.getLine(), $assignAndPrint.start.getCharPositionInLine());
            }
        }
        | evalAndPrint {
            try {
                rewriter.rewriteQueryBlock($evalAndPrint.ctx, $evalAndPrint.value);
            } catch (RuntimeException e) {
                throw new CompilerException(e.getMessage(), $evalAndPrint.start.getLine(), $evalAndPrint.start.getCharPositionInLine());
            }
        }
        | refAssignment
        )+
    ;

period
    : from = num_int FromTo to = num_int {

        int from = $from.value;
        int to = $to.value;
        
        if (from < 1 || to < 1) {
            throw new CompilerException("Time values must be both greater than 0.", $from.start.getLine(), $from.start.getCharPositionInLine());
        } else if (from > to) {
            throw new CompilerException("'From' time must be less than or equal to 'to' time.", $from.start.getLine(), $from.start.getCharPositionInLine());
        }

        compiler.setFrom($from.value - 1);
        compiler.setTo($to.value - 1);
    }
    ;

assign
    : assignment
    ;

assignAndPrint returns [DM_Object value]
    : Equals assignment                 { $value = $assignment.value; }
    ;

evalAndPrint returns [DM_Object value]
    : Equals eval                       { $value = $eval.value; }
    ;

eval returns [DM_Object value]
    : expression {
        try {
            $value = compiler.eval($expression.node);
        } catch (RuntimeException e) {
            throw new CompilerException(e.getMessage(), $expression.start.getLine(), $expression.start.getCharPositionInLine());
        }
    }
    ;

assignment returns [DM_Object value]
    : varAssignment                         { $value = $varAssignment.value; }
    ;

varAssignment returns [DM_Object value]
    : variable Equals expression {
        try {
            $value = compiler.eval($variable.node.toPointer(), $expression.node);
        } catch (RuntimeException e) {
            throw new CompilerException(e.getMessage(), $expression.start.getLine(), $expression.start.getCharPositionInLine());
        }
    }
    ;

refAssignment
    : reference Equals expression           { context.assign($reference.node.toReference(), $expression.node); }
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
    | evaluate                              { $node = $evaluate.node; }
    | array                                 { $node = $array.node; }
    | assoc_array                           { $node = $assoc_array.node; }
    | function                              { $node = $function.node; }
    | constant                              { $node = $constant.node; }
    | string                                { $node = new StringNode($string.value); }
    | LParent expression RParent            { $node = $expression.node; }
    ;

variable returns [PointerNode node]
    : id = ID                               { $node = new PointerNode($id.text); }
    | id = ID LBracket name RBracket        { $node = new PointerNode($id.text, $name.text); }
    ;

reference returns [RefNode node]
    : namespace Dot id = ID                     { $node = new RefNode($namespace.text, $id.text); }
    | nmsp = namespace Dot id = ID
        LBracket field = namespace RBracket     { $node = new RefNode($nmsp.text, $id.text, $field.text); }
    ;

evaluate returns [EvalNode node]
    : n = namespace Dot id = ID q = Quote               { $node = new EvalNode($n.text, $id.text); }
    | n = namespace Dot id = ID Quote s = namespace     { $node = new EvalNode($n.text, $id.text, $s.text); }
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

string returns [String value]
    : s = Str                               { $value = StringUtils.strip($s.text, "\""); }
    ;

constant returns [ExprNode node]
    : num_int                               { $node = new IntegerNode($num_int.value); }
    | num_double                            { $node = new DoubleNode($num_double.value); }
    | num_procent                           { $node = new DoubleNode($num_procent.value); }
    | dist                                  { $node = $dist.node; }
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

name
    : Word | Text
    ;

namespace
    : Word
    ;