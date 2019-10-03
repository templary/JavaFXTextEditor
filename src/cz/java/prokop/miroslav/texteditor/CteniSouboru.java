package cz.java.prokop.miroslav.texteditor;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class CteniSouboru {

    public StringBuilder ctiZeSouboru(String fileLocation) { //TODO jak zadávat parametr filename??

        StringBuilder stringBuilder = new StringBuilder();

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = Files.newBufferedReader(Paths.get(fileLocation));
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
