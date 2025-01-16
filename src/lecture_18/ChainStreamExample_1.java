package lecture_18;

import java.io.*;

public class ChainStreamExample_1 {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader =
                    new BufferedReader(new FileReader("file.txt"));
        BufferedWriter bufferedWriter =
                new BufferedWriter(new FileWriter("file_1.txt"))){
            String line;

            while ((line = bufferedReader.readLine()) != null){
                String upperCaseLine = line.toUpperCase();
                bufferedWriter.write(upperCaseLine);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
