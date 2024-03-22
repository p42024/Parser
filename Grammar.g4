grammar Grammar;

// Parser rules
program: stmt* EOF;
stmt: modelAssignment | modelExpr | ifStmt | loopStmt | activationAssignment;

expr: expr BIN_OP expr | '(' expr ')' | BOOLEAN | IDENTIFIER | INT | DOUBLE;
boolExpr: boolExpr '||' boolAndExpr | boolAndExpr;
boolAndExpr: boolAndExpr '&&' boolEqualityExpr | boolEqualityExpr;
boolEqualityExpr: boolEqualityExpr ('==' | '!=') boolNotExpr | boolNotExpr;
boolNotExpr: '!' boolNotExpr | '(' boolExpr ')' | expr;

modelAssignment : 'Model' IDENTIFIER '=' modelExpr ';';
modelExpr: modelTypeDef  | IDENTIFIER;

modelTypeDef: modelType '(' modelTypeDefArgs ')' | combineModels | IDENTIFIER exponent? | INT exponent?;

modelTypeDefArgs: modelTypeDefArg (',' modelTypeDefArg)* | modelTypeDefArg ('->' modelTypeDefArg)* ;
modelTypeDefArg: IDENTIFIER | INT | combineModels | modelTypeDef;

combineModels: '[' modelExpr (',' modelExpr)* ']' exponent? | '[' modelExpr ('->' modelExpr)* ']' exponent? | IDENTIFIER exponent;
modelType: 'Linear' | 'Dense' | 'Sequential' | 'Recurrent';

exponent: '^' INT;

ifStmt: 'if' '(' boolExpr ')' '{' stmt* '}'  ('else' '{' stmt* '}')?;

loopStmt: 'loop' '(' boolExpr ')' '{' stmt* '}';

activationAssignment: IDENTIFIER '.activate' '(' ACTIVATIONFUNCTION ')' ';';

ACTIVATIONFUNCTION: 'Sigmoid' | 'ReLU' | 'Tanh' | 'Softmax';

// Lexer rules
IDENTIFIER: [a-zA-Z_]+[a-zA-Z_0-9]*;
INT: [0-9]+;
DOUBLE: [0-9]* '.' [0-9]+;
BOOLEAN: 'true' | 'false';

BIN_OP: '+' | '-' | '*' | '/' | '%' | '==' | '!=' | '<' | '<=' | '>' | '>=' | '&&' | '||';

WS: [ \t\r\n]+ -> skip;
COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' .*? '\n' -> skip;