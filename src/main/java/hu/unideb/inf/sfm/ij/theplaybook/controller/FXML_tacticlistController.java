package hu.unideb.inf.sfm.ij.theplaybook.controller;

import hu.unideb.inf.sfm.ij.theplaybook.model.JpaPageDAO;
import hu.unideb.inf.sfm.ij.theplaybook.model.Page;
import hu.unideb.inf.sfm.ij.theplaybook.model.PageDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class FXML_tacticlistController implements Initializable {
    @FXML
    private TableColumn<Page, String> nameCol;
    @FXML
    private TableView<Page> pageTable;
    private PageDAO dao;
    private ObservableList<Page> pages;

    int lastSelectedIndex = -1;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dao = new JpaPageDAO();

        nameCol.setCellValueFactory(new PropertyValueFactory<Page, String>("title"));

        pages = FXCollections.observableList(dao.getPages());

        pageTable.setItems(pages);
        pageTable.refresh();
    }

    @FXML
    void pageTableClicked(MouseEvent event)
    {
        int index = pageTable.getSelectionModel().getSelectedIndex();

        if (event.getClickCount() == 2 && index == lastSelectedIndex)
        {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FXML_main.fxml"));
                Parent mainParent = loader.load();

                FXML_mainController controller = loader.getController();
                controller.setPage(pages.get(index));

                Scene loginScene = new Scene(mainParent);
                Stage stage = new Stage();
                stage.setTitle("Tactic");
                stage.setScene(loginScene);
                stage.show();
                //commit
                Stage original = (Stage)pageTable.getScene().getWindow();
                original.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        lastSelectedIndex = index;
    }
}
