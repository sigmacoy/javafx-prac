package BroCode._14_ChoiceBox_15_Slider;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class Controller {
    @FXML
    Label myLabel;
    @FXML
    ChoiceBox<String> myChoiceBox;

    @FXML Label valueLabel;
    @FXML Slider mySlider;
    int myValue;

    public void initialize(){
        myChoiceBox.getItems().addAll("pizza", "sushi", "ramen");
        myChoiceBox.getSelectionModel().select(0); // ga default select sa first
        myChoiceBox.setOnAction(this::getFood); // automatic that the ChoiceBox will call the getFood function

        mySlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                myValue = (int) mySlider.getValue();
                valueLabel.setText(Integer.toString(myValue));
            }
        });
    }

    public void getFood(ActionEvent event){
        String myFood = myChoiceBox.getValue();
        myLabel.setText(myFood);

    }




}
