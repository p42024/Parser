grammar Grammar;

// ----------------------
// Lexer rules
// ----------------------

ACTIVATIONFUNCTION: 'Sigmoid' | 'ReLU' | 'Tanh' | 'Softmax';
IDENTIFIER: [a-zA-Z_]+[a-zA-Z_0-9]*;
INT: [0-9]+;
DOUBLE: [0-9]* '.' [0-9]+;
BOOLEAN: 'true' | 'false';
BIN_OP: '+' | '-' | '*' | '/' | '%' | '==' | '!=' | '<' | '<=' | '>' | '>=' | '&&' | '||';
STRING: '"' .*? '"';

// ----------------------
// Comments
// ----------------------

WS: [ \t\r\n]+ -> skip;
COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' .*? '\n' -> skip;

// ----------------------
// Parser rules
// ----------------------

// Program structure
program: stmt* EOF;
stmt: modelAssignment | modelExpr | ifStmt | loopStmt | activationAssignment | trainStmt | optimizerAssignment | lossFunctionAssignment | datasetAssignment | activationFunctionAssignment | useStmt | saveStmt | predictStmt | normalizeStmt;

// Expressions
expr: arithExpr | '(' expr ')' | BOOLEAN | IDENTIFIER | INT | DOUBLE;
arithExpr: arithExpr ('*' | '/' | '%') arithTerm | arithTerm;
arithTerm: arithTerm ('+' | '-') arithFactor | arithFactor;
arithFactor: '(' arithExpr ')' | IDENTIFIER exponent? | INT exponent? | DOUBLE exponent?;
exponent: '**' arithExpr;

boolExpr: boolAndExpr ('||' boolAndExpr)*;
boolAndExpr: boolEqualityExpr ('&&' boolEqualityExpr)*;
boolEqualityExpr: boolEqualityTerm ('==' boolEqualityTerm | '!=' boolEqualityTerm)*;
boolEqualityTerm: '(' boolExpr ')' | boolTerm;
boolTerm: arithExpr | BOOLEAN | IDENTIFIER | INT | DOUBLE | boolNotExpr;
boolNotExpr: '!' boolEqualityExpr | '(' boolExpr ')';

// Model definitions
modelAssignment : 'Model' IDENTIFIER '=' modelExpr ';';
modelExpr: modelTypeDef  | IDENTIFIER;
modelTypeDef: modelType '(' modelTypeDefArgs ',' activationFunctionExpr ')' | combineModels | IDENTIFIER combineExponent? | INT combineExponent?;
modelTypeDefArgs: modelTypeDefArg (',' modelTypeDefArg)* | modelTypeDefArg ('->' modelTypeDefArg)*;
modelTypeDefArg: IDENTIFIER | INT | combineModels | modelTypeDef | arithExpr;
combineModels: '[' modelExpr (',' modelExpr)* ']' combineExponent? | '[' modelExpr ('->' modelExpr)* ']' combineExponent? | IDENTIFIER exponent;
modelType: 'Linear' | 'Sequential';

// Use, save, and predict statements
useStmt: IDENTIFIER '.use' '(' IDENTIFIER ')' ';';
saveStmt: IDENTIFIER '.save' '(' STRING ')' ';';
predictStmt: IDENTIFIER '.predict' '(' IDENTIFIER ')' ';';
normalizeStmt: IDENTIFIER '.normalize' '(' ')' ';';

// Control structures
ifStmt: 'if' '(' boolExpr ')' '{' stmt* '}'  ('else' '{' stmt* '}')?;
loopStmt: 'loop' '(' boolExpr ')' '{' stmt* '}';

// Activation function assignment
activationAssignment: IDENTIFIER '.activate' '(' activationFunctionExpr ( '(' ')' )? ')' ';';
activationFunctionAssignment: 'ActivationFunction' IDENTIFIER '=' activationFunctionExpr ';';
activationFunctionExpr: ACTIVATIONFUNCTION | customActivationFunction;
customActivationFunction: '(' IDENTIFIER ')' '=>' expr  | IDENTIFIER;

// Training a model
trainStmt: IDENTIFIER '.train' '(' IDENTIFIER ',' IDENTIFIER ',' IDENTIFIER (',' INT ',' DOUBLE)? ( '(' ')' )? ')' ';';

// Optimizer definition
optimizerAssignment: 'Optimizer' IDENTIFIER '=' optimizerExpr ';';
optimizerExpr: optimizerType '(' ')' | customOptimizer;
optimizerType: 'SGD';
customOptimizer: '(' IDENTIFIER ',' IDENTIFIER ')' '=>' expr;

// LossFunction definition
lossFunctionAssignment: 'LossFunction' IDENTIFIER '=' lossFunctionExpr ';';
lossFunctionExpr: lossFunctionType | customLossFunction;
lossFunctionType: 'CrossEntropy()';
customLossFunction: '(' IDENTIFIER ',' IDENTIFIER ')' '=>' expr;

// Dataset definition
datasetAssignment: 'Dataset' IDENTIFIER '=' 'LoadDataset' '(' STRING ')' ';';

// Exponent
combineExponent: '^' INT;

// Arrow function
arrowFunction: '(' ')' '=>' expr;
