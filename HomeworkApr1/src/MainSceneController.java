import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.event.ActionEvent;

public class MainSceneController {

    private int clickCount = 0;

    public void switchToYellow(ActionEvent event) throws Exception {
        switchColorScene("YELLOW");
    }

    public void switchToRed(ActionEvent event) throws Exception {
        switchColorScene("RED");
    }

    public void switchToGreen(ActionEvent event) throws Exception {
        switchColorScene("GREEN");
    }

    public void handleClick(ActionEvent event) {
        clickCount++;
        if (clickCount == 5) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Exit Confirmation");
            alert.setHeaderText("Do you want to exit?");
            alert.setContentText("Choose your option.");

            ButtonType ok = new ButtonType("OK");
            ButtonType cancel = new ButtonType("Cancel");
            alert.getButtonTypes().setAll(ok, cancel);

            alert.showAndWait().ifPresent(type -> {
                if (type == ok) {
                    System.exit(0);
                } else {
                    clickCount = 0;
                }
            });
        }
    }

    private void switchColorScene(String color) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("color.fxml"));
        Parent root = loader.load();

        ColorSceneController controller = loader.getController();
        controller.setColor(color);

        Main.newStage.setScene(new Scene(root, 400, 300));
    }
}
