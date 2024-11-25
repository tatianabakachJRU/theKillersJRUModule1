package lecture_7;

import java.util.Scanner;

public class L7_Example_6 {
    public static void main(String[] args) {
        int[] numbers = getNumbers();

        int result = numbers[0] + numbers[1];

        System.out.println("Result: " + result);
    }

    private static int[] getNumbers() {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int[2];
        System.out.println("First number: ");
        numbers[0] = Integer.parseInt(scanner.nextLine());
        System.out.println("Second number: ");
        numbers[1] = Integer.parseInt(scanner.nextLine());
        return numbers;
    }
}
