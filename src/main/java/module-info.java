module hu.unideb.inf.sfm.ij.theplaybook {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens hu.unideb.inf.sfm.ij.theplaybook to javafx.fxml;
    exports hu.unideb.inf.sfm.ij.theplaybook;
    exports hu.unideb.inf.sfm.ij.theplaybook.controller;
    opens hu.unideb.inf.sfm.ij.theplaybook.controller to javafx.fxml;
}