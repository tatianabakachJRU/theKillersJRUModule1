package lecture_4;

import java.util.Scanner;

public class L4_Example_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your name? ");
        String name = scanner.nextLine();
        String menuItem;
        do {
            System.out.println("""
                    *************************
                    What do you want to do?
                    1. Say Hello.
                    2. Say Bye.
                    3. Exit.""");
            menuItem = scanner.nextLine();
            if (menuItem.equals("1")) {
                System.out.println("Hello " + name);
            } else if (menuItem.equals("2")) {
                System.out.println("Bye " + name);
            }
        }
        while (false);
    }
}
