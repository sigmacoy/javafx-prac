package BroCode._10_CheckBox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;


/*

No scene1.fxml

 */

public class Controller {
    @FXML CheckBox myCheckBox;
    @FXML
    Label myLabel;
    @FXML ImageView myImageView;

    public void change(ActionEvent e){
        if(myCheckBox.isSelected()){
            myLabel.setText("ON");
        } else {
            myLabel.setText("OFF");
        }
    }
}
