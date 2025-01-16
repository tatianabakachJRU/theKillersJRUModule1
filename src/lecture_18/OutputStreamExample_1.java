package lecture_18;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample_1 {
    public static void main(String[] args) {
        try(FileOutputStream fileOutputStream = new FileOutputStream("file_1.txt")){
            String str = "My cat likes fish!!!";

            fileOutputStream.write(str.getBytes());
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
