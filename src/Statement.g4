grammar Statement;

import Loop, If, Arithmetic, Function, Model, Expression;

prog: stmt+;

stmt:
    import_stmt
    | if_stmt
    | assignment
    | loop_stmt
    | break_stmt
    | increment_stmt
    | decrement_stmt
    | continue_stmt
    | function_def;

import_stmt: 'import' (STRING | 'MNIST') 'as' ID ';';

assignment:
    ID (',' ID)* ('=' | '*=' | '+=' | '-=' | '/=') (
        function_call
        | model
        | arithmetic_expr
        | ID (',' ID)*
    ) ';';

increment_stmt: ID '++' ';';

decrement_stmt: ID '--' ';';


//Man kan putte det her ind i en lexer fil så skal man bare lave noget option magic

STRING: '"' ~["]* '"'; //Skal kun bruges til import der er sikkert en smarterer måde
ID: [a-zA-Z]+ [a-zA-Z_0-9]*;
ACTIVATION: 'ReLU' | 'Sigmoid';
BOOL: 'true' | 'false';
FLOAT: [0-9]* '.' [0-9]+;
INT: [0-9]+;

COMMENT: '//' .*? '\n' -> skip;
MULTI_LINE_COMMENT: '/*' .*? '*/' -> skip;
WS: [ \t\r\n]+ -> skip;