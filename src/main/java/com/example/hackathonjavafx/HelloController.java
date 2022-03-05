package com.example.hackathonjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button start_button;

    @FXML
    private Label hour;

    @FXML
    void buttonPressed(ActionEvent event) {

    }

    @FXML
    protected void handleButtonAction(ActionEvent e) {
        start_button.setText("Hello World");
    }
    @FXML
    protected void somethingButton(ActionEvent e) {
        hour.setText("20");
    }
}