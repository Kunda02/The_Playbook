package hu.unideb.inf.sfm.ij.theplaybook.controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.stage.Stage;

import java.io.IOException;

public class FXML_loginController {


    @FXML
    public Button loginBtn;
    @FXML
    public ColumnConstraints panel;
    @FXML
    public TextField loginName;
    @FXML
    public PasswordField loginPassword;
    @FXML
    public Label loginStatus;

    @FXML
    void loginHandler(ActionEvent event) throws IOException {
        loginBtn.setDisable(true);
        loginStatus.setText("Bejelentkezés...");

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FXML_main.fxml"));
        Parent mainParent = loader.load();

        FXML_mainController mainController = loader.getController();
        //mainController.setDao(pDAO);

        Scene mainScene = new Scene(mainParent);
        Stage stage = new Stage();
        stage.setTitle("Oldal");
        stage.setScene(mainScene);
        stage.show();

        Stage original = (Stage)loginName.getScene().getWindow();
        original.close();


    }
}
