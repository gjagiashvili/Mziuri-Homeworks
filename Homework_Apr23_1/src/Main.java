import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
//   // PET
//
//   @Override
//    public void start(Stage stage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("/Pet/pet.fxml"));
//        stage.setTitle("ცხოველის არჩევა");
//        stage.setScene(new Scene(root));
//        stage.show();
//    }
//
//    public static void main(String[] args) {
//        launch();
//    }
//
//    //GALLERY
//    @Override
//    public void start(Stage stage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("/Gallery/gallery.fxml"));
//        stage.setTitle("Gallery App");
//        stage.setScene(new Scene(root));
//        stage.show();
//    }
//
//    public static void main(String[] args) {
//        launch();
//    }
    // CARD
@Override
public void start(Stage stage) throws Exception {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Card/card.fxml"));
    Scene scene = new Scene(loader.load());
    stage.setTitle("მისალოცი ბარათი");
    stage.setScene(scene);
    stage.show();
}

    public static void main(String[] args) {
        launch();
    }
}
