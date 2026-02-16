package sk.spse.uloha1.procedural;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.input.KeyEvent;

///
/// Trieda pre procedurálne vytvorené GUI
///
/// Upravujte túto triedu
///

public class Application extends javafx.application.Application {
    public TextField cField;
    public TextField fField;

    @Override
    public void start(Stage primaryStage) {
        Label labelC = new Label("Stupne Celsia:");
        cField = new TextField("0");
        Label labelCUnit = new Label("°C");

        HBox rowC = new HBox(5, labelC, cField, labelCUnit);
        rowC.setAlignment(Pos.CENTER_RIGHT);
        rowC.setPadding(new Insets(10));

        Label labelF = new Label("Stupne Fahrenheit:");
        fField = new TextField("0");
        Label labelFUnit = new Label("°F");

        HBox rowF = new HBox(5, labelF, fField, labelFUnit);
        rowF.setAlignment(Pos.CENTER_RIGHT);
        rowF.setPadding(new Insets(10));

        VBox root = new VBox(0, rowC, rowF);

        Scene scene = new Scene(root, 420, 120);

        cField.setOnKeyTyped(e -> convertCtoF());
        fField.setOnKeyTyped(e -> convertFtoC());

        primaryStage.setTitle("Procedural Application 1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
        private void convertCtoF(){
            try {
                double c = Double.parseDouble(cField.getText());
                double f = (1.8 * c) + 32;
                fField.setText(Double.toString(f));
            } catch (NumberFormatException ignored) {

            }
        }

        private void convertFtoC() {
            try {
                double f = Double.parseDouble(fField.getText());
                double c = (f - 32) / 1.8;
                cField.setText(Double.toString(c));
            } catch (NumberFormatException ignored) {

            }
        }
}