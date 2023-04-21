package hu.unideb.inf.sfm.ij.theplaybook;

        import javafx.application.Application;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Scene;
        import javafx.stage.Stage;

        import java.io.IOException;
        //import java.sql.SQLException;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("/fxml/FXML_login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 627, 759);
        stage.setTitle("Hello1!33XD4455PLE");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        //startDatabase();
        launch(args);
        //commit
        System.out.println("Működik a commit");
        System.out.println("Ha nem megy szóljatok");

    }
    /*
    private static void startDatabase() throws SQLException {
        new Server().runTool("-webPort", "55555", "-tcp", "-web", "-ifNotExists");
    }*/
}