import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.beans.value.ChangeListener;

import java.util.HashMap;
import java.util.Map;

public class CurrencyApp {

    @FXML private ChoiceBox<String> fromChoice;
    @FXML private ChoiceBox<String> toChoice;
    @FXML private Spinner<Double> amountSpinner;
    @FXML private Label resultLabel;

    private final Map<String, Double> rates = new HashMap<>();

    @FXML
    public void initialize() {
        rates.put("GEL", 1.00);
        rates.put("USD", 2.83);
        rates.put("EUR", 2.80);
        rates.put("GBP", 3.50);

        fromChoice.getItems().addAll(rates.keySet());
        toChoice.getItems().addAll(rates.keySet());
        fromChoice.setValue("USD");
        toChoice.setValue("GEL");

        amountSpinner.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(0, 1000000, 1, 1));

        ChangeListener<Object> listener = (obs, oldVal, newVal) -> convert();
        fromChoice.getSelectionModel().selectedItemProperty().addListener(listener);
        toChoice.getSelectionModel().selectedItemProperty().addListener(listener);
        amountSpinner.valueProperty().addListener(listener);

        convert();

    }

    private void convert() {
        String from = fromChoice.getValue();
        String to = toChoice.getValue();
        Double amount = amountSpinner.getValue();

        if (amount < 0) {
            resultLabel.setText("ERROR! Amount cant be under 0");
            return;
        }

        double rateFrom = rates.get(from);
        double rateTo = rates.get(to);
        double result = amount * rateFrom / rateTo;

        resultLabel.setText(" თქვენ იყიდით " + result + " " + to + "-ს ");
    }
}
