package lecture_16;

import java.io.IOException;

public class FileProcessor {
    public void readFile(String path) {
        try{
            // логика чтения файла
            throw new IOException();
        } catch (IOException e){
            throw new RuntimeException("RuntimeException");
        }
    }

    public void processFile(String path) {
        readFile(path);
        // логика по обработке файла

    }
}
