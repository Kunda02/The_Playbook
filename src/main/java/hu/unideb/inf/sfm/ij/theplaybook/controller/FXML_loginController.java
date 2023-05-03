package hu.unideb.inf.sfm.ij.theplaybook.controller;
import hu.unideb.inf.sfm.ij.theplaybook.model.JpaUserDAO;
import hu.unideb.inf.sfm.ij.theplaybook.model.User;
import hu.unideb.inf.sfm.ij.theplaybook.model.UserDAO;
import hu.unideb.inf.sfm.ij.theplaybook.MainApp;
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
        /*var user = new User();
        user.setUsername("test");
        user.setPassword("elek");*/

        try{
            loginBtn.setDisable(true);
            
            UserDAO uDAO = new JpaUserDAO();
            //uDAO.saveUser(user);
            
            loginStatus.setText("Bejelentkezés...");

            MainApp.u = uDAO.Login(loginName.getText(), loginPassword.getText());
        }
        catch(Exception e)
        {
            e.printStackTrace();

            loginBtn.setDisable(false);
            loginStatus.setText("Bejelentkezés elbukott!");
            return;
        }

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FXML_tacticlist.fxml"));
        Parent mainParent = loader.load();

        FXML_tacticlistController mainController = loader.getController();
        //mainController.setDao(pDAO);

        Scene mainScene = new Scene(mainParent);
        Stage stage = new Stage();
        stage.setTitle("Oldal");
        stage.setScene(mainScene);
        stage.show();
        //commit
        Stage original = (Stage) loginName.getScene().getWindow();
        original.close();

        /*FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FXML_main.fxml"));
        Parent mainParent = loader.load();

        FXML_mainController mainController = loader.getController();
        //mainController.setDao(pDAO);

        Scene mainScene = new Scene(mainParent);
        Stage stage = new Stage();
        stage.setTitle("Oldal");
        stage.setScene(mainScene);
        stage.show();
        //commit
        Stage original = (Stage) loginName.getScene().getWindow();
        original.close();*/

        /*
        if ((nev.equals(loginName.getText())) && (jelszo.equals(loginPassword.getText()))) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FXML_main.fxml"));
            Parent mainParent = loader.load();

            FXML_mainController mainController = loader.getController();
            //mainController.setDao(pDAO);

            Scene mainScene = new Scene(mainParent);
            Stage stage = new Stage();
            stage.setTitle("Oldal");
            stage.setScene(mainScene);
            stage.show();
            //commit
            Stage original = (Stage) loginName.getScene().getWindow();
            original.close();
        }*/
        /*else {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FXML_login.fxml"));
            Parent loginParent = loader.load();

            //FXML_loginController loginController = loader.getController();

            Scene loginScene = new Scene(loginParent);
            Stage stage = new Stage();
            stage.setTitle("Login");
            stage.setScene(loginScene);
            stage.show();
            //loginStatus.setText("Hibás jelszó vagy felhasználói név! Próbálja újra!");
            //commit
            Stage original = (Stage)loginBtn.getScene().getWindow();
            original.close();
        }*/
    }
}
