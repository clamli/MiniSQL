grammar MiniSQL;

/* Lexical rules */

options {
  language = Java;
}

fragment A_ :	'a' | 'A';
fragment B_ :	'b' | 'B';
fragment C_ :	'c' | 'C';
fragment D_ :	'd' | 'D';
fragment E_ :	'e' | 'E';
fragment F_ :	'f' | 'F';
fragment G_ :	'g' | 'G';
fragment H_ :	'h' | 'H';
fragment I_ :	'i' | 'I';
fragment J_ :	'j' | 'J';
fragment K_ :	'k' | 'K';
fragment L_ :	'l' | 'L';
fragment M_ :	'm' | 'M';
fragment N_ :	'n' | 'N';
fragment O_ :	'o' | 'O';
fragment P_ :	'p' | 'P';
fragment Q_ :	'q' | 'Q';
fragment R_ :	'r' | 'R';
fragment S_ :	's' | 'S';
fragment T_ :	't' | 'T';
fragment U_ :	'u' | 'U';
fragment V_ :	'v' | 'V';
fragment W_ :	'w' | 'W';
fragment X_ :	'x' | 'X';
fragment Y_ :	'y' | 'Y';
fragment Z_ :	'z' | 'Z';

CREATE				: C_ R_ E_ A_ T_ E_ ;
DATABASE			: D_ A_ T_ A_ B_ A_ S_ E_ ;
DROP				: D_ R_ O_ P_  ;
IF				    : I_ F_  ;
EXISTS				: E_ X_ I_ S_ T_ S_ ;
SCHEMA				: S_ C_ H_ E_ M_ A_ ;
FROM				: F_ R_ O_ M_  ;
WHERE				: W_ H_ E_ R_ E_ ;
ASC				    : A_ S_ C_  ;
DESC				: D_ E_ S_ C_ ;
INTO				: I_ N_ T_ O_ ;
DEFAULT				: D_ E_ F_ A_ U_ L_ T_ ;
TABLE				: T_ A_ B_ L_ E_ ;
PRIMARY_SYM			: P_ R_ I_ M_ A_ R_ Y_ ;
KEY_SYM				: K_ E_ Y_ ;
ON				    : O_ N_ ;
UNIQUE_SYM			: U_ N_ I_ Q_ U_ E_ ;
INDEX_SYM			: I_ N_ D_ E_ X_ ;
SELECT_SYM			: S_ E_ L_ E_ C_ T_ ;
DELETE_SYM          : D_ E_ L_ E_ T_ E_ ;
INSERT_SYM          : I_ N_ S_ E_ R_ T_ ;
UPDATE_SYM			: U_ P_ D_ A_ T_ E_ ;
ORDER_SYM			: O_ R_ D_ E_ R_ ;
BY_SYM				: B_ Y_ ;
SET_SYM				: S_ E_ T_ ;
VALUE_SYM			: V_ A_ L_ U_ E_ ;
VALUES				: V_ A_ L_ U_ E_ S_ ;
NULL_SYM            : N_ U_ L_ L_;
INT_SYM				: I_ N_ T_  ;
CHAR				: C_ H_ A_ R_ ;
INTEGER_SYM			: I_ N_ T_ E_ G_ E_ R_  ;
FLOAT_SYM			: F_ L_ O_ A_ T_  ;


// basic token definition
DIVIDE      : ( D_ I_ V_ ) | ('/');
MOD_SYM     : ( M_ O_ D_ ) | ('%');
OR_SYM      : ( O_ R_ ) | ('||');
AND_SYM     : ( A_ N_ D_ ) | ('&&');
NOT_SYM     : ( N_ O_ T_ ) | ('!');
XOR_SYM     : ( X_ O_ R_ );
UNION_SYM   : ( U_ N_ I_ O_ N_ );

ARROW       : '=>';
EQ_SYM      : '==' | '<=>';
NOT_EQ      : '<>' | '!=' | '~=' | '^=';
LET         : '<=';
LTH         : '<';
GET         : '>=';
GTH         : '>';
SET_VAR     : '=';
ALL_FIELDS  : '.*';

