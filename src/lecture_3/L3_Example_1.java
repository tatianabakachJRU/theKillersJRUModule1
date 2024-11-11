package lecture_3;

import java.util.Scanner;

public class L3_Example_1 {
    public static void main(String[] args) {
        System.out.print("Введите любое число: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number > 10) { // 8 > 10
            System.out.println("Число больше 10");
            System.out.println(number + 15);
        } else {}

    }
}
