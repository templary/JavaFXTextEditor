package cz.java.prokop.miroslav.texteditor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML
    TextArea text = new TextArea();

    private StringBuilder getTextAreaText() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(text.getText()).append("\n");

        return stringBuilder;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void handleButtonCti(javafx.event.ActionEvent event) {
        System.out.println("čtení");

        CteniSouboru cteniSouboru = new CteniSouboru();

        text.setText(cteniSouboru.ctiZeSouboru().toString());


    }

    @FXML
    public void handleButtonZapis(ActionEvent event) {
        System.out.println("Zapisování");

        Zapis zapis = new Zapis();
        zapis.zapisDoSouboru(getTextAreaText().toString());
    }
}
