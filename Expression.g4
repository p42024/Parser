grammar Expression;

import Grammar;

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
