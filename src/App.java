import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Episode 8 - Buttons");
        stage.setWidth(400);
        stage.setHeight(500);

        VBox root = new VBox();

        ToggleButton button1 = new ToggleButton("Blue");
        ToggleButton button2 = new ToggleButton("Pink");
        ToggleButton button3 = new ToggleButton("Purple");

        ToggleGroup buttonGroup = new ToggleGroup();
        button1.setToggleGroup(buttonGroup);
        button2.setToggleGroup(buttonGroup);
        button3.setToggleGroup(buttonGroup);
        // OR  buttonGroup.getToggles().addAll(button1, button2, button3);

        RadioButton r1 = new RadioButton("Brown");
        RadioButton r2 = new RadioButton("Green");
        r1.setToggleGroup(buttonGroup);
        r2.setToggleGroup(buttonGroup);


        root.getChildren().addAll(button1, button2, button3, r1, r2);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

// How to change CSS in a runtime
// https://stackoverflow.com/questions/24702542/how-to-change-the-color-of-text-in-javafx-textfield
