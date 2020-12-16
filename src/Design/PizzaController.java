/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import Functions.Loading;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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
public class PizzaController implements Initializable {
    
    @FXML
    private Button Orderbtn;

    @FXML
    private Button Cancelbtn;

    @FXML
    private JFXComboBox<String> sizecb;

    @FXML
    private JFXComboBox<String> crustcb;

    @FXML
    private JFXComboBox<String> saucecb;

     @FXML
    private JFXCheckBox Cbox;

    @FXML
    private JFXCheckBox Pbox;

    @FXML
    private JFXCheckBox GPbox;

    @FXML
    private JFXCheckBox Obox;

    @FXML
    private JFXCheckBox Sausagebox;

    @FXML
    private JFXCheckBox MRbox;

    @FXML
    private JFXCheckBox Tbox;

    @FXML
    private JFXCheckBox Hbox;

    @FXML
    private JFXTextField nametxt;

    public String getNametxt() {
        return nametxt.getText();
    }

    public void setNametxt(String nametxt) {
        this.nametxt.setText(nametxt);
    }
    
    @FXML
    void Cancel(ActionEvent event) throws IOException {
        Stage s = (Stage) Cancelbtn.getScene().getWindow();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("PizzaList.fxml"));
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
        sizecb.getItems().addAll(Loading.Pizzaslist());
        crustcb.getItems().addAll(Loading.crustlist());
        saucecb.getItems().addAll(Loading.saucelist());
    }    
    
}
