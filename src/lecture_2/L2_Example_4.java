package module_1.lecture_2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class L2_Example_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        String s1 = "Java";
//        String s2 = new String("Rush");

        String str = scanner.nextLine();
        int number = scanner.nextInt();

        System.out.println(number);
        System.out.println(Integer.parseInt(str) + 12);

        scanner.close();

        BigInteger d;
        BigDecimal s;

    }
}
