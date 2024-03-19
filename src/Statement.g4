grammar Statement;

import Loop, If, Arithmetic, Function, Model, Expression, Assignment;

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
    | function_def
    | return_stmt;

import_stmt: 'import' (STRING | 'MNIST') 'as' ID ';';

increment_stmt: ID '++' ';';

decrement_stmt: ID '--' ';';

return_stmt: 'return' expr ';'; // Added return statement



//Todoings for andreas eller noget, find ud af hvordan token imports fungere ordenligt så
// jeg kan smide det her i en anden fill det er ugly duckly
STRING: '"' ~["]* '"';
ID: [a-zA-Z]+ [a-zA-Z_0-9]*;
ACTIVATION: 'ReLU' | 'Sigmoid';
BOOL: 'true' | 'false';
FLOAT: [0-9]* '.' [0-9]+;
INT: [0-9]+;

COMMENT: '//' .*? ('\n' | EOF) -> skip;
MULTI_LINE_COMMENT: '/*' .*? '*/' -> skip;
WS: [ \t\r\n]+ -> skip;