package lecture_7;

import java.util.Arrays;

public class L7_Example_2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        for (String arg : args) {
            System.out.println(arg);
        }
        System.out.println(args[0]);
    }
}
