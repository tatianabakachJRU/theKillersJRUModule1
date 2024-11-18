package lecture_5;

import java.util.Scanner;

public class L5_Example_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] myArray;
        if (a < 10)
            myArray = new int[10];
        else
            myArray = new int[20];
        System.out.println("Array length: " + myArray.length);
        for (int j : myArray) {
            System.out.println(j);
        }
    }
}
