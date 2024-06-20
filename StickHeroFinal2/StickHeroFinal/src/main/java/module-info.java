module com.example.stickherofinal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.stickherofinal to javafx.fxml;
    exports com.example.stickherofinal;
}