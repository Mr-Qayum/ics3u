package summative;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("primary.fxml"));
        Parent root = loader.load();

        PrimaryController controller = loader.getController();
        controller.setStage(primaryStage);

        primaryStage.setTitle("Summative");
        primaryStage.setScene(new Scene(root, 750, 750));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
