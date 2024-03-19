grammar Expression;

import Statement;

expr:
    expr binary_op expr
    | 'not' expr
    | '(' expr ')'
    | arithmetic_expr
    | function_call
    | ID
    | BOOL
    | FLOAT
    | INT;

binary_op: 'and' | 'or' | '==' | '>=' | '<=' | '<' | '>' | '!=';
