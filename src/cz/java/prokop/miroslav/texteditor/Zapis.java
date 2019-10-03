package cz.java.prokop.miroslav.texteditor;

import java.io.*;

public class Zapis {

    public static void zapisDoSouboru(String fileLocation){

        File file =new File(fileLocation);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(fileLocation);

        } catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                assert fileWriter != null;
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }


    }

    public static void zapisDoSouboruAVytvoreni(String fileLocation){
        CreateFile createFile = new CreateFile();

        zapisDoSouboru(createFile.vytvorSoubor(fileLocation));

    }

}
