grammar If;

import Grammar;

if_stmt: 'if' expr '{' stmt+ '}' ('else' '{' stmt+ '}')?;