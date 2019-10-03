package cz.java.prokop.miroslav.texteditor;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public String vytvorSoubor(String path){
        File file = new File(path);
        try {
            if (file.createNewFile()){
                return path;
            }else {
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public boolean isFileExist(String path){
        File file = new File(path);
        if (file.exists()){
            return true;
        }else{
            return false;
        }
    }
}
