package com.example.hackathonjavafx;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.Duration;
import org.w3c.dom.events.MouseEvent;

import java.time.Clock;
import java.util.Timer;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class HelloController {
    Timer timer = new Timer();
    private Clock clock;
    @FXML
    private Label welcomeText;

    @FXML
    private Button btnTest;

    @FXML
    private Label TimeLabel;

    @FXML
    protected void handleButtonAction(ActionEvent e){
        btnTest.setText("Hello World");
    }

    

    public void timerMode(Event event) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            TimeLabel.setText(dtf.format(now));
    }
}