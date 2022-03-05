module com.example.hackathonjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.example.hackathonjavafx to javafx.fxml;
    exports com.example.hackathonjavafx;
}