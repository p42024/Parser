grammar Grammer;

import Loop, If, Arithmetic;

prog: stmt+;

stmt:
	if_stmt
	| assignment
	| loop_stmt
	| break_stmt
	| increment_stmt
	| decrement_stmt
	| continue_stmt;

assignment:
	ID (',' ID)* ('=' | '*=' | '+=' | '-=' | '/=') (
		function_call
		| model
		| arithmetic_expr
		| ID (',' ID)*
	) ';';

function_call: ID '(' ID (',' ID)* ')';

increment_stmt: ID '++' ';';

decrement_stmt: ID '--' ';';

model: model_stmt;

model_stmt: model_term ('->' model_term)*;

model_term: model_factor ('*' INT)?;

model_factor:
	ID
	| ACTIVATION
	| '[' ID (',' ID)* ']'
	| arithmetic_expr;

expr:
	expr 'and' expr
	| expr 'or' expr
	| 'not' expr5
	| expr '==' expr
	| expr '>=' expr
	| expr '<=' expr
	| expr '<' expr
	| expr '>' expr
	| expr '!=' expr
	| '(' expr ')'
	| ID
	| BOOL
	| FLOAT
	| INT;


ID: [a-zA-Z]+ [a-zA-Z_0-9]*;
ACTIVATION: 'ReLU' | 'Sigmoid';
BOOL: 'true' | 'false';
FLOAT: [0-9]* '.' [0-9]+;
INT: [0-9]+;
COMMENT: '//' .*? '\n' -> skip;
MULTI_LINE_COMMENT: '/*' .*? '*/' -> skip;
WS: [ \t\r\n]+ -> skip;