package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main  extends Application{

    public static void main(String[] args)  {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("res/calculator.fxml"));
        Scene homeScene = new Scene(root);

        primaryStage.setTitle("Calculator");
        primaryStage.setScene(homeScene);
        primaryStage.show();
    }
}
