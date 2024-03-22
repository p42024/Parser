grammar Grammar;

import Loop, If, Arithmetic, Function, Model, Expression, Assignment;

program: stmt+;

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

return_stmt: 'return' expr ';';

if_stmt: 'if' expr '{' stmt+ '}' ('else' '{' stmt+ '}')?;

loop_stmt: 'loop' '{' stmt+ '}';

break_stmt: 'break' ';';

continue_stmt: 'continue' ';';

model: model_stmt;

model_stmt: model_term ('->' model_term)*;

model_term: model_factor ('*' INT)?;

model_factor:
    ID
    | ACTIVATION
    | '[' ID (',' ID)* ']'
    | arithmetic_expr;

function_def: 'func' ID '(' (ID (',' ID)*)? ')' '->' '{' stmt* '}' ;

function_call: ID '(' expr (',' expr)* ')';

expr:
    | '(' expr ')'
    | 'not' expr
    | expr binary_op expr
    | arithmetic_expr
    | model
    | function_call
    | ID
    | BOOL
    | FLOAT
    | INT;


binary_op: 'and' | 'or' | '==' | '>=' | '<=' | '<' | '>' | '!=';

assignment: ID (',' ID)* assignment_op (
    function_call
    | arithmetic_expr
    | ID (',' ID)*
    | model

) ';';

assignment_op: '=' | '*=' | '+=' | '-=' | '/=';

arithmetic_expr: arithmetic_term (('+' | '-') arithmetic_term)*;

arithmetic_term: arithmetic_factor (('*' | '/' | 'mod') arithmetic_factor)*;

arithmetic_factor:
    INT
    | '(' arithmetic_expr ')'
    | ID
    | ACTIVATION;

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