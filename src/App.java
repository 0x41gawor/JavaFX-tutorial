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

        MenuItem item1 = new MenuItem("Taco");
        MenuItem item2 = new MenuItem("Burrito");
        MenuItem item3 = new MenuItem("Cheese Enchilada");
        MenuItem item4 = new MenuItem("Chips & Salsa");

        MenuButton menuButton = new MenuButton("Favourite mexican food", null, item1, item2, item3, item4);

        Label food = new Label("No food selected");

        item1.setOnAction(e -> {
            food.setText("Taco");
        });
        item2.setOnAction(e -> {
            food.setText("Burrito");
        });
        item3.setOnAction(e -> {
            food.setText("Cheese Enchilada");
        });
        item4.setOnAction(e -> {
            food.setText("Chips & Salsa");
        });


        root.getChildren().addAll(menuButton, food);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

// How to change CSS in a runtime
// https://stackoverflow.com/questions/24702542/how-to-change-the-color-of-text-in-javafx-textfield
