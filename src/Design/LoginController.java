/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import static Functions.Loading.LoadCustomer;
import Lists.CrudCustomer;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Armel Hell
 */
public class LoginController implements Initializable {
    
    @FXML
    private TextField mailtxt;

    @FXML
    private Button logbtn;

    @FXML
    private Label signinbtn;

    @FXML
    private PasswordField passtxt;

    @FXML
    void login(ActionEvent event) throws IOException {
        CrudCustomer c = new CrudCustomer();
        c = LoadCustomer();
        if(mailtxt.getText().isEmpty() == false && passtxt.getText().isEmpty() == false){
            String mail = mailtxt.getText();
            String pwd = passtxt.getText();
            if(c.searchCustomer(mail, pwd) != -1){
                Stage s = (Stage) logbtn.getScene().getWindow();
                Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
                Scene scene = new Scene(root);
                s.setScene(scene);
                s.centerOnScreen();
                s.show();
            }
            else{
                Alert a = new Alert(Alert.AlertType.ERROR, "Your identifiers are incorrect.Try Again", ButtonType.OK);
                a.showAndWait();
            }
        }
        else{
            Alert a = new Alert(Alert.AlertType.ERROR, "You should fill all the textfields to login to your account", ButtonType.OK);
                a.showAndWait();
        }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
