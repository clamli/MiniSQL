// Generated from D:/IDEA programming/MiniSQL/src/main/resources\MiniSQL.g4 by ANTLR 4.7
package antlr.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CREATE=1, DATABASE=2, DROP=3, IF=4, EXISTS=5, SCHEMA=6, FROM=7, WHERE=8, 
		ASC=9, DESC=10, INTO=11, DEFAULT=12, TABLE=13, PRIMARY_SYM=14, KEY_SYM=15, 
		ON=16, UNIQUE_SYM=17, INDEX_SYM=18, SELECT_SYM=19, DELETE_SYM=20, INSERT_SYM=21, 
		UPDATE_SYM=22, ORDER_SYM=23, BY_SYM=24, SET_SYM=25, VALUE_SYM=26, VALUES=27, 
		NULL_SYM=28, INT_SYM=29, CHAR=30, INTEGER_SYM=31, FLOAT_SYM=32, DIVIDE=33, 
		MOD_SYM=34, OR_SYM=35, AND_SYM=36, NOT_SYM=37, XOR_SYM=38, UNION_SYM=39, 
		ARROW=40, EQ_SYM=41, NOT_EQ=42, LET=43, LTH=44, GET=45, GTH=46, SET_VAR=47, 
		ALL_FIELDS=48, SEMI=49, COLON=50, DOT=51, COMMA=52, ASTERISK=53, RPAREN=54, 
		LPAREN=55, RBRACK=56, LBRACK=57, PLUS=58, MINUS=59, NEGATION=60, BITWISE=61, 
		BITAND=62, POWER_OP=63, INTEGER_NUM=64, REAL_NUM=65, TEXT_STRING=66, ID=67, 
		WHITE_SPACE=68, SL_COMMENT=69, ML_COMMENT=70;
	public static final int
		RULE_relational_op = 0, RULE_string_literal = 1, RULE_number_literal = 2, 
		RULE_literal_value = 3, RULE_schema_name = 4, RULE_table_name = 5, RULE_column_name = 6, 
		RULE_index_name = 7, RULE_expression = 8, RULE_exp_factor1 = 9, RULE_exp_factor2 = 10, 
		RULE_exp_factor3 = 11, RULE_exp_factor4 = 12, RULE_bit_expr = 13, RULE_factor1 = 14, 
		RULE_factor2 = 15, RULE_simple_expr = 16, RULE_column_spec = 17, RULE_table_spec = 18, 
		RULE_column_list = 19, RULE_root_statement = 20, RULE_data_manipulation_statements = 21, 
		RULE_data_definition_statements = 22, RULE_select_statement = 23, RULE_where_clause = 24, 
		RULE_orderby_clause = 25, RULE_orderby_item = 26, RULE_select_list = 27, 
		RULE_displayed_column = 28, RULE_delete_statement = 29, RULE_insert_statement = 30, 
		RULE_value_list_clause = 31, RULE_column_value_list = 32, RULE_update_statement = 33, 
		RULE_set_columns_clause = 34, RULE_set_column_clause = 35, RULE_create_database_statement = 36, 
		RULE_drop_database_statement = 37, RULE_create_table_statement = 38, RULE_create_definition = 39, 
		RULE_null_or_notnull = 40, RULE_length = 41, RULE_column_data_type_header = 42, 
		RULE_drop_table_statement = 43, RULE_create_index_statement = 44, RULE_drop_index_statement = 45;
	public static final String[] ruleNames = {
		"relational_op", "string_literal", "number_literal", "literal_value", 
		"schema_name", "table_name", "column_name", "index_name", "expression", 
		"exp_factor1", "exp_factor2", "exp_factor3", "exp_factor4", "bit_expr", 
		"factor1", "factor2", "simple_expr", "column_spec", "table_spec", "column_list", 
		"root_statement", "data_manipulation_statements", "data_definition_statements", 
		"select_statement", "where_clause", "orderby_clause", "orderby_item", 
		"select_list", "displayed_column", "delete_statement", "insert_statement", 
		"value_list_clause", "column_value_list", "update_statement", "set_columns_clause", 
		"set_column_clause", "create_database_statement", "drop_database_statement", 
		"create_table_statement", "create_definition", "null_or_notnull", "length", 
		"column_data_type_header", "drop_table_statement", "create_index_statement", 
		"drop_index_statement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "'=>'", null, null, "'<='", "'<'", "'>='", "'>'", 
		"'='", "'.*'", "';'", "':'", "'.'", "','", "'*'", "')'", "'('", "']'", 
		"'['", "'+'", "'-'", "'~'", "'|'", "'&'", "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CREATE", "DATABASE", "DROP", "IF", "EXISTS", "SCHEMA", "FROM", 
		"WHERE", "ASC", "DESC", "INTO", "DEFAULT", "TABLE", "PRIMARY_SYM", "KEY_SYM", 
		"ON", "UNIQUE_SYM", "INDEX_SYM", "SELECT_SYM", "DELETE_SYM", "INSERT_SYM", 
		"UPDATE_SYM", "ORDER_SYM", "BY_SYM", "SET_SYM", "VALUE_SYM", "VALUES", 
		"NULL_SYM", "INT_SYM", "CHAR", "INTEGER_SYM", "FLOAT_SYM", "DIVIDE", "MOD_SYM", 
		"OR_SYM", "AND_SYM", "NOT_SYM", "XOR_SYM", "UNION_SYM", "ARROW", "EQ_SYM", 
		"NOT_EQ", "LET", "LTH", "GET", "GTH", "SET_VAR", "ALL_FIELDS", "SEMI", 
		"COLON", "DOT", "COMMA", "ASTERISK", "RPAREN", "LPAREN", "RBRACK", "LBRACK", 
		"PLUS", "MINUS", "NEGATION", "BITWISE", "BITAND", "POWER_OP", "INTEGER_NUM", 
		"REAL_NUM", "TEXT_STRING", "ID", "WHITE_SPACE", "SL_COMMENT", "ML_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MiniSQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Relational_opContext extends ParserRuleContext {
		public TerminalNode EQ_SYM() { return getToken(MiniSQLParser.EQ_SYM, 0); }
		public TerminalNode NOT_EQ() { return getToken(MiniSQLParser.NOT_EQ, 0); }
		public TerminalNode LTH() { return getToken(MiniSQLParser.LTH, 0); }
		public TerminalNode GTH() { return getToken(MiniSQLParser.GTH, 0); }
		public TerminalNode LET() { return getToken(MiniSQLParser.LET, 0); }
		public TerminalNode GET() { return getToken(MiniSQLParser.GET, 0); }
		public Relational_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitRelational_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_opContext relational_op() throws RecognitionException {
		Relational_opContext _localctx = new Relational_opContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_relational_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ_SYM) | (1L << NOT_EQ) | (1L << LET) | (1L << LTH) | (1L << GET) | (1L << GTH))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode TEXT_STRING() { return getToken(MiniSQLParser.TEXT_STRING, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(TEXT_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Number_literalContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(MiniSQLParser.INTEGER_NUM, 0); }
		public TerminalNode REAL_NUM() { return getToken(MiniSQLParser.REAL_NUM, 0); }
		public TerminalNode PLUS() { return getToken(MiniSQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MiniSQLParser.MINUS, 0); }
		public Number_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitNumber_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_literalContext number_literal() throws RecognitionException {
		Number_literalContext _localctx = new Number_literalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_number_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(96);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(99);
			_la = _input.LA(1);
			if ( !(_la==INTEGER_NUM || _la==REAL_NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_valueContext extends ParserRuleContext {
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Number_literalContext number_literal() {
			return getRuleContext(Number_literalContext.class,0);
		}
		public TerminalNode NULL_SYM() { return getToken(MiniSQLParser.NULL_SYM, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_literal_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_STRING:
				{
				setState(101);
				string_literal();
				}
				break;
			case PLUS:
			case MINUS:
			case INTEGER_NUM:
			case REAL_NUM:
				{
				setState(102);
				number_literal();
				}
				break;
			case NULL_SYM:
				{
				setState(103);
				match(NULL_SYM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Schema_nameContext extends ParserRuleContext {
		public Token tmpName;
		public TerminalNode ID() { return getToken(MiniSQLParser.ID, 0); }
		public Schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitSchema_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Schema_nameContext schema_name() throws RecognitionException {
		Schema_nameContext _localctx = new Schema_nameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			((Schema_nameContext)_localctx).tmpName = match(ID);
			if(((Schema_nameContext)_localctx).tmpName.getText().length() <= 64) System.out.println("schema name = " + ((Schema_nameContext)_localctx).tmpName.getText() + " \n");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public Token tmpName;
		public TerminalNode ID() { return getToken(MiniSQLParser.ID, 0); }
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			((Table_nameContext)_localctx).tmpName = match(ID);
			if(((Table_nameContext)_localctx).tmpName.getText().length() <= 64) System.out.println("table name = " + ((Table_nameContext)_localctx).tmpName.getText() + " \n");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public Token tmpName;
		public TerminalNode ID() { return getToken(MiniSQLParser.ID, 0); }
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			((Column_nameContext)_localctx).tmpName = match(ID);
			if(((Column_nameContext)_localctx).tmpName.getText().length() <= 64) System.out.println("column name = " + ((Column_nameContext)_localctx).tmpName.getText() + " \n");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_nameContext extends ParserRuleContext {
		public Token tmpName;
		public TerminalNode ID() { return getToken(MiniSQLParser.ID, 0); }
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			((Index_nameContext)_localctx).tmpName = match(ID);
			if(((Index_nameContext)_localctx).tmpName.getText().length() <= 64) System.out.println("index name = " + ((Index_nameContext)_localctx).tmpName.getText() + " \n");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<Exp_factor1Context> exp_factor1() {
			return getRuleContexts(Exp_factor1Context.class);
		}
		public Exp_factor1Context exp_factor1(int i) {
			return getRuleContext(Exp_factor1Context.class,i);
		}
		public List<TerminalNode> OR_SYM() { return getTokens(MiniSQLParser.OR_SYM); }
		public TerminalNode OR_SYM(int i) {
			return getToken(MiniSQLParser.OR_SYM, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			exp_factor1();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR_SYM) {
				{
				{
				setState(119);
				match(OR_SYM);
				setState(120);
				exp_factor1();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_factor1Context extends ParserRuleContext {
		public List<Exp_factor2Context> exp_factor2() {
			return getRuleContexts(Exp_factor2Context.class);
		}
		public Exp_factor2Context exp_factor2(int i) {
			return getRuleContext(Exp_factor2Context.class,i);
		}
		public List<TerminalNode> XOR_SYM() { return getTokens(MiniSQLParser.XOR_SYM); }
		public TerminalNode XOR_SYM(int i) {
			return getToken(MiniSQLParser.XOR_SYM, i);
		}
		public Exp_factor1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_factor1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitExp_factor1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_factor1Context exp_factor1() throws RecognitionException {
		Exp_factor1Context _localctx = new Exp_factor1Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_exp_factor1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			exp_factor2();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XOR_SYM) {
				{
				{
				setState(127);
				match(XOR_SYM);
				setState(128);
				exp_factor2();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_factor2Context extends ParserRuleContext {
		public List<Exp_factor3Context> exp_factor3() {
			return getRuleContexts(Exp_factor3Context.class);
		}
		public Exp_factor3Context exp_factor3(int i) {
			return getRuleContext(Exp_factor3Context.class,i);
		}
		public List<TerminalNode> AND_SYM() { return getTokens(MiniSQLParser.AND_SYM); }
		public TerminalNode AND_SYM(int i) {
			return getToken(MiniSQLParser.AND_SYM, i);
		}
		public Exp_factor2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_factor2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitExp_factor2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_factor2Context exp_factor2() throws RecognitionException {
		Exp_factor2Context _localctx = new Exp_factor2Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_exp_factor2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			exp_factor3();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_SYM) {
				{
				{
				setState(135);
				match(AND_SYM);
				setState(136);
				exp_factor3();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_factor3Context extends ParserRuleContext {
		public Exp_factor4Context exp_factor4() {
			return getRuleContext(Exp_factor4Context.class,0);
		}
		public TerminalNode NOT_SYM() { return getToken(MiniSQLParser.NOT_SYM, 0); }
		public Exp_factor3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_factor3; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitExp_factor3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_factor3Context exp_factor3() throws RecognitionException {
		Exp_factor3Context _localctx = new Exp_factor3Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_exp_factor3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT_SYM) {
				{
				setState(142);
				match(NOT_SYM);
				}
			}

			setState(145);
			exp_factor4();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_factor4Context extends ParserRuleContext {
		public List<Bit_exprContext> bit_expr() {
			return getRuleContexts(Bit_exprContext.class);
		}
		public Bit_exprContext bit_expr(int i) {
			return getRuleContext(Bit_exprContext.class,i);
		}
		public Relational_opContext relational_op() {
			return getRuleContext(Relational_opContext.class,0);
		}
		public Exp_factor4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_factor4; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitExp_factor4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_factor4Context exp_factor4() throws RecognitionException {
		Exp_factor4Context _localctx = new Exp_factor4Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_exp_factor4);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(147);
				bit_expr();
				setState(148);
				relational_op();
				setState(149);
				bit_expr();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				bit_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_exprContext extends ParserRuleContext {
		public List<Factor1Context> factor1() {
			return getRuleContexts(Factor1Context.class);
		}
		public Factor1Context factor1(int i) {
			return getRuleContext(Factor1Context.class,i);
		}
		public TerminalNode PLUS() { return getToken(MiniSQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MiniSQLParser.MINUS, 0); }
		public Bit_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitBit_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bit_exprContext bit_expr() throws RecognitionException {
		Bit_exprContext _localctx = new Bit_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bit_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			factor1();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(155);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(156);
				factor1();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor1Context extends ParserRuleContext {
		public List<Factor2Context> factor2() {
			return getRuleContexts(Factor2Context.class);
		}
		public Factor2Context factor2(int i) {
			return getRuleContext(Factor2Context.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(MiniSQLParser.ASTERISK, 0); }
		public TerminalNode DIVIDE() { return getToken(MiniSQLParser.DIVIDE, 0); }
		public TerminalNode MOD_SYM() { return getToken(MiniSQLParser.MOD_SYM, 0); }
		public TerminalNode POWER_OP() { return getToken(MiniSQLParser.POWER_OP, 0); }
		public Factor1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitFactor1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor1Context factor1() throws RecognitionException {
		Factor1Context _localctx = new Factor1Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_factor1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			factor2();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIVIDE) | (1L << MOD_SYM) | (1L << ASTERISK) | (1L << POWER_OP))) != 0)) {
				{
				setState(160);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIVIDE) | (1L << MOD_SYM) | (1L << ASTERISK) | (1L << POWER_OP))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(161);
				factor2();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor2Context extends ParserRuleContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(MiniSQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MiniSQLParser.MINUS, 0); }
		public Factor2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitFactor2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor2Context factor2() throws RecognitionException {
		Factor2Context _localctx = new Factor2Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_factor2);
		int _la;
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(165);
				simple_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				simple_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_exprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MiniSQLParser.LPAREN, 0); }
		public Bit_exprContext bit_expr() {
			return getRuleContext(Bit_exprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniSQLParser.RPAREN, 0); }
		public Simple_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitSimple_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_exprContext simple_expr() throws RecognitionException {
		Simple_exprContext _localctx = new Simple_exprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_simple_expr);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL_SYM:
			case PLUS:
			case MINUS:
			case INTEGER_NUM:
			case REAL_NUM:
			case TEXT_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				literal_value();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				column_spec();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				match(LPAREN);
				setState(172);
				bit_expr();
				setState(173);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_specContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(MiniSQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MiniSQLParser.DOT, i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Column_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_spec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitColumn_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_specContext column_spec() throws RecognitionException {
		Column_specContext _localctx = new Column_specContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_column_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(180);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(177);
					schema_name();
					setState(178);
					match(DOT);
					}
					break;
				}
				setState(182);
				table_name();
				setState(183);
				match(DOT);
				}
				break;
			}
			setState(187);
			column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_specContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(MiniSQLParser.DOT, 0); }
		public Table_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_spec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitTable_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_specContext table_spec() throws RecognitionException {
		Table_specContext _localctx = new Table_specContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_table_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(189);
				schema_name();
				setState(190);
				match(DOT);
				}
				break;
			}
			setState(194);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_listContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MiniSQLParser.LPAREN, 0); }
		public List<Column_specContext> column_spec() {
			return getRuleContexts(Column_specContext.class);
		}
		public Column_specContext column_spec(int i) {
			return getRuleContext(Column_specContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MiniSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MiniSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniSQLParser.COMMA, i);
		}
		public Column_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitColumn_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_listContext column_list() throws RecognitionException {
		Column_listContext _localctx = new Column_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_column_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(LPAREN);
			setState(197);
			column_spec();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(198);
				match(COMMA);
				setState(199);
				column_spec();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Root_statementContext extends ParserRuleContext {
		public Data_manipulation_statementsContext data_manipulation_statements() {
			return getRuleContext(Data_manipulation_statementsContext.class,0);
		}
		public Data_definition_statementsContext data_definition_statements() {
			return getRuleContext(Data_definition_statementsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MiniSQLParser.SEMI, 0); }
		public Root_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitRoot_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Root_statementContext root_statement() throws RecognitionException {
		Root_statementContext _localctx = new Root_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_root_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT_SYM:
			case DELETE_SYM:
			case INSERT_SYM:
			case UPDATE_SYM:
				{
				setState(207);
				data_manipulation_statements();
				}
				break;
			case CREATE:
			case DROP:
				{
				setState(208);
				data_definition_statements();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(211);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_manipulation_statementsContext extends ParserRuleContext {
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Delete_statementContext delete_statement() {
			return getRuleContext(Delete_statementContext.class,0);
		}
		public Insert_statementContext insert_statement() {
			return getRuleContext(Insert_statementContext.class,0);
		}
		public Update_statementContext update_statement() {
			return getRuleContext(Update_statementContext.class,0);
		}
		public Data_manipulation_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_manipulation_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitData_manipulation_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_manipulation_statementsContext data_manipulation_statements() throws RecognitionException {
		Data_manipulation_statementsContext _localctx = new Data_manipulation_statementsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_data_manipulation_statements);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT_SYM:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				select_statement();
				}
				break;
			case DELETE_SYM:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				delete_statement();
				}
				break;
			case INSERT_SYM:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				insert_statement();
				}
				break;
			case UPDATE_SYM:
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				update_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_definition_statementsContext extends ParserRuleContext {
		public Create_database_statementContext create_database_statement() {
			return getRuleContext(Create_database_statementContext.class,0);
		}
		public Drop_database_statementContext drop_database_statement() {
			return getRuleContext(Drop_database_statementContext.class,0);
		}
		public Create_table_statementContext create_table_statement() {
			return getRuleContext(Create_table_statementContext.class,0);
		}
		public Drop_table_statementContext drop_table_statement() {
			return getRuleContext(Drop_table_statementContext.class,0);
		}
		public Create_index_statementContext create_index_statement() {
			return getRuleContext(Create_index_statementContext.class,0);
		}
		public Drop_index_statementContext drop_index_statement() {
			return getRuleContext(Drop_index_statementContext.class,0);
		}
		public Data_definition_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_definition_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitData_definition_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_definition_statementsContext data_definition_statements() throws RecognitionException {
		Data_definition_statementsContext _localctx = new Data_definition_statementsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_data_definition_statements);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				create_database_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				drop_database_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				create_table_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				drop_table_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(224);
				create_index_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(225);
				drop_index_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_statementContext extends ParserRuleContext {
		public TerminalNode SELECT_SYM() { return getToken(MiniSQLParser.SELECT_SYM, 0); }
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode FROM() { return getToken(MiniSQLParser.FROM, 0); }
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public Orderby_clauseContext orderby_clause() {
			return getRuleContext(Orderby_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitSelect_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_select_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(SELECT_SYM);
			setState(229);
			select_list();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(230);
				match(FROM);
				setState(231);
				table_spec();
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(232);
					where_clause();
					}
				}

				}
			}

			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_SYM) {
				{
				setState(237);
				orderby_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(MiniSQLParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(WHERE);
			setState(241);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Orderby_clauseContext extends ParserRuleContext {
		public TerminalNode ORDER_SYM() { return getToken(MiniSQLParser.ORDER_SYM, 0); }
		public TerminalNode BY_SYM() { return getToken(MiniSQLParser.BY_SYM, 0); }
		public List<Orderby_itemContext> orderby_item() {
			return getRuleContexts(Orderby_itemContext.class);
		}
		public Orderby_itemContext orderby_item(int i) {
			return getRuleContext(Orderby_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniSQLParser.COMMA, i);
		}
		public Orderby_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitOrderby_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Orderby_clauseContext orderby_clause() throws RecognitionException {
		Orderby_clauseContext _localctx = new Orderby_clauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_orderby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(ORDER_SYM);
			setState(244);
			match(BY_SYM);
			setState(245);
			orderby_item();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(246);
				match(COMMA);
				setState(247);
				orderby_item();
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Orderby_itemContext extends ParserRuleContext {
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public TerminalNode ASC() { return getToken(MiniSQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(MiniSQLParser.DESC, 0); }
		public Orderby_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitOrderby_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Orderby_itemContext orderby_item() throws RecognitionException {
		Orderby_itemContext _localctx = new Orderby_itemContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_orderby_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			column_spec();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(254);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_listContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(MiniSQLParser.ASTERISK, 0); }
		public List<Displayed_columnContext> displayed_column() {
			return getRuleContexts(Displayed_columnContext.class);
		}
		public Displayed_columnContext displayed_column(int i) {
			return getRuleContext(Displayed_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniSQLParser.COMMA, i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitSelect_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_select_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				{
				setState(257);
				displayed_column();
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(258);
					match(COMMA);
					setState(259);
					displayed_column();
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case ASTERISK:
				{
				setState(265);
				match(ASTERISK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Displayed_columnContext extends ParserRuleContext {
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public TerminalNode DOT() { return getToken(MiniSQLParser.DOT, 0); }
		public TerminalNode ASTERISK() { return getToken(MiniSQLParser.ASTERISK, 0); }
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public Displayed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayed_column; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitDisplayed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Displayed_columnContext displayed_column() throws RecognitionException {
		Displayed_columnContext _localctx = new Displayed_columnContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_displayed_column);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(268);
				table_spec();
				setState(269);
				match(DOT);
				setState(270);
				match(ASTERISK);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(272);
				column_spec();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_statementContext extends ParserRuleContext {
		public TerminalNode DELETE_SYM() { return getToken(MiniSQLParser.DELETE_SYM, 0); }
		public TerminalNode FROM() { return getToken(MiniSQLParser.FROM, 0); }
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Delete_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitDelete_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_statementContext delete_statement() throws RecognitionException {
		Delete_statementContext _localctx = new Delete_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_delete_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(DELETE_SYM);
			setState(276);
			match(FROM);
			setState(277);
			table_spec();
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(278);
				where_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_statementContext extends ParserRuleContext {
		public TerminalNode INSERT_SYM() { return getToken(MiniSQLParser.INSERT_SYM, 0); }
		public TerminalNode INTO() { return getToken(MiniSQLParser.INTO, 0); }
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public Value_list_clauseContext value_list_clause() {
			return getRuleContext(Value_list_clauseContext.class,0);
		}
		public Insert_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitInsert_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_statementContext insert_statement() throws RecognitionException {
		Insert_statementContext _localctx = new Insert_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_insert_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(INSERT_SYM);
			setState(282);
			match(INTO);
			setState(283);
			table_spec();
			setState(284);
			column_list();
			setState(285);
			value_list_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_list_clauseContext extends ParserRuleContext {
		public List<Column_value_listContext> column_value_list() {
			return getRuleContexts(Column_value_listContext.class);
		}
		public Column_value_listContext column_value_list(int i) {
			return getRuleContext(Column_value_listContext.class,i);
		}
		public TerminalNode VALUES() { return getToken(MiniSQLParser.VALUES, 0); }
		public TerminalNode VALUE_SYM() { return getToken(MiniSQLParser.VALUE_SYM, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MiniSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniSQLParser.COMMA, i);
		}
		public Value_list_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_list_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitValue_list_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_list_clauseContext value_list_clause() throws RecognitionException {
		Value_list_clauseContext _localctx = new Value_list_clauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_value_list_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_la = _input.LA(1);
			if ( !(_la==VALUE_SYM || _la==VALUES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(288);
			column_value_list();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(289);
				match(COMMA);
				setState(290);
				column_value_list();
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_value_listContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MiniSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniSQLParser.RPAREN, 0); }
		public List<Literal_valueContext> literal_value() {
			return getRuleContexts(Literal_valueContext.class);
		}
		public Literal_valueContext literal_value(int i) {
			return getRuleContext(Literal_valueContext.class,i);
		}
		public List<TerminalNode> DEFAULT() { return getTokens(MiniSQLParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(MiniSQLParser.DEFAULT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniSQLParser.COMMA, i);
		}
		public Column_value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_value_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitColumn_value_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_value_listContext column_value_list() throws RecognitionException {
		Column_value_listContext _localctx = new Column_value_listContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_column_value_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(LPAREN);
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL_SYM:
			case PLUS:
			case MINUS:
			case INTEGER_NUM:
			case REAL_NUM:
			case TEXT_STRING:
				{
				setState(297);
				literal_value();
				}
				break;
			case DEFAULT:
				{
				setState(298);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(301);
				match(COMMA);
				setState(304);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NULL_SYM:
				case PLUS:
				case MINUS:
				case INTEGER_NUM:
				case REAL_NUM:
				case TEXT_STRING:
					{
					setState(302);
					literal_value();
					}
					break;
				case DEFAULT:
					{
					setState(303);
					match(DEFAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_statementContext extends ParserRuleContext {
		public TerminalNode UPDATE_SYM() { return getToken(MiniSQLParser.UPDATE_SYM, 0); }
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public Set_columns_clauseContext set_columns_clause() {
			return getRuleContext(Set_columns_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Orderby_clauseContext orderby_clause() {
			return getRuleContext(Orderby_clauseContext.class,0);
		}
		public Update_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitUpdate_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_statementContext update_statement() throws RecognitionException {
		Update_statementContext _localctx = new Update_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_update_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(UPDATE_SYM);
			setState(314);
			table_spec();
			setState(315);
			set_columns_clause();
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(316);
				where_clause();
				}
			}

			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_SYM) {
				{
				setState(319);
				orderby_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_columns_clauseContext extends ParserRuleContext {
		public TerminalNode SET_SYM() { return getToken(MiniSQLParser.SET_SYM, 0); }
		public List<Set_column_clauseContext> set_column_clause() {
			return getRuleContexts(Set_column_clauseContext.class);
		}
		public Set_column_clauseContext set_column_clause(int i) {
			return getRuleContext(Set_column_clauseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniSQLParser.COMMA, i);
		}
		public Set_columns_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_columns_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitSet_columns_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_columns_clauseContext set_columns_clause() throws RecognitionException {
		Set_columns_clauseContext _localctx = new Set_columns_clauseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_set_columns_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(SET_SYM);
			setState(323);
			set_column_clause();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(324);
				match(COMMA);
				setState(325);
				set_column_clause();
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_column_clauseContext extends ParserRuleContext {
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public TerminalNode SET_VAR() { return getToken(MiniSQLParser.SET_VAR, 0); }
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(MiniSQLParser.DEFAULT, 0); }
		public Set_column_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_column_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitSet_column_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_column_clauseContext set_column_clause() throws RecognitionException {
		Set_column_clauseContext _localctx = new Set_column_clauseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_set_column_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			column_spec();
			setState(332);
			match(SET_VAR);
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL_SYM:
			case PLUS:
			case MINUS:
			case INTEGER_NUM:
			case REAL_NUM:
			case TEXT_STRING:
				{
				setState(333);
				literal_value();
				}
				break;
			case DEFAULT:
				{
				setState(334);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_database_statementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MiniSQLParser.CREATE, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DATABASE() { return getToken(MiniSQLParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(MiniSQLParser.SCHEMA, 0); }
		public Create_database_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitCreate_database_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_database_statementContext create_database_statement() throws RecognitionException {
		Create_database_statementContext _localctx = new Create_database_statementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_create_database_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(CREATE);
			setState(338);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(339);
			schema_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_database_statementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MiniSQLParser.DROP, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DATABASE() { return getToken(MiniSQLParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(MiniSQLParser.SCHEMA, 0); }
		public Drop_database_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_database_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitDrop_database_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_database_statementContext drop_database_statement() throws RecognitionException {
		Drop_database_statementContext _localctx = new Drop_database_statementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_drop_database_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(DROP);
			setState(342);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(343);
			schema_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_statementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MiniSQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(MiniSQLParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MiniSQLParser.LPAREN, 0); }
		public List<Create_definitionContext> create_definition() {
			return getRuleContexts(Create_definitionContext.class);
		}
		public Create_definitionContext create_definition(int i) {
			return getRuleContext(Create_definitionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MiniSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MiniSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniSQLParser.COMMA, i);
		}
		public Create_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitCreate_table_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_statementContext create_table_statement() throws RecognitionException {
		Create_table_statementContext _localctx = new Create_table_statementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_create_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(CREATE);
			setState(346);
			match(TABLE);
			setState(347);
			table_name();
			setState(348);
			match(LPAREN);
			setState(349);
			create_definition();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(350);
				match(COMMA);
				setState(351);
				create_definition();
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(357);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_definitionContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Column_data_type_headerContext column_data_type_header() {
			return getRuleContext(Column_data_type_headerContext.class,0);
		}
		public TerminalNode PRIMARY_SYM() { return getToken(MiniSQLParser.PRIMARY_SYM, 0); }
		public TerminalNode KEY_SYM() { return getToken(MiniSQLParser.KEY_SYM, 0); }
		public TerminalNode LPAREN() { return getToken(MiniSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniSQLParser.RPAREN, 0); }
		public TerminalNode UNIQUE_SYM() { return getToken(MiniSQLParser.UNIQUE_SYM, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MiniSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniSQLParser.COMMA, i);
		}
		public Create_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitCreate_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_definitionContext create_definition() throws RecognitionException {
		Create_definitionContext _localctx = new Create_definitionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_create_definition);
		int _la;
		try {
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(359);
				column_name();
				setState(360);
				column_data_type_header();
				}
				}
				break;
			case PRIMARY_SYM:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(362);
				match(PRIMARY_SYM);
				setState(363);
				match(KEY_SYM);
				setState(364);
				match(LPAREN);
				setState(365);
				column_name();
				setState(366);
				match(RPAREN);
				}
				}
				break;
			case UNIQUE_SYM:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(368);
				match(UNIQUE_SYM);
				setState(369);
				match(LPAREN);
				setState(370);
				column_name();
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(371);
					match(COMMA);
					setState(372);
					column_name();
					}
					}
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(378);
				match(RPAREN);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_or_notnullContext extends ParserRuleContext {
		public TerminalNode NOT_SYM() { return getToken(MiniSQLParser.NOT_SYM, 0); }
		public TerminalNode NULL_SYM() { return getToken(MiniSQLParser.NULL_SYM, 0); }
		public Null_or_notnullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_or_notnull; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitNull_or_notnull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_or_notnullContext null_or_notnull() throws RecognitionException {
		Null_or_notnullContext _localctx = new Null_or_notnullContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_null_or_notnull);
		try {
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT_SYM:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(382);
				match(NOT_SYM);
				setState(383);
				match(NULL_SYM);
				}
				}
				break;
			case NULL_SYM:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				match(NULL_SYM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LengthContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(MiniSQLParser.INTEGER_NUM, 0); }
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(INTEGER_NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_data_type_headerContext extends ParserRuleContext {
		public TerminalNode INT_SYM() { return getToken(MiniSQLParser.INT_SYM, 0); }
		public Null_or_notnullContext null_or_notnull() {
			return getRuleContext(Null_or_notnullContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(MiniSQLParser.DEFAULT, 0); }
		public Number_literalContext number_literal() {
			return getRuleContext(Number_literalContext.class,0);
		}
		public TerminalNode INTEGER_SYM() { return getToken(MiniSQLParser.INTEGER_SYM, 0); }
		public TerminalNode FLOAT_SYM() { return getToken(MiniSQLParser.FLOAT_SYM, 0); }
		public TerminalNode CHAR() { return getToken(MiniSQLParser.CHAR, 0); }
		public TerminalNode LPAREN() { return getToken(MiniSQLParser.LPAREN, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniSQLParser.RPAREN, 0); }
		public TerminalNode TEXT_STRING() { return getToken(MiniSQLParser.TEXT_STRING, 0); }
		public Column_data_type_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_data_type_header; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitColumn_data_type_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_data_type_headerContext column_data_type_header() throws RecognitionException {
		Column_data_type_headerContext _localctx = new Column_data_type_headerContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_column_data_type_header);
		int _la;
		try {
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
			case RPAREN:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case INT_SYM:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(390);
				match(INT_SYM);
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NULL_SYM || _la==NOT_SYM) {
					{
					setState(391);
					null_or_notnull();
					}
				}

				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(394);
					match(DEFAULT);
					setState(395);
					number_literal();
					}
				}

				}
				}
				break;
			case INTEGER_SYM:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(398);
				match(INTEGER_SYM);
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NULL_SYM || _la==NOT_SYM) {
					{
					setState(399);
					null_or_notnull();
					}
				}

				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(402);
					match(DEFAULT);
					setState(403);
					number_literal();
					}
				}

				}
				}
				break;
			case FLOAT_SYM:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(406);
				match(FLOAT_SYM);
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NULL_SYM || _la==NOT_SYM) {
					{
					setState(407);
					null_or_notnull();
					}
				}

				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(410);
					match(DEFAULT);
					setState(411);
					number_literal();
					}
				}

				}
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(414);
				match(CHAR);
				{
				setState(415);
				match(LPAREN);
				setState(416);
				length();
				setState(417);
				match(RPAREN);
				}
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NULL_SYM || _la==NOT_SYM) {
					{
					setState(419);
					null_or_notnull();
					}
				}

				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(422);
					match(DEFAULT);
					setState(423);
					match(TEXT_STRING);
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_table_statementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MiniSQLParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(MiniSQLParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Drop_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitDrop_table_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_statementContext drop_table_statement() throws RecognitionException {
		Drop_table_statementContext _localctx = new Drop_table_statementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_drop_table_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(DROP);
			setState(429);
			match(TABLE);
			setState(430);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_index_statementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MiniSQLParser.CREATE, 0); }
		public TerminalNode UNIQUE_SYM() { return getToken(MiniSQLParser.UNIQUE_SYM, 0); }
		public TerminalNode INDEX_SYM() { return getToken(MiniSQLParser.INDEX_SYM, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode ON() { return getToken(MiniSQLParser.ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MiniSQLParser.LPAREN, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MiniSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MiniSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniSQLParser.COMMA, i);
		}
		public Create_index_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitCreate_index_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_statementContext create_index_statement() throws RecognitionException {
		Create_index_statementContext _localctx = new Create_index_statementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_create_index_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(CREATE);
			setState(433);
			match(UNIQUE_SYM);
			setState(434);
			match(INDEX_SYM);
			setState(435);
			index_name();
			setState(436);
			match(ON);
			setState(437);
			table_name();
			setState(438);
			match(LPAREN);
			setState(439);
			column_name();
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(440);
				match(COMMA);
				setState(441);
				column_name();
				}
				}
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(447);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_index_statementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MiniSQLParser.DROP, 0); }
		public TerminalNode INDEX_SYM() { return getToken(MiniSQLParser.INDEX_SYM, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode ON() { return getToken(MiniSQLParser.ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Drop_index_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitDrop_index_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_index_statementContext drop_index_statement() throws RecognitionException {
		Drop_index_statementContext _localctx = new Drop_index_statementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_drop_index_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(DROP);
			setState(450);
			match(INDEX_SYM);
			setState(451);
			index_name();
			setState(452);
			match(ON);
			setState(453);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u01ca\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\4\5\4d\n\4\3\4\3\4\3\5\3\5\3"+
		"\5\5\5k\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\7\n|\n\n\f\n\16\n\177\13\n\3\13\3\13\3\13\7\13\u0084\n\13\f\13\16\13"+
		"\u0087\13\13\3\f\3\f\3\f\7\f\u008c\n\f\f\f\16\f\u008f\13\f\3\r\5\r\u0092"+
		"\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u009b\n\16\3\17\3\17\3\17\5"+
		"\17\u00a0\n\17\3\20\3\20\3\20\5\20\u00a5\n\20\3\21\3\21\3\21\5\21\u00aa"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00b2\n\22\3\23\3\23\3\23\5\23"+
		"\u00b7\n\23\3\23\3\23\3\23\5\23\u00bc\n\23\3\23\3\23\3\24\3\24\3\24\5"+
		"\24\u00c3\n\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00cb\n\25\f\25\16\25"+
		"\u00ce\13\25\3\25\3\25\3\26\3\26\5\26\u00d4\n\26\3\26\5\26\u00d7\n\26"+
		"\3\27\3\27\3\27\3\27\5\27\u00dd\n\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u00e5\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u00ec\n\31\5\31\u00ee\n\31\3"+
		"\31\5\31\u00f1\n\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\7\33\u00fb"+
		"\n\33\f\33\16\33\u00fe\13\33\3\34\3\34\5\34\u0102\n\34\3\35\3\35\3\35"+
		"\7\35\u0107\n\35\f\35\16\35\u010a\13\35\3\35\5\35\u010d\n\35\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u0114\n\36\3\37\3\37\3\37\3\37\5\37\u011a\n\37\3"+
		" \3 \3 \3 \3 \3 \3!\3!\3!\3!\7!\u0126\n!\f!\16!\u0129\13!\3\"\3\"\3\""+
		"\5\"\u012e\n\"\3\"\3\"\3\"\5\"\u0133\n\"\7\"\u0135\n\"\f\"\16\"\u0138"+
		"\13\"\3\"\3\"\3#\3#\3#\3#\5#\u0140\n#\3#\5#\u0143\n#\3$\3$\3$\3$\7$\u0149"+
		"\n$\f$\16$\u014c\13$\3%\3%\3%\3%\5%\u0152\n%\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3(\3(\7(\u0163\n(\f(\16(\u0166\13(\3(\3(\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u0178\n)\f)\16)\u017b\13)\3)\3)\5)"+
		"\u017f\n)\3*\3*\3*\5*\u0184\n*\3+\3+\3,\3,\3,\5,\u018b\n,\3,\3,\5,\u018f"+
		"\n,\3,\3,\5,\u0193\n,\3,\3,\5,\u0197\n,\3,\3,\5,\u019b\n,\3,\3,\5,\u019f"+
		"\n,\3,\3,\3,\3,\3,\3,\5,\u01a7\n,\3,\3,\5,\u01ab\n,\5,\u01ad\n,\3-\3-"+
		"\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u01bd\n.\f.\16.\u01c0\13.\3.\3"+
		".\3/\3/\3/\3/\3/\3/\3/\2\2\60\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\t\3\2+\60\3\2<=\3\2BC\5\2#"+
		"$\67\67AA\3\2\13\f\3\2\34\35\4\2\4\4\b\b\2\u01d9\2^\3\2\2\2\4`\3\2\2\2"+
		"\6c\3\2\2\2\bj\3\2\2\2\nl\3\2\2\2\fo\3\2\2\2\16r\3\2\2\2\20u\3\2\2\2\22"+
		"x\3\2\2\2\24\u0080\3\2\2\2\26\u0088\3\2\2\2\30\u0091\3\2\2\2\32\u009a"+
		"\3\2\2\2\34\u009c\3\2\2\2\36\u00a1\3\2\2\2 \u00a9\3\2\2\2\"\u00b1\3\2"+
		"\2\2$\u00bb\3\2\2\2&\u00c2\3\2\2\2(\u00c6\3\2\2\2*\u00d3\3\2\2\2,\u00dc"+
		"\3\2\2\2.\u00e4\3\2\2\2\60\u00e6\3\2\2\2\62\u00f2\3\2\2\2\64\u00f5\3\2"+
		"\2\2\66\u00ff\3\2\2\28\u010c\3\2\2\2:\u0113\3\2\2\2<\u0115\3\2\2\2>\u011b"+
		"\3\2\2\2@\u0121\3\2\2\2B\u012a\3\2\2\2D\u013b\3\2\2\2F\u0144\3\2\2\2H"+
		"\u014d\3\2\2\2J\u0153\3\2\2\2L\u0157\3\2\2\2N\u015b\3\2\2\2P\u017e\3\2"+
		"\2\2R\u0183\3\2\2\2T\u0185\3\2\2\2V\u01ac\3\2\2\2X\u01ae\3\2\2\2Z\u01b2"+
		"\3\2\2\2\\\u01c3\3\2\2\2^_\t\2\2\2_\3\3\2\2\2`a\7D\2\2a\5\3\2\2\2bd\t"+
		"\3\2\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\t\4\2\2f\7\3\2\2\2gk\5\4\3\2hk"+
		"\5\6\4\2ik\7\36\2\2jg\3\2\2\2jh\3\2\2\2ji\3\2\2\2k\t\3\2\2\2lm\7E\2\2"+
		"mn\b\6\1\2n\13\3\2\2\2op\7E\2\2pq\b\7\1\2q\r\3\2\2\2rs\7E\2\2st\b\b\1"+
		"\2t\17\3\2\2\2uv\7E\2\2vw\b\t\1\2w\21\3\2\2\2x}\5\24\13\2yz\7%\2\2z|\5"+
		"\24\13\2{y\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\23\3\2\2\2\177}\3"+
		"\2\2\2\u0080\u0085\5\26\f\2\u0081\u0082\7(\2\2\u0082\u0084\5\26\f\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\25\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008d\5\30\r\2\u0089\u008a"+
		"\7&\2\2\u008a\u008c\5\30\r\2\u008b\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\27\3\2\2\2\u008f\u008d\3\2\2"+
		"\2\u0090\u0092\7\'\2\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0094\5\32\16\2\u0094\31\3\2\2\2\u0095\u0096\5\34\17\2"+
		"\u0096\u0097\5\2\2\2\u0097\u0098\5\34\17\2\u0098\u009b\3\2\2\2\u0099\u009b"+
		"\5\34\17\2\u009a\u0095\3\2\2\2\u009a\u0099\3\2\2\2\u009b\33\3\2\2\2\u009c"+
		"\u009f\5\36\20\2\u009d\u009e\t\3\2\2\u009e\u00a0\5\36\20\2\u009f\u009d"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\35\3\2\2\2\u00a1\u00a4\5 \21\2\u00a2"+
		"\u00a3\t\5\2\2\u00a3\u00a5\5 \21\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\37\3\2\2\2\u00a6\u00a7\t\3\2\2\u00a7\u00aa\5\"\22\2\u00a8\u00aa"+
		"\5\"\22\2\u00a9\u00a6\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa!\3\2\2\2\u00ab"+
		"\u00b2\5\b\5\2\u00ac\u00b2\5$\23\2\u00ad\u00ae\79\2\2\u00ae\u00af\5\34"+
		"\17\2\u00af\u00b0\78\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00ab\3\2\2\2\u00b1"+
		"\u00ac\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b2#\3\2\2\2\u00b3\u00b4\5\n\6\2"+
		"\u00b4\u00b5\7\65\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\5\f\7\2\u00b9\u00ba\7\65\2\2"+
		"\u00ba\u00bc\3\2\2\2\u00bb\u00b6\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00be\5\16\b\2\u00be%\3\2\2\2\u00bf\u00c0\5\n\6\2\u00c0"+
		"\u00c1\7\65\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c2\u00c3\3"+
		"\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\5\f\7\2\u00c5\'\3\2\2\2\u00c6\u00c7"+
		"\79\2\2\u00c7\u00cc\5$\23\2\u00c8\u00c9\7\66\2\2\u00c9\u00cb\5$\23\2\u00ca"+
		"\u00c8\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\78\2\2\u00d0"+
		")\3\2\2\2\u00d1\u00d4\5,\27\2\u00d2\u00d4\5.\30\2\u00d3\u00d1\3\2\2\2"+
		"\u00d3\u00d2\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d7\7\63\2\2\u00d6\u00d5"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7+\3\2\2\2\u00d8\u00dd\5\60\31\2\u00d9"+
		"\u00dd\5<\37\2\u00da\u00dd\5> \2\u00db\u00dd\5D#\2\u00dc\u00d8\3\2\2\2"+
		"\u00dc\u00d9\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd-\3"+
		"\2\2\2\u00de\u00e5\5J&\2\u00df\u00e5\5L\'\2\u00e0\u00e5\5N(\2\u00e1\u00e5"+
		"\5X-\2\u00e2\u00e5\5Z.\2\u00e3\u00e5\5\\/\2\u00e4\u00de\3\2\2\2\u00e4"+
		"\u00df\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e4\u00e3\3\2\2\2\u00e5/\3\2\2\2\u00e6\u00e7\7\25\2\2\u00e7\u00ed"+
		"\58\35\2\u00e8\u00e9\7\t\2\2\u00e9\u00eb\5&\24\2\u00ea\u00ec\5\62\32\2"+
		"\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00e8"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00f1\5\64\33\2"+
		"\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\61\3\2\2\2\u00f2\u00f3"+
		"\7\n\2\2\u00f3\u00f4\5\22\n\2\u00f4\63\3\2\2\2\u00f5\u00f6\7\31\2\2\u00f6"+
		"\u00f7\7\32\2\2\u00f7\u00fc\5\66\34\2\u00f8\u00f9\7\66\2\2\u00f9\u00fb"+
		"\5\66\34\2\u00fa\u00f8\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2"+
		"\u00fc\u00fd\3\2\2\2\u00fd\65\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0101"+
		"\5$\23\2\u0100\u0102\t\6\2\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\67\3\2\2\2\u0103\u0108\5:\36\2\u0104\u0105\7\66\2\2\u0105\u0107\5:\36"+
		"\2\u0106\u0104\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109"+
		"\3\2\2\2\u0109\u010d\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010d\7\67\2\2"+
		"\u010c\u0103\3\2\2\2\u010c\u010b\3\2\2\2\u010d9\3\2\2\2\u010e\u010f\5"+
		"&\24\2\u010f\u0110\7\65\2\2\u0110\u0111\7\67\2\2\u0111\u0114\3\2\2\2\u0112"+
		"\u0114\5$\23\2\u0113\u010e\3\2\2\2\u0113\u0112\3\2\2\2\u0114;\3\2\2\2"+
		"\u0115\u0116\7\26\2\2\u0116\u0117\7\t\2\2\u0117\u0119\5&\24\2\u0118\u011a"+
		"\5\62\32\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a=\3\2\2\2\u011b"+
		"\u011c\7\27\2\2\u011c\u011d\7\r\2\2\u011d\u011e\5&\24\2\u011e\u011f\5"+
		"(\25\2\u011f\u0120\5@!\2\u0120?\3\2\2\2\u0121\u0122\t\7\2\2\u0122\u0127"+
		"\5B\"\2\u0123\u0124\7\66\2\2\u0124\u0126\5B\"\2\u0125\u0123\3\2\2\2\u0126"+
		"\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128A\3\2\2\2"+
		"\u0129\u0127\3\2\2\2\u012a\u012d\79\2\2\u012b\u012e\5\b\5\2\u012c\u012e"+
		"\7\16\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e\u0136\3\2\2\2"+
		"\u012f\u0132\7\66\2\2\u0130\u0133\5\b\5\2\u0131\u0133\7\16\2\2\u0132\u0130"+
		"\3\2\2\2\u0132\u0131\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u012f\3\2\2\2\u0135"+
		"\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2"+
		"\2\2\u0138\u0136\3\2\2\2\u0139\u013a\78\2\2\u013aC\3\2\2\2\u013b\u013c"+
		"\7\30\2\2\u013c\u013d\5&\24\2\u013d\u013f\5F$\2\u013e\u0140\5\62\32\2"+
		"\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u0143"+
		"\5\64\33\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143E\3\2\2\2\u0144"+
		"\u0145\7\33\2\2\u0145\u014a\5H%\2\u0146\u0147\7\66\2\2\u0147\u0149\5H"+
		"%\2\u0148\u0146\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014bG\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\5$\23\2"+
		"\u014e\u0151\7\61\2\2\u014f\u0152\5\b\5\2\u0150\u0152\7\16\2\2\u0151\u014f"+
		"\3\2\2\2\u0151\u0150\3\2\2\2\u0152I\3\2\2\2\u0153\u0154\7\3\2\2\u0154"+
		"\u0155\t\b\2\2\u0155\u0156\5\n\6\2\u0156K\3\2\2\2\u0157\u0158\7\5\2\2"+
		"\u0158\u0159\t\b\2\2\u0159\u015a\5\n\6\2\u015aM\3\2\2\2\u015b\u015c\7"+
		"\3\2\2\u015c\u015d\7\17\2\2\u015d\u015e\5\f\7\2\u015e\u015f\79\2\2\u015f"+
		"\u0164\5P)\2\u0160\u0161\7\66\2\2\u0161\u0163\5P)\2\u0162\u0160\3\2\2"+
		"\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167"+
		"\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0168\78\2\2\u0168O\3\2\2\2\u0169\u016a"+
		"\5\16\b\2\u016a\u016b\5V,\2\u016b\u017f\3\2\2\2\u016c\u016d\7\20\2\2\u016d"+
		"\u016e\7\21\2\2\u016e\u016f\79\2\2\u016f\u0170\5\16\b\2\u0170\u0171\7"+
		"8\2\2\u0171\u017f\3\2\2\2\u0172\u0173\7\23\2\2\u0173\u0174\79\2\2\u0174"+
		"\u0179\5\16\b\2\u0175\u0176\7\66\2\2\u0176\u0178\5\16\b\2\u0177\u0175"+
		"\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017d\78\2\2\u017d\u017f\3\2"+
		"\2\2\u017e\u0169\3\2\2\2\u017e\u016c\3\2\2\2\u017e\u0172\3\2\2\2\u017f"+
		"Q\3\2\2\2\u0180\u0181\7\'\2\2\u0181\u0184\7\36\2\2\u0182\u0184\7\36\2"+
		"\2\u0183\u0180\3\2\2\2\u0183\u0182\3\2\2\2\u0184S\3\2\2\2\u0185\u0186"+
		"\7B\2\2\u0186U\3\2\2\2\u0187\u01ad\3\2\2\2\u0188\u018a\7\37\2\2\u0189"+
		"\u018b\5R*\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018e\3\2\2"+
		"\2\u018c\u018d\7\16\2\2\u018d\u018f\5\6\4\2\u018e\u018c\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018f\u01ad\3\2\2\2\u0190\u0192\7!\2\2\u0191\u0193\5R*"+
		"\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0195"+
		"\7\16\2\2\u0195\u0197\5\6\4\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2"+
		"\u0197\u01ad\3\2\2\2\u0198\u019a\7\"\2\2\u0199\u019b\5R*\2\u019a\u0199"+
		"\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019d\7\16\2\2"+
		"\u019d\u019f\5\6\4\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01ad"+
		"\3\2\2\2\u01a0\u01a1\7 \2\2\u01a1\u01a2\79\2\2\u01a2\u01a3\5T+\2\u01a3"+
		"\u01a4\78\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a7\5R*\2\u01a6\u01a5\3\2\2"+
		"\2\u01a6\u01a7\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a9\7\16\2\2\u01a9"+
		"\u01ab\7D\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\3\2"+
		"\2\2\u01ac\u0187\3\2\2\2\u01ac\u0188\3\2\2\2\u01ac\u0190\3\2\2\2\u01ac"+
		"\u0198\3\2\2\2\u01ac\u01a0\3\2\2\2\u01adW\3\2\2\2\u01ae\u01af\7\5\2\2"+
		"\u01af\u01b0\7\17\2\2\u01b0\u01b1\5\f\7\2\u01b1Y\3\2\2\2\u01b2\u01b3\7"+
		"\3\2\2\u01b3\u01b4\7\23\2\2\u01b4\u01b5\7\24\2\2\u01b5\u01b6\5\20\t\2"+
		"\u01b6\u01b7\7\22\2\2\u01b7\u01b8\5\f\7\2\u01b8\u01b9\79\2\2\u01b9\u01be"+
		"\5\16\b\2\u01ba\u01bb\7\66\2\2\u01bb\u01bd\5\16\b\2\u01bc\u01ba\3\2\2"+
		"\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1"+
		"\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c2\78\2\2\u01c2[\3\2\2\2\u01c3\u01c4"+
		"\7\5\2\2\u01c4\u01c5\7\24\2\2\u01c5\u01c6\5\20\t\2\u01c6\u01c7\7\22\2"+
		"\2\u01c7\u01c8\5\f\7\2\u01c8]\3\2\2\2\64cj}\u0085\u008d\u0091\u009a\u009f"+
		"\u00a4\u00a9\u00b1\u00b6\u00bb\u00c2\u00cc\u00d3\u00d6\u00dc\u00e4\u00eb"+
		"\u00ed\u00f0\u00fc\u0101\u0108\u010c\u0113\u0119\u0127\u012d\u0132\u0136"+
		"\u013f\u0142\u014a\u0151\u0164\u0179\u017e\u0183\u018a\u018e\u0192\u0196"+
		"\u019a\u019e\u01a6\u01aa\u01ac\u01be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}