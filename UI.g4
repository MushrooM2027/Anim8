grammar UI;

program: statement* EOF;

statement: windowDeclaration | componentDeclaration;

windowDeclaration:
    'create' 'window' title=STRING 'size' width=INT 'x' height=INT ('layout' layout=layoutType)?;

componentDeclaration: 'add' component;

component:
    labelComponent
    | textfieldComponent
    | checkboxComponent
    | dropdownComponent
    | buttonComponent;

labelComponent:
    'label' text=STRING labelProperty*;

textfieldComponent:
    'textfield' 'id' id=IDENTIFIER textfieldProperty*;

checkboxComponent:
    'checkbox' label=STRING 'id' id=IDENTIFIER checkboxProperty*;

dropdownComponent:
    'dropdown' 'id' id=IDENTIFIER 'options' options=stringList dropdownProperty*;

buttonComponent:
    'button' label=STRING 'onClick' 'showAlert' alertText=STRING buttonProperty*;

labelProperty:
      'font' font=STRING
    | 'size' size=INT
    | 'color' color=STRING;

textfieldProperty:
      'placeholder' placeholder=STRING
    | 'width' width=INT
    | 'default' defaultValue=STRING;

checkboxProperty:
      'checked'
    | 'disabled';

dropdownProperty:
    'width' width=INT;

buttonProperty:
      'width' width=INT
    | 'disabled';

stringList: STRING (',' STRING)*;

layoutType:
      'VBox'
    | 'HBox'
    | 'GridPane'
    | 'Pane';

STRING: '"' (~["\r\n])* '"';
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
INT: [0-9]+;
WS: [ \t\r\n]+ -> skip;
