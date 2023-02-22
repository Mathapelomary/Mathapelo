package com.example.mathapelo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField displayfield;
    int counter = 0;

    @FXML
    void IncreaseOnAction(ActionEvent event) {
        if (displayfield.getText().isBlank()) {
            counter = counter + 1;
            displayfield.setText(String.valueOf(counter));


        } else {
            counter = Integer.parseInt(displayfield.getText());
            counter = counter + 1;
            displayfield.setText(String.valueOf(counter));
        }


    }

    @FXML
    void decreaseOnAction(ActionEvent event) {
        if (displayfield.getText().isBlank()) {
            counter = counter -1;
            displayfield.setText(String.valueOf(counter));


        } else {
            counter = Integer.parseInt(displayfield.getText());
            counter = counter -1;
            displayfield.setText(String.valueOf(counter));

        }

    }
}
