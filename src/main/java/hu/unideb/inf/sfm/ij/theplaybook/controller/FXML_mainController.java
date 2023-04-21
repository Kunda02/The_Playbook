package hu.unideb.inf.sfm.ij.theplaybook.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class FXML_mainController {
    @FXML
    public Button exit;
    @FXML
    public Button delete;
    @FXML
    public Button add;
    @FXML
    public Button back;

    public void exitHandler(ActionEvent actionEvent) throws IOException {
        exit.setDisable(true);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FXML_login.fxml"));
        Parent loginParent = loader.load();

        FXML_loginController loginController = loader.getController();
        //mainController.setDao(pDAO);

        Scene loginScene = new Scene(loginParent);
        Stage stage = new Stage();
        stage.setTitle("Login");
        stage.setScene(loginScene);
        stage.show();
        //commit
        //Stage original = (Stage).getScene().getWindow();
        //original.close();

    }

    public void backHandler(ActionEvent actionEvent) {
    }

    public void addHandler(ActionEvent actionEvent) {
    }

    public void deleteHandler(ActionEvent actionEvent) {
    }
}
