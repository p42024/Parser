grammar Grammar;
program: statement* EOF ;

statement:  assignment
         |  if
         |  loop
         |  break_return
         |  expression
         ;

block_statement: '{' statement* '}';

assignment: ID (',' ID)* '=' expression DELIMITER
          | ID '=' '{' expression '}'
          ;

expression: expression conditional_operator expression
          | ID
          | ACTIVATION
          | number
          | model
          | arithmetic
          | function_call
          | '(' expression ')'
          ;

// Function call
function_call: ID '(' (expression)? (',' expression)* ')';

// Model
ACTIVATION: 'Sigmoid'
          | 'ReLU'
          | 'Tanh'
          ;

model_chaining_options: ACTIVATION | INT | ID | model_combiner | arithmetic;

model_chaining: model_chaining_options '->' model_chaining_options;

model: model_chaining | ACTIVATION | ID | model_combiner;

model_combiner: '[' model (',' model)* ']';

// Break / return
break_return: 'break' DELIMITER | 'return' expression DELIMITER;

// If
if: 'if' expression block_statement ('else' block_statement)?;

// Loop
loop: 'loop' '{' statement* '}';

// Condition
conditional_operator: 'and' | 'or' | '!=' | '==' | '>=' | '<=' | '>' | '<';

// Arithmetic
arithmetic: number
          | ID
          | model_combiner
          | arithmetic ARITHMETIC_OPERATORS arithmetic
          | '(' arithmetic ARITHMETIC_OPERATORS arithmetic ')'
          ;

ARITHMETIC_OPERATORS: '-' | '+' | '*' | '/' ;

// Comments
MULTI_LINE_COMMENT: '/*'.*?'*/'             -> skip;
SINGLE_COMMENT:     '//' ~( '\r' | '\n' )*  -> skip;

// Types
FLOAT: [0-9]*[.][0-9]+;

INT: [0-9]+ ;

number: INT | FLOAT;

// Variable names
ID: [a-zA-Z_][a-zA-Z0-9_']* ;

// Ignore characters
NEWLINE: [ \t\r\n] -> skip ;

// Other
DELIMITER: ';';