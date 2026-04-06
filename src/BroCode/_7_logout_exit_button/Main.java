package BroCode._7_logout_exit_button;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
        Scene scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();

        stage.setOnCloseRequest(event -> {
            try {
                event.consume(); // Keep window open until logout completes
                logout(stage);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

    }

    public void logout(Stage stage){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to logout?");

        if(alert.showAndWait().get() == ButtonType.OK){
//            stage = (Stage) scenePane.getScene().getWindow();
            System.out.println("Successful logged out!");
            stage.close();
        }
    }
}
