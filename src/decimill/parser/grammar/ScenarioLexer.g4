
lexer grammar ScenarioLexer;

@header {
    package decimill.parser;
}

EOL     : '\n';
INLINE  : '`' -> pushMode(Code);
BLOCK   : ( '\t' | '    ' ) [\t ]* -> pushMode(Code);
ANY     : .;

mode Code;

    UDIST   : 'u';

    NAME    : [A-Z][a-zA-Z0-9]*;
    ID      : [a-z][a-zA-Z0-9_]*;
    NUM     : [0-9]+ ('.' [0-9]+)?;

    EQ      : '=';
    PEQ     : '+=';
    MEQ     : '-=';
    TEQ     : '*=';
    DEQ     : '/=';
    COMMA   : ',';
    DOT     : '.';
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

    WS      : (' ' | '\t') -> channel(HIDDEN);
    BREAK   : '`' -> popMode;
    NL      : [\n\r]+ -> popMode;

    ERR     : .;
     