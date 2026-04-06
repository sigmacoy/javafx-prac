package BroCode._19_TreeView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.InputStream;

public class Controller {
    @FXML
    TreeView<String> myTreeView;
    @FXML
    Label myLabel;
    public void initialize(){
        Image icon = new Image(getClass().getResourceAsStream("folder.png"));
        ImageView iconView = new ImageView(icon);
        iconView.setFitWidth(16);
        iconView.setFitHeight(16);
        TreeItem<String> rootItem = new TreeItem<>("Files", iconView);

        TreeItem<String> branchItem1 = new TreeItem<>("Pictures");
        TreeItem<String> branchItem2 = new TreeItem<>("Videos");
        TreeItem<String> branchItem3 = new TreeItem<>("Music");

        TreeItem<String> leafItem1 = new TreeItem<>("Picture1");
        TreeItem<String> leafItem2 = new TreeItem<>("Picture2");
        TreeItem<String> leafItem3 = new TreeItem<>("Video1");
        TreeItem<String> leafItem4 = new TreeItem<>("Video2");
        TreeItem<String> leafItem5 = new TreeItem<>("Music1");
        TreeItem<String> leafItem6 = new TreeItem<>("Music2");

        branchItem1.getChildren().addAll(leafItem1, leafItem2);
        branchItem2.getChildren().addAll(leafItem3, leafItem4);
        branchItem3.getChildren().addAll(leafItem5, leafItem6);

        rootItem.getChildren().addAll(branchItem1, branchItem2, branchItem3);

        myTreeView.setShowRoot(true);
        myTreeView.setRoot(rootItem);
    }
    public void selectItem(MouseEvent e){
        TreeItem<String> selectedItem = myTreeView.getSelectionModel().getSelectedItem();
        if(selectedItem != null){
            myLabel.setText(selectedItem.getValue());
        }
    }
}
