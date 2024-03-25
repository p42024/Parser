grammar Grammar;

// Entry point for the parser!
program
    : statement* EOF
    ;


statement
    : assignment
    ;


assignment
    : id '=' expression ';'
    ;


id
    : ID
    ;


expression
    : modelLayer
    | modelContainer
    | variable
    ;


variable
    : id
    ;


// All the differents layers of a model. For now linear and recurrent
modelLayer
    : linearLayer
    | recurrentLayer
    ;


// The linear layer only contains the size of the layer and the expected input size
linearLayer
    : 'linear' '(' int ',' int ')'
    ;


// Unsure how this one works
recurrentLayer
    : 'recurrent' '(' int ',' int ')'
    ;


modelContainer
    : sequentialContainer
    ;


// We need to make sure the expressions are a modelLayer type!
sequentialContainer
    : 'sequential' '(' expression ('->' activation '->' expression)* ')'
    ;


activation
    : relu
    | sigmoid
    | tanh
    ;


relu
    : 'ReLU'
    ;


tanh
    : 'Tanh'
    ;


sigmoid
    : 'Sigmoid'
    ;


int
    : INT
    ;


// The constants
INT
    : ('+' | '-')?[0-9]+
    ;
ID
    : [a-zA-Z_][a-zA-Z_0-9]+
    ;
WS
    : [ \t\r\n]+ -> skip
    ;
