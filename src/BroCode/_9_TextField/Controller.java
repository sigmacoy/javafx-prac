package BroCode._9_TextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/*

This has no scene1.fxml, only Controller logic

 */

public class Controller {
    @FXML
    private Label myLabel;
    @FXML
    private TextField myTextField;
    int age;
    public void submit(ActionEvent event){
        try {
            age = Integer.parseInt(myTextField.getText());
            System.out.println(age);

            myLabel.setText("Your age is: " + age);
        } catch(NumberFormatException ex) {
            System.out.println("NUMBER RA DAPAT OY");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