SEMI	    : ';';
COLON	    : ':';
DOT	        : '.';
COMMA	    : ',';
ASTERISK    : '*';
RPAREN	    : ')';
LPAREN	    : '(';
RBRACK	    : ']';
LBRACK	    : '[';
PLUS	    : '+';
MINUS	    : '-';
NEGATION    : '~';
BITWISE	    : '|';
BITAND	    : '&';
POWER_OP    : '^';

INTEGER_NUM		: ('0'..'9')+;
REAL_NUM        :
        (  INTEGER_NUM DOT INTEGER_NUM | INTEGER_NUM DOT | DOT INTEGER_NUM | INTEGER_NUM  )
        (  ('E'|'e') ( PLUS | MINUS )? INTEGER_NUM  )?
;
//CHAR            : (   '\'' ( . | '\n')? '\''  );
TEXT_STRING     :
        (
            (  '\'' ( ('\\' '\\') | ('\'' '\'') | ('\\' '\'') | ~('\'') )* '\''  )
            |
            (  '"' ( ('\\' '\\') | ('"' '"') | ('\\' '"') | ~('"') )* '"'  )
        )
;
ID:
	    ( 'A'..'Z' | 'a'..'z' | '_' | '$') ( 'A'..'Z' | 'a'..'z' | '_' | '$' | '0'..'9' )*
;
WHITE_SPACE	    : ( ' '|'\r'|'\t'|'\n' )  -> channel(HIDDEN);
SL_COMMENT      : ( ('--'|'#') ~('\n'|'\r')* '\r'? '\n' )  -> channel(HIDDEN);
ML_COMMENT	    : '/*' ( . )*? '*/'  -> channel(HIDDEN);


/* Grammar rules */

// basic type definition
relational_op   :
    EQ_SYM | NOT_EQ | LTH | GTH | LET | GET;


// basic const data definition
string_literal  : TEXT_STRING;
number_literal  : (PLUS | MINUS)? (INTEGER_NUM | REAL_NUM);
literal_value   : ( string_literal | number_literal | NULL_SYM);


// identifiers
schema_name	 : tmpName=ID {if($tmpName.getText().length() <= 64) System.out.println("schema name = " + $tmpName.getText() + " \n");};
table_name	 : tmpName=ID {if($tmpName.getText().length() <= 64) System.out.println("table name = " + $tmpName.getText() + " \n");};
column_name	 : tmpName=ID {if($tmpName.getText().length() <= 64) System.out.println("column name = " + $tmpName.getText() + " \n");};
index_name   : tmpName=ID {if($tmpName.getText().length() <= 64) System.out.println("index name = " + $tmpName.getText() + " \n");};


// expression statement
expression :	exp_factor1 ( OR_SYM exp_factor1 )* ;
exp_factor1:	exp_factor2 ( XOR_SYM exp_factor2 )* ;
exp_factor2:	exp_factor3 ( AND_SYM exp_factor3 )* ;
exp_factor3:	(NOT_SYM)? exp_factor4 ;
exp_factor4:
    ( predicate relational_op predicate )
    | predicate
;
predicate  :  bit_expr;
bit_expr  :
    factor1 ( BITWISE factor1 )? ;
factor1  :
    factor2 ( BITAND factor2 )? ;
factor2:
	factor3 ( (PLUS|MINUS) factor3 )? ;
factor3:
	factor4 ( (ASTERISK|DIVIDE|MOD_SYM|POWER_OP) factor4 )? ;
factor4:
	(PLUS | MINUS | NEGATION) simple_expr
    | simple_expr ;
simple_expr:
	literal_value
	| column_spec
	| expression_list
;
expression_list:
	LPAREN expression ( COMMA expression )* RPAREN ;

column_spec  :
	( ( schema_name DOT )? table_name DOT )? column_name
;
table_spec:
	( schema_name DOT )? table_name
;
column_list:
	LPAREN column_spec (COMMA column_spec)* RPAREN
;


// SQL Statement Syntax
root_statement  :
    ( data_manipulation_statements | data_definition_statements)
    ( SEMI ) ?
