package BroCode;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.*;

/*

BASICS of STAGES

 */

public class _1_stages extends Application {
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage s) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 400, Color.BLACK);

        Image icon = new Image("BroCode/please_upvote.jpeg");
        s.getIcons().add(icon);
        s.setTitle("First javaFX GUI");

        s.setResizable(false);
        /*
        s.setX(50);
        s.setY(50);
        s.setFullScreen(true); // default ESC
        s.setFullScreenExitHint("hint message here");
        s.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
         */

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        s.setScene(scene);
        s.show();
    }
}

/*

Key points:
One Stage can only have one Scene at a time
But you can swap scenes on the same stage (s.setScene(newScene))
All UI components (buttons, labels) go inside the Scene



 */