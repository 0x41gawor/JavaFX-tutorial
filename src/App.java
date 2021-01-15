import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    // Whenever program starts the state is created and passed to start method
    // A stage is a window, every window we create for GUI is a stage
    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Hello world");
        stage.show();
    }

    // There are two methods we can implement from javafx.Application class, but they're optional

    // This one is called before start method
    // This might be useful for loading pictures and assets
    @Override
    public void init() throws Exception {
        super.init();
        System.out.println("Loading assets");
    }

    // This one is opposite of init() method
    // Runs after start method ends it flow
    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("start() method ended");
    }
}
