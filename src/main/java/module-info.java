module com.example.duker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.duker to javafx.fxml;
    exports com.example.duker;
}