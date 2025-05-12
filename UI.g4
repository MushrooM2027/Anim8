grammar UI;

program: statement* EOF;

statement:
	windowDeclaration
	| componentDeclaration
	| layoutDeclaration
	| styleDeclaration
	| globalStyle;

globalStyle: 'importStyle' STRING;

windowDeclaration:
	'create' 'window' STRING 'size' INT 'x' INT (
		'resizable' BOOLEAN
	)? ('position' 'x' INT 'y' INT)? ('modality' modalityType)? (
		'stageStyle' stageStyleType
	)? ('layout' layoutType)?;

componentDeclaration: 'add' component;

component:
	labelComponent
	| textfieldComponent
	| passwordFieldComponent
	| textAreaComponent
	| checkboxComponent
	| dropdownComponent
	| buttonComponent
	| imageComponent
	| sliderComponent
	| progressBarComponent
	| tableViewComponent
	| radioButtonComponent
	| listViewComponent
	| menuBarComponent
	| toolBarComponent
	| datePickerComponent
	| webViewComponent
	| tabPaneComponent
	| accordionComponent
	| titledPaneComponent
	| treeViewComponent
	| spinnerComponent
	| colorPickerComponent
	| fileChooserComponent
	| directoryChooserComponent
	| canvasComponent
	| mediaViewComponent
	| scrollPaneComponent
	| splitPaneComponent
	| treeTableViewComponent
	| dialogComponent
	| chartComponent;

labelComponent:
	'label' STRING labelProperty* layoutProperty* animationBinding* eventBinding*; // <-- NEW

textfieldComponent:
	'textfield' 'id' IDENTIFIER textfieldProperty* layoutProperty* eventBinding*; // <-- NEW

passwordFieldComponent:
	'passwordField' 'id' IDENTIFIER passwordFieldProperty* layoutProperty* eventBinding*; // <-- NEW

textAreaComponent:
	'textArea' 'id' IDENTIFIER textAreaProperty* layoutProperty* eventBinding*; // <-- NEW

checkboxComponent:
	'checkbox' STRING 'id' IDENTIFIER checkboxProperty* layoutProperty* eventBinding*; // <-- NEW

dropdownComponent:
	'dropdown' 'id' IDENTIFIER 'options' stringList dropdownProperty* layoutProperty* eventBinding*;
// <-- NEW

buttonComponent:
	'button' STRING 'onClick' eventAction? buttonProperty* layoutProperty* animationBinding* effectBinding* animationBinding* eventBinding*;
// <-- updated: onClick optional, eventBinding added

imageComponent:
	'image' 'source' STRING imageProperty* layoutProperty* animationBinding*;

sliderComponent:
	'slider' 'id' IDENTIFIER 'min' INT 'max' INT 'value' INT sliderProperty* layoutProperty*
		eventBinding*; // <-- NEW

progressBarComponent:
	'progressBar' 'id' IDENTIFIER 'progress' FLOAT progressBarProperty* layoutProperty*;

tableViewComponent:
	'tableView' 'id' IDENTIFIER 'columns' columnList tableViewProperty* layoutProperty*;

radioButtonComponent:
	'radioButton' STRING 'id' IDENTIFIER radioButtonProperty* layoutProperty* eventBinding*;
// <-- NEW

listViewComponent:
	'listView' 'id' IDENTIFIER 'items' stringList listViewProperty* layoutProperty* eventBinding*;
// <-- NEW

menuBarComponent: 'menuBar' menuDefinition layoutProperty*;

toolBarComponent: 'toolBar' 'items' stringList layoutProperty*;

datePickerComponent:
	'datePicker' 'id' IDENTIFIER datePickerProperty* layoutProperty* eventBinding*; // <-- NEW

webViewComponent:
	'webView' 'url' STRING webViewProperty* layoutProperty* eventBinding*; // <-- NEW

tabPaneComponent:
	'tabPane' '{' tab+ '}' layoutProperty* eventBinding*; // <-- NEW

tab: 'tab' STRING '{' component+ '}';

accordionComponent:
	'accordion' '{' titledPaneComponent+ '}' layoutProperty* eventBinding*; // <-- NEW

titledPaneComponent:
	'titledPane' STRING '{' component+ '}' layoutProperty* eventBinding*; // <-- NEW

