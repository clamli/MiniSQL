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
		RULE_exp_factor3 = 11, RULE_exp_factor4 = 12, RULE_predicate = 13, RULE_bit_expr = 14, 
		RULE_factor1 = 15, RULE_factor2 = 16, RULE_factor3 = 17, RULE_factor4 = 18, 
		RULE_simple_expr = 19, RULE_expression_list = 20, RULE_column_spec = 21, 
		RULE_table_spec = 22, RULE_column_list = 23, RULE_root_statement = 24, 
		RULE_data_manipulation_statements = 25, RULE_data_definition_statements = 26, 
		RULE_select_statement = 27, RULE_where_clause = 28, RULE_orderby_clause = 29, 
		RULE_orderby_item = 30, RULE_select_list = 31, RULE_displayed_column = 32, 
		RULE_delete_statement = 33, RULE_insert_statement = 34, RULE_value_list_clause = 35, 
		RULE_column_value_list = 36, RULE_update_statement = 37, RULE_set_columns_clause = 38, 
		RULE_set_column_clause = 39, RULE_create_database_statement = 40, RULE_drop_database_statement = 41, 
		RULE_create_table_statement = 42, RULE_create_definition = 43, RULE_column_definition = 44, 
		RULE_null_or_notnull = 45, RULE_length = 46, RULE_column_data_type_header = 47, 
		RULE_drop_table_statement = 48, RULE_create_index_statement = 49, RULE_drop_index_statement = 50;
	public static final String[] ruleNames = {
		"relational_op", "string_literal", "number_literal", "literal_value", 
		"schema_name", "table_name", "column_name", "index_name", "expression", 
		"exp_factor1", "exp_factor2", "exp_factor3", "exp_factor4", "predicate", 
		"bit_expr", "factor1", "factor2", "factor3", "factor4", "simple_expr", 
		"expression_list", "column_spec", "table_spec", "column_list", "root_statement", 
		"data_manipulation_statements", "data_definition_statements", "select_statement", 
		"where_clause", "orderby_clause", "orderby_item", "select_list", "displayed_column", 
		"delete_statement", "insert_statement", "value_list_clause", "column_value_list", 
		"update_statement", "set_columns_clause", "set_column_clause", "create_database_statement", 
		"drop_database_statement", "create_table_statement", "create_definition", 
		"column_definition", "null_or_notnull", "length", "column_data_type_header", 
		"drop_table_statement", "create_index_statement", "drop_index_statement"
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
			setState(102);
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
			setState(104);
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
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(106);
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

			setState(109);
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
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_STRING:
				{
				setState(111);
				string_literal();
				}
				break;
			case PLUS:
			case MINUS:
			case INTEGER_NUM:
			case REAL_NUM:
				{
				setState(112);
				number_literal();
				}
				break;
			case NULL_SYM:
				{
				setState(113);
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
			setState(116);
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
			setState(119);
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
			setState(122);
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
			setState(125);
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
			setState(128);
			exp_factor1();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR_SYM) {
				{
				{
				setState(129);
				match(OR_SYM);
				setState(130);
				exp_factor1();
				}
				}
				setState(135);
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
			setState(136);
			exp_factor2();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XOR_SYM) {
				{
				{
				setState(137);
				match(XOR_SYM);
				setState(138);
				exp_factor2();
				}
				}
				setState(143);
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
			setState(144);
			exp_factor3();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_SYM) {
				{
				{
				setState(145);
				match(AND_SYM);
				setState(146);
				exp_factor3();
				}
				}
				setState(151);
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
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT_SYM) {
				{
				setState(152);
				match(NOT_SYM);
				}
			}

			setState(155);
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
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
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
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(157);
				predicate();
				setState(158);
				relational_op();
				setState(159);
				predicate();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				predicate();
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

	public static class PredicateContext extends ParserRuleContext {
		public Bit_exprContext bit_expr() {
			return getRuleContext(Bit_exprContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			bit_expr();
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
		public TerminalNode BITWISE() { return getToken(MiniSQLParser.BITWISE, 0); }
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
		enterRule(_localctx, 28, RULE_bit_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			factor1();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BITWISE) {
				{
				setState(167);
				match(BITWISE);
				setState(168);
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
		public TerminalNode BITAND() { return getToken(MiniSQLParser.BITAND, 0); }
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
		enterRule(_localctx, 30, RULE_factor1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			factor2();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BITAND) {
				{
				setState(172);
				match(BITAND);
				setState(173);
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
		public List<Factor3Context> factor3() {
			return getRuleContexts(Factor3Context.class);
		}
		public Factor3Context factor3(int i) {
			return getRuleContext(Factor3Context.class,i);
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
		enterRule(_localctx, 32, RULE_factor2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			factor3();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(177);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(178);
				factor3();
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

	public static class Factor3Context extends ParserRuleContext {
		public List<Factor4Context> factor4() {
			return getRuleContexts(Factor4Context.class);
		}
		public Factor4Context factor4(int i) {
			return getRuleContext(Factor4Context.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(MiniSQLParser.ASTERISK, 0); }
		public TerminalNode DIVIDE() { return getToken(MiniSQLParser.DIVIDE, 0); }
		public TerminalNode MOD_SYM() { return getToken(MiniSQLParser.MOD_SYM, 0); }
		public TerminalNode POWER_OP() { return getToken(MiniSQLParser.POWER_OP, 0); }
		public Factor3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor3; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitFactor3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor3Context factor3() throws RecognitionException {
		Factor3Context _localctx = new Factor3Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_factor3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			factor4();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIVIDE) | (1L << MOD_SYM) | (1L << ASTERISK) | (1L << POWER_OP))) != 0)) {
				{
				setState(182);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIVIDE) | (1L << MOD_SYM) | (1L << ASTERISK) | (1L << POWER_OP))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(183);
				factor4();
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

	public static class Factor4Context extends ParserRuleContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(MiniSQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MiniSQLParser.MINUS, 0); }
		public TerminalNode NEGATION() { return getToken(MiniSQLParser.NEGATION, 0); }
		public Factor4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor4; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitFactor4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor4Context factor4() throws RecognitionException {
		Factor4Context _localctx = new Factor4Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_factor4);
		int _la;
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NEGATION))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(187);
				simple_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
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
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
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
		enterRule(_localctx, 38, RULE_simple_expr);
		try {
			setState(194);
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
				setState(191);
				literal_value();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				column_spec();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				expression_list();
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

	public static class Expression_listContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MiniSQLParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MiniSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MiniSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniSQLParser.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(LPAREN);
			setState(197);
			expression();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(198);
				match(COMMA);
				setState(199);
				expression();
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
		enterRule(_localctx, 42, RULE_column_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(210);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(207);
					schema_name();
					setState(208);
					match(DOT);
					}
					break;
				}
				setState(212);
				table_name();
				setState(213);
				match(DOT);
				}
				break;
			}
			setState(217);
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
		enterRule(_localctx, 44, RULE_table_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(219);
				schema_name();
				setState(220);
				match(DOT);
				}
				break;
			}
			setState(224);
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
		enterRule(_localctx, 46, RULE_column_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(LPAREN);
			setState(227);
			column_spec();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(228);
				match(COMMA);
				setState(229);
				column_spec();
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
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
		enterRule(_localctx, 48, RULE_root_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT_SYM:
			case DELETE_SYM:
			case INSERT_SYM:
			case UPDATE_SYM:
				{
				setState(237);
				data_manipulation_statements();
				}
				break;
			case CREATE:
			case DROP:
				{
				setState(238);
				data_definition_statements();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(241);
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
		enterRule(_localctx, 50, RULE_data_manipulation_statements);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT_SYM:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				select_statement();
				}
				break;
			case DELETE_SYM:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				delete_statement();
				}
				break;
			case INSERT_SYM:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				insert_statement();
				}
				break;
			case UPDATE_SYM:
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
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
		enterRule(_localctx, 52, RULE_data_definition_statements);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				create_database_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				drop_database_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				create_table_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				drop_table_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(254);
				create_index_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(255);
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
		enterRule(_localctx, 54, RULE_select_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(SELECT_SYM);
			setState(259);
			select_list();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(260);
				match(FROM);
				setState(261);
				table_spec();
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(262);
					where_clause();
					}
				}

				}
			}

			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_SYM) {
				{
				setState(267);
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
		enterRule(_localctx, 56, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(WHERE);
			setState(271);
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
		enterRule(_localctx, 58, RULE_orderby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(ORDER_SYM);
			setState(274);
			match(BY_SYM);
			setState(275);
			orderby_item();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(276);
				match(COMMA);
				setState(277);
				orderby_item();
				}
				}
				setState(282);
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
		enterRule(_localctx, 60, RULE_orderby_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			column_spec();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(284);
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
		enterRule(_localctx, 62, RULE_select_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				{
				setState(287);
				displayed_column();
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(288);
					match(COMMA);
					setState(289);
					displayed_column();
					}
					}
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case ASTERISK:
				{
				setState(295);
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
		enterRule(_localctx, 64, RULE_displayed_column);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(298);
				table_spec();
				setState(299);
				match(DOT);
				setState(300);
				match(ASTERISK);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(302);
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
		enterRule(_localctx, 66, RULE_delete_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(DELETE_SYM);
			setState(306);
			match(FROM);
			setState(307);
			table_spec();
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(308);
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
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public Value_list_clauseContext value_list_clause() {
			return getRuleContext(Value_list_clauseContext.class,0);
		}
		public TerminalNode INTO() { return getToken(MiniSQLParser.INTO, 0); }
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
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
		enterRule(_localctx, 68, RULE_insert_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(INSERT_SYM);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(312);
				match(INTO);
				}
			}

			setState(315);
			table_spec();
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(316);
				column_list();
				}
			}

			setState(319);
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
		enterRule(_localctx, 70, RULE_value_list_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_la = _input.LA(1);
			if ( !(_la==VALUE_SYM || _la==VALUES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(322);
			column_value_list();
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(323);
				match(COMMA);
				setState(324);
				column_value_list();
				}
				}
				setState(329);
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
		enterRule(_localctx, 72, RULE_column_value_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(LPAREN);
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL_SYM:
			case PLUS:
			case MINUS:
			case INTEGER_NUM:
			case REAL_NUM:
			case TEXT_STRING:
				{
				setState(331);
				literal_value();
				}
				break;
			case DEFAULT:
				{
				setState(332);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(335);
				match(COMMA);
				setState(338);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NULL_SYM:
				case PLUS:
				case MINUS:
				case INTEGER_NUM:
				case REAL_NUM:
				case TEXT_STRING:
					{
					setState(336);
					literal_value();
					}
					break;
				case DEFAULT:
					{
					setState(337);
					match(DEFAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(345);
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
		enterRule(_localctx, 74, RULE_update_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(UPDATE_SYM);
			setState(348);
			table_spec();
			setState(349);
			set_columns_clause();
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(350);
				where_clause();
				}
			}

			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_SYM) {
				{
				setState(353);
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
		enterRule(_localctx, 76, RULE_set_columns_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(SET_SYM);
			setState(357);
			set_column_clause();
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(358);
				match(COMMA);
				setState(359);
				set_column_clause();
				}
				}
				setState(364);
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
		public TerminalNode EQ_SYM() { return getToken(MiniSQLParser.EQ_SYM, 0); }
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
		enterRule(_localctx, 78, RULE_set_column_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			column_spec();
			setState(366);
			match(EQ_SYM);
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL_SYM:
			case PLUS:
			case MINUS:
			case INTEGER_NUM:
			case REAL_NUM:
			case TEXT_STRING:
				{
				setState(367);
				literal_value();
				}
				break;
			case DEFAULT:
				{
				setState(368);
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
		public TerminalNode IF() { return getToken(MiniSQLParser.IF, 0); }
		public TerminalNode NOT_SYM() { return getToken(MiniSQLParser.NOT_SYM, 0); }
		public TerminalNode EXISTS() { return getToken(MiniSQLParser.EXISTS, 0); }
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
		enterRule(_localctx, 80, RULE_create_database_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(CREATE);
			setState(372);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(373);
				match(IF);
				setState(374);
				match(NOT_SYM);
				setState(375);
				match(EXISTS);
				}
			}

			setState(378);
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
		public TerminalNode IF() { return getToken(MiniSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(MiniSQLParser.EXISTS, 0); }
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
		enterRule(_localctx, 82, RULE_drop_database_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(DROP);
			setState(381);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(382);
				match(IF);
				setState(383);
				match(EXISTS);
				}
			}

			setState(386);
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
		public TerminalNode IF() { return getToken(MiniSQLParser.IF, 0); }
		public TerminalNode NOT_SYM() { return getToken(MiniSQLParser.NOT_SYM, 0); }
		public TerminalNode EXISTS() { return getToken(MiniSQLParser.EXISTS, 0); }
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
		enterRule(_localctx, 84, RULE_create_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(CREATE);
			setState(389);
			match(TABLE);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(390);
				match(IF);
				setState(391);
				match(NOT_SYM);
				setState(392);
				match(EXISTS);
				}
			}

			setState(395);
			table_name();
			setState(396);
			match(LPAREN);
			setState(397);
			create_definition();
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(398);
				match(COMMA);
				setState(399);
				create_definition();
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(405);
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
		public Column_definitionContext column_definition() {
			return getRuleContext(Column_definitionContext.class,0);
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
		enterRule(_localctx, 86, RULE_create_definition);
		int _la;
		try {
			setState(428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(407);
				column_name();
				setState(408);
				column_definition();
				}
				}
				break;
			case PRIMARY_SYM:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(410);
				match(PRIMARY_SYM);
				setState(411);
				match(KEY_SYM);
				setState(412);
				match(LPAREN);
				setState(413);
				column_name();
				setState(414);
				match(RPAREN);
				}
				}
				break;
			case UNIQUE_SYM:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(416);
				match(UNIQUE_SYM);
				setState(417);
				match(LPAREN);
				setState(418);
				column_name();
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(419);
					match(COMMA);
					setState(420);
					column_name();
					}
					}
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(426);
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

	public static class Column_definitionContext extends ParserRuleContext {
		public Column_data_type_headerContext column_data_type_header() {
			return getRuleContext(Column_data_type_headerContext.class,0);
		}
		public Column_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitColumn_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_definitionContext column_definition() throws RecognitionException {
		Column_definitionContext _localctx = new Column_definitionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_column_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			column_data_type_header();
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
		enterRule(_localctx, 90, RULE_null_or_notnull);
		try {
			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT_SYM:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(432);
				match(NOT_SYM);
				setState(433);
				match(NULL_SYM);
				}
				}
				break;
			case NULL_SYM:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
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
		enterRule(_localctx, 92, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
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
		public TerminalNode LPAREN() { return getToken(MiniSQLParser.LPAREN, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniSQLParser.RPAREN, 0); }
		public Null_or_notnullContext null_or_notnull() {
			return getRuleContext(Null_or_notnullContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(MiniSQLParser.DEFAULT, 0); }
		public List<Number_literalContext> number_literal() {
			return getRuleContexts(Number_literalContext.class);
		}
		public Number_literalContext number_literal(int i) {
			return getRuleContext(Number_literalContext.class,i);
		}
		public TerminalNode INTEGER_SYM() { return getToken(MiniSQLParser.INTEGER_SYM, 0); }
		public TerminalNode FLOAT_SYM() { return getToken(MiniSQLParser.FLOAT_SYM, 0); }
		public TerminalNode COMMA() { return getToken(MiniSQLParser.COMMA, 0); }
		public TerminalNode CHAR() { return getToken(MiniSQLParser.CHAR, 0); }
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
		enterRule(_localctx, 94, RULE_column_data_type_header);
		int _la;
		try {
			setState(498);
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
				setState(440);
				match(INT_SYM);
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(441);
					match(LPAREN);
					setState(442);
					length();
					setState(443);
					match(RPAREN);
					}
				}

				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NULL_SYM || _la==NOT_SYM) {
					{
					setState(447);
					null_or_notnull();
					}
				}

				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(450);
					match(DEFAULT);
					setState(451);
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
				setState(454);
				match(INTEGER_SYM);
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(455);
					match(LPAREN);
					setState(456);
					length();
					setState(457);
					match(RPAREN);
					}
				}

				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NULL_SYM || _la==NOT_SYM) {
					{
					setState(461);
					null_or_notnull();
					}
				}

				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(464);
					match(DEFAULT);
					setState(465);
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
				setState(468);
				match(FLOAT_SYM);
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(469);
					match(LPAREN);
					setState(470);
					length();
					setState(471);
					match(COMMA);
					setState(472);
					number_literal();
					setState(473);
					match(RPAREN);
					}
				}

				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NULL_SYM || _la==NOT_SYM) {
					{
					setState(477);
					null_or_notnull();
					}
				}

				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(480);
					match(DEFAULT);
					setState(481);
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
				setState(484);
				match(CHAR);
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(485);
					match(LPAREN);
					setState(486);
					length();
					setState(487);
					match(RPAREN);
					}
				}

				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NULL_SYM || _la==NOT_SYM) {
					{
					setState(491);
					null_or_notnull();
					}
				}

				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(494);
					match(DEFAULT);
					setState(495);
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
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode IF() { return getToken(MiniSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(MiniSQLParser.EXISTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MiniSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniSQLParser.COMMA, i);
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
		enterRule(_localctx, 96, RULE_drop_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(DROP);
			setState(501);
			match(TABLE);
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(502);
				match(IF);
				setState(503);
				match(EXISTS);
				}
			}

			setState(506);
			table_name();
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(507);
				match(COMMA);
				setState(508);
				table_name();
				}
				}
				setState(513);
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
		enterRule(_localctx, 98, RULE_create_index_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(CREATE);
			setState(515);
			match(UNIQUE_SYM);
			setState(516);
			match(INDEX_SYM);
			setState(517);
			index_name();
			setState(518);
			match(ON);
			setState(519);
			table_name();
			setState(520);
			match(LPAREN);
			setState(521);
			column_name();
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(522);
				match(COMMA);
				setState(523);
				column_name();
				}
				}
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(529);
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
		enterRule(_localctx, 100, RULE_drop_index_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(DROP);
			setState(532);
			match(INDEX_SYM);
			setState(533);
			index_name();
			setState(534);
			match(ON);
			setState(535);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u021c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\3\2\3\3\3\3\3\4\5\4n\n\4\3\4\3\4\3\5\3\5\3\5\5\5u\n\5\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u0086\n\n\f\n"+
		"\16\n\u0089\13\n\3\13\3\13\3\13\7\13\u008e\n\13\f\13\16\13\u0091\13\13"+
		"\3\f\3\f\3\f\7\f\u0096\n\f\f\f\16\f\u0099\13\f\3\r\5\r\u009c\n\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\5\16\u00a5\n\16\3\17\3\17\3\20\3\20\3\20\5"+
		"\20\u00ac\n\20\3\21\3\21\3\21\5\21\u00b1\n\21\3\22\3\22\3\22\5\22\u00b6"+
		"\n\22\3\23\3\23\3\23\5\23\u00bb\n\23\3\24\3\24\3\24\5\24\u00c0\n\24\3"+
		"\25\3\25\3\25\5\25\u00c5\n\25\3\26\3\26\3\26\3\26\7\26\u00cb\n\26\f\26"+
		"\16\26\u00ce\13\26\3\26\3\26\3\27\3\27\3\27\5\27\u00d5\n\27\3\27\3\27"+
		"\3\27\5\27\u00da\n\27\3\27\3\27\3\30\3\30\3\30\5\30\u00e1\n\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\7\31\u00e9\n\31\f\31\16\31\u00ec\13\31\3\31\3"+
		"\31\3\32\3\32\5\32\u00f2\n\32\3\32\5\32\u00f5\n\32\3\33\3\33\3\33\3\33"+
		"\5\33\u00fb\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0103\n\34\3\35\3"+
		"\35\3\35\3\35\3\35\5\35\u010a\n\35\5\35\u010c\n\35\3\35\5\35\u010f\n\35"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\7\37\u0119\n\37\f\37\16\37\u011c"+
		"\13\37\3 \3 \5 \u0120\n \3!\3!\3!\7!\u0125\n!\f!\16!\u0128\13!\3!\5!\u012b"+
		"\n!\3\"\3\"\3\"\3\"\3\"\5\"\u0132\n\"\3#\3#\3#\3#\5#\u0138\n#\3$\3$\5"+
		"$\u013c\n$\3$\3$\5$\u0140\n$\3$\3$\3%\3%\3%\3%\7%\u0148\n%\f%\16%\u014b"+
		"\13%\3&\3&\3&\5&\u0150\n&\3&\3&\3&\5&\u0155\n&\7&\u0157\n&\f&\16&\u015a"+
		"\13&\3&\3&\3\'\3\'\3\'\3\'\5\'\u0162\n\'\3\'\5\'\u0165\n\'\3(\3(\3(\3"+
		"(\7(\u016b\n(\f(\16(\u016e\13(\3)\3)\3)\3)\5)\u0174\n)\3*\3*\3*\3*\3*"+
		"\5*\u017b\n*\3*\3*\3+\3+\3+\3+\5+\u0183\n+\3+\3+\3,\3,\3,\3,\3,\5,\u018c"+
		"\n,\3,\3,\3,\3,\3,\7,\u0193\n,\f,\16,\u0196\13,\3,\3,\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u01a8\n-\f-\16-\u01ab\13-\3-\3-\5-\u01af"+
		"\n-\3.\3.\3/\3/\3/\5/\u01b6\n/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\5\61\u01c0\n\61\3\61\5\61\u01c3\n\61\3\61\3\61\5\61\u01c7\n\61\3\61\3"+
		"\61\3\61\3\61\3\61\5\61\u01ce\n\61\3\61\5\61\u01d1\n\61\3\61\3\61\5\61"+
		"\u01d5\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u01de\n\61\3\61\5"+
		"\61\u01e1\n\61\3\61\3\61\5\61\u01e5\n\61\3\61\3\61\3\61\3\61\3\61\5\61"+
		"\u01ec\n\61\3\61\5\61\u01ef\n\61\3\61\3\61\5\61\u01f3\n\61\5\61\u01f5"+
		"\n\61\3\62\3\62\3\62\3\62\5\62\u01fb\n\62\3\62\3\62\3\62\7\62\u0200\n"+
		"\62\f\62\16\62\u0203\13\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\7\63\u020f\n\63\f\63\16\63\u0212\13\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\2\2\65\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdf\2\n\3\2+\60\3\2<=\3\2BC\5"+
		"\2#$\67\67AA\3\2<>\3\2\13\f\3\2\34\35\4\2\4\4\b\b\2\u0234\2h\3\2\2\2\4"+
		"j\3\2\2\2\6m\3\2\2\2\bt\3\2\2\2\nv\3\2\2\2\fy\3\2\2\2\16|\3\2\2\2\20\177"+
		"\3\2\2\2\22\u0082\3\2\2\2\24\u008a\3\2\2\2\26\u0092\3\2\2\2\30\u009b\3"+
		"\2\2\2\32\u00a4\3\2\2\2\34\u00a6\3\2\2\2\36\u00a8\3\2\2\2 \u00ad\3\2\2"+
		"\2\"\u00b2\3\2\2\2$\u00b7\3\2\2\2&\u00bf\3\2\2\2(\u00c4\3\2\2\2*\u00c6"+
		"\3\2\2\2,\u00d9\3\2\2\2.\u00e0\3\2\2\2\60\u00e4\3\2\2\2\62\u00f1\3\2\2"+
		"\2\64\u00fa\3\2\2\2\66\u0102\3\2\2\28\u0104\3\2\2\2:\u0110\3\2\2\2<\u0113"+
		"\3\2\2\2>\u011d\3\2\2\2@\u012a\3\2\2\2B\u0131\3\2\2\2D\u0133\3\2\2\2F"+
		"\u0139\3\2\2\2H\u0143\3\2\2\2J\u014c\3\2\2\2L\u015d\3\2\2\2N\u0166\3\2"+
		"\2\2P\u016f\3\2\2\2R\u0175\3\2\2\2T\u017e\3\2\2\2V\u0186\3\2\2\2X\u01ae"+
		"\3\2\2\2Z\u01b0\3\2\2\2\\\u01b5\3\2\2\2^\u01b7\3\2\2\2`\u01f4\3\2\2\2"+
		"b\u01f6\3\2\2\2d\u0204\3\2\2\2f\u0215\3\2\2\2hi\t\2\2\2i\3\3\2\2\2jk\7"+
		"D\2\2k\5\3\2\2\2ln\t\3\2\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2op\t\4\2\2p\7"+
		"\3\2\2\2qu\5\4\3\2ru\5\6\4\2su\7\36\2\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2"+
		"u\t\3\2\2\2vw\7E\2\2wx\b\6\1\2x\13\3\2\2\2yz\7E\2\2z{\b\7\1\2{\r\3\2\2"+
		"\2|}\7E\2\2}~\b\b\1\2~\17\3\2\2\2\177\u0080\7E\2\2\u0080\u0081\b\t\1\2"+
		"\u0081\21\3\2\2\2\u0082\u0087\5\24\13\2\u0083\u0084\7%\2\2\u0084\u0086"+
		"\5\24\13\2\u0085\u0083\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2"+
		"\u0087\u0088\3\2\2\2\u0088\23\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008f"+
		"\5\26\f\2\u008b\u008c\7(\2\2\u008c\u008e\5\26\f\2\u008d\u008b\3\2\2\2"+
		"\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\25"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0097\5\30\r\2\u0093\u0094\7&\2\2\u0094"+
		"\u0096\5\30\r\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3"+
		"\2\2\2\u0097\u0098\3\2\2\2\u0098\27\3\2\2\2\u0099\u0097\3\2\2\2\u009a"+
		"\u009c\7\'\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009e\5\32\16\2\u009e\31\3\2\2\2\u009f\u00a0\5\34\17\2\u00a0"+
		"\u00a1\5\2\2\2\u00a1\u00a2\5\34\17\2\u00a2\u00a5\3\2\2\2\u00a3\u00a5\5"+
		"\34\17\2\u00a4\u009f\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\33\3\2\2\2\u00a6"+
		"\u00a7\5\36\20\2\u00a7\35\3\2\2\2\u00a8\u00ab\5 \21\2\u00a9\u00aa\7?\2"+
		"\2\u00aa\u00ac\5 \21\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\37"+
		"\3\2\2\2\u00ad\u00b0\5\"\22\2\u00ae\u00af\7@\2\2\u00af\u00b1\5\"\22\2"+
		"\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1!\3\2\2\2\u00b2\u00b5\5"+
		"$\23\2\u00b3\u00b4\t\3\2\2\u00b4\u00b6\5$\23\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6#\3\2\2\2\u00b7\u00ba\5&\24\2\u00b8\u00b9\t\5\2\2"+
		"\u00b9\u00bb\5&\24\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb%\3"+
		"\2\2\2\u00bc\u00bd\t\6\2\2\u00bd\u00c0\5(\25\2\u00be\u00c0\5(\25\2\u00bf"+
		"\u00bc\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\'\3\2\2\2\u00c1\u00c5\5\b\5\2"+
		"\u00c2\u00c5\5,\27\2\u00c3\u00c5\5*\26\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5)\3\2\2\2\u00c6\u00c7\79\2\2\u00c7\u00cc"+
		"\5\22\n\2\u00c8\u00c9\7\66\2\2\u00c9\u00cb\5\22\n\2\u00ca\u00c8\3\2\2"+
		"\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf"+
		"\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\78\2\2\u00d0+\3\2\2\2\u00d1\u00d2"+
		"\5\n\6\2\u00d2\u00d3\7\65\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d1\3\2\2\2"+
		"\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\5\f\7\2\u00d7\u00d8"+
		"\7\65\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d4\3\2\2\2\u00d9\u00da\3\2\2\2"+
		"\u00da\u00db\3\2\2\2\u00db\u00dc\5\16\b\2\u00dc-\3\2\2\2\u00dd\u00de\5"+
		"\n\6\2\u00de\u00df\7\65\2\2\u00df\u00e1\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\5\f\7\2\u00e3/\3\2\2\2"+
		"\u00e4\u00e5\79\2\2\u00e5\u00ea\5,\27\2\u00e6\u00e7\7\66\2\2\u00e7\u00e9"+
		"\5,\27\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\78"+
		"\2\2\u00ee\61\3\2\2\2\u00ef\u00f2\5\64\33\2\u00f0\u00f2\5\66\34\2\u00f1"+
		"\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f5\7\63"+
		"\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\63\3\2\2\2\u00f6\u00fb"+
		"\58\35\2\u00f7\u00fb\5D#\2\u00f8\u00fb\5F$\2\u00f9\u00fb\5L\'\2\u00fa"+
		"\u00f6\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2"+
		"\2\2\u00fb\65\3\2\2\2\u00fc\u0103\5R*\2\u00fd\u0103\5T+\2\u00fe\u0103"+
		"\5V,\2\u00ff\u0103\5b\62\2\u0100\u0103\5d\63\2\u0101\u0103\5f\64\2\u0102"+
		"\u00fc\3\2\2\2\u0102\u00fd\3\2\2\2\u0102\u00fe\3\2\2\2\u0102\u00ff\3\2"+
		"\2\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103\67\3\2\2\2\u0104\u0105"+
		"\7\25\2\2\u0105\u010b\5@!\2\u0106\u0107\7\t\2\2\u0107\u0109\5.\30\2\u0108"+
		"\u010a\5:\36\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2"+
		"\2\2\u010b\u0106\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d"+
		"\u010f\5<\37\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f9\3\2\2\2"+
		"\u0110\u0111\7\n\2\2\u0111\u0112\5\22\n\2\u0112;\3\2\2\2\u0113\u0114\7"+
		"\31\2\2\u0114\u0115\7\32\2\2\u0115\u011a\5> \2\u0116\u0117\7\66\2\2\u0117"+
		"\u0119\5> \2\u0118\u0116\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2"+
		"\2\u011a\u011b\3\2\2\2\u011b=\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011f"+
		"\5,\27\2\u011e\u0120\t\7\2\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"?\3\2\2\2\u0121\u0126\5B\"\2\u0122\u0123\7\66\2\2\u0123\u0125\5B\"\2\u0124"+
		"\u0122\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u012b\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012b\7\67\2\2\u012a"+
		"\u0121\3\2\2\2\u012a\u0129\3\2\2\2\u012bA\3\2\2\2\u012c\u012d\5.\30\2"+
		"\u012d\u012e\7\65\2\2\u012e\u012f\7\67\2\2\u012f\u0132\3\2\2\2\u0130\u0132"+
		"\5,\27\2\u0131\u012c\3\2\2\2\u0131\u0130\3\2\2\2\u0132C\3\2\2\2\u0133"+
		"\u0134\7\26\2\2\u0134\u0135\7\t\2\2\u0135\u0137\5.\30\2\u0136\u0138\5"+
		":\36\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138E\3\2\2\2\u0139\u013b"+
		"\7\27\2\2\u013a\u013c\7\r\2\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2"+
		"\u013c\u013d\3\2\2\2\u013d\u013f\5.\30\2\u013e\u0140\5\60\31\2\u013f\u013e"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\5H%\2\u0142"+
		"G\3\2\2\2\u0143\u0144\t\b\2\2\u0144\u0149\5J&\2\u0145\u0146\7\66\2\2\u0146"+
		"\u0148\5J&\2\u0147\u0145\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2"+
		"\2\u0149\u014a\3\2\2\2\u014aI\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014f"+
		"\79\2\2\u014d\u0150\5\b\5\2\u014e\u0150\7\16\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u014e\3\2\2\2\u0150\u0158\3\2\2\2\u0151\u0154\7\66\2\2\u0152\u0155\5"+
		"\b\5\2\u0153\u0155\7\16\2\2\u0154\u0152\3\2\2\2\u0154\u0153\3\2\2\2\u0155"+
		"\u0157\3\2\2\2\u0156\u0151\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2"+
		"\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b"+
		"\u015c\78\2\2\u015cK\3\2\2\2\u015d\u015e\7\30\2\2\u015e\u015f\5.\30\2"+
		"\u015f\u0161\5N(\2\u0160\u0162\5:\36\2\u0161\u0160\3\2\2\2\u0161\u0162"+
		"\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0165\5<\37\2\u0164\u0163\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165M\3\2\2\2\u0166\u0167\7\33\2\2\u0167\u016c\5P)\2\u0168"+
		"\u0169\7\66\2\2\u0169\u016b\5P)\2\u016a\u0168\3\2\2\2\u016b\u016e\3\2"+
		"\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016dO\3\2\2\2\u016e\u016c"+
		"\3\2\2\2\u016f\u0170\5,\27\2\u0170\u0173\7+\2\2\u0171\u0174\5\b\5\2\u0172"+
		"\u0174\7\16\2\2\u0173\u0171\3\2\2\2\u0173\u0172\3\2\2\2\u0174Q\3\2\2\2"+
		"\u0175\u0176\7\3\2\2\u0176\u017a\t\t\2\2\u0177\u0178\7\6\2\2\u0178\u0179"+
		"\7\'\2\2\u0179\u017b\7\7\2\2\u017a\u0177\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u017d\5\n\6\2\u017dS\3\2\2\2\u017e\u017f\7\5\2\2"+
		"\u017f\u0182\t\t\2\2\u0180\u0181\7\6\2\2\u0181\u0183\7\7\2\2\u0182\u0180"+
		"\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\5\n\6\2\u0185"+
		"U\3\2\2\2\u0186\u0187\7\3\2\2\u0187\u018b\7\17\2\2\u0188\u0189\7\6\2\2"+
		"\u0189\u018a\7\'\2\2\u018a\u018c\7\7\2\2\u018b\u0188\3\2\2\2\u018b\u018c"+
		"\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\5\f\7\2\u018e\u018f\79\2\2\u018f"+
		"\u0194\5X-\2\u0190\u0191\7\66\2\2\u0191\u0193\5X-\2\u0192\u0190\3\2\2"+
		"\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197"+
		"\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0198\78\2\2\u0198W\3\2\2\2\u0199\u019a"+
		"\5\16\b\2\u019a\u019b\5Z.\2\u019b\u01af\3\2\2\2\u019c\u019d\7\20\2\2\u019d"+
		"\u019e\7\21\2\2\u019e\u019f\79\2\2\u019f\u01a0\5\16\b\2\u01a0\u01a1\7"+
		"8\2\2\u01a1\u01af\3\2\2\2\u01a2\u01a3\7\23\2\2\u01a3\u01a4\79\2\2\u01a4"+
		"\u01a9\5\16\b\2\u01a5\u01a6\7\66\2\2\u01a6\u01a8\5\16\b\2\u01a7\u01a5"+
		"\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa"+
		"\u01ac\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ad\78\2\2\u01ad\u01af\3\2"+
		"\2\2\u01ae\u0199\3\2\2\2\u01ae\u019c\3\2\2\2\u01ae\u01a2\3\2\2\2\u01af"+
		"Y\3\2\2\2\u01b0\u01b1\5`\61\2\u01b1[\3\2\2\2\u01b2\u01b3\7\'\2\2\u01b3"+
		"\u01b6\7\36\2\2\u01b4\u01b6\7\36\2\2\u01b5\u01b2\3\2\2\2\u01b5\u01b4\3"+
		"\2\2\2\u01b6]\3\2\2\2\u01b7\u01b8\7B\2\2\u01b8_\3\2\2\2\u01b9\u01f5\3"+
		"\2\2\2\u01ba\u01bf\7\37\2\2\u01bb\u01bc\79\2\2\u01bc\u01bd\5^\60\2\u01bd"+
		"\u01be\78\2\2\u01be\u01c0\3\2\2\2\u01bf\u01bb\3\2\2\2\u01bf\u01c0\3\2"+
		"\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01c3\5\\/\2\u01c2\u01c1\3\2\2\2\u01c2"+
		"\u01c3\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c5\7\16\2\2\u01c5\u01c7\5"+
		"\6\4\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01f5\3\2\2\2\u01c8"+
		"\u01cd\7!\2\2\u01c9\u01ca\79\2\2\u01ca\u01cb\5^\60\2\u01cb\u01cc\78\2"+
		"\2\u01cc\u01ce\3\2\2\2\u01cd\u01c9\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0"+
		"\3\2\2\2\u01cf\u01d1\5\\/\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1"+
		"\u01d4\3\2\2\2\u01d2\u01d3\7\16\2\2\u01d3\u01d5\5\6\4\2\u01d4\u01d2\3"+
		"\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01f5\3\2\2\2\u01d6\u01dd\7\"\2\2\u01d7"+
		"\u01d8\79\2\2\u01d8\u01d9\5^\60\2\u01d9\u01da\7\66\2\2\u01da\u01db\5\6"+
		"\4\2\u01db\u01dc\78\2\2\u01dc\u01de\3\2\2\2\u01dd\u01d7\3\2\2\2\u01dd"+
		"\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01e1\5\\/\2\u01e0\u01df\3\2"+
		"\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e3\7\16\2\2\u01e3"+
		"\u01e5\5\6\4\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01f5\3\2"+
		"\2\2\u01e6\u01eb\7 \2\2\u01e7\u01e8\79\2\2\u01e8\u01e9\5^\60\2\u01e9\u01ea"+
		"\78\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01e7\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec"+
		"\u01ee\3\2\2\2\u01ed\u01ef\5\\/\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3\2"+
		"\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01f1\7\16\2\2\u01f1\u01f3\7D\2\2\u01f2"+
		"\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\3\2\2\2\u01f4\u01b9\3\2"+
		"\2\2\u01f4\u01ba\3\2\2\2\u01f4\u01c8\3\2\2\2\u01f4\u01d6\3\2\2\2\u01f4"+
		"\u01e6\3\2\2\2\u01f5a\3\2\2\2\u01f6\u01f7\7\5\2\2\u01f7\u01fa\7\17\2\2"+
		"\u01f8\u01f9\7\6\2\2\u01f9\u01fb\7\7\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb"+
		"\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u0201\5\f\7\2\u01fd\u01fe\7\66\2\2"+
		"\u01fe\u0200\5\f\7\2\u01ff\u01fd\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff"+
		"\3\2\2\2\u0201\u0202\3\2\2\2\u0202c\3\2\2\2\u0203\u0201\3\2\2\2\u0204"+
		"\u0205\7\3\2\2\u0205\u0206\7\23\2\2\u0206\u0207\7\24\2\2\u0207\u0208\5"+
		"\20\t\2\u0208\u0209\7\22\2\2\u0209\u020a\5\f\7\2\u020a\u020b\79\2\2\u020b"+
		"\u0210\5\16\b\2\u020c\u020d\7\66\2\2\u020d\u020f\5\16\b\2\u020e\u020c"+
		"\3\2\2\2\u020f\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211"+
		"\u0213\3\2\2\2\u0212\u0210\3\2\2\2\u0213\u0214\78\2\2\u0214e\3\2\2\2\u0215"+
		"\u0216\7\5\2\2\u0216\u0217\7\24\2\2\u0217\u0218\5\20\t\2\u0218\u0219\7"+
		"\22\2\2\u0219\u021a\5\f\7\2\u021ag\3\2\2\2Bmt\u0087\u008f\u0097\u009b"+
		"\u00a4\u00ab\u00b0\u00b5\u00ba\u00bf\u00c4\u00cc\u00d4\u00d9\u00e0\u00ea"+
		"\u00f1\u00f4\u00fa\u0102\u0109\u010b\u010e\u011a\u011f\u0126\u012a\u0131"+
		"\u0137\u013b\u013f\u0149\u014f\u0154\u0158\u0161\u0164\u016c\u0173\u017a"+
		"\u0182\u018b\u0194\u01a9\u01ae\u01b5\u01bf\u01c2\u01c6\u01cd\u01d0\u01d4"+
		"\u01dd\u01e0\u01e4\u01eb\u01ee\u01f2\u01f4\u01fa\u0201\u0210";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}