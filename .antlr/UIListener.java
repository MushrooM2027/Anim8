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
	 * Enter a parse tree produced by {@link UIParser#labelComponent}.
	 * @param ctx the parse tree
	 */
	void enterLabelComponent(UIParser.LabelComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#labelComponent}.
	 * @param ctx the parse tree
	 */
	void exitLabelComponent(UIParser.LabelComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#textfieldComponent}.
	 * @param ctx the parse tree
	 */
	void enterTextfieldComponent(UIParser.TextfieldComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#textfieldComponent}.
	 * @param ctx the parse tree
	 */
	void exitTextfieldComponent(UIParser.TextfieldComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#checkboxComponent}.
	 * @param ctx the parse tree
	 */
	void enterCheckboxComponent(UIParser.CheckboxComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#checkboxComponent}.
	 * @param ctx the parse tree
	 */
	void exitCheckboxComponent(UIParser.CheckboxComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#dropdownComponent}.
	 * @param ctx the parse tree
	 */
	void enterDropdownComponent(UIParser.DropdownComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#dropdownComponent}.
	 * @param ctx the parse tree
	 */
	void exitDropdownComponent(UIParser.DropdownComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#buttonComponent}.
	 * @param ctx the parse tree
	 */
	void enterButtonComponent(UIParser.ButtonComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#buttonComponent}.
	 * @param ctx the parse tree
	 */
	void exitButtonComponent(UIParser.ButtonComponentContext ctx);
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
	 * Enter a parse tree produced by {@link UIParser#textfieldProperty}.
	 * @param ctx the parse tree
	 */
	void enterTextfieldProperty(UIParser.TextfieldPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#textfieldProperty}.
	 * @param ctx the parse tree
	 */
	void exitTextfieldProperty(UIParser.TextfieldPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#checkboxProperty}.
	 * @param ctx the parse tree
	 */
	void enterCheckboxProperty(UIParser.CheckboxPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#checkboxProperty}.
	 * @param ctx the parse tree
	 */
	void exitCheckboxProperty(UIParser.CheckboxPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#dropdownProperty}.
	 * @param ctx the parse tree
	 */
	void enterDropdownProperty(UIParser.DropdownPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#dropdownProperty}.
	 * @param ctx the parse tree
	 */
	void exitDropdownProperty(UIParser.DropdownPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#buttonProperty}.
	 * @param ctx the parse tree
	 */
	void enterButtonProperty(UIParser.ButtonPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#buttonProperty}.
	 * @param ctx the parse tree
	 */
	void exitButtonProperty(UIParser.ButtonPropertyContext ctx);
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