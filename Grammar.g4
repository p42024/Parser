grammar Grammar;


program
    : statement* EOF
    ;


statement
    : id '=' expression ';'                                             #StatementAssignment
    | 'loop' '{' statement* '}'                                         #StatementLoop
    | 'break' ';'                                                       #StatementBreak
    | 'if' expression '{' statement* '}' else?                          #StatementIf
    | 'print' '(' expression ')' ';'                                    #StatementPrint
    | 'SGD' '(' expression ',' expression ',' expression ')' ';'        #StatementSGD
    | 'export' expression 'as' (id | string) ';'                        #StatementExport
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

    // Imports
    | 'import' 'MNISTDigits'                                            #ExpressionImportDigits
    | 'import' 'MNISTDigitsTest'                                        #ExpressionImportDigitsTest
    | 'import' 'MNISTDigitsLabels'                                      #ExpressionImportDigitsTest
    | 'import' 'MNISTDigitsTestLabels'                                  #ExpressionImportDigitsTest

    // Functions
    | 'calculate_accuracy' '(' expression ',' expression ')'            #ExpressionAccuracy
    | 'MSE' '(' expression ',' expression ')'                           #ExpressionMSE
    | id '(' expression ')'                                             #ExpressionModelCall
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
    : chainedArith op='*' chainedArith        #ArithMultiplication
    | chainedArith op='/' chainedArith        #ArithDivision
    | chainedArith op='+' chainedArith        #ArithAddition
    | chainedArith op='-' chainedArith        #ArithSubtraction
    ;


chainedArith
    : chainedArith op='*' chainedArith          #ChainedArithMultiplication
    | chainedArith op='/' chainedArith          #ChainedArithDivision
    | chainedArith op='+' chainedArith          #ChainedArithAddition
    | chainedArith op='-' chainedArith          #ChainedArithSubtraction
    | id                                        #ChainedArithId
    | int                                       #ChainedArithInt
    | float                                     #ChainedArithFloat
    ;


id
    : ID
    ;


int
    : INT
    ;


float
    : INT'.'INT
    ;


string
    : STRING
    ;


INT
    : ('-')?[0-9]+
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
