/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Armel Hell
 */
public class DrinkListController implements Initializable {
    
    @FXML
    private ImageView Pview;

    @FXML
    private Label Plbl;

    @FXML
    private Label DPlbl;

    @FXML
    private ImageView DPview;

    @FXML
    private Label Olbl;

    @FXML
    private ImageView Oview;

    @FXML
    private Label DOlbl;

    @FXML
    private ImageView DOview;

    @FXML
    private ImageView Lview;

    @FXML
    private Label Llbl;
    
    @FXML
    private AnchorPane dmagicpane;
    
    @FXML
    void OrderDO(MouseEvent event) throws IOException {
        Stage s = (Stage) DOview.getScene().getWindow();
        FXMLLoader root = new FXMLLoader(getClass().getResource("Drink.fxml"));
        Parent p = (Parent) root.load();
        DrinkController dcont = root.getController();
        dcont.setNametxt("Diet Orange");
        //dcont.getSizecb().setItems(FXCollections.observableArrayList("small","medium","large"));
        dmagicpane.getChildren().clear();
        dmagicpane.getChildren().setAll(p);
        s.centerOnScreen();
        s.show();
    }

    @FXML
    void OrderDP(MouseEvent event) throws IOException {
        Stage s = (Stage) DPview.getScene().getWindow();
        FXMLLoader root = new FXMLLoader(getClass().getResource("Drink.fxml"));
        Parent p = (Parent) root.load();
        DrinkController dcont = root.getController();
        dcont.setNametxt("Diet Pepsi");
        dmagicpane.getChildren().clear();
        dmagicpane.getChildren().setAll(p);
        s.centerOnScreen();
        s.show();
    }

    @FXML
    void OrderL(MouseEvent event) throws IOException {
        Stage s = (Stage) Lview.getScene().getWindow();
        FXMLLoader root = new FXMLLoader(getClass().getResource("Drink.fxml"));
        Parent p = (Parent) root.load();
        DrinkController dcont = root.getController();
        dcont.setNametxt("Lemonade");
        dmagicpane.getChildren().clear();
        dmagicpane.getChildren().setAll(p);
        s.centerOnScreen();
        s.show();
    }

    @FXML
    void OrderO(MouseEvent event) throws IOException {
        Stage s = (Stage) Oview.getScene().getWindow();
        FXMLLoader root = new FXMLLoader(getClass().getResource("Drink.fxml"));
        Parent p = (Parent) root.load();
        DrinkController dcont = root.getController();
        dcont.setNametxt("Orange");
        dmagicpane.getChildren().clear();
        dmagicpane.getChildren().setAll(p);
        s.centerOnScreen();
        s.show();
    }

    @FXML
    void OrderP(MouseEvent event) throws IOException {
        Stage s = (Stage) Pview.getScene().getWindow();
        FXMLLoader root = new FXMLLoader(getClass().getResource("Drink.fxml"));
        Parent p = (Parent) root.load();
        DrinkController dcont = root.getController();
        dcont.setNametxt("Pepsi");
        dmagicpane.getChildren().clear();
        dmagicpane.getChildren().setAll(p);
        s.centerOnScreen();
        s.show();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
