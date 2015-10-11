    
lexer grammar ModelLexer;

@header {
    package decimill.parser;
}

EOL     : '\n';
INLINE  : '`' -> pushMode(Code);
BLOCK   : ( '\t' | '    ' ) [\t ]* -> pushMode(Code);
ANY     : .;

mode Code;

    UDIST   : 'u';

    NODE    : 'node:';
    GOAL    : 'goal:';
    ASSM    : 'assm:';
    VAR     : 'var:';
    NAME    : [A-Z][a-zA-Z0-9&\-/_ ]*;
    ID      : [a-z][a-zA-Z0-9_]*;
    NUM     : [0-9]+ ('.' [0-9]+)?;

    REF     : '<-';
    EQ      : '=';
    COMMA   : ',';
    LPR     : '(';
    RPR     : ')';

    PLUS    : '+';
    MINUS   : '-';
    TIMES   : '*';
    DIV     : '/';
    POW     : '^';
    LT      : '<';
    GT      : '>';
    LBR     : '[';
    RBR     : ']';

    BNL     : ( [\n\r]+ ( '\t' | '    ' ) [\t ]* )+;

    BREAK   : '`' -> popMode;
    NL      : [\n\r]+ -> popMode;

    WS      : (' ' | '\t') -> channel(HIDDEN);
    ERR     : .;
     