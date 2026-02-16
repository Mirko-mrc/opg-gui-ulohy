package sk.spse.uloha1.declarative;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

/**
 * Controller pre FXML súbor – obsahuje logiku aplikácie
 */
public class Controller {

    @FXML
    public TextField cField;

    @FXML
    public TextField fField;

    @FXML
    private void convertCtoF(){
        try {
            double c = Double.parseDouble(cField.getText());
            double f = (1.8 * c) + 32;
            fField.setText(Double.toString(f));
        } catch (NumberFormatException e) {

        }
    }

    @FXML
    public void convertFtoC() {
        try {
            double f = Double.parseDouble(fField.getText());
            double c = (f - 32) / 1.8;
            cField.setText(Double.toString(c));
        } catch (NumberFormatException e) {

        }
    }
}
