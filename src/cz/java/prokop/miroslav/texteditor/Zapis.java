package cz.java.prokop.miroslav.texteditor;

import java.io.*;

public class Zapis {

    public static void zapisDoSouboru(String text){

        File file =new File("text.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(text);

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

}
