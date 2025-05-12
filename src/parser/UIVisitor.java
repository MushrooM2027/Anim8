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
	 * Visit a parse tree produced by {@link UIParser#globalStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalStyle(UIParser.GlobalStyleContext ctx);
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
	 * Visit a parse tree produced by {@link UIParser#passwordFieldComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPasswordFieldComponent(UIParser.PasswordFieldComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#textAreaComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextAreaComponent(UIParser.TextAreaComponentContext ctx);
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
	 * Visit a parse tree produced by {@link UIParser#imageComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageComponent(UIParser.ImageComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#sliderComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliderComponent(UIParser.SliderComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#progressBarComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgressBarComponent(UIParser.ProgressBarComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#tableViewComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableViewComponent(UIParser.TableViewComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#radioButtonComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRadioButtonComponent(UIParser.RadioButtonComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#listViewComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListViewComponent(UIParser.ListViewComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#menuBarComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenuBarComponent(UIParser.MenuBarComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#toolBarComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToolBarComponent(UIParser.ToolBarComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#datePickerComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatePickerComponent(UIParser.DatePickerComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#webViewComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWebViewComponent(UIParser.WebViewComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#tabPaneComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabPaneComponent(UIParser.TabPaneComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#tab}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTab(UIParser.TabContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#accordionComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccordionComponent(UIParser.AccordionComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#titledPaneComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitledPaneComponent(UIParser.TitledPaneComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#treeViewComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTreeViewComponent(UIParser.TreeViewComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#spinnerComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpinnerComponent(UIParser.SpinnerComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#colorPickerComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorPickerComponent(UIParser.ColorPickerComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#fileChooserComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileChooserComponent(UIParser.FileChooserComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#directoryChooserComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectoryChooserComponent(UIParser.DirectoryChooserComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#canvasComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCanvasComponent(UIParser.CanvasComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#mediaViewComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaViewComponent(UIParser.MediaViewComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#scrollPaneComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScrollPaneComponent(UIParser.ScrollPaneComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#splitPaneComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSplitPaneComponent(UIParser.SplitPaneComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#treeTableViewComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTreeTableViewComponent(UIParser.TreeTableViewComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#dialogComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDialogComponent(UIParser.DialogComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#chartComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChartComponent(UIParser.ChartComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#chartType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChartType(UIParser.ChartTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#eventBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventBinding(UIParser.EventBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#animationBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnimationBinding(UIParser.AnimationBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#animationType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnimationType(UIParser.AnimationTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#effectBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEffectBinding(UIParser.EffectBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#effectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEffectType(UIParser.EffectTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#eventAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventAction(UIParser.EventActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#chartProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChartProperty(UIParser.ChartPropertyContext ctx);
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
	 * Visit a parse tree produced by {@link UIParser#passwordFieldProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPasswordFieldProperty(UIParser.PasswordFieldPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#textAreaProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextAreaProperty(UIParser.TextAreaPropertyContext ctx);
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
	 * Visit a parse tree produced by {@link UIParser#imageProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageProperty(UIParser.ImagePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#sliderProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliderProperty(UIParser.SliderPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#progressBarProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgressBarProperty(UIParser.ProgressBarPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#tableViewProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableViewProperty(UIParser.TableViewPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#radioButtonProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRadioButtonProperty(UIParser.RadioButtonPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#listViewProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListViewProperty(UIParser.ListViewPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#menuDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenuDefinition(UIParser.MenuDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#menu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenu(UIParser.MenuContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#datePickerProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatePickerProperty(UIParser.DatePickerPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#webViewProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWebViewProperty(UIParser.WebViewPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#layoutDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLayoutDeclaration(UIParser.LayoutDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#styleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleDeclaration(UIParser.StyleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#layoutProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLayoutProperty(UIParser.LayoutPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#styleProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleProperty(UIParser.StylePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#treeViewProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTreeViewProperty(UIParser.TreeViewPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#spinnerProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpinnerProperty(UIParser.SpinnerPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#colorPickerProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorPickerProperty(UIParser.ColorPickerPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#fileChooserProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileChooserProperty(UIParser.FileChooserPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#mediaViewProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaViewProperty(UIParser.MediaViewPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#scrollPaneProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScrollPaneProperty(UIParser.ScrollPanePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#splitPaneProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSplitPaneProperty(UIParser.SplitPanePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#treeTableViewProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTreeTableViewProperty(UIParser.TreeTableViewPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#dialogProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDialogProperty(UIParser.DialogPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#columnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnList(UIParser.ColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#stringList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringList(UIParser.StringListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#alignmentType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignmentType(UIParser.AlignmentTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#layoutType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLayoutType(UIParser.LayoutTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#orientationType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrientationType(UIParser.OrientationTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#selectionModeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionModeType(UIParser.SelectionModeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#modalityType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModalityType(UIParser.ModalityTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#stageStyleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStageStyleType(UIParser.StageStyleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#dialogType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDialogType(UIParser.DialogTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#dataList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataList(UIParser.DataListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UIParser#dataPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataPair(UIParser.DataPairContext ctx);
}