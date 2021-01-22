import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Episode 12 - Vbox and Hbox");
        stage.setWidth(400);
        stage.setHeight(500);

        // Layout Pane, or so called Layout Manager manage the layout of child nodes on the scene.

        HBox root = new HBox();
        Button b1 = new Button("One");
        Button b2 = new Button("Two");
        Button b3 = new Button("Three");
        Button b4 = new Button("Four");

        // Sets amount of width [px] between each element of Hbox
        root.setSpacing(12);

        // Where all the child element will be located on the root node of the Hbox
        root.setAlignment(Pos.BOTTOM_RIGHT);

        // Space in px, around the Hbox
        root.setPadding(new Insets(10,10,10,10));

        // Set a padding for a specific node
        HBox.setMargin(b1,new Insets(50,50,50,50));


        root.getChildren().addAll(b1, b2, b3, b4);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

// How to change CSS in a runtime
// https://stackoverflow.com/questions/24702542/how-to-change-the-color-of-text-in-javafx-textfield
