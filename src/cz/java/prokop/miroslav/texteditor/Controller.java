package cz.java.prokop.miroslav.texteditor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML
    TextArea text = new TextArea();
    @FXML
    TextField path = new TextField();

    private StringBuilder getTextAreaText() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(text.getText()).append("\n");
        return stringBuilder;
    }

    private String getFileLocation() {
        String cesta = path.getText();
        return cesta;
    }


    @FXML
    public void handleButtonCti(javafx.event.ActionEvent event) {
        System.out.println("čtení");

        CteniSouboru cteniSouboru = new CteniSouboru();

        text.setText(cteniSouboru.ctiZeSouboru(getFileLocation()).toString());


    }

    @FXML
    public void handleButtonZapis(ActionEvent event) {
        System.out.println("Zapisování");

        Zapis zapis = new Zapis();
        CreateFile createFile = new CreateFile();
        if (createFile.isFileExist(getFileLocation())){
            zapis.zapisDoSouboru(getTextAreaText().toString());
        }else {
            createFile.vytvorSoubor(getFileLocation());
            zapis.zapisDoSouboru(getTextAreaText().toString());
        }

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
