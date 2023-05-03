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

public class FXML_mainController implements Initializable {
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        dao = new JpaPageDAO();
        /*
        page = new Page();
        page.setAuthor("Barney");
        page.setEffectiveness(69);
        page.setTactic("Ask her out.");
        page.setTitle("Virgin");

        dao.savePage(page);*/

        var page1 = dao.getPage(1);
        title.setText(page1.getTitle());
        tactic.setText(page1.getTactic());
        author.setText(page1.getAuthor());
        effectiveness.setText("" + page1.getEffectiveness());
    }

    public void exitHandler(ActionEvent actionEvent) throws IOException {
        exit.setDisable(true);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FXML_login.fxml"));
        Parent loginParent = loader.load();

        //FXML_loginController loginController = loader.getController();

        Scene loginScene = new Scene(loginParent);
        Stage stage = new Stage();
        stage.setTitle("Login");
        stage.setScene(loginScene);
        stage.show();
        //commit
        Stage original = (Stage)exit.getScene().getWindow();
        original.close();

    }

    public void backHandler(ActionEvent actionEvent) {
        //
        ////
    }

    public void addHandler(ActionEvent actionEvent) {
    }

    public void deleteHandler(ActionEvent actionEvent) {
    }
}
