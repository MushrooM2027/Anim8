// Generated from UI.g4 by ANTLR 4.13.2
package parser;
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
	 * Enter a parse tree produced by {@link UIParser#globalStyle}.
	 * @param ctx the parse tree
	 */
	void enterGlobalStyle(UIParser.GlobalStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#globalStyle}.
	 * @param ctx the parse tree
	 */
	void exitGlobalStyle(UIParser.GlobalStyleContext ctx);
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
	 * Enter a parse tree produced by {@link UIParser#passwordFieldComponent}.
	 * @param ctx the parse tree
	 */
	void enterPasswordFieldComponent(UIParser.PasswordFieldComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#passwordFieldComponent}.
	 * @param ctx the parse tree
	 */
	void exitPasswordFieldComponent(UIParser.PasswordFieldComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#textAreaComponent}.
	 * @param ctx the parse tree
	 */
	void enterTextAreaComponent(UIParser.TextAreaComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#textAreaComponent}.
	 * @param ctx the parse tree
	 */
	void exitTextAreaComponent(UIParser.TextAreaComponentContext ctx);
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
	 * Enter a parse tree produced by {@link UIParser#imageComponent}.
	 * @param ctx the parse tree
	 */
	void enterImageComponent(UIParser.ImageComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#imageComponent}.
	 * @param ctx the parse tree
	 */
	void exitImageComponent(UIParser.ImageComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#sliderComponent}.
	 * @param ctx the parse tree
	 */
	void enterSliderComponent(UIParser.SliderComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#sliderComponent}.
	 * @param ctx the parse tree
	 */
	void exitSliderComponent(UIParser.SliderComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#progressBarComponent}.
	 * @param ctx the parse tree
	 */
	void enterProgressBarComponent(UIParser.ProgressBarComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#progressBarComponent}.
	 * @param ctx the parse tree
	 */
	void exitProgressBarComponent(UIParser.ProgressBarComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#tableViewComponent}.
	 * @param ctx the parse tree
	 */
	void enterTableViewComponent(UIParser.TableViewComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#tableViewComponent}.
	 * @param ctx the parse tree
	 */
	void exitTableViewComponent(UIParser.TableViewComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#radioButtonComponent}.
	 * @param ctx the parse tree
	 */
	void enterRadioButtonComponent(UIParser.RadioButtonComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#radioButtonComponent}.
	 * @param ctx the parse tree
	 */
	void exitRadioButtonComponent(UIParser.RadioButtonComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#listViewComponent}.
	 * @param ctx the parse tree
	 */
	void enterListViewComponent(UIParser.ListViewComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#listViewComponent}.
	 * @param ctx the parse tree
	 */
	void exitListViewComponent(UIParser.ListViewComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#menuBarComponent}.
	 * @param ctx the parse tree
	 */
	void enterMenuBarComponent(UIParser.MenuBarComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#menuBarComponent}.
	 * @param ctx the parse tree
	 */
	void exitMenuBarComponent(UIParser.MenuBarComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#toolBarComponent}.
	 * @param ctx the parse tree
	 */
	void enterToolBarComponent(UIParser.ToolBarComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#toolBarComponent}.
	 * @param ctx the parse tree
	 */
	void exitToolBarComponent(UIParser.ToolBarComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#datePickerComponent}.
	 * @param ctx the parse tree
	 */
	void enterDatePickerComponent(UIParser.DatePickerComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#datePickerComponent}.
	 * @param ctx the parse tree
	 */
	void exitDatePickerComponent(UIParser.DatePickerComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#webViewComponent}.
	 * @param ctx the parse tree
	 */
	void enterWebViewComponent(UIParser.WebViewComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#webViewComponent}.
	 * @param ctx the parse tree
	 */
	void exitWebViewComponent(UIParser.WebViewComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#tabPaneComponent}.
	 * @param ctx the parse tree
	 */
	void enterTabPaneComponent(UIParser.TabPaneComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#tabPaneComponent}.
	 * @param ctx the parse tree
	 */
	void exitTabPaneComponent(UIParser.TabPaneComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#tab}.
	 * @param ctx the parse tree
	 */
	void enterTab(UIParser.TabContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#tab}.
	 * @param ctx the parse tree
	 */
	void exitTab(UIParser.TabContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#accordionComponent}.
	 * @param ctx the parse tree
	 */
	void enterAccordionComponent(UIParser.AccordionComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#accordionComponent}.
	 * @param ctx the parse tree
	 */
	void exitAccordionComponent(UIParser.AccordionComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#titledPaneComponent}.
	 * @param ctx the parse tree
	 */
	void enterTitledPaneComponent(UIParser.TitledPaneComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#titledPaneComponent}.
	 * @param ctx the parse tree
	 */
	void exitTitledPaneComponent(UIParser.TitledPaneComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#treeViewComponent}.
	 * @param ctx the parse tree
	 */
	void enterTreeViewComponent(UIParser.TreeViewComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#treeViewComponent}.
	 * @param ctx the parse tree
	 */
	void exitTreeViewComponent(UIParser.TreeViewComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#spinnerComponent}.
	 * @param ctx the parse tree
	 */
	void enterSpinnerComponent(UIParser.SpinnerComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#spinnerComponent}.
	 * @param ctx the parse tree
	 */
	void exitSpinnerComponent(UIParser.SpinnerComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#colorPickerComponent}.
	 * @param ctx the parse tree
	 */
	void enterColorPickerComponent(UIParser.ColorPickerComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#colorPickerComponent}.
	 * @param ctx the parse tree
	 */
	void exitColorPickerComponent(UIParser.ColorPickerComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#fileChooserComponent}.
	 * @param ctx the parse tree
	 */
	void enterFileChooserComponent(UIParser.FileChooserComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#fileChooserComponent}.
	 * @param ctx the parse tree
	 */
	void exitFileChooserComponent(UIParser.FileChooserComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#directoryChooserComponent}.
	 * @param ctx the parse tree
	 */
	void enterDirectoryChooserComponent(UIParser.DirectoryChooserComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#directoryChooserComponent}.
	 * @param ctx the parse tree
	 */
	void exitDirectoryChooserComponent(UIParser.DirectoryChooserComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#canvasComponent}.
	 * @param ctx the parse tree
	 */
	void enterCanvasComponent(UIParser.CanvasComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#canvasComponent}.
	 * @param ctx the parse tree
	 */
	void exitCanvasComponent(UIParser.CanvasComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#mediaViewComponent}.
	 * @param ctx the parse tree
	 */
	void enterMediaViewComponent(UIParser.MediaViewComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#mediaViewComponent}.
	 * @param ctx the parse tree
	 */
	void exitMediaViewComponent(UIParser.MediaViewComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#scrollPaneComponent}.
	 * @param ctx the parse tree
	 */
	void enterScrollPaneComponent(UIParser.ScrollPaneComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#scrollPaneComponent}.
	 * @param ctx the parse tree
	 */
	void exitScrollPaneComponent(UIParser.ScrollPaneComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#splitPaneComponent}.
	 * @param ctx the parse tree
	 */
	void enterSplitPaneComponent(UIParser.SplitPaneComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#splitPaneComponent}.
	 * @param ctx the parse tree
	 */
	void exitSplitPaneComponent(UIParser.SplitPaneComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#treeTableViewComponent}.
	 * @param ctx the parse tree
	 */
	void enterTreeTableViewComponent(UIParser.TreeTableViewComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#treeTableViewComponent}.
	 * @param ctx the parse tree
	 */
	void exitTreeTableViewComponent(UIParser.TreeTableViewComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#dialogComponent}.
	 * @param ctx the parse tree
	 */
	void enterDialogComponent(UIParser.DialogComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#dialogComponent}.
	 * @param ctx the parse tree
	 */
	void exitDialogComponent(UIParser.DialogComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#eventBinding}.
	 * @param ctx the parse tree
	 */
	void enterEventBinding(UIParser.EventBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#eventBinding}.
	 * @param ctx the parse tree
	 */
	void exitEventBinding(UIParser.EventBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#eventAction}.
	 * @param ctx the parse tree
	 */
	void enterEventAction(UIParser.EventActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#eventAction}.
	 * @param ctx the parse tree
	 */
	void exitEventAction(UIParser.EventActionContext ctx);
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
	 * Enter a parse tree produced by {@link UIParser#passwordFieldProperty}.
	 * @param ctx the parse tree
	 */
	void enterPasswordFieldProperty(UIParser.PasswordFieldPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#passwordFieldProperty}.
	 * @param ctx the parse tree
	 */
	void exitPasswordFieldProperty(UIParser.PasswordFieldPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#textAreaProperty}.
	 * @param ctx the parse tree
	 */
	void enterTextAreaProperty(UIParser.TextAreaPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#textAreaProperty}.
	 * @param ctx the parse tree
	 */
	void exitTextAreaProperty(UIParser.TextAreaPropertyContext ctx);
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
	 * Enter a parse tree produced by {@link UIParser#imageProperty}.
	 * @param ctx the parse tree
	 */
	void enterImageProperty(UIParser.ImagePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#imageProperty}.
	 * @param ctx the parse tree
	 */
	void exitImageProperty(UIParser.ImagePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#sliderProperty}.
	 * @param ctx the parse tree
	 */
	void enterSliderProperty(UIParser.SliderPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#sliderProperty}.
	 * @param ctx the parse tree
	 */
	void exitSliderProperty(UIParser.SliderPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#progressBarProperty}.
	 * @param ctx the parse tree
	 */
	void enterProgressBarProperty(UIParser.ProgressBarPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#progressBarProperty}.
	 * @param ctx the parse tree
	 */
	void exitProgressBarProperty(UIParser.ProgressBarPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#tableViewProperty}.
	 * @param ctx the parse tree
	 */
	void enterTableViewProperty(UIParser.TableViewPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#tableViewProperty}.
	 * @param ctx the parse tree
	 */
	void exitTableViewProperty(UIParser.TableViewPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#radioButtonProperty}.
	 * @param ctx the parse tree
	 */
	void enterRadioButtonProperty(UIParser.RadioButtonPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#radioButtonProperty}.
	 * @param ctx the parse tree
	 */
	void exitRadioButtonProperty(UIParser.RadioButtonPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#listViewProperty}.
	 * @param ctx the parse tree
	 */
	void enterListViewProperty(UIParser.ListViewPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#listViewProperty}.
	 * @param ctx the parse tree
	 */
	void exitListViewProperty(UIParser.ListViewPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#menuDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMenuDefinition(UIParser.MenuDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#menuDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMenuDefinition(UIParser.MenuDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#menu}.
	 * @param ctx the parse tree
	 */
	void enterMenu(UIParser.MenuContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#menu}.
	 * @param ctx the parse tree
	 */
	void exitMenu(UIParser.MenuContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#datePickerProperty}.
	 * @param ctx the parse tree
	 */
	void enterDatePickerProperty(UIParser.DatePickerPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#datePickerProperty}.
	 * @param ctx the parse tree
	 */
	void exitDatePickerProperty(UIParser.DatePickerPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#webViewProperty}.
	 * @param ctx the parse tree
	 */
	void enterWebViewProperty(UIParser.WebViewPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#webViewProperty}.
	 * @param ctx the parse tree
	 */
	void exitWebViewProperty(UIParser.WebViewPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#layoutDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLayoutDeclaration(UIParser.LayoutDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#layoutDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLayoutDeclaration(UIParser.LayoutDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#styleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStyleDeclaration(UIParser.StyleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#styleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStyleDeclaration(UIParser.StyleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#layoutProperty}.
	 * @param ctx the parse tree
	 */
	void enterLayoutProperty(UIParser.LayoutPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#layoutProperty}.
	 * @param ctx the parse tree
	 */
	void exitLayoutProperty(UIParser.LayoutPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#styleProperty}.
	 * @param ctx the parse tree
	 */
	void enterStyleProperty(UIParser.StylePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#styleProperty}.
	 * @param ctx the parse tree
	 */
	void exitStyleProperty(UIParser.StylePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#treeViewProperty}.
	 * @param ctx the parse tree
	 */
	void enterTreeViewProperty(UIParser.TreeViewPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#treeViewProperty}.
	 * @param ctx the parse tree
	 */
	void exitTreeViewProperty(UIParser.TreeViewPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#spinnerProperty}.
	 * @param ctx the parse tree
	 */
	void enterSpinnerProperty(UIParser.SpinnerPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#spinnerProperty}.
	 * @param ctx the parse tree
	 */
	void exitSpinnerProperty(UIParser.SpinnerPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#colorPickerProperty}.
	 * @param ctx the parse tree
	 */
	void enterColorPickerProperty(UIParser.ColorPickerPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#colorPickerProperty}.
	 * @param ctx the parse tree
	 */
	void exitColorPickerProperty(UIParser.ColorPickerPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#fileChooserProperty}.
	 * @param ctx the parse tree
	 */
	void enterFileChooserProperty(UIParser.FileChooserPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#fileChooserProperty}.
	 * @param ctx the parse tree
	 */
	void exitFileChooserProperty(UIParser.FileChooserPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#mediaViewProperty}.
	 * @param ctx the parse tree
	 */
	void enterMediaViewProperty(UIParser.MediaViewPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#mediaViewProperty}.
	 * @param ctx the parse tree
	 */
	void exitMediaViewProperty(UIParser.MediaViewPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#scrollPaneProperty}.
	 * @param ctx the parse tree
	 */
	void enterScrollPaneProperty(UIParser.ScrollPanePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#scrollPaneProperty}.
	 * @param ctx the parse tree
	 */
	void exitScrollPaneProperty(UIParser.ScrollPanePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#splitPaneProperty}.
	 * @param ctx the parse tree
	 */
	void enterSplitPaneProperty(UIParser.SplitPanePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#splitPaneProperty}.
	 * @param ctx the parse tree
	 */
	void exitSplitPaneProperty(UIParser.SplitPanePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#treeTableViewProperty}.
	 * @param ctx the parse tree
	 */
	void enterTreeTableViewProperty(UIParser.TreeTableViewPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#treeTableViewProperty}.
	 * @param ctx the parse tree
	 */
	void exitTreeTableViewProperty(UIParser.TreeTableViewPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#dialogProperty}.
	 * @param ctx the parse tree
	 */
	void enterDialogProperty(UIParser.DialogPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#dialogProperty}.
	 * @param ctx the parse tree
	 */
	void exitDialogProperty(UIParser.DialogPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#columnList}.
	 * @param ctx the parse tree
	 */
	void enterColumnList(UIParser.ColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#columnList}.
	 * @param ctx the parse tree
	 */
	void exitColumnList(UIParser.ColumnListContext ctx);
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
	 * Enter a parse tree produced by {@link UIParser#alignmentType}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentType(UIParser.AlignmentTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#alignmentType}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentType(UIParser.AlignmentTypeContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link UIParser#orientationType}.
	 * @param ctx the parse tree
	 */
	void enterOrientationType(UIParser.OrientationTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#orientationType}.
	 * @param ctx the parse tree
	 */
	void exitOrientationType(UIParser.OrientationTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#selectionModeType}.
	 * @param ctx the parse tree
	 */
	void enterSelectionModeType(UIParser.SelectionModeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#selectionModeType}.
	 * @param ctx the parse tree
	 */
	void exitSelectionModeType(UIParser.SelectionModeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#modalityType}.
	 * @param ctx the parse tree
	 */
	void enterModalityType(UIParser.ModalityTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#modalityType}.
	 * @param ctx the parse tree
	 */
	void exitModalityType(UIParser.ModalityTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#stageStyleType}.
	 * @param ctx the parse tree
	 */
	void enterStageStyleType(UIParser.StageStyleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#stageStyleType}.
	 * @param ctx the parse tree
	 */
	void exitStageStyleType(UIParser.StageStyleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UIParser#dialogType}.
	 * @param ctx the parse tree
	 */
	void enterDialogType(UIParser.DialogTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UIParser#dialogType}.
	 * @param ctx the parse tree
	 */
	void exitDialogType(UIParser.DialogTypeContext ctx);
}