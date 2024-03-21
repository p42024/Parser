grammar Grammar;
program: statement* EOF ;

// ---- Statements -----

statement:  single_line_statement DELIMITER #SSingleLine
         |  multi_line_statement            #SMultiLine
         ;

multi_line_statement:  loop #MLSLoop
                    |  if   #MLSIf
                    ;

single_line_statement: assignment  #SLSAssignment
                     | BREAK       #SLSBreak
                     ;

// ----- Control Stuctures -----
// If
if: IF conditional_expression block_statement (ELSE block_statement)?;

// Loop
loop: LOOP block_statement ;

// Function
function_call: ID OPEN_PAREN (function_params)? (COMMA function_params)* CLOSED_PAREN;
function_params: ID | number | function_call | model_expression | math_expression | conditional_expression;

// Assignment
assignment: ID             ASSIGN assignable     #AssignAssignable
          | ID (COMMA ID)* ASSIGN function_call  #AssignFunction
          ;

assignable: ID                  #AsId
          | model_expression    #AsModel
          | math_expression     #AsMath
          ;

// ----- Model -----
model_expression: model_chain    #MExpChain
                | model_combiner #MExpCombiner
                ;

model_chain: model_chain ARROW model_chain          #MChain
           | model_chain_options                    #MVariables
           | OPEN_PAREN model_chain CLOSED_PAREN    #MScoping
           ;

model_chain_options: ID                 #MChainId
                   | ACTIVATION         #MChainActivation
                   | INT                #MChainInt
                   | model_combiner     #MChainCombiner
                   | math_expression    #MChainMath
                   ;

model_combiner: OPEN_SQUARE model_combiner_options (COMMA model_combiner_options)* CLOSED_SQUARE;

model_combiner_options: ID | model_chain;

// ----- Conditional -----
conditional_expression:    conditional_expression op=(AND | OR)                       conditional_expression  #BitwiseOperatorChain
                      |    conditional_expression op=(NEQ | EQ | GEQ | LEQ | GE | LE) conditional_expression  #ComparisonOperatorChain
                      |    condtional_options                                                                 #ConditionNumberVariable
                      |    OPEN_PAREN conditional_expression CLOSED_PAREN                                     #ConditionScoping
                      ;

condtional_options: ID | number | math_expression | model_expression | function_call;

// ----- Math -----
math_expression:    math_expression op=(MUL | DIV) math_expression  #MathMultiplyDivide
               |    math_expression op=(ADD | SUB) math_expression  #MathAddSubtract
               |    math_options                                    #MathNumberVariable
               |    OPEN_PAREN math_expression CLOSED_PAREN         #MathScoping
               ;

math_options: ID                #MathId
            | number            #MathNumber
            | model_combiner    #MathModel
            | function_call     #MathFunc
            ;

// ----- Structures ------
block_statement: OPEN_BRACK statement* CLOSE_BRACK ;

// return
/* !! Unnecessary as functions are not definable !! */
return: RETURN (ID | model_expression | math_expression | function_call) DELIMITER;

// ----- Types -----
// numbers
number: INT     #NumInt
      | FLOAT   #NumFloat
      ;

// ----- Constants -----

// Comment constants
MULTI_LINE_COMMENT: '/*'.*?'*/'             -> skip;
SINGLE_COMMENT:     '//' ~( '\r' | '\n' )*  -> skip;

// Ignore characters
NEWLINE: [ \t\r\n] -> skip ;

// Activation function constants
ACTIVATION: SIGMOID
          | RELU
          | TANH
          ;

// Number constants
FLOAT: [0-9]*[.][0-9]+;
INT: [0-9]+ ;

// Other
DELIMITER:      ';';
OPEN_BRACK:     '{';
CLOSE_BRACK:    '}';
COMMA:          ',';
ASSIGN:         '=';
OPEN_PAREN:     '(' ;
CLOSED_PAREN:   ')';
SIGMOID:        'Sigmoid' ;
RELU:           'ReLU' ;
TANH:           'Tanh' ;
ARROW:          '->';
OPEN_SQUARE:    '[';
CLOSED_SQUARE:  ']';
BREAK:          'break';
RETURN:         'return';
IF:             'if';
ELSE:           'else';
LOOP:           'loop';
AND:            'and';
OR:             'or';
NEQ:            '!=';
EQ:             '==';
GEQ:            '>=';
LEQ:            '<=';
GE:             '>';
LE:             '<';
SUB:            '-';
ADD:            '+';
MUL:            '*';
DIV:            '/';


// Name constant
ID: [a-zA-Z_][a-zA-Z0-9_'-]* ;