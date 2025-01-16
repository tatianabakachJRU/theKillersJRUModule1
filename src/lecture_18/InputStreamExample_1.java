package lecture_18;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamExample_1 {
    public static void main(String[] args) {
        String fileName = "file.txt";

        try(FileInputStream stream = new FileInputStream(fileName)){
            int available = stream.available();
            System.out.println(available);
            int data;
            while ((data = stream.read()) != -1){
                System.out.print((char) data);
            }
        } catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
