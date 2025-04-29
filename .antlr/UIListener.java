// Generated from c:/Users/adity/Desktop/Project_final1/UI.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UIParser}.
 */
public interface UIListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UIParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(UIParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(UIParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(UIParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(UIParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#windowDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterWindowDeclaration(UIParser.WindowDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#windowDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitWindowDeclaration(UIParser.WindowDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclaration(UIParser.ComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclaration(UIParser.ComponentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(UIParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(UIParser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#labelProperty}.
	 * @param ctx the parse tree
	 */
	void enterLabelProperty(UIParser.LabelPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#labelProperty}.
	 * @param ctx the parse tree
	 */
	void exitLabelProperty(UIParser.LabelPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#stringList}.
	 * @param ctx the parse tree
	 */
	void enterStringList(UIParser.StringListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#stringList}.
	 * @param ctx the parse tree
	 */
	void exitStringList(UIParser.StringListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#layoutType}.
	 * @param ctx the parse tree
	 */
	void enterLayoutType(UIParser.LayoutTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#layoutType}.
	 * @param ctx the parse tree
	 */
	void exitLayoutType(UIParser.LayoutTypeContext ctx);
}