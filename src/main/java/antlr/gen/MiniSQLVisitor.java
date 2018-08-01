// Generated from D:/IDEA programming/MiniSQL/src/main/resources\MiniSQL.g4 by ANTLR 4.7
package antlr.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniSQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#relational_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_op(MiniSQLParser.Relational_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(MiniSQLParser.String_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#number_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_literal(MiniSQLParser.Number_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(MiniSQLParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#schema_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_name(MiniSQLParser.Schema_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(MiniSQLParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(MiniSQLParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(MiniSQLParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MiniSQLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#exp_factor1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_factor1(MiniSQLParser.Exp_factor1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#exp_factor2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_factor2(MiniSQLParser.Exp_factor2Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#exp_factor3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_factor3(MiniSQLParser.Exp_factor3Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#exp_factor4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_factor4(MiniSQLParser.Exp_factor4Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#bit_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_expr(MiniSQLParser.Bit_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#factor1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor1(MiniSQLParser.Factor1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#factor2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor2(MiniSQLParser.Factor2Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#simple_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expr(MiniSQLParser.Simple_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#column_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_spec(MiniSQLParser.Column_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#table_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_spec(MiniSQLParser.Table_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_list(MiniSQLParser.Column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#root_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot_statement(MiniSQLParser.Root_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#data_manipulation_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_manipulation_statements(MiniSQLParser.Data_manipulation_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#data_definition_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_definition_statements(MiniSQLParser.Data_definition_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(MiniSQLParser.Select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(MiniSQLParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#orderby_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderby_clause(MiniSQLParser.Orderby_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#orderby_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderby_item(MiniSQLParser.Orderby_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(MiniSQLParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#displayed_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayed_column(MiniSQLParser.Displayed_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#delete_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_statement(MiniSQLParser.Delete_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#insert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_statement(MiniSQLParser.Insert_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#value_list_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_list_clause(MiniSQLParser.Value_list_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#column_value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_value_list(MiniSQLParser.Column_value_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#update_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_statement(MiniSQLParser.Update_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#set_columns_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_columns_clause(MiniSQLParser.Set_columns_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#set_column_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_column_clause(MiniSQLParser.Set_column_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#create_database_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_statement(MiniSQLParser.Create_database_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#drop_database_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_database_statement(MiniSQLParser.Drop_database_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#create_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_statement(MiniSQLParser.Create_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#create_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_definition(MiniSQLParser.Create_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#null_or_notnull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_or_notnull(MiniSQLParser.Null_or_notnullContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(MiniSQLParser.LengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#column_data_type_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_data_type_header(MiniSQLParser.Column_data_type_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#drop_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table_statement(MiniSQLParser.Drop_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#create_index_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_statement(MiniSQLParser.Create_index_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSQLParser#drop_index_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_index_statement(MiniSQLParser.Drop_index_statementContext ctx);
}