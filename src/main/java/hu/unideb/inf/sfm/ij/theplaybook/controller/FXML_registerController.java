package hu.unideb.inf.sfm.ij.theplaybook.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class FXML_registerController {
    public Button regBtn1;
    public void regHandler(ActionEvent actionEvent) throws IOException {
        regBtn1.setDisable(true);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FXML_login.fxml"));
        Parent tacticlistParent = loader.load();

        Scene loginScene = new Scene(tacticlistParent);
        Stage stage = new Stage();
        stage.setTitle("Login");
        stage.setScene(loginScene);
        stage.show();
        //commit
        Stage original = (Stage)regBtn1.getScene().getWindow();
        original.close();
    }
}
