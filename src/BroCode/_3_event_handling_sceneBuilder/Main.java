package BroCode.event_handling_sceneBuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.*;

import java.io.IOException;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage stage){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
