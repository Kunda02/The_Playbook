package hu.unideb.inf.sfm.ij.theplaybook.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class FXML_pageaddController {
    @FXML
    public Button back;
    @FXML
    public Button add;
    public void Ontitle(ActionEvent actionEvent) {
    }

    public void Onefficiency(ActionEvent actionEvent) {

    }

    public void addHandler(ActionEvent actionEvent) throws IOException {
        back.setDisable(true);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FXML_tacticlist.fxml"));
        Parent tacticlistParent = loader.load();

        Scene loginScene = new Scene(tacticlistParent);
        Stage stage = new Stage();
        stage.setTitle("tacticlist");
        stage.setScene(loginScene);
        stage.show();
        //commit
        Stage original = (Stage)back.getScene().getWindow();
        original.close();
    }
    public void backHandler(ActionEvent actionEvent) throws IOException {
        back.setDisable(true);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FXML_tacticlist.fxml"));
        Parent tacticlistParent = loader.load();

        Scene loginScene = new Scene(tacticlistParent);
        Stage stage = new Stage();
        stage.setTitle("tacticlist");
        stage.setScene(loginScene);
        stage.show();
        //commit
        Stage original = (Stage)back.getScene().getWindow();
        original.close();
    }
}
