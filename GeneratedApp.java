import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class GeneratedApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("User Form");
        primaryStage.setScene(scene);
        Label label559450121 = new Label("Enter your name:");
        label559450121.setStyle("-fx-font-family: 'Arial';");
        label559450121.setStyle("-fx-font-size: 16px;");
        label559450121.setStyle("-fx-text-fill: blue;");
        root.getChildren().add(label559450121);
        TextField nameField = new TextField();
        nameField.setPromptText("Your name");
        nameField.setText("John Doe");
        nameField.setPrefWidth(200);
        root.getChildren().add(nameField);
        CheckBox termsCheck = new CheckBox("Accept Terms");
        termsCheck.setSelected(true);
        root.getChildren().add(termsCheck);
        ComboBox<String> country = new ComboBox<>();
        country.getItems().add("India");
        country.getItems().add("USA");
        country.getItems().add("UK");
        root.getChildren().add(country);
        Button btn59559151 = new Button("Submit");
        btn59559151.setOnAction(e -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Form submitted!");
            alert.show();
        });
        btn59559151.setPrefWidth(100);
        root.getChildren().add(btn59559151);
        primaryStage.show();
    }
    public static void main(String[] args) { launch(args); }
}
