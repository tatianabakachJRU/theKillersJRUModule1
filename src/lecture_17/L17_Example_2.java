package lecture_17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class L17_Example_2 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new File("file1.txt"));
            Scanner scanner1 = new Scanner(new File("file.txt"))){
            while (scanner.hasNextLine()){
                String string = scanner.nextLine();
                System.out.println(string);
            }
        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
