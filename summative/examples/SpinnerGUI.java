import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class SpinnerGUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        VBox mainPane = new VBox();
        Scene scene = new Scene(mainPane, 200, 200);
		Spinner<String> month = new Spinner<String>();
        Spinner<Integer> day = new Spinner<Integer>();
        Label date = new Label("The date is: ");

        month.setValueFactory(new SpinnerValueFactory.ListSpinnerValueFactory<String>(FXCollections.observableArrayList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec")));
        day.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 31, 1));

        month.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                date.setText("The date is: " + newValue + " " + day.getValue() + ", 2020");
            }
        });

        day.valueProperty().addListener(new ChangeListener<Integer>() {
            public void changed(ObservableValue<? extends Integer> ov, Integer oldValue, Integer newValue) {
                date.setText("The date is: " + month.getValue() + " " + newValue + ", 2020");
            }
        });

        mainPane.getChildren().add(month);
        mainPane.getChildren().add(day);
        mainPane.getChildren().add(date);

        primaryStage.setTitle("Spinner GUI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
