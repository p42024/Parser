grammar Arith;

operator: '+' | '*' | '-' ;

arith: number (operator number)*
       | '(' arith+ ')'
       | arith operator arith
       ;

