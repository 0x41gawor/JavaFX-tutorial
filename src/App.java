import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;



public class App extends Application {
    @Override
    public void start(Stage stage) {

        stage.setTitle("Episode 12 - BorderPane");
        stage.setWidth(500);
        stage.setHeight(500);
        // Border Pane is a layout manager that allows you to layout your nodes in a five section layout
        // As you can see in res/img/BorderPane.png

        BorderPane root = new BorderPane();

        Button b1 = new Button("One");
        Button b2 = new Button("Two");
        Button b3 = new Button("Three");
        Button b4 = new Button("Four");
        Button b5 = new Button("Five");

        // Normally we do smth like this but with BorderPane does not gonna work bcuz we need to tell where (in which Pane)
        // we are placing a child node, we need to tell each child node which section it's gonna be
        //root.getChildren().addAll(b1, b2, b3, b4, b5);

        // So ..
        root.setCenter(b1);
        root.setTop(b2);
        root.setRight(b3);
        root.setLeft(b4);
        root.setBottom(b5);

        // If u want b2 at the center of the top use this:
        // BorderPane.setAligment(b2, Pos.CENTER)
        // Try also this
        // BorderPane.setAlignment(b3, Pos.BOTTOM_CENTER);


        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

// How to change CSS in a runtime
// https://stackoverflow.com/questions/24702542/how-to-change-the-color-of-text-in-javafx-textfield
