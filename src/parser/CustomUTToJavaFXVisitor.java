package parser;
import parser.UIBaseVisitor;
import parser.UIParser;
import parser.*;

import java.util.List;
import java.util.stream.Collectors;

public class CustomUTToJavaFXVisitor extends UIBaseVisitor<String> {

    StringBuilder javaCode = new StringBuilder();

    @Override
    public String visitProgram(UIParser.ProgramContext ctx) {
        javaCode.append("import javafx.application.Application;\n")
                .append("import javafx.scene.Scene;\n")
                .append("import javafx.scene.control.*;\n")
                .append("import javafx.scene.layout.*;\n")
                .append("import javafx.stage.Stage;\n")
                .append("\npublic class GeneratedApp extends Application {\n")
                .append("    @Override\n")
                .append("    public void start(Stage primaryStage) {\n");

        for (UIParser.StatementContext stmt : ctx.statement()) {
            javaCode.append(visit(stmt));
        }

        javaCode.append("        primaryStage.show();\n");
        javaCode.append("    }\n");
        javaCode.append("    public static void main(String[] args) { launch(args); }\n");
        javaCode.append("}\n");
        return javaCode.toString();
    }

    @Override
    public String visitWindowDeclaration(UIParser.WindowDeclarationContext ctx) {
        String title = ctx.title.getText().replace("\"", "");
        int width = Integer.parseInt(ctx.width.getText());
        int height = Integer.parseInt(ctx.height.getText());
        String layout = "VBox";
        if (ctx.layout != null) {
            layout = ctx.layout.getText();
        }

        javaCode.append("        ").append(layout).append(" root = new ").append(layout).append("();\n");
        javaCode.append("        Scene scene = new Scene(root, ").append(width).append(", ").append(height).append(");\n");
        javaCode.append("        primaryStage.setTitle(\"").append(title).append("\");\n");
        javaCode.append("        primaryStage.setScene(scene);\n");

        return "";
    }

    @Override
    public String visitComponentDeclaration(UIParser.ComponentDeclarationContext ctx) {
        return visit(ctx.component());
    }

    @Override
    public String visitLabelComponent(UIParser.LabelComponentContext ctx) {
        String text = ctx.text.getText().replace("\"", "");
        String varName = "label" + ctx.hashCode();
        javaCode.append("        Label ").append(varName).append(" = new Label(\"").append(text).append("\");\n");

        for (UIParser.LabelPropertyContext prop : ctx.labelProperty()) {
            if (prop.font != null) {
                String font = prop.font.getText().replace("\"", "");
                javaCode.append("        ").append(varName).append(".setStyle(\"-fx-font-family: '").append(font).append("';\");\n");
            } else if (prop.size != null) {
                javaCode.append("        ").append(varName).append(".setStyle(\"-fx-font-size: ").append(prop.size.getText()).append("px;\");\n");
            } else if (prop.color != null) {
                String color = prop.color.getText().replace("\"", "");
                javaCode.append("        ").append(varName).append(".setStyle(\"-fx-text-fill: ").append(color).append(";\");\n");
            }
        }
        javaCode.append("        root.getChildren().add(").append(varName).append(");\n");
        return "";
    }

    @Override
    public String visitTextfieldComponent(UIParser.TextfieldComponentContext ctx) {
        String id = ctx.id.getText();
        javaCode.append("        TextField ").append(id).append(" = new TextField();\n");

        for (UIParser.TextfieldPropertyContext prop : ctx.textfieldProperty()) {
            if (prop.placeholder != null) {
                String placeholder = prop.placeholder.getText().replace("\"", "");
                javaCode.append("        ").append(id).append(".setPromptText(\"").append(placeholder).append("\");\n");
            } else if (prop.width != null) {
                javaCode.append("        ").append(id).append(".setPrefWidth(").append(prop.width.getText()).append(");\n");
            } else if (prop.defaultValue != null) {
                String def = prop.defaultValue.getText().replace("\"", "");
                javaCode.append("        ").append(id).append(".setText(\"").append(def).append("\");\n");
            }
        }
        javaCode.append("        root.getChildren().add(").append(id).append(");\n");
        return "";
    }

    @Override
    public String visitCheckboxComponent(UIParser.CheckboxComponentContext ctx) {
        String id = ctx.id.getText();
        String label = ctx.label.getText().replace("\"", "");
        javaCode.append("        CheckBox ").append(id).append(" = new CheckBox(\"").append(label).append("\");\n");

        for (UIParser.CheckboxPropertyContext prop : ctx.checkboxProperty()) {
            if (prop.getText().equals("checked")) {
                javaCode.append("        ").append(id).append(".setSelected(true);\n");
            } else if (prop.getText().equals("disabled")) {
                javaCode.append("        ").append(id).append(".setDisable(true);\n");
            }
        }

        javaCode.append("        root.getChildren().add(").append(id).append(");\n");
        return "";
    }

    @Override
    public String visitDropdownComponent(UIParser.DropdownComponentContext ctx) {
        String id = ctx.id.getText();
        List<String> options = ctx.options.STRING().stream()
                .map(s -> s.getText().replace("\"", ""))
                .collect(Collectors.toList());

        javaCode.append("        ComboBox<String> ").append(id).append(" = new ComboBox<>();\n");
        for (String opt : options) {
            javaCode.append("        ").append(id).append(".getItems().add(\"").append(opt).append("\");\n");
        }

        for (UIParser.DropdownPropertyContext prop : ctx.dropdownProperty()) {
            if (prop.width != null) {
                javaCode.append("        ").append(id).append(".setPrefWidth(").append(prop.width.getText()).append(");\n");
            }
        }

        javaCode.append("        root.getChildren().add(").append(id).append(");\n");
        return "";
    }

    @Override
    public String visitButtonComponent(UIParser.ButtonComponentContext ctx) {
        String label = ctx.label.getText().replace("\"", "");
        String alertText = ctx.alertText.getText().replace("\"", "");
        String id = "btn" + ctx.hashCode();
        javaCode.append("        Button ").append(id).append(" = new Button(\"").append(label).append("\");\n");
        javaCode.append("        ").append(id).append(".setOnAction(e -> {\n")
                .append("            Alert alert = new Alert(Alert.AlertType.INFORMATION);\n")
                .append("            alert.setContentText(\"").append(alertText).append("\");\n")
                .append("            alert.show();\n")
                .append("        });\n");

        for (UIParser.ButtonPropertyContext prop : ctx.buttonProperty()) {
            if (prop.width != null) {
                javaCode.append("        ").append(id).append(".setPrefWidth(").append(prop.width.getText()).append(");\n");
            } else if (prop.getText().equals("disabled")) {
                javaCode.append("        ").append(id).append(".setDisable(true);\n");
            }
        }

        javaCode.append("        root.getChildren().add(").append(id).append(");\n");
        return "";
    }
}
