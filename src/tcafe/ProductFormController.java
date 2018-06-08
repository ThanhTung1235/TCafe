/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcafe;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author Le Thanh Tung
 */
public class ProductFormController implements Initializable {

    @FXML
    private JFXTextField txtName;
    @FXML
    private JFXPasswordField txtPassword;
    @FXML
    private Button btnChooseFile;
    @FXML
    private Button btnSubmit;
    @FXML
    private Button btnReset;
    private String img;
    @FXML
    private Label linkImg;
    @FXML
    private ImageView imgView;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void handleChooseFile(ActionEvent event) throws IOException {
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extensionFilter = new FileChooser.ExtensionFilter("Image files (*.png)", "*.png", "*.jpg");
        fileChooser.getExtensionFilters().add(extensionFilter);

        File file = fileChooser.showOpenDialog(TCafe.stage);
        System.out.println("Đường dẫn file người dùng chọn:" + file.getAbsolutePath());

        Path path = Paths.get("src/img/", file.getName());
        System.out.println("Đường dẫn mới:" + path.toString());
        linkImg.setText(path.toString());
        Files.copy(file.toPath(), path, StandardCopyOption.REPLACE_EXISTING);
        img = "img/" + file.getName();
    }

    @FXML
    private void handleSubmit(ActionEvent event) {

    }

    @FXML
    private void handleReset(ActionEvent event) {
        txtName.clear();
        txtPassword.clear();
    }

}
