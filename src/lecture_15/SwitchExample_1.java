package lecture_15;

import java.util.Scanner;

public class SwitchExample_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of operation: ");

        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                System.out.println("Operation number 1");
                break;
            case 2:
                System.out.println("Operation number 2");
                break;
            case 3:
                System.out.println("Operation number 3");
                break;
            case 4:
                System.out.println("Operation number 4");
                break;
            default:
                System.out.println("Wrong!!!!");
                break;
        }
    }
}
