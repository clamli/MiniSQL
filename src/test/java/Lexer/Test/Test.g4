grammar Test;
main: CHAR;
name: ANY+;
ANY: .;
CHAR            : (   '\'' ( . | '\n')? '\''  );
