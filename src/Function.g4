grammar Function;

import Statement;

function_def: 'func' ID '(' (ID (',' ID)*)? ')' '->' '{' stmt* '}' ;

function_call: ID '(' expr (',' expr)* ')';