package lecture_18;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample_2 {
    public static void main(String[] args) {
        try(BufferedOutputStream bufferedOutputStream =
                    new BufferedOutputStream(new FileOutputStream("file_1.txt"), 2)){
            String str = "My cat likes fish and meat!!!";
            byte[] bytes = str.getBytes();
            bufferedOutputStream.write(bytes);
            bufferedOutputStream.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
