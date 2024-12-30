package lecture_15;

import java.util.Scanner;

public class SwitchExample_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of operation: ");

        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
            case 2:
            case 3:
                System.out.println("Operations number 1-3");
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
