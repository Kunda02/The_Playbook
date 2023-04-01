package hu.unideb.inf.sfm.ij.theplaybook;

        import javafx.application.Application;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Scene;
        import javafx.stage.Stage;

        import java.io.IOException;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("/fxml/Scene.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello1!33XD");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
        //commit
        System.out.println("Működik a commit");
        System.out.println("Ha nem megy szóljatok");

    }
}