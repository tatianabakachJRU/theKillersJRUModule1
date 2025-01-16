package lecture_18;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ArrayStreamExample_1 {
    public static void main(String[] args) {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            String str = "Hello cats!!!";
            byteArrayOutputStream.write(str.getBytes());
            byte[] byteArray = byteArrayOutputStream.toByteArray();

            try (ByteArrayInputStream byteArrayInputStream
                         = new ByteArrayInputStream(byteArray)) {
                int byteRead;
                while ((byteRead = byteArrayInputStream.read()) != -1){
                    System.out.print((char) byteRead);
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
