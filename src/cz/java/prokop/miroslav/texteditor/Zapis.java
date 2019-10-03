package cz.java.prokop.miroslav.texteditor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Zapis {

    public static void zapisDoSouboru(String fileLocation, StringBuilder stringBuilder) {

        File file = new File(fileLocation);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(stringBuilder.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fileWriter != null;
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public static void zapisDoSouboruAVytvoreni(String fileLocation, StringBuilder stringBuilder) {
        CreateFile createFile = new CreateFile();

        zapisDoSouboru(createFile.vytvorSoubor(fileLocation), stringBuilder);

    }

}
