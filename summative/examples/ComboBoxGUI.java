import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.beans.value.ChangeListener;

public class ComboBoxGUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        VBox mainPane = new VBox();
        Scene scene = new Scene(mainPane, 275, 50);
		ComboBox<String> plantNames = new ComboBox<String>();
        Label latinName = new Label("Ocimum");

        plantNames.getItems().addAll("basil", "lavender", "parsley", "peppermint", "saffron", "sage");
        plantNames.setPromptText("Select a plant name:");
        plantNames.valueProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> ov, String oldValue, String newValue) {
                switch (newValue) {
                    case "basil":
                        latinName.setText("Ocimum");
                        break;
                    case "lavender":
                        latinName.setText("Lavandula spica");
                        break;
                    case "parsley":
                        latinName.setText("Apium");
                        break;
                    case "peppermint":
                        latinName.setText("Mentha piperita");
                        break;
                    case "saffron":
                        latinName.setText("Crocus");
                        break;
                    case "sage":
                        latinName.setText("Salvia");
                        break;
                    default:
                        latinName.setText("");
                        break;
                }
            }
        });

        mainPane.getChildren().add(plantNames);
        mainPane.getChildren().add(latinName);

        primaryStage.setTitle("Combo Box GUI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
