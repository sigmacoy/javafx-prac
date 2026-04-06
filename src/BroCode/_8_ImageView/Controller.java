package BroCode._8_ImageView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    /*
        Image = photo
        ImageView = picture frame
     */
    @FXML ImageView myImageView;
    Image myImage;
    int picNum = 1;
    public void switch_image(ActionEvent e){
        if(picNum == 1){
            myImage = new Image(getClass().getResourceAsStream("jelian2.jpg"));
            picNum++;
        } else if(picNum == 2){
            myImage = new Image(getClass().getResourceAsStream("jelian1.jpg"));
            picNum--;
        }
        myImageView.setImage(myImage);
    }

}
