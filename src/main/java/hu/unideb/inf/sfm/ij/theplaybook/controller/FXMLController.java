package hu.unideb.inf.sfm.ij.theplaybook.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FXMLController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
