/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Armel Hell
 */
public class SigninController implements Initializable {
    
    @FXML
    private JFXTextField Fntxt;

    @FXML
    private JFXTextField Lntxt;

    @FXML
    private JFXTextField Etxt;

    @FXML
    private JFXTextField Pwdtxt;

    @FXML
    private JFXTextField Cpwdtxt;

    @FXML
    private Button Confirmbtn;

    @FXML
    private Button Cancelbtn;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
