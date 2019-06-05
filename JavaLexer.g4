lexer grammar JavaLexer;

BOOLEAN:            'boolean';
CHAR:               'char';
CLASS:              'class';
DOUBLE:             'double';
ELSE:               'else';
FINAL:              'final';
FLOAT:              'float';
FOR:                'for';
IF:                 'if';
IMPORT:             'import';
INT:                'int';
LONG:               'long';
NEW:                'new';
PRIVATE:            'private';
PUBLIC:             'public';
RETURN:             'return';
STATIC:             'static';
THIS:               'this';
VOID:               'void';
WHILE:              'while';


DECIMAL_LITERAL:    ('0' | [1-9] (Digits? | '_'+ Digits)) [lL]?;
                    
FLOAT_LITERAL:      (Digits '.' Digits?);

BOOL_LITERAL:       'true'
            |       'false'
            ;

CHAR_LITERAL:       '\'' (~['\\\r\n] | EscapeSequence) '\'';

STRING_LITERAL:     '"' (~["\\\r\n] | EscapeSequence)* '"';
NULL_LITERAL:       'null';

// Separators
LPAREN:             '(';
RPAREN:             ')';
LBRACE:             '{';
RBRACE:             '}';
LBRACK:             '[';
RBRACK:             ']';
SEMI:               ';';
COMMA:              ',';
DOT:                '.';
// Operators
ASSIGN:             '=';
GT:                 '>';
LT:                 '<';
BANG:               '!';
EQUAL:              '==';
LE:                 '<=';
GE:                 '>=';
NOTEQUAL:           '!=';
AND:                '&&';
OR:                 '||';
ADD:                '+';
SUB:                '-';
MUL:                '*';
DIV:                '/';
MOD:                '%';
ADD_ASSIGN:         '+=';
SUB_ASSIGN:         '-=';
INC:                '++';
DEC:                '--';

// Whitespace and comments
WS:                 [ \t\r\n\u000C]+ -> channel(HIDDEN);
COMMENT:            '/*' .*? '*/'    -> channel(HIDDEN);
LINE_COMMENT:       '//' ~[\r\n]*    -> channel(HIDDEN);


IDENTIFIER:         Letter LetterOrDigit*;

// Fragment rules

fragment EscapeSequence
    : '\\' [btnfr"'\\]
    | '\\' ([0-3]? [0-7])? [0-7]
    ;

fragment Digits
    : [0-9] ([0-9_]* [0-9])?
    ;
fragment LetterOrDigit
    : Letter
    | [0-9]
    ;
fragment Letter
    : [a-zA-Z$_]
    ;