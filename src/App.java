import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Episode 8 - Buttons");
        stage.setWidth(400);
        stage.setHeight(500);

        VBox root = new VBox();

        Button button = new Button("_Click me!");
        button.setStyle("-fx-font-size: 45px");

        //But with this font size button is to small to enclose whole text
        //button.setText("Reptilians are cool");
        //So we need to do a text wrapping
        //button.setWrapText(true);

        button.setMinSize(20,20);
        // Uncomment this the line below
        //button.setPrefSize(300,100);

        // M N E M O N I C  - shortcut buttons its when u press alt and type some letter e.g. alt + t (try it here, in Intellij)
        button.setMnemonicParsing(true);
        // We need to put underscore before the letter we want to be shortcut

        button.setOnAction( e -> {
            System.out.println("Button tapped");
        });


        root.getChildren().addAll(button);

        Scene scene = new Scene(root);
        scene.getStylesheets().add("stylesheets/styles.css");
        stage.setScene(scene);
        stage.show();
    }
}

// How to change CSS in a runtime
// https://stackoverflow.com/questions/24702542/how-to-change-the-color-of-text-in-javafx-textfield
