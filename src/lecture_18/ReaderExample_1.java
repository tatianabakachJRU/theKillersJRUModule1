package lecture_18;

import java.io.FileReader;
import java.io.IOException;

public class ReaderExample_1 {
    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader("file.txt")) {
            int data;
            while ((data = fileReader.read()) != -1){
                System.out.print((char) data);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
