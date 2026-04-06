package BroCode._11_RadioButtons;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

/*

Yes, by default, RadioButtons are designed so you can only select one at a time
but only if they are grouped together properly.

SCENE BUILDER
Properties of the RadioButton #
Toggle Group



no scene1.fxml

 */

public class Controller {
    @FXML
    private Label myLabel;
    @FXML
    RadioButton rButton1;
    @FXML
    RadioButton rButton2;

    public void getFood(ActionEvent e){
        if(rButton1.isSelected()){
            myLabel.setText(rButton1.getText());
        } else if(rButton2.isSelected()){
            myLabel.setText(rButton2.getText());
        }
    }
}
