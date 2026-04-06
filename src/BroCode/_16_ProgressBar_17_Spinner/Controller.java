package BroCode._16_ProgressBar_17_Spinner;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.math.BigDecimal;

public class Controller {
    @FXML
    ProgressBar myProgressBar;
    @FXML
    Label myLabel;
    BigDecimal progress = new BigDecimal(String.format("%.2f", 0.0));


    @FXML
    Spinner<Integer> mySpinner;
    @FXML
    Label myLabel2;
    int currValue = 1;

    public void initialize(){
        myProgressBar.setStyle("-fx-accent: green;");

        SpinnerValueFactory<Integer> valueFactory
                = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10); // min and max

        valueFactory.setValue(1);
        mySpinner.setValueFactory(valueFactory);
        mySpinner.valueProperty().addListener(new ChangeListener<Integer>() {
            @Override
            public void changed(ObservableValue<? extends Integer> observable, Integer oldValue, Integer newValue) {
                currValue = valueFactory.getValue();
                myLabel2.setText(Integer.toString(currValue));
            }
        });
    }
    public void increase(ActionEvent e){
        if (progress.doubleValue() < 1) {
            progress = new BigDecimal(String.format("%.2f", progress.doubleValue() + 0.1));
            myProgressBar.setProgress(progress.doubleValue());
            myLabel.setText(Math.round(progress.doubleValue() * 100) + "%");
        }

    }


}
