module com.example.calculatorsecond {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.calculatorsecond to javafx.fxml;
    exports com.example.calculatorsecond;
}