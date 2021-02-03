import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class App extends Application {
    @Override
    public void start(Stage stage) {

        stage.setTitle("Episode 12 - BorderPane");
        stage.setWidth(500);
        stage.setHeight(500);

        GridPane root = new GridPane();
        // Usually we work with GridPane to create forms (user, email, password etc)

        Label userNameLabel = new Label("Username");
        Label emailLabel = new Label("Email");
        Label passwordLabel = new Label("Password");

        TextField usernameTextField = new TextField();
        TextField emailTextField = new TextField();
        PasswordField passwordTextField = new PasswordField();

        Button finishButton = new Button("Create Account");

        // Vertical space between each cell
        root.setVgap(10);
        // Horizontal space between each cell
        root.setHgap(5);


        //  add method params (node, column, row) and GridPane know where to put it
        root.add(userNameLabel, 0, 0);
        root.add(emailLabel, 0, 1);
        root.add(passwordLabel, 0, 2);
        root.add(usernameTextField, 1, 0);
        root.add(emailTextField, 1, 1);
        root.add(passwordTextField, 1, 2);
        root.add(finishButton, 1, 4);
        // This puts GridPane in the Center of the screen
        root.setAlignment(Pos.CENTER);


        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

// How to change CSS in a runtime
// https://stackoverflow.com/questions/24702542/how-to-change-the-color-of-text-in-javafx-textfield
