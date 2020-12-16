/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Armel Hell
 */
public class MenuController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private ImageView micon;

    @FXML
    private ImageView accicon;

    @FXML
    private ImageView chkicon;

    @FXML
    private AnchorPane switchpane;

    @FXML
    private ImageView Drinkvw;

    @FXML
    private ImageView Pizzavw;

    @FXML
    private ImageView Sidevw;

    public AnchorPane getSwitchpane() {
        return switchpane;
    }

    public void setSwitchpane(AnchorPane switchpane) {
        this.switchpane = switchpane;
    }
    
    

    @FXML
    void dlist(MouseEvent event) throws IOException {
        Stage s = (Stage) Drinkvw.getScene().getWindow();
        AnchorPane root = FXMLLoader.load(getClass().getResource("DrinkList.fxml"));
        switchpane.getChildren().clear();
        switchpane.getChildren().setAll(root);
        s.centerOnScreen();
    }

    @FXML
    void plist(MouseEvent event) throws IOException {
        Stage s = (Stage) Pizzavw.getScene().getWindow();
        AnchorPane root = FXMLLoader.load(getClass().getResource("PizzaList.fxml"));
        switchpane.getChildren().clear();
        switchpane.getChildren().setAll(root);
        s.centerOnScreen();
    }

    @FXML
    void checkout(MouseEvent event) throws IOException {
        Stage s = (Stage) chkicon.getScene().getWindow();
        AnchorPane root = FXMLLoader.load(getClass().getResource("Checkout.fxml"));
        switchpane.getChildren().clear();
        switchpane.getChildren().setAll(root);
        s.centerOnScreen();
    }
    
    @FXML
    void menu(MouseEvent event) throws IOException {
        Stage s = (Stage) micon.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.centerOnScreen();
        s.show();
    }

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
