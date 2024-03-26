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
    | number                                                            #ExpressionNumber
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
    : 'sequential' '(' (layer | id) ('->' activation '->' (layer | id))* ')' #SequentialContainerModel
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
    : 'linear' '(' linearLayerArith ',' linearLayerArith ')'
    ;

linearLayerArith
    : (number | id)
    ;

id
    : ID
    ;


string
    : STRING
    ;


number
    : additive          #NumberMath
    | numberConstant    #NumberNumberConstant
    ;


multiplicative
    : numberConstant (multOp numberConstant)*
    ;


multOp
    : '/'   #MultOpDivision
    | '*'   #MultOpMultiplication
    ;


additive
    : multiplicative (addOp multiplicative)*
    ;


addOp
    : '+'   #AddOpAdd
    | '-'   #AddOpSub
    ;


int
    : INT
    ;


float
    : FLOAT
    ;


numberConstant
    : id                #NumberConstantId
    | int               #NumberConstantInt
    | float             #NumberConstantFloat
    | '(' number ')'    #NumberConstantParenthesis
    ;


INT
    : ('-')?[0-9]+
    ;


FLOAT
    : '-'?[0-9]+'.'[0-9]+
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
