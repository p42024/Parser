grammar Model;
import Arith;

modop: '*' ;

modelexpr: ACTIVATION '->' INT
           | ACTIVATION '->' arith
           | '(' modelexpr ')'
           | ID
           | modellist
           ;

model: modelchain ;

modelchain: modelexpr ('->' modelexpr)* ;

modellist: '[' modelexpr (',' modelexpr)* ']' ;