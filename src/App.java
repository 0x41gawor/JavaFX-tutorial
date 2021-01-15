import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // With scenes you can add components and layouts to your stages (-> windows)
        // This episode i will show you how to add a scene to the stage, and later how to add buttons etc. to the scene
        // Only one scene can be displayed at a time on the stage
        // Components are also called a nodes

        stage.setTitle("Episode 4 - Scenes");
        stage.setWidth(400);
        stage.setHeight(500);

        // Param of Scene.Scene() is the root node of the scene
        // Here we will give the layoutManager, VBox is a type of the layoutManager
        VBox root = new VBox();

        // Here we can  add some components/node to the root component/node
        Label label = new Label("This is a text label");
        Button button = new Button("OK");

        root.getChildren().add(label);
        root.getChildren().add(button);
        // root.getChidlren().addAll(label, button);

        // Go google "Scene graph model JavaFX"


        Scene scene = new Scene(root);

        // We can choose what happens with out mouse cursor when it enters the scene
        scene.setCursor(Cursor.HAND);
        // Checkout the enum values yourself

        // Assign scene to the stage
        stage.setScene(scene);

        stage.show();
    }
}
