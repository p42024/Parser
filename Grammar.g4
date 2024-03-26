grammar Grammar;


program
    : statement* EOF
    ;


statement
    : id '=' expression ';'                         #StatementAssignment
    | 'loop' expression '{' statement* '}'          #StatementLoop
    | 'break' ';'                                   #StatementBreak
    | 'if' expression '{' statement* '}' else?      #StatementIf
    ;


else
    : 'else' '{' statement* '}'
    ;


expression
    : id                                        #ExpressionId
    | layer                                     #ExpressionLayer
    | model                                     #ExpressionModel
    | '(' expression ')'                        #ExpressionParenthesis

    // Boolean expressions
    | expression 'and' expression               #ExpressionBooleanAnd
    | expression 'or' expression                #ExpressionBooleanOr
    | expression '>' expression                 #ExpressionLe
    | expression '>=' expression                #ExpressionLeq
    | expression '<' expression                 #ExpressionGe
    | expression '<=' expression                #ExpressionGeq

    // Hardcoded function calls
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
    : 'linear' '(' (arith | int) ',' (arith | int) ')'
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


INT
    : [0-9]+
    ;


float
    : INT'.'INT
    ;


ID
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;


WS
    : [ \t\r\n]+ -> skip
    ;
