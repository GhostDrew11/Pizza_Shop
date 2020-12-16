/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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
public class PizzaListController implements Initializable {
    
    @FXML
    private ImageView CTview;

    @FXML
    private Label CTlbl;

    @FXML
    private Label Mlbl;

    @FXML
    private ImageView Mview;

    @FXML
    private Label Dlbl;

    @FXML
    private ImageView Dview;

    @FXML
    private Label MPSlbl;

    @FXML
    private ImageView MPSview;
    
    @FXML
    private AnchorPane magicpane;
    
    @FXML
    private AnchorPane supersub;

    
    @FXML
    void OrderCT(MouseEvent event) throws IOException {
        Stage s = (Stage) CTview.getScene().getWindow();
        FXMLLoader root = new FXMLLoader(getClass().getResource("Pizza.fxml"));
        Parent p = (Parent) root.load();
        PizzaController pcont = root.getController();
        pcont.setNametxt("Chicken Taco");
        magicpane.getChildren().clear();
        magicpane.getChildren().setAll(p);
        s.centerOnScreen();
        s.show();    
    }

    @FXML
    void OrderDX(MouseEvent event) throws IOException {
        Stage s = (Stage) Dview.getScene().getWindow();
        FXMLLoader root = new FXMLLoader(getClass().getResource("Pizza.fxml"));
        Parent p = (Parent) root.load();
        PizzaController pcont = root.getController();
        pcont.setNametxt("Deluxe");
        magicpane.getChildren().clear();
        magicpane.getChildren().setAll(p);
        s.centerOnScreen();
        s.show();
    }

    @FXML
    void OrderMP(MouseEvent event) throws IOException {
        Stage s = (Stage) MPSview.getScene().getWindow();
        FXMLLoader root = new FXMLLoader(getClass().getResource("Pizza.fxml"));
        Parent p = (Parent) root.load();
        PizzaController pcont = root.getController();
        pcont.setNametxt("Mom & Pop Special");
        magicpane.getChildren().clear();
        magicpane.getChildren().setAll(p);
        s.centerOnScreen();
        s.show();
    }

    @FXML
    void OrderMZ(MouseEvent event) throws IOException {
        Stage s = (Stage) Mview.getScene().getWindow();
        FXMLLoader root = new FXMLLoader(getClass().getResource("Pizza.fxml"));
        Parent p = (Parent) root.load();
        PizzaController pcont = root.getController();
        pcont.setNametxt("MeatZZa");
        magicpane.getChildren().clear();
        magicpane.getChildren().setAll(p);
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
