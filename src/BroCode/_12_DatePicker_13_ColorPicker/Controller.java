package BroCode._12_DatePicker_13_ColorPicker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Controller {
    @FXML
    DatePicker myDatePicker;
    @FXML
    Label myLabel;

    @FXML private Pane myPane;
    @FXML private ColorPicker myColorPicker;

    public void getDate(ActionEvent event){
        LocalDate myDate = myDatePicker.getValue();
        String myFormattedDate = myDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        myLabel.setText(myFormattedDate);

    }

    public void changeColor(ActionEvent event){
        Color myColor = myColorPicker.getValue();
        myPane.setBackground(new Background(new BackgroundFill(myColor, null, null)));
    }
}
