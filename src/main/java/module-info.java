module com.example.mathapelo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mathapelo to javafx.fxml;
    exports com.example.mathapelo;
}