import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        // Sets window title
        stage.setTitle("Hello world");
        // Shows window
        stage.show();

        // Creating window new window
        Stage stage2 = new Stage();
        stage2.setTitle("Second window");

        // Set window size, but it's not resizable now
        stage2.setWidth(400);
        stage2.setHeight(50);

        // Set position of window, by default they appear in the middle of the screen
        stage2.setX(0);
        stage2.setY(0);

        // M O D A L I T Y - how you want to stages(windows) to interact with each other
        Stage newStage = new Stage();
        newStage.initModality(Modality.APPLICATION_MODAL);
        // Modality.APPLICATION_MODAL - other windows can't be used until this one is closed
        // Modality.NONE - default one
        // Modality.WINDOW_MODAL - you cannot mess with window that created this window until its closed
        // You can set a window owner with Stage.initOwner(Stage s)


        // S T Y L I N G
        newStage.initStyle(StageStyle.DECORATED);
        // StageStyle.DECORATED - default one
        // StageStyle.TRANSPARENT - window is invisible
        // StageStyle.UTILITY - only exit option (not minimize or maximize), cool for pop ups, settings etc. Like File -> Settings... in Intellij IDEA
        // StageStyle.UNDECORATED - shows only content of the window, no frame at all (now it will be invisible)
        // StageStyle.UNIFIED - removes the border between the decoration area (frame) and the main content area

        stage2.toFront();
        stage2.show();
        newStage.show();
    }
}
