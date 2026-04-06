package BroCode._16_ProgressBar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.math.BigDecimal;

public class Controller {
    @FXML
    ProgressBar myProgressBar;
    @FXML
    Label myLabel;
    BigDecimal progress = new BigDecimal(String.format("%.2f", 0.0));

    public void initialize(){
        myProgressBar.setStyle("-fx-accent: green;");
    }
    public void increase(ActionEvent e){
        if (progress.doubleValue() < 1) {
            progress = new BigDecimal(String.format("%.2f", progress.doubleValue() + 0.1));
            myProgressBar.setProgress(progress.doubleValue());
            myLabel.setText(Math.round(progress.doubleValue() * 100) + "%");
        }

    }
}
