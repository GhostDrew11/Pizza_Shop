/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Armel Hell
 */
public class CheckoutController implements Initializable {
    
    @FXML
    private TableView<?> otable;

    @FXML
    private TableColumn<?, ?> Itemcol;

    @FXML
    private TableColumn<?, ?> descol;

    @FXML
    private TableColumn<?, ?> qtycol;

    @FXML
    private TableColumn<?, ?> pricecol;

    @FXML
    private Button Ckbtn;
    
    @FXML
    private TextField totaltxt;

    @FXML
    private Label FDlbl;

    @FXML
    private Label Tdlbl;

    @FXML
    private Label Dvlbl;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
