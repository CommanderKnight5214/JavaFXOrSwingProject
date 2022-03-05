package com.example.hackathonjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import java.io.IOException;

public class HelloApplication extends Application implements EventHandler<ActionEvent> {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setScene(scene);
        stage.show();
        //start_button = new Button();
        //start_button.setOnAction(this);

    }

    @Override
    public void handle(ActionEvent actionEvent) {

    }

    public static void main(String[] args) {
        launch();
    }
}