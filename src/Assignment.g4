grammar Assignment;

import Statement;

assignment: ID (',' ID)* assignment_op (
    function_call
    | model
    | arithmetic_expr
    | ID (',' ID)*
) ';';

assignment_op: '=' | '*=' | '+=' | '-=' | '/=';