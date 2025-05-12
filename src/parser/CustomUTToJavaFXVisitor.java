package parser;

import parser.UIBaseVisitor;
import parser.UIParser;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CustomUTToJavaFXVisitor extends UIBaseVisitor<String> {
    private Map<String, String> componentTypes = new HashMap<>();
    private Set<String> createdToggleGroups = new HashSet<>();
    private StringBuilder javaCode = new StringBuilder();
    private String currentLayout = "VBox"; // Default layout
    private String currentAccordion = null;
    private String currentTabPane = null;
    private String currentRoot = "mainRoot"; // Changed from "root" to "mainRoot"
    private String currentComponentId = null; // Track current component for event binding

    @Override
    public String visitProgram(UIParser.ProgramContext ctx) {
        javaCode = new StringBuilder();
        // Add imports
        javaCode.append("import javafx.application.Application;\n")
                .append("import javafx.scene.Scene;\n")
                .append("import javafx.scene.control.*;\n")
                .append("import javafx.scene.image.*;\n")
                .append("import javafx.scene.layout.*;\n")
                .append("import javafx.scene.web.*;\n")
                .append("import javafx.scene.canvas.*;\n")
                .append("import javafx.scene.media.*;\n")
                .append("import javafx.stage.*;\n")
                .append("import javafx.geometry.*;\n")
                .append("import javafx.scene.paint.*;\n")
                .append("import javafx.stage.FileChooser;\n")
                .append("import javafx.stage.DirectoryChooser;\n")
                .append("import javafx.scene.control.ToggleGroup;\n")
                .append("import javafx.scene.control.Tab;\n")
                .append("import javafx.scene.control.TabPane;\n")
                .append("import javafx.scene.control.TitledPane;\n")
                .append("import javafx.scene.control.Accordion;\n")
                .append("import java.io.File;\n")
                .append("import javafx.stage.*;\n")
                .append("import java.net.URL;\n")
                .append("import javafx.scene.text.Font;\n")
                .append("import javafx.scene.Node;\n")
                .append("import javafx.event.EventHandler;\n")
                .append("import javafx.scene.input.MouseEvent;\n")
                .append("import javafx.scene.input.KeyEvent;\n")
                .append("import java.util.Map;\n")
                .append("import java.util.HashMap;\n")
                .append("import javafx.scene.chart.*;\n")
                .append("import javafx.collections.*;\n")
                .append("import javafx.animation.*;\n")
                .append("import javafx.scene.effect.*;\n")
                .append("import javafx.util.*;\n")
                .append("\npublic class GeneratedApp extends Application {\n")
                // Class-level fields
                .append("    private VBox mainRoot;\n")
                .append("    private Scene scene;\n")
                .append("    private Map<String, ToggleGroup> toggleGroups = new HashMap<>();\n\n")
                // Start method
                .append("    @Override\n")
                .append("    public void start(Stage primaryStage) {\n")
                .append("        mainRoot = new VBox();\n")
                .append("        mainRoot.setSpacing(10);\n")
                .append("        mainRoot.setPadding(new Insets(10));\n")
                .append("        mainRoot.setAlignment(Pos.TOP_CENTER);\n")
                .append("        mainRoot.setStyle(\"-fx-background-color: white;\");\n")
                .append("        ScrollPane mainScroll = new ScrollPane(mainRoot);\n")
                .append("        mainScroll.setFitToWidth(true);\n")
                .append("        scene = new Scene(mainScroll);\n");

        // Visit all statements
        for (UIParser.StatementContext stmt : ctx.statement()) {
            visit(stmt);
        }

        // Close the start method and class
        javaCode.append("        primaryStage.setScene(scene);\n")
                .append("        primaryStage.show();\n")
                .append("    }\n\n")
                .append("    public static void main(String[] args) {\n")
                .append("        launch(args);\n")
                .append("    }\n")
                .append("}\n");

        return javaCode.toString();
    }

    @Override
    public String visitGlobalStyle(UIParser.GlobalStyleContext ctx) {
        String stylePath = ctx.STRING().getText().replace("\"", "");
        if (!stylePath.startsWith("/")) {
            stylePath = "/" + stylePath;
        }

        javaCode.append("        URL cssURL = getClass().getResource(\"")
                .append(stylePath)
                .append("\");\n")
                .append("        if (cssURL != null) {\n")
                .append("            scene.getStylesheets().add(cssURL.toExternalForm());\n")
                .append("        } else {\n")
                .append("            System.err.println(\"Could not find CSS file: ")
                .append(stylePath)
                .append("\");\n")
                .append("        }\n");

        return "";
    }

    @Override
    public String visitWindowDeclaration(UIParser.WindowDeclarationContext ctx) {
        String title = ctx.STRING().getText().replace("\"", "");
        int width = Integer.parseInt(ctx.INT(0).getText());
        int height = Integer.parseInt(ctx.INT(1).getText());

        // Set window properties
        javaCode.append("        primaryStage.setTitle(\"").append(title).append("\");\n")
                .append("        primaryStage.setWidth(").append(width).append(");\n")
                .append("        primaryStage.setHeight(").append(height).append(");\n");

        // Handle resizable property
        if (ctx.BOOLEAN() != null) {
            boolean resizable = Boolean.parseBoolean(ctx.BOOLEAN().getText());
            javaCode.append("        primaryStage.setResizable(").append(resizable).append(");\n");
        }

        // Handle position
        if (ctx.INT().size() > 2) {
            int x = Integer.parseInt(ctx.INT(2).getText());
            int y = Integer.parseInt(ctx.INT(3).getText());
            javaCode.append("        primaryStage.setX(").append(x).append(");\n")
                    .append("        primaryStage.setY(").append(y).append(");\n");
        }

        // Handle stage style
        if (ctx.stageStyleType() != null) {
            String stageStyle = ctx.stageStyleType().getText();
            javaCode.append("        primaryStage.initStyle(StageStyle.").append(stageStyle).append(");\n");
        }

        return "";
    }

    // --- Event Binding Support ---
    @Override
    public String visitEventBinding(UIParser.EventBindingContext ctx) {
        String eventType = ctx.STRING().getText().replace("\"", "");
        String generatedAction = visitEventAction(ctx.eventAction());
        if (currentComponentId == null)
            return "";

        switch (eventType) {
            case "onMouseClicked":
                javaCode.append("        ").append(currentComponentId)
                        .append(".setOnMouseClicked(event -> {\n")
                        .append(generatedAction)
                        .append("        });\n");
                break;
            case "onMousePressed":
                javaCode.append("        ").append(currentComponentId)
                        .append(".setOnMousePressed(event -> {\n")
                        .append(generatedAction)
                        .append("        });\n");
                break;
            case "onKeyPressed":
                javaCode.append("        ").append(currentComponentId)
                        .append(".setOnKeyPressed(event -> {\n")
                        .append(generatedAction)
                        .append("        });\n");
                break;
            case "onChange":
                // Generic change listener, applicable for text fields, sliders, etc.
                javaCode.append("        ").append(currentComponentId)
                        .append(".textProperty().addListener((obs, oldVal, newVal) -> {\n")
                        .append(generatedAction)
                        .append("        });\n");
                break;
            case "onToggle":
                // For checkboxes and radio buttons
                javaCode.append("        ").append(currentComponentId)
                        .append(".selectedProperty().addListener((obs, oldVal, newVal) -> {\n")
                        .append(generatedAction)
                        .append("        });\n");
                break;
            case "onHover":
                javaCode.append("        ").append(currentComponentId)
                        .append(".hoverProperty().addListener((obs, oldVal, newVal) -> {\n")
                        .append("            if (newVal) {\n")
                        .append(generatedAction)
                        .append("            }\n")
                        .append("        });\n");
                break;
            case "onSelect":
                // For dropdowns and lists
                javaCode.append("        ").append(currentComponentId)
                        .append(".setOnAction(event -> {\n")
                        .append(generatedAction)
                        .append("        });\n");
                break;
            // Add more event types as needed
            default:
                javaCode.append("        // Unhandled event type: ").append(eventType).append(" for ")
                        .append(currentComponentId).append("\n");
        }
        return "";
    }

    @Override
    public String visitEventAction(UIParser.EventActionContext ctx) {
        String actionType = ctx.getChild(0).getText();
        if (actionType.equals("showAlert")) {
            String alertText = ctx.STRING().getText().replace("\"", "");
            return "            Alert alert = new Alert(Alert.AlertType.INFORMATION);\n" +
                    "            alert.setContentText(\"" + alertText + "\");\n" +
                    "            alert.show();\n";
        } else if (actionType.equals("print")) {
            String message = ctx.STRING().getText().replace("\"", "");
            return "            System.out.println(\"" + message + "\");\n";
        } else if (actionType.equals("navigate")) {
            String destination = ctx.STRING().getText().replace("\"", "");
            return "            // Navigation logic to " + destination + "\n";
        }
        return "";
    }

    @Override
    public String visitComponentDeclaration(UIParser.ComponentDeclarationContext ctx) {
        return visit(ctx.component());
    }

    // --- Component Visitors with Event Binding Support ---
    @Override
    public String visitLabelComponent(UIParser.LabelComponentContext ctx) {
        String text = ctx.STRING().getText().replace("\"", "");
        String varName = "label" + ctx.hashCode();
        currentComponentId = varName;

        javaCode.append("        Label ").append(varName)
                .append(" = new Label(\"").append(text).append("\");\n");

        for (UIParser.LabelPropertyContext prop : ctx.labelProperty()) {
            if (prop.STRING() != null) {
                if (prop.getText().contains("font")) {
                    String fontFamily = prop.STRING().getText().replace("\"", "");
                    int fontSize = prop.INT() != null ? Integer.parseInt(prop.INT().getText()) : 12;
                    javaCode.append("        ").append(varName)
                            .append(".setFont(Font.font(\"").append(fontFamily)
                            .append("\", ").append(fontSize).append("));\n");
                } else if (prop.getText().contains("color")) {
                    String color = prop.STRING().getText().replace("\"", "");
                    javaCode.append("        ").append(varName)
                            .append(".setTextFill(Color.web(\"").append(color).append("\"));\n");
                } else if (prop.getText().contains("tooltip")) {
                    String tooltip = prop.STRING().getText().replace("\"", "");
                    addTooltip(varName, tooltip);
                }
            }
            if (prop.getText().contains("bold")) {
                javaCode.append("        ").append(varName)
                        .append(".setStyle(\"-fx-font-weight: bold;\");\n");
            }
            if (prop.getText().contains("italic")) {
                javaCode.append("        ").append(varName)
                        .append(".setStyle(\"-fx-font-style: italic;\");\n");
            }
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            applyLayoutProperties(varName, prop);
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.EventBindingContext eb : ctx.eventBinding()) {
            visit(eb);
        }

        javaCode.append("        mainRoot.getChildren().add(").append(varName).append(");\n");
        currentComponentId = null;
        return "";
    }

    @Override
    public String visitTextfieldComponent(UIParser.TextfieldComponentContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        currentComponentId = id;

        javaCode.append("        TextField ").append(id).append(" = new TextField();\n");
        componentTypes.put(id, "TextField");

        for (UIParser.TextfieldPropertyContext prop : ctx.textfieldProperty()) {
            if (prop.STRING() != null) {
                if (prop.getText().contains("placeholder")) {
                    String placeholder = prop.STRING().getText().replace("\"", "");
                    javaCode.append("        ").append(id)
                            .append(".setPromptText(\"").append(placeholder).append("\");\n");
                } else if (prop.getText().contains("default")) {
                    String defaultText = prop.STRING().getText().replace("\"", "");
                    javaCode.append("        ").append(id)
                            .append(".setText(\"").append(defaultText).append("\");\n");
                } else if (prop.getText().contains("tooltip")) {
                    String tooltip = prop.STRING().getText().replace("\"", "");
                    addTooltip(id, tooltip);
                }
            }
            if (prop.INT() != null && prop.getText().contains("width")) {
                javaCode.append("        ").append(id)
                        .append(".setPrefWidth(").append(prop.INT().getText()).append(");\n");
            }
            if (prop.BOOLEAN() != null && prop.getText().contains("editable")) {
                javaCode.append("        ").append(id)
                        .append(".setEditable(").append(prop.BOOLEAN().getText()).append(");\n");
            }
            if (prop.IDENTIFIER() != null && prop.getText().contains("bindTo")) {
                handleBindProperty(id, prop.IDENTIFIER().getText());
            }
            if (prop.eventAction() != null && prop.getText().contains("onChange")) {
                javaCode.append("        ").append(id)
                        .append(".textProperty().addListener((obs, oldVal, newVal) -> {\n");
                handleEventAction(id, prop.eventAction());
                javaCode.append("        });\n");
            }
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            applyLayoutProperties(id, prop);
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.EventBindingContext eb : ctx.eventBinding()) {
            visit(eb);
        }

        javaCode.append("        mainRoot.getChildren().add(").append(id).append(");\n");
        currentComponentId = null;
        return "";
    }

    @Override
    public String visitPasswordFieldComponent(UIParser.PasswordFieldComponentContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        currentComponentId = id;

        javaCode.append("        PasswordField ").append(id).append(" = new PasswordField();\n");

        if (ctx.passwordFieldProperty() != null) {
            for (UIParser.PasswordFieldPropertyContext prop : ctx.passwordFieldProperty()) {
                if (prop.STRING() != null && prop.getText().contains("promptText")) {
                    String promptText = prop.STRING().getText().replace("\"", "");
                    javaCode.append("        ").append(id)
                            .append(".setPromptText(\"").append(promptText).append("\");\n");
                }
                if (prop.BOOLEAN() != null && prop.getText().contains("editable")) {
                    javaCode.append("        ").append(id)
                            .append(".setEditable(").append(prop.BOOLEAN().getText()).append(");\n");
                }
                if (prop.eventBinding() != null) {
                    visit(prop.eventBinding());
                }
            }
        }

        if (ctx.layoutProperty() != null) {
            for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
                applyLayoutProperties(id, prop);
                if (prop.eventBinding() != null) {
                    visit(prop.eventBinding());
                }
            }
        }

        for (UIParser.EventBindingContext eb : ctx.eventBinding()) {
            visit(eb);
        }

        javaCode.append("        mainRoot.getChildren().add(").append(id).append(");\n");
        currentComponentId = null;
        return "";
    }

    @Override
    public String visitTextAreaComponent(UIParser.TextAreaComponentContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        currentComponentId = id;

        javaCode.append("        TextArea ").append(id).append(" = new TextArea();\n");

        for (UIParser.TextAreaPropertyContext prop : ctx.textAreaProperty()) {
            if (prop.STRING() != null && prop.getText().contains("promptText")) {
                String promptText = prop.STRING().getText().replace("\"", "");
                javaCode.append("        ").append(id)
                        .append(".setPromptText(\"").append(promptText).append("\");\n");
            }
            if (prop.BOOLEAN() != null) {
                String boolValue = prop.BOOLEAN().getText();
                if (prop.getText().contains("wrapText")) {
                    javaCode.append("        ").append(id)
                            .append(".setWrapText(").append(boolValue).append(");\n");
                } else if (prop.getText().contains("editable")) {
                    javaCode.append("        ").append(id)
                            .append(".setEditable(").append(boolValue).append(");\n");
                }
            }
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            applyLayoutProperties(id, prop);
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.EventBindingContext eb : ctx.eventBinding()) {
            visit(eb);
        }

        javaCode.append("        mainRoot.getChildren().add(").append(id).append(");\n");
        currentComponentId = null;
        return "";
    }

    @Override
    public String visitCheckboxComponent(UIParser.CheckboxComponentContext ctx) {
        String text = ctx.STRING().getText().replace("\"", "");
        String id = ctx.IDENTIFIER().getText();
        currentComponentId = id;

        javaCode.append("        CheckBox ").append(id)
                .append(" = new CheckBox(\"").append(text).append("\");\n");

        for (UIParser.CheckboxPropertyContext prop : ctx.checkboxProperty()) {
            String propText = prop.getText();
            if (propText.contains("checked")) {
                javaCode.append("        ").append(id).append(".setSelected(true);\n");
            } else if (propText.contains("disabled")) {
                javaCode.append("        ").append(id).append(".setDisable(true);\n");
            } else if (propText.contains("indeterminate")) {
                javaCode.append("        ").append(id).append(".setIndeterminate(true);\n");
            } else if (propText.contains("onToggle") && prop.eventAction() != null) {
                javaCode.append("        ").append(id)
                        .append(".selectedProperty().addListener((obs, oldVal, newVal) -> {\n");
                handleEventAction(id, prop.eventAction());
                javaCode.append("        });\n");
            }
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            applyLayoutProperties(id, prop);
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.EventBindingContext eb : ctx.eventBinding()) {
            visit(eb);
        }

        javaCode.append("        mainRoot.getChildren().add(").append(id).append(");\n");
        currentComponentId = null;
        return "";
    }

    @Override
    public String visitDropdownComponent(UIParser.DropdownComponentContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        currentComponentId = id;

        javaCode.append("        ComboBox<String> ").append(id).append(" = new ComboBox<>();\n");

        if (ctx.stringList() != null) {
            for (org.antlr.v4.runtime.tree.TerminalNode item : ctx.stringList().STRING()) {
                String itemText = item.getText().replace("\"", "");
                javaCode.append("        ").append(id)
                        .append(".getItems().add(\"").append(itemText).append("\");\n");
            }
        }

        for (UIParser.DropdownPropertyContext prop : ctx.dropdownProperty()) {
            if (prop.INT() != null && prop.getText().contains("width")) {
                javaCode.append("        ").append(id)
                        .append(".setPrefWidth(").append(prop.INT().getText()).append(");\n");
            }
            if (prop.BOOLEAN() != null && prop.getText().contains("multipleSelection")) {
                javaCode.append("        // Multiple selection requires ListView\n");
            }
            if (prop.eventAction() != null && prop.getText().contains("onSelect")) {
                javaCode.append("        ").append(id)
                        .append(".setOnAction(event -> {\n");
                handleEventAction(id, prop.eventAction());
                javaCode.append("        });\n");
            }
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            applyLayoutProperties(id, prop);
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.EventBindingContext eb : ctx.eventBinding()) {
            visit(eb);
        }

        javaCode.append("        mainRoot.getChildren().add(").append(id).append(");\n");
        currentComponentId = null;
        return "";
    }

    @Override
    public String visitButtonComponent(UIParser.ButtonComponentContext ctx) {
        String label = ctx.STRING().getText().replace("\"", "");
        String varName = generateComponentId("button");

        javaCode.append("        Button ").append(varName).append(" = new Button(\"").append(label).append("\");\n");

        currentComponentId = varName;

        // Handle onClick event
        if (ctx.eventAction() != null) {
            javaCode.append("        ").append(varName).append(".setOnAction(event -> {\n");
            visit(ctx.eventAction());
            javaCode.append("        });\n");
        }

        // Button properties
        for (UIParser.ButtonPropertyContext prop : ctx.buttonProperty()) {
            String text = prop.getText();
            if (text.startsWith("width")) {
                javaCode.append("        ").append(varName).append(".setPrefWidth(")
                        .append(prop.INT().getText()).append(");\n");
            } else if (text.equals("defaultButton")) {
                javaCode.append("        ").append(varName).append(".setDefaultButton(true);\n");
            } else if (text.equals("disabled")) {
                javaCode.append("        ").append(varName).append(".setDisable(true);\n");
            } else if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        // Layout properties
        for (UIParser.LayoutPropertyContext layout : ctx.layoutProperty()) {
            applyLayoutProperties(varName, layout);
            if (layout.eventBinding() != null) {
                visit(layout.eventBinding());
            }
        }

        // Animations (1st set)
        for (UIParser.AnimationBindingContext anim : ctx.animationBinding()) {
            applyAnimationBindings(varName, List.of(anim));
        }

        // Effect
        if (ctx.effectBinding() != null) {
            for (UIParser.EffectBindingContext eff : ctx.effectBinding()) {
                applyEffectBinding(varName, eff);
            }
        }

        // Animations (2nd set)
        if (ctx.animationBinding().size() > 1) {
            // If multiple animationBinding sections are allowed (e.g., before and after
            // effectBinding)
            applyAnimationBindings(varName, ctx.animationBinding().subList(1, ctx.animationBinding().size()));
        }

        // General event bindings
        for (UIParser.EventBindingContext eb : ctx.eventBinding()) {
            visit(eb);
        }

        javaCode.append("        mainRoot.getChildren().add(").append(varName).append(");\n");

        currentComponentId = null;
        return "";
    }

    @Override
    public String visitImageComponent(UIParser.ImageComponentContext ctx) {
        String source = ctx.STRING().getText().replace("\"", "");
        String varName = "imageView" + ctx.hashCode();

        javaCode.append("        ImageView ").append(varName).append(";\n")
                .append("        try {\n")
                .append("            Image image = new Image(getClass().getResourceAsStream(\"")
                .append(source).append("\"));\n")
                .append("            ").append(varName).append(" = new ImageView(image);\n");

        for (UIParser.ImagePropertyContext prop : ctx.imageProperty()) {
            if (prop.INT() != null) {
                String value = prop.INT().getText();
                if (prop.getText().contains("fitWidth")) {
                    javaCode.append("            ").append(varName)
                            .append(".setFitWidth(").append(value).append(");\n");
                } else if (prop.getText().contains("fitHeight")) {
                    javaCode.append("            ").append(varName)
                            .append(".setFitHeight(").append(value).append(");\n");
                }
            }
            if (prop.BOOLEAN() != null && prop.getText().contains("preserveRatio")) {
                javaCode.append("            ").append(varName)
                        .append(".setPreserveRatio(").append(prop.BOOLEAN().getText()).append(");\n");
            }
        }

        javaCode.append("        } catch (Exception e) {\n")
                .append("            ").append(varName).append(" = new ImageView();\n")
                .append("            System.err.println(\"Image not found: ").append(source).append("\");\n")
                .append("        }\n")
                .append("        mainRoot.getChildren().add(").append(varName).append(");\n");

        return "";
    }

    @Override
    public String visitSliderComponent(UIParser.SliderComponentContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        currentComponentId = id;

        int min = Integer.parseInt(ctx.INT(0).getText());
        int max = Integer.parseInt(ctx.INT(1).getText());
        int value = Integer.parseInt(ctx.INT(2).getText());

        javaCode.append("        Slider ").append(id).append(" = new Slider(")
                .append(min).append(", ").append(max).append(", ").append(value).append(");\n");

        for (UIParser.SliderPropertyContext prop : ctx.sliderProperty()) {
            if (prop.orientationType() != null) {
                javaCode.append("        ").append(id)
                        .append(".setOrientation(Orientation.")
                        .append(prop.orientationType().getText()).append(");\n");
            }
            if (prop.FLOAT() != null) {
                javaCode.append("        ").append(id)
                        .append(".setBlockIncrement(").append(prop.FLOAT().getText()).append(");\n");
            }
            if (prop.eventAction() != null && prop.getText().contains("onValueChange")) {
                javaCode.append("        ").append(id)
                        .append(".valueProperty().addListener((obs, oldVal, newVal) -> {\n");
                handleEventAction(id, prop.eventAction());
                javaCode.append("        });\n");
            }
            if (prop.IDENTIFIER() != null && prop.getText().contains("bindTo")) {
                handleBindProperty(id, prop.IDENTIFIER().getText());
            }
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            applyLayoutProperties(id, prop);
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.EventBindingContext eb : ctx.eventBinding()) {
            visit(eb);
        }

        javaCode.append("        mainRoot.getChildren().add(").append(id).append(");\n");
        currentComponentId = null;
        return "";
    }

    @Override
    public String visitProgressBarComponent(UIParser.ProgressBarComponentContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        float progress = Float.parseFloat(ctx.FLOAT().getText());

        javaCode.append("        ProgressBar ").append(id)
                .append(" = new ProgressBar(").append(progress).append(");\n");

        for (UIParser.ProgressBarPropertyContext prop : ctx.progressBarProperty()) {
            if (prop.BOOLEAN() != null && prop.getText().contains("indeterminate")) {
                boolean indeterminate = Boolean.parseBoolean(prop.BOOLEAN().getText());
                if (indeterminate) {
                    javaCode.append("        ").append(id)
                            .append(".setProgress(ProgressBar.INDETERMINATE_PROGRESS);\n");
                }
            }
        }

        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            applyLayoutProperties(id, prop);
        }

        javaCode.append("        mainRoot.getChildren().add(").append(id).append(");\n");
        return "";
    }

    @Override
    public String visitTableViewComponent(UIParser.TableViewComponentContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        currentComponentId = id;

        javaCode.append("        TableView<Object> ").append(id).append(" = new TableView<>();\n");

        // Handle columns
        if (ctx.columnList() != null) {
            for (org.antlr.v4.runtime.tree.TerminalNode column : ctx.columnList().STRING()) {
                String columnName = column.getText().replace("\"", "");
                String columnId = "column" + column.hashCode();
                javaCode.append("        TableColumn<Object, String> ").append(columnId)
                        .append(" = new TableColumn<>(\"").append(columnName).append("\");\n")
                        .append("        ").append(id).append(".getColumns().add(").append(columnId).append(");\n");
            }
        }

        for (UIParser.TableViewPropertyContext prop : ctx.tableViewProperty()) {
            if (prop.BOOLEAN() != null) {
                if (prop.getText().contains("editable")) {
                    boolean editable = Boolean.parseBoolean(prop.BOOLEAN().getText());
                    javaCode.append("        ").append(id).append(".setEditable(").append(editable).append(");\n");
                } else if (prop.getText().contains("sortableColumns")) {
                    boolean sortable = Boolean.parseBoolean(prop.BOOLEAN().getText());
                    if (!sortable) {
                        javaCode.append("        ").append(id).append(".setSortPolicy(null);\n");
                    }
                }
            }
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            applyLayoutProperties(id, prop);
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        javaCode.append("        mainRoot.getChildren().add(").append(id).append(");\n");
        currentComponentId = null;
        return "";
    }

    @Override
    public String visitRadioButtonComponent(UIParser.RadioButtonComponentContext ctx) {
        String text = ctx.STRING().getText().replace("\"", "");
        String id = ctx.IDENTIFIER().getText();
        currentComponentId = id;
        javaCode.append("        RadioButton ").append(id)
                .append(" = new RadioButton(\"").append(text).append("\");\n");
        // Optional: track type if doing binding/type-safe codegen
        componentTypes.put(id, "RadioButton");

        for (UIParser.RadioButtonPropertyContext prop : ctx.radioButtonProperty()) {
            if (prop.BOOLEAN() != null && prop.getText().contains("selected")) {
                javaCode.append("        ").append(id)
                        .append(".setSelected(").append(prop.BOOLEAN().getText()).append(");\n");
            }
            if (prop.IDENTIFIER() != null && prop.getText().contains("group")) {
                String groupId = prop.IDENTIFIER().getText();
                String groupVar = "group_" + groupId;
                // Only declare the variable and computeIfAbsent the FIRST time
                if (createdToggleGroups.add(groupId)) {
                    javaCode.append("        ToggleGroup ").append(groupVar)
                            .append(" = toggleGroups.computeIfAbsent(\"").append(groupId)
                            .append("\", k -> new ToggleGroup());\n");
                }
                javaCode.append("        ").append(id).append(".setToggleGroup(").append(groupVar).append(");\n");
            }
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            applyLayoutProperties(id, prop);
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.EventBindingContext eb : ctx.eventBinding()) {
            visit(eb);
        }

        javaCode.append("        mainRoot.getChildren().add(").append(id).append(");\n");
        currentComponentId = null;
        return "";
    }

    @Override
    public String visitListViewComponent(UIParser.ListViewComponentContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        currentComponentId = id;

        javaCode.append("        ListView<String> ").append(id).append(" = new ListView<>();\n");

        if (ctx.stringList() != null) {
            for (org.antlr.v4.runtime.tree.TerminalNode item : ctx.stringList().STRING()) {
                String itemText = item.getText().replace("\"", "");
                javaCode.append("        ").append(id)
                        .append(".getItems().add(\"").append(itemText).append("\");\n");
            }
        }

        for (UIParser.ListViewPropertyContext prop : ctx.listViewProperty()) {
            if (prop.selectionModeType() != null) {
                javaCode.append("        ").append(id)
                        .append(".getSelectionModel().setSelectionMode(SelectionMode.")
                        .append(prop.selectionModeType().getText()).append(");\n");
            }
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            applyLayoutProperties(id, prop);
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.EventBindingContext eb : ctx.eventBinding()) {
            visit(eb);
        }

        javaCode.append("        mainRoot.getChildren().add(").append(id).append(");\n");
        currentComponentId = null;
        return "";
    }

    @Override
    public String visitMenuBarComponent(UIParser.MenuBarComponentContext ctx) {
        String varName = "menuBar" + ctx.hashCode();
        javaCode.append("        MenuBar ").append(varName).append(" = new MenuBar();\n");

        for (UIParser.MenuContext menu : ctx.menuDefinition().menu()) {
            String menuName = menu.STRING().getText().replace("\"", "");
            String menuVarName = "menu" + menu.hashCode();
            javaCode.append("        Menu ").append(menuVarName)
                    .append(" = new Menu(\"").append(menuName).append("\");\n");
            handleMenuItems(menuVarName, menu.stringList());
            javaCode.append("        ").append(varName).append(".getMenus().add(").append(menuVarName).append(");\n");
        }

        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            applyLayoutProperties(varName, prop);
        }

        javaCode.append("        mainRoot.getChildren().add(").append(varName).append(");\n");
        return "";
    }

    @Override
    public String visitToolBarComponent(UIParser.ToolBarComponentContext ctx) {
        String varName = "toolBar" + ctx.hashCode();
        javaCode.append("        ToolBar ").append(varName).append(" = new ToolBar();\n");

        if (ctx.stringList() != null) {
            for (org.antlr.v4.runtime.tree.TerminalNode item : ctx.stringList().STRING()) {
                String itemText = item.getText().replace("\"", "");
                String buttonId = "toolBarBtn" + item.hashCode();
                javaCode.append("        Button ").append(buttonId)
                        .append(" = new Button(\"").append(itemText).append("\");\n")
                        .append("        ").append(varName).append(".getItems().add(").append(buttonId).append(");\n");
            }
        }

        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            applyLayoutProperties(varName, prop);
        }

        javaCode.append("        mainRoot.getChildren().add(").append(varName).append(");\n");
        return "";
    }

    @Override
    public String visitDatePickerComponent(UIParser.DatePickerComponentContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        currentComponentId = id;

        javaCode.append("        DatePicker ").append(id).append(" = new DatePicker();\n");

        for (UIParser.DatePickerPropertyContext prop : ctx.datePickerProperty()) {
            if (prop.BOOLEAN() != null) {
                if (prop.getText().contains("showWeekNumbers")) {
                    javaCode.append("        ").append(id)
                            .append(".setShowWeekNumbers(").append(prop.BOOLEAN().getText()).append(");\n");
                } else if (prop.getText().contains("editable")) {
                    javaCode.append("        ").append(id)
                            .append(".setEditable(").append(prop.BOOLEAN().getText()).append(");\n");
                }
            }
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            applyLayoutProperties(id, prop);
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.EventBindingContext eb : ctx.eventBinding()) {
            visit(eb);
        }

        javaCode.append("        mainRoot.getChildren().add(").append(id).append(");\n");
        currentComponentId = null;
        return "";
    }

    @Override
    public String visitWebViewComponent(UIParser.WebViewComponentContext ctx) {
        String url = ctx.STRING().getText().replace("\"", "");
        String varName = "webView" + ctx.hashCode();
        currentComponentId = varName;

        javaCode.append("        WebView ").append(varName).append(" = new WebView();\n")
                .append("        ").append(varName).append(".setPrefSize(600, 400);\n") // Set preferred size
                .append("        try {\n")
                .append("            ").append(varName).append(".getEngine().load(\"")
                .append(url).append("\");\n");

        for (UIParser.WebViewPropertyContext prop : ctx.webViewProperty()) {
            if (prop.FLOAT() != null) {
                float zoom = Float.parseFloat(prop.FLOAT().getText());
                javaCode.append("            ").append(varName)
                        .append(".setZoom(").append(zoom).append(");\n");
            }
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        javaCode.append("        } catch (Exception e) {\n")
                .append("            System.err.println(\"Failed to load URL: ").append(url).append("\");\n")
                .append("        }\n");

        // Add to a ScrollPane to handle overflow
        javaCode.append("        ScrollPane ").append(varName).append("Scroll = new ScrollPane(")
                .append(varName).append(");\n")
                .append("        ").append(varName).append("Scroll.setFitToWidth(true);\n");

        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            applyLayoutProperties(varName, prop);
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.EventBindingContext eb : ctx.eventBinding()) {
            visit(eb);
        }

        javaCode.append("        mainRoot.getChildren().add(").append(varName).append("Scroll);\n");
        currentComponentId = null;
        return "";
    }

    @Override
    public String visitTabPaneComponent(UIParser.TabPaneComponentContext ctx) {
        String varName = "tabPane" + ctx.hashCode();
        currentComponentId = varName;

        javaCode.append("        TabPane ").append(varName).append(" = new TabPane();\n");

        String previousRoot = currentRoot;

        for (UIParser.TabContext tab : ctx.tab()) {
            String tabTitle = tab.STRING().getText().replace("\"", "");
            String tabVarName = "tab" + tab.hashCode();
            String contentVarName = tabVarName + "Content";

            javaCode.append("        Tab ").append(tabVarName).append(" = new Tab(\"")
                    .append(tabTitle).append("\");\n")
                    .append("        VBox ").append(contentVarName).append(" = new VBox();\n")
                    .append("        ").append(contentVarName).append(".setSpacing(10);\n")
                    .append("        ").append(contentVarName).append(".setPadding(new Insets(10));\n");

            // Set current root to tab content
            currentRoot = contentVarName;

            // Visit all components in the tab
            for (UIParser.ComponentContext component : tab.component()) {
                visit(component);
            }

            javaCode.append("        ").append(tabVarName).append(".setContent(")
                    .append(contentVarName).append(");\n")
                    .append("        ").append(varName).append(".getTabs().add(")
                    .append(tabVarName).append(");\n");
        }

        // Restore previous root
        currentRoot = previousRoot;

        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            applyLayoutProperties(varName, prop);
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.EventBindingContext eb : ctx.eventBinding()) {
            visit(eb);
        }

        javaCode.append("        mainRoot.getChildren().add(").append(varName).append(");\n");
        currentComponentId = null;
        return "";
    }

    @Override
    public String visitAccordionComponent(UIParser.AccordionComponentContext ctx) {
        String varName = "accordion" + ctx.hashCode();
        currentAccordion = varName;
        currentComponentId = varName;

        javaCode.append("        Accordion ").append(varName).append(" = new Accordion();\n");

        String previousRoot = currentRoot;

        for (UIParser.TitledPaneComponentContext pane : ctx.titledPaneComponent()) {
            visit(pane);
        }

        currentRoot = previousRoot;

        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            applyLayoutProperties(varName, prop);
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.EventBindingContext eb : ctx.eventBinding()) {
            visit(eb);
        }

        javaCode.append("        mainRoot.getChildren().add(").append(varName).append(");\n");
        currentAccordion = null;
        currentComponentId = null;
        return "";
    }

    @Override
    public String visitTitledPaneComponent(UIParser.TitledPaneComponentContext ctx) {
        String title = ctx.STRING().getText().replace("\"", "");
        String varName = "titledPane" + ctx.hashCode();
        String contentVarName = varName + "Content";
        currentComponentId = varName;

        javaCode.append("        TitledPane ").append(varName)
                .append(" = new TitledPane(\"").append(title).append("\", null);\n")
                .append("        VBox ").append(contentVarName).append(" = new VBox();\n")
                .append("        ").append(contentVarName).append(".setSpacing(10);\n")
                .append("        ").append(contentVarName).append(".setPadding(new Insets(10));\n");

        // Store previous root and set new root
        String previousRoot = currentRoot;
        currentRoot = contentVarName;

        // Process components inside the titled pane
        for (UIParser.ComponentContext component : ctx.component()) {
            visit(component);
        }

        // Restore previous root and set content
        currentRoot = previousRoot;
        javaCode.append("        ").append(varName).append(".setContent(")
                .append(contentVarName).append(");\n");

        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            applyLayoutProperties(varName, prop);
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.EventBindingContext eb : ctx.eventBinding()) {
            visit(eb);
        }

        if (currentAccordion != null) {
            javaCode.append("        ").append(currentAccordion)
                    .append(".getPanes().add(").append(varName).append(");\n");
        } else {
            javaCode.append("        mainRoot.getChildren().add(").append(varName).append(");\n");
        }

        currentComponentId = null;
        return "";
    }

    @Override
    public String visitTreeViewComponent(UIParser.TreeViewComponentContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        currentComponentId = id;

        javaCode.append("        TreeView<String> ").append(id).append(" = new TreeView<>();\n");

        for (UIParser.TreeViewPropertyContext prop : ctx.treeViewProperty()) {
            if (prop.BOOLEAN() != null && prop.getText().contains("showRoot")) {
                javaCode.append("        ").append(id)
                        .append(".setShowRoot(").append(prop.BOOLEAN().getText()).append(");\n");
            }
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            applyLayoutProperties(id, prop);
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.EventBindingContext eb : ctx.eventBinding()) {
            visit(eb);
        }

        javaCode.append("        mainRoot.getChildren().add(").append(id).append(");\n");
        currentComponentId = null;
        return "";
    }

    @Override
    public String visitSpinnerComponent(UIParser.SpinnerComponentContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        currentComponentId = id;

        int min = Integer.parseInt(ctx.INT(0).getText());
        int max = Integer.parseInt(ctx.INT(1).getText());

        javaCode.append("        Spinner<Integer> ").append(id)
                .append(" = new Spinner<>(").append(min).append(", ")
                .append(max).append(", ").append(min).append(");\n");

        for (UIParser.SpinnerPropertyContext prop : ctx.spinnerProperty()) {
            if (prop.BOOLEAN() != null) {
                boolean editable = Boolean.parseBoolean(prop.BOOLEAN().getText());
                javaCode.append("        ").append(id).append(".setEditable(").append(editable).append(");\n");
            }
            if (prop.INT() != null) {
                int initialValue = Integer.parseInt(prop.INT().getText());
                javaCode.append("        ").append(id).append(".getValueFactory().setValue(")
                        .append(initialValue).append(");\n");
            }
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            applyLayoutProperties(id, prop);
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.EventBindingContext eb : ctx.eventBinding()) {
            visit(eb);
        }

        javaCode.append("        mainRoot.getChildren().add(").append(id).append(");\n");
        currentComponentId = null;
        return "";
    }

    @Override
    public String visitColorPickerComponent(UIParser.ColorPickerComponentContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        currentComponentId = id;

        javaCode.append("        ColorPicker ").append(id).append(" = new ColorPicker();\n");

        for (UIParser.ColorPickerPropertyContext prop : ctx.colorPickerProperty()) {
            if (prop.STRING() != null && prop.getText().contains("defaultColor")) {
                String color = prop.STRING().getText().replace("\"", "");
                javaCode.append("        ").append(id)
                        .append(".setValue(Color.web(\"").append(color).append("\"));\n");
            }
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            applyLayoutProperties(id, prop);
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.EventBindingContext eb : ctx.eventBinding()) {
            visit(eb);
        }

        javaCode.append("        mainRoot.getChildren().add(").append(id).append(");\n");
        currentComponentId = null;
        return "";
    }

    @Override
    public String visitFileChooserComponent(UIParser.FileChooserComponentContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        currentComponentId = id;

        String title = ctx.STRING().getText().replace("\"", "");
        javaCode.append("        FileChooser ").append(id).append(" = new FileChooser();\n")
                .append("        ").append(id).append(".setTitle(\"").append(title).append("\");\n");

        for (UIParser.FileChooserPropertyContext prop : ctx.fileChooserProperty()) {
            if (prop.STRING() != null && prop.getText().contains("initialDirectory")) {
                String dir = prop.STRING().getText().replace("\"", "");
                javaCode.append("        ").append(id)
                        .append(".setInitialDirectory(new File(\"").append(dir).append("\"));\n");
            }
            if (prop.stringList() != null && prop.getText().contains("extensionFilters")) {
                for (org.antlr.v4.runtime.tree.TerminalNode filter : prop.stringList().STRING()) {
                    String filterText = filter.getText().replace("\"", "");
                    javaCode.append("        ").append(id)
                            .append(".getExtensionFilters().add(new FileChooser.ExtensionFilter(\"").append(filterText)
                            .append("\", \"*.").append(filterText.toLowerCase()).append("\"));\n");
                }
            }
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            applyLayoutProperties(id, prop);
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.EventBindingContext eb : ctx.eventBinding()) {
            visit(eb);
        }

        // FileChooser is typically used with a button or other UI trigger
        javaCode.append("        // Use FileChooser with a trigger like a Button (not directly added to layout)\n");
        javaCode.append("        Button ").append(id).append("Trigger = new Button(\"Open File Chooser\");\n")
                .append("        ").append(id).append("Trigger.setOnAction(e -> {\n")
                .append("            File file = ").append(id).append(".showOpenDialog(null);\n")
                .append("            if (file != null) {\n")
                .append("                System.out.println(\"Selected file: \" + file.getPath());\n")
                .append("            }\n")
                .append("        });\n")
                .append("        mainRoot.getChildren().add(").append(id).append("Trigger);\n");
        currentComponentId = null;
        return "";
    }

    @Override
    public String visitDirectoryChooserComponent(UIParser.DirectoryChooserComponentContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        currentComponentId = id;
        String title = ctx.STRING().getText().replace("\"", "");
        javaCode.append("        DirectoryChooser ").append(id).append(" = new DirectoryChooser();\n")
                .append("        ").append(id).append(".setTitle(\"").append(title).append("\");\n");

        // Do NOT call applyLayoutProperties or emit region/layout code for choosers!

        for (UIParser.EventBindingContext eb : ctx.eventBinding()) {
            visit(eb);
        }

        // DirectoryChooser is typically used with a button or other UI trigger
        javaCode.append(
                "        // Use DirectoryChooser with a trigger like a Button (not directly added to layout)\n");
        javaCode.append("        Button ").append(id).append("Trigger = new Button(\"Open Directory Chooser\");\n")
                .append("        ").append(id).append("Trigger.setOnAction(e -> {\n")
                .append("            File dir = ").append(id).append(".showDialog(null);\n")
                .append("            if (dir != null) {\n")
                .append("                System.out.println(\"Selected directory: \" + dir.getPath());\n")
                .append("            }\n")
                .append("        });\n")
                .append("        mainRoot.getChildren().add(").append(id).append("Trigger);\n");
        currentComponentId = null;
        return "";
    }

    @Override
    public String visitCanvasComponent(UIParser.CanvasComponentContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        currentComponentId = id;

        int width = Integer.parseInt(ctx.INT(0).getText());
        int height = Integer.parseInt(ctx.INT(1).getText());

        javaCode.append("        Canvas ").append(id).append(" = new Canvas(")
                .append(width).append(", ").append(height).append(");\n")
                .append("        GraphicsContext gc = ").append(id).append(".getGraphicsContext2D();\n")
                .append("        gc.setFill(Color.WHITE);\n")
                .append("        gc.setStroke(Color.BLACK);\n")
                .append("        gc.setLineWidth(1);\n");

        // Only call applyLayoutProperties (and only do so if you know type is a Region)
        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            if (isRegionType(componentTypes.get(id))) {
                applyLayoutProperties(id, prop);
            }
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }
        for (UIParser.EventBindingContext eb : ctx.eventBinding()) {
            visit(eb);
        }
        javaCode.append("        mainRoot.getChildren().add(").append(id).append(");\n");
        currentComponentId = null;
        return "";
    }

    @Override
    public String visitMediaViewComponent(UIParser.MediaViewComponentContext ctx) {
        String source = ctx.STRING().getText().replace("\"", "");
        String varName = "mediaView" + ctx.hashCode();
        currentComponentId = varName;

        javaCode.append("        MediaView ").append(varName).append(" = new MediaView();\n")
                .append("        try {\n")
                .append("            Media media = new Media(getClass().getResource(\"").append(source)
                .append("\").toString());\n")
                .append("            MediaPlayer player = new MediaPlayer(media);\n")
                .append("            ").append(varName).append(".setMediaPlayer(player);\n");

        for (UIParser.MediaViewPropertyContext prop : ctx.mediaViewProperty()) {
            if (prop.INT() != null) {
                if (prop.getText().contains("fitWidth")) {
                    javaCode.append("            ").append(varName)
                            .append(".setFitWidth(").append(prop.INT().getText()).append(");\n");
                } else if (prop.getText().contains("fitHeight")) {
                    javaCode.append("            ").append(varName)
                            .append(".setFitHeight(").append(prop.INT().getText()).append(");\n");
                }
            }
            if (prop.BOOLEAN() != null && prop.getText().contains("preserveRatio")) {
                javaCode.append("            ").append(varName)
                        .append(".setPreserveRatio(").append(prop.BOOLEAN().getText()).append(");\n");
            }
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        javaCode.append("        } catch (Exception e) {\n")
                .append("            System.err.println(\"Media not found: ").append(source).append("\");\n")
                .append("        }\n");

        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            applyLayoutProperties(varName, prop);
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.EventBindingContext eb : ctx.eventBinding()) {
            visit(eb);
        }

        javaCode.append("        mainRoot.getChildren().add(").append(varName).append(");\n");
        currentComponentId = null;
        return "";
    }

    @Override
    public String visitLayoutDeclaration(UIParser.LayoutDeclarationContext ctx) {
        String layoutType = ctx.layoutType().getText();
        currentLayout = layoutType;

        String layoutVar = "layout" + ctx.hashCode();

        // Store the current content
        javaCode.append("        Node[] children = mainRoot.getChildren().toArray(new Node[0]);\n")
                .append("        mainRoot.getChildren().clear();\n")
                .append("        ").append(layoutType).append(" ").append(layoutVar)
                .append(" = new ").append(layoutType).append("();\n");

        switch (layoutType) {
            case "GridPane":
                handleGridPaneLayout(ctx);
                break;
            case "BorderPane":
                handleBorderPaneLayout(ctx);
                break;
            case "FlowPane":
            case "TilePane":
                handleFlowTileLayout(ctx, layoutType);
                break;
            case "HBox":
            case "VBox":
                handleBoxLayout(ctx, layoutType);
                break;
            case "StackPane":
                handleStackPaneLayout(ctx);
                break;
        }

        // Add the new layout to the main root and transfer children
        javaCode.append("        ").append(layoutVar).append(".getChildren().addAll(children);\n")
                .append("        mainRoot.getChildren().add(").append(layoutVar).append(");\n");

        return "";
    }

    @Override
    public String visitScrollPaneComponent(UIParser.ScrollPaneComponentContext ctx) {
        String varName = "scrollPane" + ctx.hashCode();
        String contentVar = varName + "Content";

        javaCode.append("        VBox ").append(contentVar).append(" = new VBox();\n");
        javaCode.append("        ScrollPane ").append(varName).append(" = new ScrollPane(").append(contentVar)
                .append(");\n");

        for (UIParser.ScrollPanePropertyContext prop : ctx.scrollPaneProperty()) {
            if (prop.getText().contains("fitToWidth")) {
                javaCode.append("        ").append(varName).append(".setFitToWidth(").append(prop.BOOLEAN().getText())
                        .append(");\n");
            } else if (prop.getText().contains("fitToHeight")) {
                javaCode.append("        ").append(varName).append(".setFitToHeight(").append(prop.BOOLEAN().getText())
                        .append(");\n");
            } else if (prop.getText().contains("pannable")) {
                javaCode.append("        ").append(varName).append(".setPannable(").append(prop.BOOLEAN().getText())
                        .append(");\n");
            }
        }

        String prevRoot = currentRoot;
        currentRoot = contentVar;
        for (UIParser.ComponentContext child : ctx.component()) {
            visit(child);
        }
        currentRoot = prevRoot;

        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            applyLayoutProperties(varName, prop);
        }

        javaCode.append("        ").append(currentRoot).append(".getChildren().add(").append(varName).append(");\n");
        return "";
    }

    @Override
    public String visitSplitPaneComponent(UIParser.SplitPaneComponentContext ctx) {
        String varName = "splitPane" + ctx.hashCode();
        javaCode.append("        SplitPane ").append(varName).append(" = new SplitPane();\n");
        javaCode.append("        ").append(varName).append(".setOrientation(Orientation.")
                .append(ctx.orientationType().getText()).append(");\n");

        String prevRoot = currentRoot;
        String previousRoot = currentRoot;
        currentRoot = "tempSplitRoot" + varName;
        javaCode.append("        VBox ").append(currentRoot).append(" = new VBox();\n");

        for (UIParser.ComponentContext child : ctx.component()) {
            visit(child);
            if (currentComponentId != null) {
                javaCode.append("        ").append(varName).append(".getItems().add(").append(currentComponentId)
                        .append(");\n");
            }
        }
        currentRoot = previousRoot;

        currentRoot = prevRoot;

        for (UIParser.SplitPanePropertyContext prop : ctx.splitPaneProperty()) {
            if (prop.getText().contains("dividerPositions")) {
                String[] positions = prop.getText().replace("dividerPositions", "").split(",");
                for (String pos : positions) {
                    javaCode.append("        ").append(varName).append(".setDividerPositions(").append(pos.trim())
                            .append(");\n");
                }
            }
        }

        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            applyLayoutProperties(varName, prop);
        }

        javaCode.append("        ").append(currentRoot).append(".getChildren().add(").append(varName).append(");\n");
        return "";
    }

    @Override
    public String visitTreeTableViewComponent(UIParser.TreeTableViewComponentContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        javaCode.append("        TreeTableView<String> ").append(id).append(" = new TreeTableView<>();\n");

        for (var col : ctx.columnList().STRING()) {
            String colName = col.getText().replace("\"", "");
            javaCode.append("        TreeTableColumn<String, String> col").append(col.hashCode())
                    .append(" = new TreeTableColumn<>(\"").append(colName).append("\");\n")
                    .append("        ").append(id).append(".getColumns().add(col").append(col.hashCode())
                    .append(");\n");
        }

        for (UIParser.TreeTableViewPropertyContext prop : ctx.treeTableViewProperty()) {
            if (prop.getText().contains("editable")) {
                javaCode.append("        ").append(id).append(".setEditable(").append(prop.BOOLEAN().getText())
                        .append(");\n");
            } else if (prop.getText().contains("showRoot")) {
                javaCode.append("        ").append(id).append(".setShowRoot(").append(prop.BOOLEAN().getText())
                        .append(");\n");
            }
        }

        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            applyLayoutProperties(id, prop);
        }

        javaCode.append("        ").append(currentRoot).append(".getChildren().add(").append(id).append(");\n");
        return "";
    }

    @Override
    public String visitDialogComponent(UIParser.DialogComponentContext ctx) {
        String title = ctx.STRING().getText().replace("\"", "");
        String id = ctx.IDENTIFIER().getText();
        javaCode.append("        Alert ").append(id).append(" = new Alert(Alert.AlertType.NONE);\n");
        javaCode.append("        ").append(id).append(".setTitle(\"").append(title).append("\");\n");

        for (UIParser.DialogPropertyContext prop : ctx.dialogProperty()) {
            if (prop.getText().contains("header")) {
                String val = prop.STRING().getText().replace("\"", "");
                javaCode.append("        ").append(id).append(".setHeaderText(\"").append(val).append("\");\n");
            } else if (prop.getText().contains("content")) {
                String val = prop.STRING().getText().replace("\"", "");
                javaCode.append("        ").append(id).append(".setContentText(\"").append(val).append("\");\n");
            } else if (prop.getText().contains("type")) {
                String val = prop.dialogType().getText();
                javaCode.append("        ").append(id).append(".setAlertType(Alert.AlertType.").append(val)
                        .append(");\n");
            } else if (prop.getText().contains("resizable")) {
                javaCode.append("        ").append(id).append(".setResizable(").append(prop.BOOLEAN().getText())
                        .append(");\n");
            } else if (prop.getText().contains("buttons")) {
                for (var btn : prop.stringList().STRING()) {
                    String btnText = btn.getText().replace("\"", "");
                    javaCode.append("        ").append(id).append(".getButtonTypes().add(new ButtonType(\"")
                            .append(btnText).append("\"));\n");
                }
            }
        }

        javaCode.append("        ").append(id).append(".showAndWait();\n");
        return "";
    }

    private void handleGridPaneLayout(UIParser.LayoutDeclarationContext ctx) {
        javaCode.append("        ").append(currentLayout).append(" newLayout = new ").append(currentLayout)
                .append("();\n")
                .append("        newLayout.setHgap(10);\n")
                .append("        newLayout.setVgap(10);\n")
                .append("        newLayout.setPadding(new Insets(20));\n");

        // Create a ScrollPane to contain the GridPane
        javaCode.append("        ScrollPane scrollPane = new ScrollPane(newLayout);\n")
                .append("        scrollPane.setFitToWidth(true);\n")
                .append("        scrollPane.setFitToHeight(true);\n");

        // Add components to the GridPane with proper constraints
        javaCode.append("        int row = 0;\n")
                .append("        for (Node node : mainRoot.getChildren()) {\n")
                .append("            if (node instanceof Control || node instanceof Pane) {\n")
                .append("                newLayout.add(node, 0, row++);\n")
                .append("                GridPane.setFillWidth(node, true);\n")
                .append("            }\n")
                .append("        }\n")
                .append("        mainRoot.getChildren().clear();\n")
                .append("        mainRoot.getChildren().add(scrollPane);\n");
    }

    private void handleBoxLayout(UIParser.LayoutDeclarationContext ctx, String layoutType) {
        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            if (prop.INT() != null) {
                String value = prop.INT().getText();
                if (prop.getText().contains("spacing")) {
                    javaCode.append("        ((").append(layoutType).append(") mainRoot)")
                            .append(".setSpacing(").append(value).append(");\n");
                }
            }
            if (prop.alignmentType() != null) {
                javaCode.append("        ((").append(layoutType).append(") mainRoot)")
                        .append(".setAlignment(Pos.")
                        .append(prop.alignmentType().getText()).append(");\n");
            }
        }
    }

    private void handleFlowTileLayout(UIParser.LayoutDeclarationContext ctx, String layoutType) {
        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            if (prop.INT() != null) {
                String value = prop.INT().getText();
                if (prop.getText().contains("hgap")) {
                    javaCode.append("        ((").append(layoutType).append(") mainRoot)")
                            .append(".setHgap(").append(value).append(");\n");
                } else if (prop.getText().contains("vgap")) {
                    javaCode.append("        ((").append(layoutType).append(") mainRoot)")
                            .append(".setVgap(").append(value).append(");\n");
                }
            }
        }
    }

    private void handleStackPaneLayout(UIParser.LayoutDeclarationContext ctx) {
        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            if (prop.alignmentType() != null) {
                javaCode.append("        ((StackPane) mainRoot).setAlignment(Pos.")
                        .append(prop.alignmentType().getText()).append(");\n");
            }
        }
    }

    private void applyLayoutProperties(String varName, UIParser.LayoutPropertyContext prop) {
        javaCode.append("        if (").append(varName).append(" instanceof Region) {\n");
        String propText = prop.getText();

        if (currentLayout.equals("GridPane")) {
            if (prop.INT() != null) {
                String value = prop.INT().getText();
                switch (propText.split("\\s+")[0]) {
                    case "row":
                        javaCode.append("            GridPane.setRowIndex(").append(varName)
                                .append(", ").append(value).append(");\n");
                        break;
                    case "column":
                        javaCode.append("            GridPane.setColumnIndex(").append(varName)
                                .append(", ").append(value).append(");\n");
                        break;
                    case "rowSpan":
                        javaCode.append("            GridPane.setRowSpan(").append(varName)
                                .append(", ").append(value).append(");\n");
                        break;
                    case "columnSpan":
                        javaCode.append("            GridPane.setColumnSpan(").append(varName)
                                .append(", ").append(value).append(");\n");
                        break;
                    case "padding":
                        javaCode.append("            ((Region)").append(varName)
                                .append(").setPadding(new Insets(").append(value).append("));\n");
                        break;
                    case "margin":
                        javaCode.append("            GridPane.setMargin(").append(varName)
                                .append(", new Insets(").append(value).append("));\n");
                        break;
                }
            }
        } else if (currentLayout.equals("BorderPane")) {
            if (prop.STRING() != null && prop.getText().contains("position")) {
                String position = prop.STRING().getText().replace("\"", "");
                javaCode.append("            BorderPane.setAlignment(").append(varName)
                        .append(", Pos.").append(position).append(");\n");
            }
        }

        // Common layout properties for Region
        if (prop.alignmentType() != null) {
            javaCode.append("            ((Region)").append(varName)
                    .append(").setAlignment(Pos.").append(prop.alignmentType().getText()).append(");\n");
        }

        if (prop.BOOLEAN() != null) {
            if (propText.contains("hgrow")) {
                javaCode.append("            HBox.setHgrow(").append(varName)
                        .append(", Priority.ALWAYS);\n");
            } else if (propText.contains("vgrow")) {
                javaCode.append("            VBox.setVgrow(").append(varName)
                        .append(", Priority.ALWAYS);\n");
            }
        }

        if (prop.STRING() != null && propText.contains("visibleIf")) {
            String condition = prop.STRING().getText().replace("\"", "");
            javaCode.append("            ").append(varName)
                    .append(".visibleProperty().bind(").append(condition).append(");\n");
        }
        javaCode.append("        } else {\n")
                .append("            // Skipping Region-specific properties for non-Region component: ").append(varName)
                .append("\n")
                .append("        }\n");
    }

    @Override
    public String visitStyleDeclaration(UIParser.StyleDeclarationContext ctx) {
        StringBuilder styleString = new StringBuilder();

        for (UIParser.StylePropertyContext prop : ctx.styleProperty()) {
            String propText = prop.getText();
            if (prop.STRING() != null) {
                String value = prop.STRING().getText().replace("\"", "");
                if (propText.contains("backgroundColor")) {
                    styleString.append("-fx-background-color: ").append(value).append("; ");
                } else if (propText.contains("borderColor")) {
                    styleString.append("-fx-border-color: ").append(value).append("; ");
                } else if (propText.contains("styleClass")) {
                    javaCode.append("        mainRoot.getStyleClass().add(\"").append(value).append("\");\n");
                }
            }
            if (prop.INT() != null && propText.contains("borderWidth")) {
                styleString.append("-fx-border-width: ").append(prop.INT().getText()).append("px; ");
            }
            if (prop.FLOAT() != null && propText.contains("opacity")) {
                styleString.append("-fx-opacity: ").append(prop.FLOAT().getText()).append("; ");
            }
        }

        if (styleString.length() > 0) {
            javaCode.append("        mainRoot.setStyle(\"").append(styleString).append("\");\n");
        }
        return "";
    }

    @Override
    public String visitChartComponent(UIParser.ChartComponentContext ctx) {
        String chartType = ctx.chartType().getText();
        String id = ctx.IDENTIFIER().getText();
        String title = ctx.STRING().getText().replace("\"", "");
        currentComponentId = id;

        javaCode.append("        Chart ").append(id).append(" = null;\n");

        javaCode.append("        switch (\"").append(chartType).append("\") {\n")
                .append("            case \"PieChart\":\n")
                .append("                ObservableList<PieChart.Data> pieData = FXCollections.observableArrayList();\n");

        for (UIParser.DataPairContext pair : ctx.dataList().dataPair()) {
            String key = pair.STRING().getText().replace("\"", "");
            String value = pair.INT() != null ? pair.INT().getText() : pair.FLOAT().getText();
            javaCode.append("                pieData.add(new PieChart.Data(\"").append(key).append("\", ")
                    .append(value).append("));\n");
        }
        javaCode.append("                ").append(id).append(" = new PieChart(pieData);\n")
                .append("                ((PieChart)").append(id).append(").setTitle(\"").append(title).append("\");\n")
                .append("                break;\n")
                .append("            case \"BarChart\":\n")
                .append("                CategoryAxis xAxis = new CategoryAxis();\n")
                .append("                NumberAxis yAxis = new NumberAxis();\n")
                .append("                xAxis.setLabel(\"Category\");\n")
                .append("                yAxis.setLabel(\"Value\");\n")
                .append("                BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);\n")
                .append("                XYChart.Series<String, Number> series = new XYChart.Series<>();\n");

        for (UIParser.DataPairContext pair : ctx.dataList().dataPair()) {
            String key = pair.STRING().getText().replace("\"", "");
            String value = pair.INT() != null ? pair.INT().getText() : pair.FLOAT().getText();
            javaCode.append("                series.getData().add(new XYChart.Data<>(\"").append(key).append("\", ")
                    .append(value).append("));\n");
        }
        javaCode.append("                barChart.getData().add(series);\n")
                .append("                barChart.setTitle(\"").append(title).append("\");\n")
                .append("                ").append(id).append(" = barChart;\n")
                .append("                break;\n")
                .append("            case \"LineChart\":\n")
                .append("                CategoryAxis lxAxis = new CategoryAxis();\n")
                .append("                NumberAxis lyAxis = new NumberAxis();\n")
                .append("                LineChart<String, Number> lineChart = new LineChart<>(lxAxis, lyAxis);\n")
                .append("                XYChart.Series<String, Number> lineSeries = new XYChart.Series<>();\n");

        for (UIParser.DataPairContext pair : ctx.dataList().dataPair()) {
            String key = pair.STRING().getText().replace("\"", "");
            String value = pair.INT() != null ? pair.INT().getText() : pair.FLOAT().getText();
            javaCode.append("                lineSeries.getData().add(new XYChart.Data<>(\"").append(key).append("\", ")
                    .append(value).append("));\n");
        }
        javaCode.append("                lineChart.getData().add(lineSeries);\n")
                .append("                lineChart.setTitle(\"").append(title).append("\");\n")
                .append("                ").append(id).append(" = lineChart;\n")
                .append("                break;\n")
                .append("        }\n");

        for (UIParser.ChartPropertyContext prop : ctx.chartProperty()) {
            if (prop.BOOLEAN() != null) {
                if (prop.getText().contains("legendVisible")) {
                    javaCode.append("        if (").append(id).append(" instanceof PieChart) ((PieChart) ").append(id)
                            .append(").setLegendVisible(").append(prop.BOOLEAN().getText()).append(");\n");
                } else if (prop.getText().contains("animated")) {
                    javaCode.append("        if (").append(id).append(" instanceof BarChart) ((BarChart) ").append(id)
                            .append(").setAnimated(").append(prop.BOOLEAN().getText()).append(");\n");
                }
            }
            if (prop.STRING() != null) {
                if (prop.getText().contains("categoryAxisLabel")) {
                    javaCode.append("        if (").append(id).append(" instanceof BarChart) ((BarChart) ").append(id)
                            .append(").getXAxis().setLabel(\"").append(prop.STRING().getText().replace("\"", ""))
                            .append("\");\n");
                } else if (prop.getText().contains("valueAxisLabel")) {
                    javaCode.append("        if (").append(id).append(" instanceof BarChart) ((BarChart) ").append(id)
                            .append(").getYAxis().setLabel(\"").append(prop.STRING().getText().replace("\"", ""))
                            .append("\");\n");
                }
            }
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            applyLayoutProperties(id, prop);
            if (prop.eventBinding() != null) {
                visit(prop.eventBinding());
            }
        }

        for (UIParser.EventBindingContext eb : ctx.eventBinding()) {
            visit(eb);
        }

        javaCode.append("        mainRoot.getChildren().add(").append(id).append(");\n");
        currentComponentId = null;
        return "";
    }

    private void handleEventAction(String componentId, UIParser.EventActionContext ctx) {
        javaCode.append("            try {\n");
        String actionText = ctx.getText();
        if (actionText.startsWith("showAlert")) {
            String alertText = ctx.STRING().getText().replace("\"", "");
            javaCode.append("                Alert alert = new Alert(Alert.AlertType.INFORMATION);\n")
                    .append("                alert.setContentText(\"").append(alertText).append("\");\n")
                    .append("                alert.show();\n");
        } else if (actionText.startsWith("print")) {
            String message = ctx.STRING().getText().replace("\"", "");
            javaCode.append("                System.out.println(\"").append(message).append("\");\n");
        } else if (actionText.startsWith("navigate")) {
            String destination = ctx.STRING().getText().replace("\"", "");
            javaCode.append("                // Navigation logic to ").append(destination).append("\n");
        }
        javaCode.append("            } catch (Exception e) {\n")
                .append("                e.printStackTrace();\n")
                .append("            }\n");
    }

    private void handleBindProperty(String componentId, String bindTarget) {
        String sourceType = componentTypes.get(componentId);
        String targetType = componentTypes.get(bindTarget);

        if (sourceType == null || targetType == null) {
            javaCode.append("        // Unable to bind: unknown type for ")
                    .append(componentId).append(" or ").append(bindTarget).append("\n");
            return;
        }

        if (!sourceType.equals(targetType)) {
            javaCode.append("        // Cannot bind: type mismatch between ")
                    .append(componentId).append(" (").append(sourceType)
                    .append(") and ").append(bindTarget).append(" (").append(targetType).append(")\n");
            return;
        }

        switch (sourceType) {
            case "TextField":
            case "TextArea":
                javaCode.append("        ").append(componentId)
                        .append(".textProperty().bindBidirectional(")
                        .append(bindTarget).append(".textProperty());\n");
                break;
            case "Slider":
                javaCode.append("        ").append(componentId)
                        .append(".valueProperty().bindBidirectional(")
                        .append(bindTarget).append(".valueProperty());\n");
                break;
            // Add cases as need for other bindable types
            default:
                javaCode.append("        // Binding for ").append(sourceType).append(" not implemented\n");
        }
    }

    private void handleMenuItems(String menuId, UIParser.StringListContext items) {
        for (org.antlr.v4.runtime.tree.TerminalNode item : items.STRING()) {
            String itemText = item.getText().replace("\"", "");
            String itemId = "menuItem" + item.hashCode();
            javaCode.append("        MenuItem ").append(itemId)
                    .append(" = new MenuItem(\"").append(itemText).append("\");\n")
                    .append("        ").append(menuId).append(".getItems().add(")
                    .append(itemId).append(");\n");
        }
    }

    // Helper method for creating context menus
    private void createContextMenu(String componentId, UIParser.StringListContext items) {
        String menuId = "contextMenu" + componentId;
        javaCode.append("        ContextMenu ").append(menuId).append(" = new ContextMenu();\n");

        for (org.antlr.v4.runtime.tree.TerminalNode item : items.STRING()) {
            String itemText = item.getText().replace("\"", "");
            String itemId = "menuItem" + item.hashCode();
            javaCode.append("        MenuItem ").append(itemId)
                    .append(" = new MenuItem(\"").append(itemText).append("\");\n")
                    .append("        ").append(menuId).append(".getItems().add(")
                    .append(itemId).append(");\n");
        }

        javaCode.append("        ").append(componentId)
                .append(".setContextMenu(").append(menuId).append(");\n");
    }

    // Helper method for handling tooltip properties
    private void addTooltip(String componentId, String tooltipText) {
        javaCode.append("        ").append(componentId)
                .append(".setTooltip(new Tooltip(\"").append(tooltipText).append("\"));\n");
    }

    // Helper method for handling focus properties
    private void handleFocus(String componentId, boolean requestFocus) {
        if (requestFocus) {
            javaCode.append("        Platform.runLater(() -> ")
                    .append(componentId).append(".requestFocus());\n");
        }
    }

    // Helper method for handling disabled state
    private void setDisabled(String componentId, boolean disabled) {
        javaCode.append("        ").append(componentId)
                .append(".setDisable(").append(disabled).append(");\n");
    }

    // Helper method for handling visibility
    private void setVisibility(String componentId, boolean visible) {
        javaCode.append("        ").append(componentId)
                .append(".setVisible(").append(visible).append(");\n");
    }

    // Helper method for handling opacity
    private void setOpacity(String componentId, double opacity) {
        javaCode.append("        ").append(componentId)
                .append(".setOpacity(").append(opacity).append(");\n");
    }

    // Helper method for generating unique IDs
    private String generateUniqueId(String prefix) {
        return prefix + System.nanoTime();
    }

    // Helper method for error handling
    private void addErrorHandler(String componentId, String errorMessage) {
        javaCode.append("        try {\n")
                .append("            ").append(componentId).append(".setOnError(e -> {\n")
                .append("                System.err.println(\"").append(errorMessage).append("\");\n")
                .append("            });\n")
                .append("        } catch (Exception e) {\n")
                .append("            System.err.println(\"Error setting error handler: \" + e.getMessage());\n")
                .append("        }\n");
    }

    // Helper method for adding change listeners
    private void addChangeListener(String componentId, String property, String handler) {
        javaCode.append("        try {\n")
                .append("            ").append(componentId).append(".").append(property)
                .append("Property().addListener((obs, oldVal, newVal) -> {\n")
                .append("                ").append(handler).append("\n")
                .append("            });\n")
                .append("        } catch (Exception e) {\n")
                .append("            System.err.println(\"Error adding change listener: \" + e.getMessage());\n")
                .append("        }\n");
    }

    // Helper method for handling keyboard events
    private void addKeyHandler(String componentId, String keyCode, String handler) {
        javaCode.append("        ").append(componentId)
                .append(".setOnKeyPressed(event -> {\n")
                .append("            if (event.getCode() == KeyCode.").append(keyCode).append(") {\n")
                .append("                try {\n")
                .append("                    ").append(handler).append("\n")
                .append("                } catch (Exception e) {\n")
                .append("                    System.err.println(\"Error in key handler: \" + e.getMessage());\n")
                .append("                }\n")
                .append("            }\n")
                .append("        });\n");
    }

    // Helper method for creating dialog boxes
    private void createDialog(String title, String content, String type) {
        javaCode.append("        try {\n")
                .append("            Alert alert = new Alert(Alert.AlertType.").append(type).append(");\n")
                .append("            alert.setTitle(\"").append(title).append("\");\n")
                .append("            alert.setContentText(\"").append(content).append("\");\n")
                .append("            alert.showAndWait();\n")
                .append("        } catch (Exception e) {\n")
                .append("            System.err.println(\"Error showing dialog: \" + e.getMessage());\n")
                .append("        }\n");
    }

    // Helper method for handling style classes
    private void applyStyleClass(String componentId, String styleClass) {
        javaCode.append("        try {\n")
                .append("            ").append(componentId)
                .append(".getStyleClass().add(\"").append(styleClass).append("\");\n")
                .append("        } catch (Exception e) {\n")
                .append("            System.err.println(\"Error applying style class: \" + e.getMessage());\n")
                .append("        }\n");
    }

    // Helper method for setting common properties
    private void setCommonProperties(String componentId, UIParser.LayoutPropertyContext prop) {
        javaCode.append("        if (").append(componentId).append(" instanceof Region) {\n")
                .append("            ((Region)").append(componentId).append(").setMaxWidth(800);\n")
                .append("            ((Region)").append(componentId)
                .append(").setPrefWidth(Region.USE_COMPUTED_SIZE);\n")
                .append("        }\n");
        if (prop.INT() != null) {
            String value = prop.INT().getText();
            if (prop.getText().contains("minWidth")) {
                javaCode.append("        ((Region)").append(componentId)
                        .append(").setMinWidth(").append(value).append(");\n");
            } else if (prop.getText().contains("maxWidth")) {
                javaCode.append("        ((Region)").append(componentId)
                        .append(").setMaxWidth(").append(value).append(");\n");
            } else if (prop.getText().contains("prefWidth")) {
                javaCode.append("        ((Region)").append(componentId)
                        .append(").setPrefWidth(").append(value).append(");\n");
            }
        }
    }

    private void handleBorderPaneLayout(UIParser.LayoutDeclarationContext ctx) {
        javaCode.append("        ((BorderPane) mainRoot).setPadding(new Insets(10));\n");

        for (UIParser.LayoutPropertyContext prop : ctx.layoutProperty()) {
            if (prop.STRING() != null && prop.getText().contains("position")) {
                String position = prop.STRING().getText().replace("\"", "");
                String region = position.toUpperCase();
                switch (region) {
                    case "TOP":
                    case "BOTTOM":
                    case "LEFT":
                    case "RIGHT":
                    case "CENTER":
                        javaCode.append("        ((BorderPane) mainRoot).set")
                                .append(region.substring(0, 1)).append(region.substring(1).toLowerCase())
                                .append("(new VBox());\n");
                        break;
                }
            }
            if (prop.alignmentType() != null) {
                javaCode.append("        ((BorderPane) mainRoot).setAlignment(Pos.")
                        .append(prop.alignmentType().getText()).append(");\n");
            }
            if (prop.INT() != null) {
                String value = prop.INT().getText();
                if (prop.getText().contains("spacing")) {
                    javaCode.append("        ((BorderPane) mainRoot).setSpacing(")
                            .append(value).append(");\n");
                }
            }
        }
    }

    // Returns true if the type extends Region
    private boolean isRegionType(String type) {
        return type != null
                && (type.equals("VBox") || type.equals("HBox") || type.equals("Canvas") || type.equals("Pane")
                        || type.equals("GridPane") || type.equals("TextField") || type.equals("TextArea")
                        || type.equals("Label") /* etc. */);
    }

    private int animationCounter = 0;

    private void applyAnimationBindings(String id, List<UIParser.AnimationBindingContext> animations) {
        for (UIParser.AnimationBindingContext anim : animations) {
            String type = anim.animationType().getText();
            String duration = anim.INT(0) != null ? anim.INT(0).getText() : "1000";
            String cycleCount = anim.INT(1) != null ? anim.INT(1).getText() : "1";
            String autoReverse = anim.BOOLEAN() != null ? anim.BOOLEAN().getText() : "false";

            // Generate a unique suffix
            String animVarSuffix = id + (++animationCounter);

            switch (type) {
                case "fade":
                    javaCode.append("        FadeTransition ft_").append(animVarSuffix)
                            .append(" = new FadeTransition(Duration.millis(").append(duration)
                            .append("), ").append(id).append(");\n")
                            .append("        ft_").append(animVarSuffix).append(".setFromValue(0.0);\n")
                            .append("        ft_").append(animVarSuffix).append(".setToValue(1.0);\n")
                            .append("        ft_").append(animVarSuffix).append(".setCycleCount(").append(cycleCount)
                            .append(");\n")
                            .append("        ft_").append(animVarSuffix).append(".setAutoReverse(").append(autoReverse)
                            .append(");\n")
                            .append("        ft_").append(animVarSuffix).append(".play();\n");
                    break;
                case "rotate":
                    javaCode.append("        RotateTransition rt_").append(animVarSuffix)
                            .append(" = new RotateTransition(Duration.millis(").append(duration)
                            .append("), ").append(id).append(");\n")
                            .append("        rt_").append(animVarSuffix).append(".setByAngle(360);\n")
                            .append("        rt_").append(animVarSuffix).append(".setCycleCount(").append(cycleCount)
                            .append(");\n")
                            .append("        rt_").append(animVarSuffix).append(".setAutoReverse(").append(autoReverse)
                            .append(");\n")
                            .append("        rt_").append(animVarSuffix).append(".play();\n");
                    break;
                case "scale":
                    javaCode.append("        ScaleTransition st_").append(animVarSuffix)
                            .append(" = new ScaleTransition(Duration.millis(").append(duration)
                            .append("), ").append(id).append(");\n")
                            .append("        st_").append(animVarSuffix).append(".setByX(1.5);\n")
                            .append("        st_").append(animVarSuffix).append(".setByY(1.5);\n")
                            .append("        st_").append(animVarSuffix).append(".setCycleCount(").append(cycleCount)
                            .append(");\n")
                            .append("        st_").append(animVarSuffix).append(".setAutoReverse(").append(autoReverse)
                            .append(");\n")
                            .append("        st_").append(animVarSuffix).append(".play();\n");
                    break;
                case "translate":
                    javaCode.append("        TranslateTransition tt_").append(animVarSuffix)
                            .append(" = new TranslateTransition(Duration.millis(").append(duration)
                            .append("), ").append(id).append(");\n")
                            .append("        tt_").append(animVarSuffix).append(".setByX(50);\n")
                            .append("        tt_").append(animVarSuffix).append(".setCycleCount(").append(cycleCount)
                            .append(");\n")
                            .append("        tt_").append(animVarSuffix).append(".setAutoReverse(").append(autoReverse)
                            .append(");\n")
                            .append("        tt_").append(animVarSuffix).append(".play();\n");
                    break;
            }
        }
    }

    private void applyEffectBinding(String id, UIParser.EffectBindingContext effect) {
        if (effect == null)
            return;
        String effectType = effect.effectType().getText();
        switch (effectType) {
            case "dropShadow":
                javaCode.append("        ").append(id).append(".setEffect(new DropShadow());\n");
                break;
            case "glow":
                javaCode.append("        ").append(id).append(".setEffect(new Glow());\n");
                break;
            case "bloom":
                javaCode.append("        ").append(id).append(".setEffect(new Bloom());\n");
                break;
            case "sepia":
                javaCode.append("        ").append(id).append(".setEffect(new SepiaTone());\n");
                break;
            case "gaussianBlur":
                javaCode.append("        ").append(id).append(".setEffect(new GaussianBlur());\n");
                break;
        }
    }

    private int idCounter = 0;

    private String generateComponentId(String prefix) {
        return prefix + (++idCounter);
    }

    // Then, before calling applyLayoutProperties:
}
// End of CustomUTToJavaFXVisitor class