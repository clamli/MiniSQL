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
		NULL_SYM=28, INT_SYM=29, CHAR=30, INTEGER_SYM=31, FLOAT_SYM=32, EXIT=33, 
		DIVIDE=34, MOD_SYM=35, OR_SYM=36, AND_SYM=37, NOT_SYM=38, XOR_SYM=39, 
		UNION_SYM=40, ARROW=41, EQ_SYM=42, NOT_EQ=43, LET=44, LTH=45, GET=46, 
		GTH=47, SET_VAR=48, ALL_FIELDS=49, SEMI=50, COLON=51, DOT=52, COMMA=53, 
		ASTERISK=54, RPAREN=55, LPAREN=56, RBRACK=57, LBRACK=58, PLUS=59, MINUS=60, 
		NEGATION=61, BITWISE=62, BITAND=63, POWER_OP=64, INTEGER_NUM=65, REAL_NUM=66, 
		TEXT_STRING=67, ID=68, WHITE_SPACE=69, SL_COMMENT=70, ML_COMMENT=71;
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
		RULE_drop_table_statement = 43, RULE_create_index_statement = 44, RULE_drop_index_statement = 45, 
		RULE_exit = 46;
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
		"drop_index_statement", "exit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "'=>'", "'=='", "'!='", "'<='", "'<'", "'>='", 
		"'>'", "'='", "'.*'", "';'", "':'", "'.'", "','", "'*'", "')'", "'('", 
		"']'", "'['", "'+'", "'-'", "'~'", "'|'", "'&'", "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CREATE", "DATABASE", "DROP", "IF", "EXISTS", "SCHEMA", "FROM", 
		"WHERE", "ASC", "DESC", "INTO", "DEFAULT", "TABLE", "PRIMARY_SYM", "KEY_SYM", 
		"ON", "UNIQUE_SYM", "INDEX_SYM", "SELECT_SYM", "DELETE_SYM", "INSERT_SYM", 
		"UPDATE_SYM", "ORDER_SYM", "BY_SYM", "SET_SYM", "VALUE_SYM", "VALUES", 
		"NULL_SYM", "INT_SYM", "CHAR", "INTEGER_SYM", "FLOAT_SYM", "EXIT", "DIVIDE", 
		"MOD_SYM", "OR_SYM", "AND_SYM", "NOT_SYM", "XOR_SYM", "UNION_SYM", "ARROW", 
		"EQ_SYM", "NOT_EQ", "LET", "LTH", "GET", "GTH", "SET_VAR", "ALL_FIELDS", 
		"SEMI", "COLON", "DOT", "COMMA", "ASTERISK", "RPAREN", "LPAREN", "RBRACK", 
		"LBRACK", "PLUS", "MINUS", "NEGATION", "BITWISE", "BITAND", "POWER_OP", 
		"INTEGER_NUM", "REAL_NUM", "TEXT_STRING", "ID", "WHITE_SPACE", "SL_COMMENT", 
		"ML_COMMENT"
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
			setState(94);
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
			setState(96);
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
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(98);
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

			setState(101);
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
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_STRING:
				{
				setState(103);
				string_literal();
				}
				break;
			case PLUS:
			case MINUS:
			case INTEGER_NUM:
			case REAL_NUM:
				{
				setState(104);
				number_literal();
				}
				break;
			case NULL_SYM:
				{
				setState(105);
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
			setState(108);
			((Schema_nameContext)_localctx).tmpName = match(ID);
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
			setState(110);
			((Table_nameContext)_localctx).tmpName = match(ID);
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
			setState(114);
			((Index_nameContext)_localctx).tmpName = match(ID);
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
			setState(116);
			exp_factor1();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR_SYM) {
				{
				{
				setState(117);
				match(OR_SYM);
				setState(118);
				exp_factor1();
				}
				}
				setState(123);
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
			setState(124);
			exp_factor2();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XOR_SYM) {
				{
				{
				setState(125);
				match(XOR_SYM);
				setState(126);
				exp_factor2();
				}
				}
				setState(131);
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
			setState(132);
			exp_factor3();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_SYM) {
				{
				{
				setState(133);
				match(AND_SYM);
				setState(134);
				exp_factor3();
				}
				}
				setState(139);
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
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT_SYM) {
				{
				setState(140);
				match(NOT_SYM);
				}
			}

			setState(143);
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
		public TerminalNode LPAREN() { return getToken(MiniSQLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniSQLParser.RPAREN, 0); }
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
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(145);
				match(LPAREN);
				setState(146);
				expression();
				setState(147);
				match(RPAREN);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(149);
				bit_expr();
				setState(150);
				relational_op();
				setState(151);
				bit_expr();
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
			setState(155);
			factor1();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(156);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(157);
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
			setState(160);
			factor2();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (DIVIDE - 34)) | (1L << (MOD_SYM - 34)) | (1L << (ASTERISK - 34)) | (1L << (POWER_OP - 34)))) != 0)) {
				{
				setState(161);
				_la = _input.LA(1);
				if ( !(((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (DIVIDE - 34)) | (1L << (MOD_SYM - 34)) | (1L << (ASTERISK - 34)) | (1L << (POWER_OP - 34)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(162);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			simple_expr();
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
			setState(173);
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
				setState(167);
				literal_value();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				column_spec();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				match(LPAREN);
				setState(170);
				bit_expr();
				setState(171);
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
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(175);
					schema_name();
					setState(176);
					match(DOT);
					}
					break;
				}
				setState(180);
				table_name();
				setState(181);
				match(DOT);
				}
				break;
			}
			setState(185);
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
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(187);
				schema_name();
				setState(188);
				match(DOT);
				}
				break;
			}
			setState(192);
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
			setState(194);
			match(LPAREN);
			setState(195);
			column_spec();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(196);
				match(COMMA);
				setState(197);
				column_spec();
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
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
		public ExitContext exit() {
			return getRuleContext(ExitContext.class,0);
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
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT_SYM:
			case DELETE_SYM:
			case INSERT_SYM:
			case UPDATE_SYM:
				{
				setState(205);
				data_manipulation_statements();
				}
				break;
			case CREATE:
			case DROP:
				{
				setState(206);
				data_definition_statements();
				}
				break;
			case EXIT:
				{
				setState(207);
				exit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(210);
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
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT_SYM:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				select_statement();
				}
				break;
			case DELETE_SYM:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				delete_statement();
				}
				break;
			case INSERT_SYM:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				insert_statement();
				}
				break;
			case UPDATE_SYM:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
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
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				create_database_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				drop_database_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				create_table_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				drop_table_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
				create_index_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(224);
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
			setState(227);
			match(SELECT_SYM);
			setState(228);
			select_list();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(229);
				match(FROM);
				setState(230);
				table_spec();
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(231);
					where_clause();
					}
				}

				}
			}

			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_SYM) {
				{
				setState(236);
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
			setState(239);
			match(WHERE);
			setState(240);
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
			setState(242);
			match(ORDER_SYM);
			setState(243);
			match(BY_SYM);
			setState(244);
			orderby_item();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(245);
				match(COMMA);
				setState(246);
				orderby_item();
				}
				}
				setState(251);
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
			setState(252);
			column_spec();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(253);
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
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				{
				setState(256);
				displayed_column();
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(257);
					match(COMMA);
					setState(258);
					displayed_column();
					}
					}
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case ASTERISK:
				{
				setState(264);
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
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(267);
				table_spec();
				setState(268);
				match(DOT);
				setState(269);
				match(ASTERISK);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(271);
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
			setState(274);
			match(DELETE_SYM);
			setState(275);
			match(FROM);
			setState(276);
			table_spec();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(277);
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
			setState(280);
			match(INSERT_SYM);
			setState(281);
			match(INTO);
			setState(282);
			table_spec();
			setState(283);
			column_list();
			setState(284);
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
			setState(286);
			_la = _input.LA(1);
			if ( !(_la==VALUE_SYM || _la==VALUES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(287);
			column_value_list();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(288);
				match(COMMA);
				setState(289);
				column_value_list();
				}
				}
				setState(294);
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
			setState(295);
			match(LPAREN);
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL_SYM:
			case PLUS:
			case MINUS:
			case INTEGER_NUM:
			case REAL_NUM:
			case TEXT_STRING:
				{
				setState(296);
				literal_value();
				}
				break;
			case DEFAULT:
				{
				setState(297);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(300);
				match(COMMA);
				setState(303);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NULL_SYM:
				case PLUS:
				case MINUS:
				case INTEGER_NUM:
				case REAL_NUM:
				case TEXT_STRING:
					{
					setState(301);
					literal_value();
					}
					break;
				case DEFAULT:
					{
					setState(302);
					match(DEFAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
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
			setState(312);
			match(UPDATE_SYM);
			setState(313);
			table_spec();
			setState(314);
			set_columns_clause();
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(315);
				where_clause();
				}
			}

			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_SYM) {
				{
				setState(318);
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
			setState(321);
			match(SET_SYM);
			setState(322);
			set_column_clause();
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(323);
				match(COMMA);
				setState(324);
				set_column_clause();
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
			setState(330);
			column_spec();
			setState(331);
			match(SET_VAR);
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL_SYM:
			case PLUS:
			case MINUS:
			case INTEGER_NUM:
			case REAL_NUM:
			case TEXT_STRING:
				{
				setState(332);
				literal_value();
				}
				break;
			case DEFAULT:
				{
				setState(333);
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
			setState(336);
			match(CREATE);
			setState(337);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(338);
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
			setState(340);
			match(DROP);
			setState(341);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(342);
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
			setState(344);
			match(CREATE);
			setState(345);
			match(TABLE);
			setState(346);
			table_name();
			setState(347);
			match(LPAREN);
			setState(348);
			create_definition();
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(349);
				match(COMMA);
				setState(350);
				create_definition();
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(356);
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
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(358);
				column_name();
				setState(359);
				column_data_type_header();
				}
				}
				break;
			case PRIMARY_SYM:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(361);
				match(PRIMARY_SYM);
				setState(362);
				match(KEY_SYM);
				setState(363);
				match(LPAREN);
				setState(364);
				column_name();
				setState(365);
				match(RPAREN);
				}
				}
				break;
			case UNIQUE_SYM:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(367);
				match(UNIQUE_SYM);
				setState(368);
				match(LPAREN);
				setState(369);
				column_name();
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(370);
					match(COMMA);
					setState(371);
					column_name();
					}
					}
					setState(376);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(377);
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
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT_SYM:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(381);
				match(NOT_SYM);
				setState(382);
				match(NULL_SYM);
				}
				}
				break;
			case NULL_SYM:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
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
			setState(386);
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
			setState(417);
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
				setState(389);
				match(INT_SYM);
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NULL_SYM || _la==NOT_SYM) {
					{
					setState(390);
					null_or_notnull();
					}
				}

				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(393);
					match(DEFAULT);
					setState(394);
					number_literal();
					}
				}

				}
				}
				break;
			case FLOAT_SYM:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(397);
				match(FLOAT_SYM);
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NULL_SYM || _la==NOT_SYM) {
					{
					setState(398);
					null_or_notnull();
					}
				}

				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(401);
					match(DEFAULT);
					setState(402);
					number_literal();
					}
				}

				}
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(405);
				match(CHAR);
				{
				setState(406);
				match(LPAREN);
				setState(407);
				length();
				setState(408);
				match(RPAREN);
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NULL_SYM || _la==NOT_SYM) {
					{
					setState(410);
					null_or_notnull();
					}
				}

				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(413);
					match(DEFAULT);
					setState(414);
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
			setState(419);
			match(DROP);
			setState(420);
			match(TABLE);
			setState(421);
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
			setState(423);
			match(CREATE);
			setState(424);
			match(UNIQUE_SYM);
			setState(425);
			match(INDEX_SYM);
			setState(426);
			index_name();
			setState(427);
			match(ON);
			setState(428);
			table_name();
			setState(429);
			match(LPAREN);
			setState(430);
			column_name();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(431);
				match(COMMA);
				setState(432);
				column_name();
				}
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(438);
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
			setState(440);
			match(DROP);
			setState(441);
			match(INDEX_SYM);
			setState(442);
			index_name();
			setState(443);
			match(ON);
			setState(444);
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

	public static class ExitContext extends ParserRuleContext {
		public TerminalNode EXIT() { return getToken(MiniSQLParser.EXIT, 0); }
		public ExitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSQLVisitor ) return ((MiniSQLVisitor<? extends T>)visitor).visitExit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExitContext exit() throws RecognitionException {
		ExitContext _localctx = new ExitContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_exit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(EXIT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u01c3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\4\5\4f\n\4\3\4\3\4"+
		"\3\5\3\5\3\5\5\5m\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\7\n"+
		"z\n\n\f\n\16\n}\13\n\3\13\3\13\3\13\7\13\u0082\n\13\f\13\16\13\u0085\13"+
		"\13\3\f\3\f\3\f\7\f\u008a\n\f\f\f\16\f\u008d\13\f\3\r\5\r\u0090\n\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u009c\n\16\3\17\3"+
		"\17\3\17\5\17\u00a1\n\17\3\20\3\20\3\20\5\20\u00a6\n\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00b0\n\22\3\23\3\23\3\23\5\23\u00b5\n"+
		"\23\3\23\3\23\3\23\5\23\u00ba\n\23\3\23\3\23\3\24\3\24\3\24\5\24\u00c1"+
		"\n\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00c9\n\25\f\25\16\25\u00cc\13"+
		"\25\3\25\3\25\3\26\3\26\3\26\5\26\u00d3\n\26\3\26\5\26\u00d6\n\26\3\27"+
		"\3\27\3\27\3\27\5\27\u00dc\n\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00e4"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u00eb\n\31\5\31\u00ed\n\31\3\31\5"+
		"\31\u00f0\n\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\7\33\u00fa\n\33"+
		"\f\33\16\33\u00fd\13\33\3\34\3\34\5\34\u0101\n\34\3\35\3\35\3\35\7\35"+
		"\u0106\n\35\f\35\16\35\u0109\13\35\3\35\5\35\u010c\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u0113\n\36\3\37\3\37\3\37\3\37\5\37\u0119\n\37\3 \3 \3"+
		" \3 \3 \3 \3!\3!\3!\3!\7!\u0125\n!\f!\16!\u0128\13!\3\"\3\"\3\"\5\"\u012d"+
		"\n\"\3\"\3\"\3\"\5\"\u0132\n\"\7\"\u0134\n\"\f\"\16\"\u0137\13\"\3\"\3"+
		"\"\3#\3#\3#\3#\5#\u013f\n#\3#\5#\u0142\n#\3$\3$\3$\3$\7$\u0148\n$\f$\16"+
		"$\u014b\13$\3%\3%\3%\3%\5%\u0151\n%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3("+
		"\3(\3(\3(\3(\3(\7(\u0162\n(\f(\16(\u0165\13(\3(\3(\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\7)\u0177\n)\f)\16)\u017a\13)\3)\3)\5)\u017e\n)"+
		"\3*\3*\3*\5*\u0183\n*\3+\3+\3,\3,\3,\5,\u018a\n,\3,\3,\5,\u018e\n,\3,"+
		"\3,\5,\u0192\n,\3,\3,\5,\u0196\n,\3,\3,\3,\3,\3,\3,\5,\u019e\n,\3,\3,"+
		"\5,\u01a2\n,\5,\u01a4\n,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\7."+
		"\u01b4\n.\f.\16.\u01b7\13.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\2\2"+
		"\61\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTVXZ\\^\2\t\3\2,\61\3\2=>\3\2CD\5\2$%88BB\3\2\13\f\3\2\34\35\4"+
		"\2\4\4\b\b\2\u01ce\2`\3\2\2\2\4b\3\2\2\2\6e\3\2\2\2\bl\3\2\2\2\nn\3\2"+
		"\2\2\fp\3\2\2\2\16r\3\2\2\2\20t\3\2\2\2\22v\3\2\2\2\24~\3\2\2\2\26\u0086"+
		"\3\2\2\2\30\u008f\3\2\2\2\32\u009b\3\2\2\2\34\u009d\3\2\2\2\36\u00a2\3"+
		"\2\2\2 \u00a7\3\2\2\2\"\u00af\3\2\2\2$\u00b9\3\2\2\2&\u00c0\3\2\2\2(\u00c4"+
		"\3\2\2\2*\u00d2\3\2\2\2,\u00db\3\2\2\2.\u00e3\3\2\2\2\60\u00e5\3\2\2\2"+
		"\62\u00f1\3\2\2\2\64\u00f4\3\2\2\2\66\u00fe\3\2\2\28\u010b\3\2\2\2:\u0112"+
		"\3\2\2\2<\u0114\3\2\2\2>\u011a\3\2\2\2@\u0120\3\2\2\2B\u0129\3\2\2\2D"+
		"\u013a\3\2\2\2F\u0143\3\2\2\2H\u014c\3\2\2\2J\u0152\3\2\2\2L\u0156\3\2"+
		"\2\2N\u015a\3\2\2\2P\u017d\3\2\2\2R\u0182\3\2\2\2T\u0184\3\2\2\2V\u01a3"+
		"\3\2\2\2X\u01a5\3\2\2\2Z\u01a9\3\2\2\2\\\u01ba\3\2\2\2^\u01c0\3\2\2\2"+
		"`a\t\2\2\2a\3\3\2\2\2bc\7E\2\2c\5\3\2\2\2df\t\3\2\2ed\3\2\2\2ef\3\2\2"+
		"\2fg\3\2\2\2gh\t\4\2\2h\7\3\2\2\2im\5\4\3\2jm\5\6\4\2km\7\36\2\2li\3\2"+
		"\2\2lj\3\2\2\2lk\3\2\2\2m\t\3\2\2\2no\7F\2\2o\13\3\2\2\2pq\7F\2\2q\r\3"+
		"\2\2\2rs\7F\2\2s\17\3\2\2\2tu\7F\2\2u\21\3\2\2\2v{\5\24\13\2wx\7&\2\2"+
		"xz\5\24\13\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\23\3\2\2\2}{\3\2"+
		"\2\2~\u0083\5\26\f\2\177\u0080\7)\2\2\u0080\u0082\5\26\f\2\u0081\177\3"+
		"\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\25\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u008b\5\30\r\2\u0087\u0088\7\'\2"+
		"\2\u0088\u008a\5\30\r\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\27\3\2\2\2\u008d\u008b\3\2\2"+
		"\2\u008e\u0090\7(\2\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u0092\5\32\16\2\u0092\31\3\2\2\2\u0093\u0094\7:\2\2\u0094"+
		"\u0095\5\22\n\2\u0095\u0096\79\2\2\u0096\u009c\3\2\2\2\u0097\u0098\5\34"+
		"\17\2\u0098\u0099\5\2\2\2\u0099\u009a\5\34\17\2\u009a\u009c\3\2\2\2\u009b"+
		"\u0093\3\2\2\2\u009b\u0097\3\2\2\2\u009c\33\3\2\2\2\u009d\u00a0\5\36\20"+
		"\2\u009e\u009f\t\3\2\2\u009f\u00a1\5\36\20\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\35\3\2\2\2\u00a2\u00a5\5 \21\2\u00a3\u00a4\t\5\2"+
		"\2\u00a4\u00a6\5 \21\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\37"+
		"\3\2\2\2\u00a7\u00a8\5\"\22\2\u00a8!\3\2\2\2\u00a9\u00b0\5\b\5\2\u00aa"+
		"\u00b0\5$\23\2\u00ab\u00ac\7:\2\2\u00ac\u00ad\5\34\17\2\u00ad\u00ae\7"+
		"9\2\2\u00ae\u00b0\3\2\2\2\u00af\u00a9\3\2\2\2\u00af\u00aa\3\2\2\2\u00af"+
		"\u00ab\3\2\2\2\u00b0#\3\2\2\2\u00b1\u00b2\5\n\6\2\u00b2\u00b3\7\66\2\2"+
		"\u00b3\u00b5\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6"+
		"\3\2\2\2\u00b6\u00b7\5\f\7\2\u00b7\u00b8\7\66\2\2\u00b8\u00ba\3\2\2\2"+
		"\u00b9\u00b4\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc"+
		"\5\16\b\2\u00bc%\3\2\2\2\u00bd\u00be\5\n\6\2\u00be\u00bf\7\66\2\2\u00bf"+
		"\u00c1\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c3\5\f\7\2\u00c3\'\3\2\2\2\u00c4\u00c5\7:\2\2\u00c5\u00ca"+
		"\5$\23\2\u00c6\u00c7\7\67\2\2\u00c7\u00c9\5$\23\2\u00c8\u00c6\3\2\2\2"+
		"\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd"+
		"\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\79\2\2\u00ce)\3\2\2\2\u00cf\u00d3"+
		"\5,\27\2\u00d0\u00d3\5.\30\2\u00d1\u00d3\5^\60\2\u00d2\u00cf\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d6\7\64"+
		"\2\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6+\3\2\2\2\u00d7\u00dc"+
		"\5\60\31\2\u00d8\u00dc\5<\37\2\u00d9\u00dc\5> \2\u00da\u00dc\5D#\2\u00db"+
		"\u00d7\3\2\2\2\u00db\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2"+
		"\2\2\u00dc-\3\2\2\2\u00dd\u00e4\5J&\2\u00de\u00e4\5L\'\2\u00df\u00e4\5"+
		"N(\2\u00e0\u00e4\5X-\2\u00e1\u00e4\5Z.\2\u00e2\u00e4\5\\/\2\u00e3\u00dd"+
		"\3\2\2\2\u00e3\u00de\3\2\2\2\u00e3\u00df\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4/\3\2\2\2\u00e5\u00e6\7\25\2\2"+
		"\u00e6\u00ec\58\35\2\u00e7\u00e8\7\t\2\2\u00e8\u00ea\5&\24\2\u00e9\u00eb"+
		"\5\62\32\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2"+
		"\u00ec\u00e7\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00f0"+
		"\5\64\33\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\61\3\2\2\2\u00f1"+
		"\u00f2\7\n\2\2\u00f2\u00f3\5\22\n\2\u00f3\63\3\2\2\2\u00f4\u00f5\7\31"+
		"\2\2\u00f5\u00f6\7\32\2\2\u00f6\u00fb\5\66\34\2\u00f7\u00f8\7\67\2\2\u00f8"+
		"\u00fa\5\66\34\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3"+
		"\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\65\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe"+
		"\u0100\5$\23\2\u00ff\u0101\t\6\2\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\67\3\2\2\2\u0102\u0107\5:\36\2\u0103\u0104\7\67\2\2\u0104\u0106"+
		"\5:\36\2\u0105\u0103\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u010c\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010c\78"+
		"\2\2\u010b\u0102\3\2\2\2\u010b\u010a\3\2\2\2\u010c9\3\2\2\2\u010d\u010e"+
		"\5&\24\2\u010e\u010f\7\66\2\2\u010f\u0110\78\2\2\u0110\u0113\3\2\2\2\u0111"+
		"\u0113\5$\23\2\u0112\u010d\3\2\2\2\u0112\u0111\3\2\2\2\u0113;\3\2\2\2"+
		"\u0114\u0115\7\26\2\2\u0115\u0116\7\t\2\2\u0116\u0118\5&\24\2\u0117\u0119"+
		"\5\62\32\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119=\3\2\2\2\u011a"+
		"\u011b\7\27\2\2\u011b\u011c\7\r\2\2\u011c\u011d\5&\24\2\u011d\u011e\5"+
		"(\25\2\u011e\u011f\5@!\2\u011f?\3\2\2\2\u0120\u0121\t\7\2\2\u0121\u0126"+
		"\5B\"\2\u0122\u0123\7\67\2\2\u0123\u0125\5B\"\2\u0124\u0122\3\2\2\2\u0125"+
		"\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127A\3\2\2\2"+
		"\u0128\u0126\3\2\2\2\u0129\u012c\7:\2\2\u012a\u012d\5\b\5\2\u012b\u012d"+
		"\7\16\2\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d\u0135\3\2\2\2"+
		"\u012e\u0131\7\67\2\2\u012f\u0132\5\b\5\2\u0130\u0132\7\16\2\2\u0131\u012f"+
		"\3\2\2\2\u0131\u0130\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u012e\3\2\2\2\u0134"+
		"\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2"+
		"\2\2\u0137\u0135\3\2\2\2\u0138\u0139\79\2\2\u0139C\3\2\2\2\u013a\u013b"+
		"\7\30\2\2\u013b\u013c\5&\24\2\u013c\u013e\5F$\2\u013d\u013f\5\62\32\2"+
		"\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u0142"+
		"\5\64\33\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142E\3\2\2\2\u0143"+
		"\u0144\7\33\2\2\u0144\u0149\5H%\2\u0145\u0146\7\67\2\2\u0146\u0148\5H"+
		"%\2\u0147\u0145\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014aG\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d\5$\23\2"+
		"\u014d\u0150\7\62\2\2\u014e\u0151\5\b\5\2\u014f\u0151\7\16\2\2\u0150\u014e"+
		"\3\2\2\2\u0150\u014f\3\2\2\2\u0151I\3\2\2\2\u0152\u0153\7\3\2\2\u0153"+
		"\u0154\t\b\2\2\u0154\u0155\5\n\6\2\u0155K\3\2\2\2\u0156\u0157\7\5\2\2"+
		"\u0157\u0158\t\b\2\2\u0158\u0159\5\n\6\2\u0159M\3\2\2\2\u015a\u015b\7"+
		"\3\2\2\u015b\u015c\7\17\2\2\u015c\u015d\5\f\7\2\u015d\u015e\7:\2\2\u015e"+
		"\u0163\5P)\2\u015f\u0160\7\67\2\2\u0160\u0162\5P)\2\u0161\u015f\3\2\2"+
		"\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166"+
		"\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0167\79\2\2\u0167O\3\2\2\2\u0168\u0169"+
		"\5\16\b\2\u0169\u016a\5V,\2\u016a\u017e\3\2\2\2\u016b\u016c\7\20\2\2\u016c"+
		"\u016d\7\21\2\2\u016d\u016e\7:\2\2\u016e\u016f\5\16\b\2\u016f\u0170\7"+
		"9\2\2\u0170\u017e\3\2\2\2\u0171\u0172\7\23\2\2\u0172\u0173\7:\2\2\u0173"+
		"\u0178\5\16\b\2\u0174\u0175\7\67\2\2\u0175\u0177\5\16\b\2\u0176\u0174"+
		"\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		"\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c\79\2\2\u017c\u017e\3\2"+
		"\2\2\u017d\u0168\3\2\2\2\u017d\u016b\3\2\2\2\u017d\u0171\3\2\2\2\u017e"+
		"Q\3\2\2\2\u017f\u0180\7(\2\2\u0180\u0183\7\36\2\2\u0181\u0183\7\36\2\2"+
		"\u0182\u017f\3\2\2\2\u0182\u0181\3\2\2\2\u0183S\3\2\2\2\u0184\u0185\7"+
		"C\2\2\u0185U\3\2\2\2\u0186\u01a4\3\2\2\2\u0187\u0189\7\37\2\2\u0188\u018a"+
		"\5R*\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018d\3\2\2\2\u018b"+
		"\u018c\7\16\2\2\u018c\u018e\5\6\4\2\u018d\u018b\3\2\2\2\u018d\u018e\3"+
		"\2\2\2\u018e\u01a4\3\2\2\2\u018f\u0191\7\"\2\2\u0190\u0192\5R*\2\u0191"+
		"\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0194\7\16"+
		"\2\2\u0194\u0196\5\6\4\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u01a4\3\2\2\2\u0197\u0198\7 \2\2\u0198\u0199\7:\2\2\u0199\u019a\5T+\2"+
		"\u019a\u019b\79\2\2\u019b\u019d\3\2\2\2\u019c\u019e\5R*\2\u019d\u019c"+
		"\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u01a0\7\16\2\2"+
		"\u01a0\u01a2\7E\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4"+
		"\3\2\2\2\u01a3\u0186\3\2\2\2\u01a3\u0187\3\2\2\2\u01a3\u018f\3\2\2\2\u01a3"+
		"\u0197\3\2\2\2\u01a4W\3\2\2\2\u01a5\u01a6\7\5\2\2\u01a6\u01a7\7\17\2\2"+
		"\u01a7\u01a8\5\f\7\2\u01a8Y\3\2\2\2\u01a9\u01aa\7\3\2\2\u01aa\u01ab\7"+
		"\23\2\2\u01ab\u01ac\7\24\2\2\u01ac\u01ad\5\20\t\2\u01ad\u01ae\7\22\2\2"+
		"\u01ae\u01af\5\f\7\2\u01af\u01b0\7:\2\2\u01b0\u01b5\5\16\b\2\u01b1\u01b2"+
		"\7\67\2\2\u01b2\u01b4\5\16\b\2\u01b3\u01b1\3\2\2\2\u01b4\u01b7\3\2\2\2"+
		"\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01b5"+
		"\3\2\2\2\u01b8\u01b9\79\2\2\u01b9[\3\2\2\2\u01ba\u01bb\7\5\2\2\u01bb\u01bc"+
		"\7\24\2\2\u01bc\u01bd\5\20\t\2\u01bd\u01be\7\22\2\2\u01be\u01bf\5\f\7"+
		"\2\u01bf]\3\2\2\2\u01c0\u01c1\7#\2\2\u01c1_\3\2\2\2\61el{\u0083\u008b"+
		"\u008f\u009b\u00a0\u00a5\u00af\u00b4\u00b9\u00c0\u00ca\u00d2\u00d5\u00db"+
		"\u00e3\u00ea\u00ec\u00ef\u00fb\u0100\u0107\u010b\u0112\u0118\u0126\u012c"+
		"\u0131\u0135\u013e\u0141\u0149\u0150\u0163\u0178\u017d\u0182\u0189\u018d"+
		"\u0191\u0195\u019d\u01a1\u01a3\u01b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}