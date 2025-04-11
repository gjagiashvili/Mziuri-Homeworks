import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ColorSceneController {

    @FXML
    private Label colorLabel;

    @FXML
    private VBox root;

    public void setColor(String color) {
        colorLabel.setText(color + " SCENE");

        Color fxColor = switch (color) {
            case "YELLOW" -> Color.YELLOW;
            case "RED" -> Color.RED;
            case "GREEN" -> Color.LIGHTGREEN;
            default -> Color.WHITE;
        };

        root.setBackground(new Background(new BackgroundFill(fxColor, null, null)));
    }

    public void goBack() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        Main.newStage.setScene(new Scene(root, 400, 300));
    }
}
