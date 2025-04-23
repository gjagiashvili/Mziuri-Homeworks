import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import menubar.MenuController;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("login/login.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

//    @Override
//    public void start(Stage stage) throws Exception {
//        FXMLLoader loader = new FXMLLoader((getClass().getResource("menubar/menu.fxml")));
//        Parent root = loader.load();
//
//        MenuController controller = loader.getController();
//        controller.setStage(stage);
//
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }
}