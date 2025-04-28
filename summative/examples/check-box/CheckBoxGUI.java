import javafx.scene.image.Image;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CheckBoxGUI extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  public void start(Stage primaryStage) {
    GridPane mainPane = new GridPane();
    Scene mainScene = new Scene(mainPane, 200, 200);
    CheckBox[] features = new CheckBox[4];
    CheckBox chin = new CheckBox("Chin");
    CheckBox glasses = new CheckBox("Glasses");
    CheckBox hair = new CheckBox("Hair");
    CheckBox teeth = new CheckBox("Teeth");
    Label image = new Label("");
    StringBuffer options = new StringBuffer("----");

    features[0] = chin;
    features[1] = glasses;
    features[2] = hair;
    features[3] = teeth;

    image.setGraphic(new ImageView(new Image(getClass().getResourceAsStream("----.gif"))));

    mainPane.add(chin, 0, 0);
    mainPane.add(glasses, 0, 1);
    mainPane.add(hair, 0, 2);
    mainPane.add(teeth, 0, 3);
    mainPane.add(image, 0, 5);

    for (CheckBox checkBox : features) {
      checkBox.selectedProperty().addListener(new ChangeListener<Boolean>() {
        public void changed(ObservableValue<? extends Boolean> ov, Boolean oldValue, Boolean newValue) {
          int index = 0;
          char option;
          switch (checkBox.getText()) {
            case "Chin":
              index = 0;
              option = checkBox.isSelected() ? 'c' : '-';
              break;
            case "Glasses":
              index = 1;
              option = checkBox.isSelected() ? 'g' : '-';
              break;
            case "Hair":
              index = 2;
              option = checkBox.isSelected() ? 'h' : '-';
              break;
            default:
              index = 3;
              option = checkBox.isSelected() ? 't' : '-';
              break;
          }
          options.setCharAt(index, option);
          image.setGraphic(new ImageView(new Image(getClass().getResourceAsStream(options + ".gif"))));
        }
      });
    }
    primaryStage.setTitle("Check Box GUI");
    primaryStage.setScene(mainScene);
    primaryStage.show();
  }
}
