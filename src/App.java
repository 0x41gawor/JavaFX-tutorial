import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;




public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        // > Last episode I called it components but these are controls by JavaFX official term

        stage.setTitle("Episode 5 - Images and Labels");
        stage.setWidth(400);
        stage.setHeight(500);

        VBox root = new VBox();

        // I M A G E

        // U can put a link to image
        ImageView imageView1 = new ImageView("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Image_created_with_a_mobile_phone.png/220px-Image_created_with_a_mobile_phone.png");

        // Or make Image object
        Image image = new Image("file:///A:/Ejek/Java/JavaFX/JavaFXTutorial/res/img/tree.jpg");

        ImageView imageView2 = new ImageView(image);
        root.getChildren().add(imageView1);

        // L A B E L

        // This way u can add an icon to the label, this image is too large to be an icon for this label, but you get it
        // Remember that without a label imageView will be also displayed because of the previous code
        Label label = new Label("Text label", imageView1);

        // Bunch of staff u can do with label
        Label label2 = new Label("Pickles r cool");
        label2.setTextFill(Color.web("#9042f5"));
        label2.setFont(new Font("Cambria", 45));
        label2.setRotate(45);

        root.getChildren().addAll(label, label2);


        Scene scene = new Scene(root);

        stage.setScene(scene);

        stage.show();
    }
}
