grammar Grammar;
program: statement* EOF ;

statement:  assignment
         |  if
         |  loop
         |  break_return
         |  expression
         ;

block_statement: OPEN_BRACK statement* CLOSE_BRACK ;

assignment: ID (COMMA ID)* ASSIGN expression DELIMITER
          | ID ASSIGN OPEN_BRACK expression CLOSE_BRACK
          ;

expression: expression conditional_operator expression
          | ID
          | activation
          | number
          | model
          | arithmetic
          | boolean
          | function_call
          | OPEN_PAREN expression CLOSED_PAREN
          ;

// Function call
function_call: ID OPEN_PAREN (expression)? (COMMA expression)* CLOSED_PAREN ;

// Model
activation: SIGMOID
          | RELU
          | TANH
          ;

model_chaining_options: activation | INT | ID | model_combiner | arithmetic;

model_chaining: model_chaining_options ARROW model_chaining_options;

model: model_chaining | activation | ID | model_combiner;

model_combiner: OPEN_SQUARE model (COMMA model)* CLOSED_SQUARE;

// Break / return
break_return: BREAK DELIMITER | RETURN expression DELIMITER;

// If
if: IF expression block_statement (ELSE block_statement)?;

// Loop
loop: LOOP OPEN_BRACK statement* CLOSE_BRACK ;

// Condition
conditional_operator: AND | OR | NEQ | EQ | GEQ | LEQ | GE | LE ;

// numbers
number: INT | FLOAT;

// Arithmetic
arithmetic: number
          | ID
          | model_combiner
          | arithmetic arithmetic_operators arithmetic
          | OPEN_PAREN arithmetic arithmetic_operators arithmetic CLOSED_PAREN
          ;

arithmetic_operators: MINUS | PLUS | TIMES | DIV ;

boolean: TRUE | FALSE ;

// CONSTANTS!!!

// Comment constants
MULTI_LINE_COMMENT: '/*'.*?'*/'             -> skip;
SINGLE_COMMENT:     '//' ~( '\r' | '\n' )*  -> skip;

// Number constants
FLOAT: [0-9]*[.][0-9]+;
INT: [0-9]+ ;

// Ignore characters
NEWLINE: [ \t\r\n] -> skip ;

// Other
DELIMITER:      ';';
OPEN_BRACK:     '{';
CLOSE_BRACK:    '}';
COMMA:      ',';
ASSIGN:     '=';
OPEN_PAREN: '(' ;
CLOSED_PAREN:   ')';
SIGMOID:        'Sigmoid' ;
RELU:           'ReLU' ;
TANH:           'Tanh' ;
ARROW:  '->';
OPEN_SQUARE:    '[';
CLOSED_SQUARE:  ']';
BREAK:  'break';
RETURN: 'return';
TRUE: 'true';
FALSE: 'false';
IF: 'if';
ELSE: 'else';
LOOP:   'loop';
AND:    'and';
OR:     'or';
NEQ:    '!=';
EQ:     '==';
GEQ:    '>=';
LEQ:    '<=';
GE:     '>';
LE:     '<';
MINUS:  '-';
PLUS:   '+';
TIMES:  '*';
DIV:    '/';

// Name constant
ID: [a-zA-Z_][a-zA-Z0-9_']* ;
