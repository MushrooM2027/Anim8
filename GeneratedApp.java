import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.web.*;
import javafx.scene.canvas.*;
import javafx.scene.media.*;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.scene.paint.*;
import javafx.stage.FileChooser;
import javafx.stage.DirectoryChooser;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TitledPane;
import javafx.scene.control.Accordion;
import java.io.File;
import javafx.stage.*;
import java.net.URL;
import javafx.scene.text.Font;
import javafx.scene.Node;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.KeyEvent;
import java.util.Map;
import java.util.HashMap;
import javafx.scene.chart.*;
import javafx.collections.*;
import javafx.animation.*;
import javafx.scene.effect.*;
import javafx.util.*;

public class GeneratedApp extends Application {
    private VBox mainRoot;
    private Scene scene;
    private Map<String, ToggleGroup> toggleGroups = new HashMap<>();

    @Override
    public void start(Stage primaryStage) {
        mainRoot = new VBox();
        mainRoot.setSpacing(10);
        mainRoot.setPadding(new Insets(10));
        mainRoot.setAlignment(Pos.TOP_CENTER);
        mainRoot.setStyle("-fx-background-color: white;");
        ScrollPane mainScroll = new ScrollPane(mainRoot);
        mainScroll.setFitToWidth(true);
        scene = new Scene(mainScroll);
        primaryStage.setTitle("Test Components Window");
        primaryStage.setWidth(800);
        primaryStage.setHeight(600);
        Button button1 = new Button("Click Me");
        button1.setOnAction(event -> {
        });
        button1.setPrefWidth(120);
        button1.setDefaultButton(true);
        if (button1 instanceof Region) {
        } else {
            // Skipping Region-specific properties for non-Region component: button1
        }
        if (button1 instanceof Region) {
        } else {
            // Skipping Region-specific properties for non-Region component: button1
        }
        RotateTransition rt_button11 = new RotateTransition(Duration.millis(1000), button1);
        rt_button11.setByAngle(360);
        rt_button11.setCycleCount(3);
        rt_button11.setAutoReverse(false);
        rt_button11.play();
        button1.setEffect(new DropShadow());
        // Unhandled event type: mouseEntered for button1
        mainRoot.getChildren().add(button1);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

