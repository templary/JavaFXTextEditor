package cz.java.prokop.miroslav.texteditor;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class CteniSouboru {

    public StringBuilder ctiZeSouboru() { //TODO jak zadávat parametr filename??

        StringBuilder stringBuilder = new StringBuilder();

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = Files.newBufferedReader(Paths.get("text.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            String line;
            assert bufferedReader != null;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringBuilder;
    }
}
