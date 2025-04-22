package Card;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import java.util.Random;

public class CardController {

    @FXML private CheckBox balloonCheckBox;
    @FXML private CheckBox heartCheckBox;
    @FXML private CheckBox starCheckBox;
    @FXML private Label emojiTextLabel;

    @FXML private void generateCard() {
        Random random = new Random();
        int count = random.nextInt(60);

        StringBuilder emojiBuilder = new StringBuilder();

        for (int i = 0; i < count; i++) {
            String emoji = "";
            if (balloonCheckBox.isSelected() && heartCheckBox.isSelected() && starCheckBox.isSelected()) {
                emoji = randomEmoji(new String[]{"🎈", "❤️", "⭐"});
            } else if (balloonCheckBox.isSelected() && heartCheckBox.isSelected()) {
                emoji = randomEmoji(new String[]{"🎈", "❤️"});
            } else if (balloonCheckBox.isSelected() && starCheckBox.isSelected()) {
                emoji = randomEmoji(new String[]{"🎈", "⭐"});
            } else if (heartCheckBox.isSelected() && starCheckBox.isSelected()) {
                emoji = randomEmoji(new String[]{"❤️", "⭐"});
            } else if (balloonCheckBox.isSelected()) {
                emoji = "🎈";
            } else if (heartCheckBox.isSelected()) {
                emoji = "❤️";
            } else if (starCheckBox.isSelected()) {
                emoji = "⭐";
            }

            emojiBuilder.append(emoji);
        }

        emojiTextLabel.setText(emojiBuilder.toString());
    }

    private String randomEmoji(String[] emojis) {
        Random random = new Random();
        return emojis[random.nextInt(emojis.length)];
    }
}