treeViewComponent:
	'treeView' 'id' IDENTIFIER treeViewProperty* layoutProperty* eventBinding*; // <-- NEW

spinnerComponent:
	'spinner' 'id' IDENTIFIER 'min' INT 'max' INT spinnerProperty* layoutProperty* eventBinding*;
// <-- NEW

colorPickerComponent:
	'colorPicker' 'id' IDENTIFIER colorPickerProperty* layoutProperty* eventBinding*; // <-- NEW

fileChooserComponent:
	'fileChooser' 'id' IDENTIFIER 'title' STRING fileChooserProperty* layoutProperty* eventBinding*;
// <-- NEW

directoryChooserComponent:
	'directoryChooser' 'id' IDENTIFIER 'title' STRING layoutProperty* eventBinding*; // <-- NEW

canvasComponent:
	'canvas' 'id' IDENTIFIER 'width' INT 'height' INT layoutProperty* eventBinding*; // <-- NEW

mediaViewComponent:
	'mediaView' 'source' STRING mediaViewProperty* layoutProperty* eventBinding*; // <-- NEW
scrollPaneComponent:
	'scrollPane' '{' component+ '}' scrollPaneProperty* layoutProperty* eventBinding*;

splitPaneComponent:
	'splitPane' 'orientation' orientationType '{' component+ '}' splitPaneProperty* layoutProperty*
		eventBinding*;

treeTableViewComponent:
	'treeTableView' 'id' IDENTIFIER 'columns' columnList treeTableViewProperty* layoutProperty*
		eventBinding*;

dialogComponent:
	'dialog' STRING 'id' IDENTIFIER dialogProperty* layoutProperty* eventBinding*;

chartComponent:
	'chart' chartType 'id' IDENTIFIER 'title' STRING 'data' dataList chartProperty* layoutProperty*
		eventBinding*;

chartType: 'PieChart' | 'BarChart' | 'LineChart';

// --- NEW: General event binding rule
eventBinding: 'onEvent' STRING 'do' eventAction;

animationBinding: 'animate' animationType ('duration' INT)? ('cycleCount' INT)? ('autoReverse' BOOLEAN)?;

animationType: 'fade' | 'rotate' | 'scale' | 'translate';

effectBinding: 'effect' effectType;

effectType: 'dropShadow' | 'glow' | 'bloom' | 'sepia' | 'gaussianBlur';


// --- Event Actions
eventAction:
	'showAlert' STRING
	| 'print' STRING
	| 'navigate' 'to' STRING;

// --- Properties

chartProperty:
	'legendVisible' BOOLEAN
	| 'animated' BOOLEAN
	| 'categoryAxisLabel' STRING
	| 'valueAxisLabel' STRING
	| eventBinding; // reuse general event bindings

labelProperty:
	'font' STRING
	| 'size' INT
	| 'color' STRING
	| 'bold'
	| 'italic'
	| 'tooltip' STRING
	| eventBinding; // <-- NEW

textfieldProperty:
	'placeholder' STRING
	| 'width' INT
	| 'default' STRING
	| 'editable' BOOLEAN
	| 'onChange' eventAction
	| 'tooltip' STRING
	| 'bindTo' IDENTIFIER
	| eventBinding; // <-- NEW

passwordFieldProperty:
	'promptText' STRING
	| 'editable' BOOLEAN
	| eventBinding; // <-- NEW

textAreaProperty:
	'promptText' STRING
	| 'wrapText' BOOLEAN
	| 'editable' BOOLEAN
	| eventBinding; // <-- NEW

checkboxProperty:
	'checked'
	| 'disabled'
	| 'indeterminate'
	| 'onToggle' eventAction
	| eventBinding; // <-- NEW

dropdownProperty:
	'width' INT
	| 'multipleSelection' BOOLEAN
	| 'onSelect' eventAction
	| eventBinding; // <-- NEW

buttonProperty:
	'width' INT
	| 'disabled'
	| 'defaultButton'
	| eventBinding; // <-- NEW

imageProperty:
	'fitWidth' INT
	| 'fitHeight' INT
	| 'preserveRatio' BOOLEAN;

sliderProperty:
	'orientation' orientationType
	| 'blockIncrement' FLOAT
	| 'onValueChange' eventAction
	| 'bindTo' IDENTIFIER
	| eventBinding; // <-- NEW

