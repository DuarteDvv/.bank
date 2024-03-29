package graphics_comps;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Cliente;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static Cliente currentClient;

    @Override
    public void start(Stage stage) throws IOException {

        scene = new Scene(loadFXML("login"), 250, 300);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void setCurrentClient(Cliente cliente) {
        currentClient = cliente;
    }

    public static Cliente getCurrentClient() {
        return currentClient;
    }

    public static void setDimension(int larg, int alt) {
        scene.getWindow().setWidth(larg);
        scene.getWindow().setHeight(alt);
    }

    public static void main(String[] args) {
        launch();
    }

}