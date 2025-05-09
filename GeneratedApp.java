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
        TreeTableView<String> myTreeTable = new TreeTableView<>();
        TreeTableColumn<String, String> col57494364 = new TreeTableColumn<>("Name");
        myTreeTable.getColumns().add(col57494364);
        TreeTableColumn<String, String> col1828757853 = new TreeTableColumn<>("Value");
        myTreeTable.getColumns().add(col1828757853);
        myTreeTable.setEditable(true);
        myTreeTable.setShowRoot(true);
        mainRoot.getChildren().add(myTreeTable);
        VBox scrollPane1374677625Content = new VBox();
        ScrollPane scrollPane1374677625 = new ScrollPane(scrollPane1374677625Content);
        scrollPane1374677625.setFitToHeight(true);
        scrollPane1374677625.setFitToWidth(true);
        scrollPane1374677625.setPannable(true);
        Label label221036634 = new Label("Item 1");
        mainRoot.getChildren().add(label221036634);
        Label label1335050193 = new Label("Item 2");
        mainRoot.getChildren().add(label1335050193);
        Label label1418370913 = new Label("Item 3");
        mainRoot.getChildren().add(label1418370913);
        Label label391359742 = new Label("Item 4");
        mainRoot.getChildren().add(label391359742);
        Label label2081853534 = new Label("Item 5");
        mainRoot.getChildren().add(label2081853534);
        Label label707610042 = new Label("Item 6");
        mainRoot.getChildren().add(label707610042);
        Label label710714889 = new Label("Item 7");
        mainRoot.getChildren().add(label710714889);
        mainRoot.getChildren().add(scrollPane1374677625);
        SplitPane splitPane551734240 = new SplitPane();
        splitPane551734240.setOrientation(Orientation.HORIZONTAL);
        VBox tempSplitRootsplitPane551734240 = new VBox();
        Button button1757293506 = new Button("Left Side");
        mainRoot.getChildren().add(button1757293506);
        Button button687780858 = new Button("Right Side");
        mainRoot.getChildren().add(button687780858);
        splitPane551734240.setDividerPositions(0.5);
        mainRoot.getChildren().add(splitPane551734240);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

