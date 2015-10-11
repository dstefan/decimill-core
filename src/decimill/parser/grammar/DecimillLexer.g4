
lexer grammar DecimillLexer;

@header {
    package decimill.parser;
}

InlineStart : '`' -> pushMode(Code);
BlockStart  : [\n\r]+ ('    ' | '\t') [ \t]* -> pushMode(Code);
EOL         : [\n\r]+ -> channel(HIDDEN);
Character   : ~[\n\r`]+;

mode Code;

    Word        : [A-Z] [a-zA-Z0-9&_]*;
    Text        : [A-Z] ( [a-zA-Z0-9&_ ]* [a-zA-Z0-9&_] )?;
    ID          : [a-z] Allowed*;
    Int         : '-'? [0-9]+;
    Dbl         : Int ( '.' [0-9]+ )?;
    Procent     : '%';
    Allowed     : [a-zA-Z0-9&_];
    Str         : '"' .*? '"';

    Dot         : '.';
    Colon       : ':';
    Comma       : ',';
    Quote       : '\'';
    FromTo      : '->';
    Refinement  : '<-';
    Equals      : '=';
    PlusEq      : '+=';
    MinusEq     : '-=';
    TimesEq     : '*=';
    DivEq       : '/=';
    Plus        : '+';
    Minus       : '-';
    Times       : '*';
    Div         : '/';
    Power       : '^';
    LowerThan   : '<';
    GreaterThan : '>';
    IsEqual     : '==';
    LBracket    : '[';
    RBracket    : ']';
    UBracket    : ']u';
    LParent     : '(';
    RParent     : ')';
    LCurly      : '{';
    RCurly      : '}';

    InlineEnd   : '`' -> popMode;
    BlockEnd    : [\n\r]+ -> popMode;

    WS          : (' ' | '\t')+ -> channel(HIDDEN);
    BNL         : [\n\r]+ ('    ' | '\t') [ \t]* -> channel(HIDDEN);
    Comment     : '//' ~[\n\r]+ -> channel(HIDDEN);

    ERR         : .;