module com.example.teszt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.teszt to javafx.fxml;
    exports com.example.teszt;
}