progressBarProperty: 'indeterminate' BOOLEAN;

tableViewProperty:
	'editable' BOOLEAN
	| 'sortableColumns' BOOLEAN
	| eventBinding; // <-- NEW

radioButtonProperty:
	'selected' BOOLEAN
	| 'group' IDENTIFIER
	| eventBinding; // <-- NEW

listViewProperty:
	'selectionMode' selectionModeType
	| eventBinding; // <-- NEW

menuDefinition: menu+;

menu: 'menu' STRING 'items' stringList;

datePickerProperty:
	'showWeekNumbers' BOOLEAN
	| 'editable' BOOLEAN
	| eventBinding; // <-- NEW

webViewProperty: 'zoom' FLOAT | eventBinding; // <-- NEW

layoutDeclaration: 'layout' 'type' layoutType layoutProperty*;

styleDeclaration: 'style' 'id' IDENTIFIER styleProperty*;

layoutProperty:
	'row' INT
	| 'column' INT
	| 'rowSpan' INT
	| 'columnSpan' INT
	| 'alignment' alignmentType
	| 'padding' INT
	| 'spacing' INT
	| 'margin' INT
	| 'hgrow' BOOLEAN
	| 'vgrow' BOOLEAN
	| 'visibleIf' STRING
	| eventBinding; // <-- MAYBE: If layouts can have event bindings too

styleProperty:
	'backgroundColor' STRING
	| 'borderColor' STRING
	| 'borderWidth' INT
	| 'opacity' FLOAT
	| 'visible' BOOLEAN
	| 'styleClass' STRING;

treeViewProperty: 'showRoot' BOOLEAN | eventBinding; // <-- NEW

spinnerProperty:
	'editable' BOOLEAN
	| 'initialValue' INT
	| eventBinding; // <-- NEW

colorPickerProperty:
	'defaultColor' STRING
	| eventBinding; // <-- NEW

fileChooserProperty:
	'initialDirectory' STRING
	| 'extensionFilters' stringList
	| eventBinding; // <-- NEW

mediaViewProperty:
	'fitWidth' INT
	| 'fitHeight' INT
	| 'preserveRatio' BOOLEAN
	| eventBinding; // <-- NEW

scrollPaneProperty:
	'fitToWidth' BOOLEAN
	| 'fitToHeight' BOOLEAN
	| 'pannable' BOOLEAN
	| eventBinding;

splitPaneProperty:
	'dividerPositions' FLOAT (',' FLOAT)* // Optional: multiple divider positions
	| eventBinding;

treeTableViewProperty:
	'editable' BOOLEAN
	| 'showRoot' BOOLEAN
	| eventBinding;

dialogProperty:
	'content' STRING
	| 'header' STRING
	| 'graphic' STRING
	| 'type' dialogType
	| 'modal' BOOLEAN
	| 'resizable' BOOLEAN
	| 'buttons' stringList
	| eventBinding;

columnList: STRING (',' STRING)*;

stringList: STRING (',' STRING)*;

alignmentType:
	'CENTER'
	| 'TOP_LEFT'
	| 'TOP_RIGHT'
	| 'BOTTOM_LEFT'
	| 'BOTTOM_RIGHT';

layoutType:
	'VBox'
	| 'HBox'
	| 'GridPane'
	| 'Pane'
	| 'BorderPane'
	| 'StackPane'
	| 'FlowPane'
	| 'TilePane';

orientationType: 'HORIZONTAL' | 'VERTICAL';

selectionModeType: 'SINGLE' | 'MULTIPLE';

modalityType: 'NONE' | 'WINDOW_MODAL' | 'APPLICATION_MODAL';

stageStyleType:
	'DECORATED'
	| 'UNDECORATED'
	| 'TRANSPARENT'
	| 'UTILITY'
	| 'UNIFIED';

dialogType:
	'INFORMATION'
	| 'WARNING'
	| 'CONFIRMATION'
	| 'ERROR'
	| 'NONE';

// Lexer Rules
STRING: '"' (~["\r\n])* '"';
BOOLEAN: 'true' | 'false';
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
INT: [0-9]+;
FLOAT: [0-9]+ '.' [0-9]+;
dataList: '{' dataPair (',' dataPair)* '}';
dataPair: STRING ':' (INT | FLOAT);

LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
WS: [ \t\r\n]+ -> skip;