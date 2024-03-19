grammar Gram;
import Model, Loop, Arith;

prog: statement* EOF ;

statement: ID (',' ID)* '=' expression ';'
           | loop
           | 'break;'
           | expression ';'
           | if_statement
           ;

expression:   function_call
            | expression (logic_operator | comparison_operator | arith_operator) expression
            | boolean
            | number
            | model
            | ID
            ;

arith_operator: '+' | '*' | '-';

function_call: ID '('(ID (',' ID)* | ) ')' ;

if_statement: 'if' expression (logic_operator expression)* body ;

boolean:   'true'
         | 'false'
         ;

body: '{' statement* '}' ;

logic_operator: 'and'
              | 'or'
              | 'not'
              ;

comparison_operator: '=='
                   | '!='
                   | '<='
                   | '>='
                   | '>'
                   | '<'
                   ;

ACTIVATION: 'Sigmoid'
            | 'ReLU'
            | 'Tanh'
            ;


COMMENT: '/*' .*? '*/' -> skip;
INLINE_COMMENT: '//' .*? '\n' -> skip;

ID: [a-zA-Z_][a-zA-Z0-9_']* ;

NEWLINE: [ \t\r\n] -> skip ;

INT: [0-9]+ ;
FLOAT: [0-9]* '.' [0-9]+ ;
number: INT | FLOAT ;