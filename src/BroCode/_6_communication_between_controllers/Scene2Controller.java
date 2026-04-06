package BroCode._6_communication_between_controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Scene2Controller {
    @FXML
    Label userLabel;

    public void displayName(String username){
        userLabel.setText(username);
    }
}
