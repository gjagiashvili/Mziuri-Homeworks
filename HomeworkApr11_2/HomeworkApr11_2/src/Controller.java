import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import java.util.Random;

public class Controller {
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Circle circle;
    @FXML
    private Button jumpButton;

    private int colorIndex = 0;
    private final Color[] colors = {Color.RED, Color.PINK, Color.PURPLE, Color.GREEN};
    private final Random random = new Random();

    @FXML
    private void moveUp() {
        circle.setLayoutY(circle.getLayoutY() - 10);
    }

    @FXML
    private void moveDown() {
        circle.setLayoutY(circle.getLayoutY() + 10);
    }

    @FXML
    private void moveLeft() {
        circle.setLayoutX(circle.getLayoutX() - 10);
    }

    @FXML
    private void moveRight() {
        circle.setLayoutX(circle.getLayoutX() + 10);
    }

    @FXML
    private void moveUpLeft() {
        move(-10, -10);
    }

    @FXML
    private void moveUpRight() {
        move(10, -10);
    }

    @FXML
    private void moveDownLeft() {
        move(-10, 10);
    }

    @FXML
    private void moveDownRight() {
        move(10, 10);
    }

    private void move(double dx, double dy) {
        circle.setLayoutX(circle.getLayoutX() + dx);
        circle.setLayoutY(circle.getLayoutY() + dy);
    }

    @FXML
    private void setRedColor() {
        circle.setFill(Color.RED);
    }

    @FXML
    private void cycleColor() {
        circle.setFill(colors[colorIndex]);
        colorIndex = (colorIndex + 1) % colors.length;
    }

    @FXML
    private void changeBackgroundColor() {
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        anchorPane.setStyle("-fx-background-color: rgb(" + r + "," + g + "," + b + ");");
    }

    @FXML
    private void jumpButtonAction() {
        double newX = random.nextDouble() * (anchorPane.getWidth() - jumpButton.getWidth());
        double newY = random.nextDouble() * (anchorPane.getHeight() - jumpButton.getHeight());
        jumpButton.setLayoutX(newX);
        jumpButton.setLayoutY(newY);
    }
}