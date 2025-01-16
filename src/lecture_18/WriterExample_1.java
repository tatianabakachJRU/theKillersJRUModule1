package lecture_18;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterExample_1 {
    public static void main(String[] args) {
        try(BufferedWriter bufferedWriter
                    = new BufferedWriter(new FileWriter("file_1.txt"), 32)){
            bufferedWriter.write("Hello Buffered Writer!!!");
            bufferedWriter.newLine();
            bufferedWriter.newLine();
            bufferedWriter.newLine();
            bufferedWriter.write("The End");
            bufferedWriter.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
