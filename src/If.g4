grammar If;

import Statement;

if_stmt: 'if' expr '{' stmt+ '}' ('else' '{' stmt+ '}')?;