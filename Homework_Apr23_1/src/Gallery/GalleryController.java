package Gallery;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GalleryController {

    @FXML private ImageView imageView;
    @FXML private Button backButton, nextButton;

    private final String[] imagePath = new String[3];
    private int currentIndex = 0;

    @FXML
    public void initialize() {
        for (int i = 0; i < 3; i++) {
            imagePath[i] = "/Gallery/Images/image" + (i + 1) + ".jpg";
        }
        updateImage();
    }

    private void updateImage() {
        Image image = new Image(getClass().getResourceAsStream(imagePath[currentIndex]));
        imageView.setImage(image);

        backButton.setDisable(currentIndex == 0);
        nextButton.setDisable(currentIndex == imagePath.length - 1);
    }

    @FXML
    private void goBack() {
        if (currentIndex > 0) {
            currentIndex--;
            updateImage();
        }
    }

    @FXML
    private void goFront() {
        if (currentIndex < imagePath.length - 1) {
            currentIndex++;
            updateImage();
        }
    }
}
