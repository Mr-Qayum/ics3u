import javafx.scene.image.Image;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RadioButtonGUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        GridPane mainPane = new GridPane();
        Scene mainScene = new Scene(mainPane, 200, 250);
        ToggleGroup group = new ToggleGroup();
        RadioButton bird = new RadioButton("Bird");
        RadioButton cat = new RadioButton("Cat");
        RadioButton dog = new RadioButton("Dog");
        RadioButton pig = new RadioButton("Pig");
        RadioButton rabbit = new RadioButton("Rabbit");
        Label image = new Label("");

        bird.setToggleGroup(group);
        cat.setToggleGroup(group);
        dog.setToggleGroup(group);
        pig.setToggleGroup(group);
        rabbit.setToggleGroup(group);

        bird.setSelected(true);
        image.setGraphic(new ImageView(new Image(getClass().getResourceAsStream("Bird.gif"))));

        mainPane.add(bird, 0, 0);
        mainPane.add(cat, 0, 1);
        mainPane.add(dog, 0, 2);
        mainPane.add(pig, 0, 3);
        mainPane.add(rabbit, 0, 4);
        mainPane.add(image, 0, 5);

        group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            public void changed(ObservableValue<? extends Toggle> ov, Toggle oldValue, Toggle newValue) {
                if (group.getSelectedToggle() != null) {
                   	image.setGraphic(new ImageView(new Image(getClass().getResourceAsStream(((RadioButton) group.getSelectedToggle()).getText() + ".gif"))));
                }
            }
        });

        primaryStage.setTitle("Radio Button GUI");
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }
}
