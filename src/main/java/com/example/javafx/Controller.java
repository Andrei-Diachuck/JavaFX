package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField userAnswer;
    @FXML
    private TextArea historyArea;
    
    
    public void clickCheckButton(ActionEvent actionEvent) {
        String answer = userAnswer.getText();
        if (answer.isBlank()){
            return;
        }
        String text = String.format(answer);
        historyArea.appendText(text + "\n");
        userAnswer.clear();
        userAnswer.requestFocus();
        
        
    }
}