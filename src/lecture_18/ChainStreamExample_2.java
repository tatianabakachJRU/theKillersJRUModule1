package lecture_18;

import java.io.*;

public class ChainStreamExample_2 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader =
                     new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter =
                     new BufferedWriter(new FileWriter("file_2.txt"))) {
            System.out.println("Введите текст(exit для выхода): ");
            String line;

            while (!(line = bufferedReader.readLine()).equalsIgnoreCase("exit")) {
                String upperCaseLine = line.toUpperCase();
                bufferedWriter.write(upperCaseLine);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
