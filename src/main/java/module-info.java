module com.mikmin.lab08 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mikmin.lab08 to javafx.fxml;
    exports com.mikmin.lab08;
}
