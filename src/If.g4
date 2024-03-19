grammar If;

import Grammer;

if_stmt: 'if' expr '{' stmt+ '}' ('else' '{' stmt+ '}')?;