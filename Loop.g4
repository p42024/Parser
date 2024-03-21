grammar Loop;

import Grammar;

loop_stmt: 'loop' '{' stmt+ '}';

break_stmt: 'break' ';';

continue_stmt: 'continue' ';';