grammar Function;

import Statement;

function_def: 'func' ID '(' (ID (',' ID)*)? ')' '->' '{' stmt* 'return' expr ';' '}';

function_call: ID '(' expr (',' expr)* ')';