;

data_manipulation_statements  :
     select_statement
   | delete_statement
   | insert_statement
   | update_statement
;

data_definition_statements  :
     create_database_statement
   | drop_database_statement
   | create_table_statement
   | drop_table_statement
   | create_index_statement
   | drop_index_statement
;

// select : SELECT [column_names] FROM table_name [WHERE Clause] [ORDER BY Clause]
select_statement  :
    SELECT_SYM
    select_list
    (
        FROM table_spec
        ( where_clause )?
    ) ?
    ( orderby_clause )?
;
where_clause      :  WHERE expression ;
orderby_clause    :  ORDER_SYM BY_SYM orderby_item (COMMA orderby_item)* ;
orderby_item      :  column_spec (ASC | DESC)? ;
select_list       :  ( ( displayed_column ( COMMA displayed_column )*)
                   	| ASTERISK )
;
displayed_column  : ( table_spec DOT ASTERISK ) | ( column_spec ) ;

// delete : DELETE FROM table_name [WHERE Clause]
delete_statement  :
    DELETE_SYM
    FROM table_spec
        (where_clause)?
;

// insert : INSERT INTO table_name ( field1, field2,...fieldN ) VALUES ( value1, value2,...valueN )
insert_statement  :
	INSERT_SYM
    	(INTO)? table_spec
	(column_list)?
	value_list_clause
;
value_list_clause  :	(VALUES | VALUE_SYM) column_value_list (COMMA column_value_list)*;
column_value_list  :	LPAREN (literal_value|DEFAULT) (COMMA (literal_value|DEFAULT) )* RPAREN ;

// update : UPDATE table_name SET field1=new-value1, field2=new-value2 [WHERE Clause]
update_statement  :
    UPDATE_SYM table_spec
    set_columns_clause
    (where_clause)?
    (orderby_clause)?
;
set_columns_clause:	SET_SYM set_column_clause ( COMMA set_column_clause )*;
set_column_clause:	column_spec EQ_SYM (literal_value|DEFAULT) ;

// create_database_statement
create_database_statement   :   CREATE (DATABASE | SCHEMA) (IF NOT_SYM EXISTS)? schema_name;

// drop_database_statement
drop_database_statement     :   DROP (DATABASE | SCHEMA) (IF EXISTS)? schema_name;

// create_table_statement
/**
 * In MiniSQL, unique can be assigned to multiple columns,
 * while primary can only be assigned to one columns.
 **/
create_table_statement      :
	CREATE TABLE (IF NOT_SYM EXISTS)? table_name
	LPAREN create_definition (COMMA create_definition)* RPAREN
;
create_definition           :
     ( column_name column_definition )
   | ( PRIMARY_SYM KEY_SYM LPAREN column_name RPAREN )
   | ( UNIQUE_SYM LPAREN column_name (COMMA column_name)* RPAREN )
;
column_definition   :
	column_data_type_header
;
null_or_notnull     :
	(NOT_SYM NULL_SYM) | NULL_SYM
;
length	:	INTEGER_NUM;
column_data_type_header:
	| (  INT_SYM(LPAREN length RPAREN)? (null_or_notnull)? (DEFAULT number_literal)?  )
	| (  INTEGER_SYM(LPAREN length RPAREN)? (null_or_notnull)? (DEFAULT number_literal)?  )
	| (  FLOAT_SYM(LPAREN length COMMA number_literal RPAREN)? (null_or_notnull)? (DEFAULT number_literal)?  )
	| (  CHAR (LPAREN length RPAREN)? (null_or_notnull)? (DEFAULT TEXT_STRING)?  )
;

// drop_table_statement
drop_table_statement:
	DROP TABLE (IF EXISTS)?
	table_name (COMMA table_name)*
;

// create_index_statement
create_index_statement:
	CREATE UNIQUE_SYM INDEX_SYM index_name
	ON table_name LPAREN column_name (COMMA column_name)* RPAREN
;

// drop_index_statement
drop_index_statement:
	DROP INDEX_SYM index_name ON table_name
;