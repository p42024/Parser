grammar Function;

import Grammar;

function_def: 'func' ID '(' (ID (',' ID)*)? ')' '->' '{' stmt* '}' ;

function_call: ID '(' expr (',' expr)* ')';