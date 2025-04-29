// Generated from UI.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UIParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UIVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UIParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(UIParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(UIParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#windowDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowDeclaration(UIParser.WindowDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#componentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDeclaration(UIParser.ComponentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(UIParser.ComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#labelComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelComponent(UIParser.LabelComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#textfieldComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextfieldComponent(UIParser.TextfieldComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#checkboxComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckboxComponent(UIParser.CheckboxComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#dropdownComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropdownComponent(UIParser.DropdownComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#buttonComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonComponent(UIParser.ButtonComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#labelProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelProperty(UIParser.LabelPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#textfieldProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextfieldProperty(UIParser.TextfieldPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#checkboxProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckboxProperty(UIParser.CheckboxPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#dropdownProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropdownProperty(UIParser.DropdownPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#buttonProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonProperty(UIParser.ButtonPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#stringList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringList(UIParser.StringListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#layoutType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLayoutType(UIParser.LayoutTypeContext ctx);
}