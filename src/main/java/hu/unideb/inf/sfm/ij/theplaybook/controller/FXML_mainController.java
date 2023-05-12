package hu.unideb.inf.sfm.ij.theplaybook.controller;

import hu.unideb.inf.sfm.ij.theplaybook.model.JpaPageDAO;
import hu.unideb.inf.sfm.ij.theplaybook.model.Page;
import hu.unideb.inf.sfm.ij.theplaybook.model.PageDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FXML_mainController {
    @FXML
    public Button exit;
    @FXML
    public Button delete;
    @FXML
    public Button add;
    @FXML
    public Button back;
    @FXML
    public Text title;
    @FXML
    public Text tactic;
    @FXML
    public Text author;
    @FXML
    public Text effectiveness;

    private PageDAO dao;

    private Page page;

    public void setPage(Page page) {
        this.page = page;

        title.setText(page.getTitle());
        tactic.setText(page.getTactic());
        author.setText(page.getAuthor());
        effectiveness.setText("" + page.getEffectiveness());
    }

    public void exitHandler(ActionEvent actionEvent) throws IOException {
        exit.setDisable(true);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FXML_login.fxml"));
        Parent loginParent = loader.load();
        Scene loginScene = new Scene(loginParent);
        Stage stage = new Stage();
        stage.setTitle("Login");
        stage.setScene(loginScene);
        stage.show();
        //commit
        Stage original = (Stage)exit.getScene().getWindow();
        original.close();

    }

    public void backHandler(ActionEvent actionEvent) throws IOException {
        exit.setDisable(true);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FXML_tacticlist.fxml"));
        Parent tacticlistParent = loader.load();

        Scene loginScene = new Scene(tacticlistParent);
        Stage stage = new Stage();
        stage.setTitle("Tactics");
        stage.setScene(loginScene);
        stage.show();
        //commit
        Stage original = (Stage)exit.getScene().getWindow();
        original.close();
    }

    public void addHandler(ActionEvent actionEvent) throws IOException {
        exit.setDisable(true);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FXML_pageadd.fxml"));
        Parent pageaddParent = loader.load();


        Scene loginScene = new Scene(pageaddParent);
        Stage stage = new Stage();
        stage.setTitle("PageAdd");
        stage.setScene(loginScene);
        stage.show();
        //commit
        Stage original = (Stage)exit.getScene().getWindow();
        original.close();

    }

    public void deleteHandler(ActionEvent actionEvent) throws IOException {
        exit.setDisable(true);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FXML_tacticlist.fxml"));
        Parent tacticlistParent = loader.load();

        Scene loginScene = new Scene(tacticlistParent);
        Stage stage = new Stage();
        stage.setTitle("Tactics");
        stage.setScene(loginScene);
        stage.show();
        //commit
        Stage original = (Stage)exit.getScene().getWindow();
        original.close();

    }
}
