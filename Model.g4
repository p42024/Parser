grammar Model;

import Grammar;

model: model_stmt;

model_stmt: model_term ('->' model_term)*;

model_term: model_factor ('*' INT)?;

model_factor:
    ID
    | ACTIVATION
    | '[' ID (',' ID)* ']'
    | arithmetic_expr;