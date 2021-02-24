package WordCounter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/***
 * Main class that extends Application as a JavaFX entry point.
 */
public class Main extends Application {

    /***
     * Entry point of the JavaFX application.
     * @param primaryStage The primary stage area for the application.
     * @throws Exception Could throw an Exception, which would critically impact application function.
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        primaryStage.setTitle("Word Counter Program");
        primaryStage.setScene(new Scene(root, 900, 400));
        primaryStage.show();
    }

    /***
     * Main method, entry point. Refer to Controller for specific methods for application function.
     * @param args An array of command-line arguments for the application.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
