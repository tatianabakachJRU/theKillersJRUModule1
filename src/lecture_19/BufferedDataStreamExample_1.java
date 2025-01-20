package lecture_19;

import java.io.*;

public class BufferedDataStreamExample_1 {
    public static void main(String[] args) {
        String filePath = "file.txt";

        writeInToFile(filePath, 120);

        readFromFile(filePath);
    }

    private static void readFromFile(String filePath) {
        try(FileInputStream fis = new FileInputStream(filePath);
            BufferedInputStream bis = new BufferedInputStream(fis);
            DataInputStream dis = new DataInputStream(bis))
        {
            int result = dis.readInt() + 5;
            System.out.println("Result from file: " + result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeInToFile(String filePath, int number) {
        try(DataOutputStream dataOutputStream =
                    new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(filePath)))) {
            dataOutputStream.writeInt(number);
            System.out.println("Integer was written to file: " + number);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
