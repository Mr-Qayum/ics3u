module summative {
    requires javafx.controls;
    requires javafx.fxml;

    opens summative to javafx.fxml;
    exports summative;
}
