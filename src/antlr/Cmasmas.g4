/*
 * Parser Rules
 */
grammar Cmasmas;

evaluar              : cadena EOF; 

cadena               : cabecera instrucciones+ pie;

cabecera             : ('cout<<' mensaje ';' entrada | entrada) ';';

pie                  : ('cout<<' mensaje';' 'cout<<' io | 'cout<<' mensaje '<<' io ) ';';

entrada              : 'cin>>' io;

io                   : LETRA+;

mensaje              : '"' (LETRA | ESPACIO | ':')* '"';

instrucciones        : componente OPERADORES componente';';

componente           : (VARIABLE | CONSTANTE);

/*
 * Lexer Rules
 */

fragment MINUSCULAS  : [a-z];
fragment MAYUSCULAS  : [A-Z];
fragment DIGITO      : [0-9];
fragment SIGNO       : ('+'|'-');
fragment SEPARADOR   : ('.'|',');

LETRA                : (MINUSCULAS | MAYUSCULAS);

OPERADORES           : (SIGNO | '*' | '/');

VARIABLE             : LETRA ( DIGITO | LETRA| '_'DIGITO | '_'LETRA )* '_'* ( DIGITO | LETRA | '_'DIGITO | '_'LETRA )* '_';

CONSTANTE            : DIGITO+ (SEPARADOR DIGITO+)?;

IGNORE               : (ESPACIO | SALTO) -> skip;

ESPACIO              :(' '  | '\t');

SALTO                :('\r'? '\n' | '\r');