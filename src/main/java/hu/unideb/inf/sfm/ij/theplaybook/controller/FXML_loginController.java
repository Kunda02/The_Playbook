package hu.unideb.inf.sfm.ij.theplaybook.controller;

import hu.unideb.inf.sfm.ij.theplaybook.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;

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
}
