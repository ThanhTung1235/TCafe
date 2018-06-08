/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcafe;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

/**
 *
 * @author Le Thanh Tung
 */
public class FXMLDocumentController implements Initializable {

    private Label label;
    @FXML
    private Hyperlink ProductManager;
    @FXML
    private Hyperlink OrderManager;
    @FXML
    private Hyperlink Statistical;
    @FXML
    private Pane mainPane;
    private Parent parent1;
    private Parent parent2;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            parent1 = FXMLLoader.load(getClass().getResource("ProductForm.fxml"));
            parent2 = FXMLLoader.load(getClass().getResource("OrderForm.fxml"));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

//    public Pane In() {
//        Pane pane = new Pane();
//        Button btn = new Button("Hello");
//        
//        return null;
//    }

    @FXML
    private void clickProdct(ActionEvent event) {
        mainPane.getChildren().clear();
        mainPane.getChildren().add(parent1);
    }

    @FXML
    private void clickOrder(ActionEvent event) {
        mainPane.getChildren().clear();
        mainPane.getChildren().add(parent2);
    }

    @FXML
    private void clickStatistical(ActionEvent event) {

    }

}
