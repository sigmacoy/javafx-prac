package BroCode;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;

/*

How Scenes Work

Stage level 3 back
Scene level 2 middle
Scene-Graph level 1 (at the front)
    root node -> Leaf node
              -> Branch node
                    -> leaf node

 */

public class _2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 1000, 1000, Color.SKYBLUE);
        Stage s = new Stage();

        Text text1 = new Text();
        text1.setText("TEXT OF TEXT1");
        text1.setFill(Color.BLACK);
//        text1.setFont(Font.font("Verdana", 20));
        text1.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        text1.setX(50);
        text1.setY(50);

        Line line1 = new Line();
        line1.setStartX(200);
        line1.setStartY(200);
        line1.setEndX(500);
        line1.setEndY(200);
        line1.setStrokeWidth(3);
        line1.setStroke(Color.BROWN);
//        line1.setOpacity(0.5); // 50% opacity
        line1.setRotate(45);


        Rectangle rec1 = new Rectangle(500, 500);
        rec1.setFill(Color.ORANGE);
        rec1.setX(100);
        rec1.setY(100);
        rec1.setWidth(100);
        rec1.setHeight(100);
        rec1.setStroke(Color.BLACK);
        rec1.setStrokeWidth(3);


        Polygon tri1 = new Polygon();
        /*
                GOOD PRACTICE
                CIRCULAR shape rendering
         */
        tri1.getPoints().setAll(
                200.0, 200.0,
                300.0, 300.0,
                200.0, 300.0
                );
        tri1.setFill(Color.RED);

        Circle cir1 = new Circle();
        cir1.setCenterX(350);
        cir1.setCenterY(350);
        cir1.setRadius(50);
        cir1.setFill(Color.GREEN);



        Image image = new Image("BroCode/please_upvote.jpeg");
        ImageView imageView1 = new ImageView(image);
        imageView1.setX(400);
        imageView1.setY(400);

        root.getChildren().add(text1);
        root.getChildren().add(line1);
        root.getChildren().add(rec1);
        root.getChildren().add(tri1);
        root.getChildren().add(cir1);
        root.getChildren().add(imageView1);

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        s.setScene(scene);
        s.show();
    }
}
