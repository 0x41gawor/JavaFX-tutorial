import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Episode 7 - CSS styling");
        stage.setWidth(400);
        stage.setHeight(500);

        VBox root = new VBox();

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
