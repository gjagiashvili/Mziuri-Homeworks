package Pet;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class PetControl {

    @FXML private RadioButton catOption, dogOption, bunnyOption, birdOption;
    @FXML private TextField nameField;
    @FXML private Label resultLabel;

    @FXML
    private void handleSelection() {
        String petType = "";
        if (catOption.isSelected()) petType = "კატა";
        else if (dogOption.isSelected()) petType = "ძაღლი";
        else if (bunnyOption.isSelected()) petType = "კურდღელი";
        else if (birdOption.isSelected()) petType = "ჩიტი";

        String name = nameField.getText().trim();

        if (petType.isEmpty() || name.isEmpty()) {
            resultLabel.setText("შეავსეთ ყველა ველი!");
        } else {
            resultLabel.setText("შენ გყავს " + petType + " რომელსავ ქვია " + name);
        }
    }
}
