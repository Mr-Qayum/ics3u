import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SliderGUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        VBox mainPane = new VBox();
        Scene scene = new Scene(mainPane, 400, 100);
        Slider number = new Slider(0, 10, 5);
        Label label = new Label("Drag the slider:");
        Label value = new Label("");

        number.setShowTickMarks(true);
        number.setShowTickLabels(true);
        number.setMajorTickUnit(1);
        number.setBlockIncrement(1);
        number.setSnapToTicks(true);

        number.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov, Number oldValue, Number newValue) {
                value.setText(newValue.toString());
            }
        });

        mainPane.getChildren().add(label);
        mainPane.getChildren().add(number);
        mainPane.getChildren().add(value);

        primaryStage.setTitle("Slider GUI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
