import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Episode 7 - CSS styling");
        stage.setWidth(400);
        stage.setHeight(500);

        VBox root = new VBox();
        // Set what happens if u uncomment the line below:
        //root.getStylesheets().add("stylesheets/fire.css");

        Label label = new Label("Cool label");

        Label labelCustom = new Label("Custom label");
        labelCustom.setId("custom-label"); // Kebab case is used in CSS.

        Hyperlink link = new Hyperlink("qweqwe");
        link.setStyle("-fx-background-color: lightcoral; -fx-rotate: 45;");

        root.getChildren().addAll(label, labelCustom, link);

        Scene scene = new Scene(root);
        scene.getStylesheets().add("stylesheets/styles.css");
        stage.setScene(scene);
        stage.show();
    }
}

// How to change CSS in a runtime
// https://stackoverflow.com/questions/24702542/how-to-change-the-color-of-text-in-javafx-textfield
