grammar Assignment;

import Grammar;

assignment: ID (',' ID)* assignment_op (
    function_call
    | arithmetic_expr
    | ID (',' ID)*
    | model

) ';';

assignment_op: '=' | '*=' | '+=' | '-=' | '/=';