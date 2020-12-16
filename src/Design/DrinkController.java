/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import Functions.Loading;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Armel Hell
 */
public class DrinkController implements Initializable {

    @FXML
    private JFXComboBox<String> sizecb;


    @FXML
    private JFXTextField QtyTxt;

    @FXML
    private JFXTextField NameTxt;
    
    
    public String getNametxt() {
        return NameTxt.getText();
    }

    public void setNametxt(String NameTxt) {
        this.NameTxt.setText(NameTxt);
    }

    @FXML
    private Button Orderbtn;

    @FXML
    private Button Cancelbtn;
    
    @FXML
    void Cancel(ActionEvent event) throws IOException {
        Stage s = (Stage) Cancelbtn.getScene().getWindow();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("DrinkList.fxml"));
        FXMLLoader menu = new FXMLLoader(getClass().getResource("Menu.fxml"));
        Parent root = (Parent) menu.load();
        MenuController mcont = menu.getController();
        Scene newScene = new Scene(root);
        s.setScene(newScene);
        mcont.getSwitchpane().getChildren().clear();
        mcont.getSwitchpane().getChildren().setAll(pane);
        s.centerOnScreen();
        s.show();
    }

    @FXML
    void Order(ActionEvent event) {

    }
    /**
     * Initializes the controller class.
     */
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        sizecb.getItems().addAll(Loading.sizelist());
    }    
    
}
