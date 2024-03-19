grammar Expression;

import Statement;

expr:
    expr 'and' expr
    | expr 'or' expr
    | 'not' expr
    | expr '==' expr
    | expr '>=' expr
    | expr '<=' expr
    | expr '<' expr
    | expr '>' expr
    | expr '!=' expr
    | '(' expr ')'
    | function_call
    | ID
    | BOOL
    | FLOAT
    | INT;