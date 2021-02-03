import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class App extends Application {
    @Override
    public void start(Stage stage) {

        stage.setTitle("Episode 12 - BorderPane");
        stage.setWidth(500);
        stage.setHeight(500);

        StackPane root = new StackPane();
        // The way StackPane works is it will put every node u pass in at the top of the stack in the center
        // unless you told him to do otherwise


        Label l1 = new Label("Hi dood");
        Button b1 = new Button("Hi smack me!");
        ImageView imageView = new ImageView("https://i.pinimg.com/564x/76/d1/01/76d101cc7408c36e6b0a1b4c15ce00e4.jpg");

        root.getChildren().addAll(l1, b1);
        // But with this only. Only the b1 (last node) is visible.

        // So we can do this e.g.
        StackPane.setAlignment(b1, Pos.CENTER_LEFT);

        root.getChildren().addAll(imageView,l1, b1);
        // This will put image behind see the effect

        // This way we know button won't touch the window
        StackPane.setMargin(b1, new Insets(30));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

// How to change CSS in a runtime
// https://stackoverflow.com/questions/24702542/how-to-change-the-color-of-text-in-javafx-textfield
