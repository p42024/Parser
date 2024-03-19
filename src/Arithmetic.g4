grammar Arithmetic;

arithmetic_expr: arithmetic_term (('+' | '-') arithmetic_term)*;

arithmetic_term: arithmetic_factor (('*' | '/' | 'mod') arithmetic_factor)*;

arithmetic_factor:
    INT
    | '(' arithmetic_expr ')'
    | ID
    | ACTIVATION;