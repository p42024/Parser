grammar Grammar;


program
    : statement* EOF
    ;


statement
    : id '=' expression ';'                         #StatementAssignment
    | 'loop' '{' statement* '}'                     #StatementLoop
    | 'break' ';'                                   #StatementBreak
    | 'if' expression '{' statement* '}' else?      #StatementIf
    | expression ';'                                #StatementExpression
    ;


else
    : 'else' '{' statement* '}'
    ;


expression
    : id                                                                #ExpressionId
    | layer                                                             #ExpressionLayer
    | model                                                             #ExpressionModel
    | string                                                            #ExpressionString
    | int                                                               #ExpressionInteger
    | float                                                             #ExpressionFloat
    | arith                                                             #ExpressionArith
    | '(' expression ')'                                                #ExpressionParenthesis

    // Boolean expressions
    | expression 'and' expression                                       #ExpressionBooleanAnd
    | expression 'or' expression                                        #ExpressionBooleanOr
    | expression '>' expression                                         #ExpressionLe
    | expression '>=' expression                                        #ExpressionLeq
    | expression '<' expression                                         #ExpressionGe
    | expression '<=' expression                                        #ExpressionGeq
    | expression '==' expression                                        #ExpressionEq

    // Function calls
    | 'print' '(' expression ')'                                        #ExpressionPrint
    | 'calculate_accuracy' '(' expression ',' expression ')'            #ExpressionAccuracy
    | 'MSE' '(' expression ',' expression ')'                           #ExpressionMSE
    | 'SGD' '(' expression ',' expression ',' expression ')'            #ExpressionSGD
    | id '(' expression ')'                                             #ExpressionModelCall

    // Imports
    | 'import' 'MNISTDigits'                                            #ExpressionImportDigits
    | 'import' 'MNISTDigitsTest'                                        #ExpressionImportDigitsTest
    | 'import' 'MNISTDigitsLabels'                                      #ExpressionImportDigitsTest
    | 'import' 'MNISTDigitsTestLabels'                                  #ExpressionImportDigitsTest

    // Export
    | 'export' expression 'as' (id | string)                           #ExpressionExport
    ;


model
    : sequentialContainer
    ;


sequentialContainer
    : 'sequential' '(' (layer | id) ('->' activation '->' (layer | id))* ')'
    ;


activation
    : 'ReLU'        #ActivationReLU
    | 'Tanh'        #ActivationTanh
    | 'Sigmoid'     #ActivationSigmoid
    ;


layer
    : linearLayer
    ;


linearLayer
    : 'linear' '(' (arith | int | id) ',' (arith | int | id) ')'
    ;


arith
    : chainedArith op=('*' | '/') chainedArith
    | chainedArith op=('+' | '-') chainedArith
    ;


chainedArith
    : chainedArith op=('*' | '/') chainedArith
    | chainedArith op=('+' | '-') chainedArith
    | id
    | int
    | float
    ;


id
    : ID
    ;


int
    : INT
    ;


string
    : STRING
    ;


INT
    : [0-9]+
    ;


float
    : INT'.'INT
    ;


ID
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;


STRING
    : '"' (~["] | '\\"' )* '"'
    ;


WS
    : [ \t\r\n]+ -> skip
    ;

COMMENT
    : '//' (~'\n')* -> skip
    ;

MULTILINECOMMENT
    : '/*' .*? '*/' -> skip
    ;
