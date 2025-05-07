module summative {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.swing;

    opens summative to javafx.fxml;

    exports summative;
}
