package lecture_6;

import java.util.Arrays;

public class L6_Example_4 {
    public static int[] first = {0, 1, 3, 4, 0, 3, 4, 7, 8, 9};
    public static int[] result;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(first));
        result = new int[first.length];
        for (int i : first) {
            result[i] = first[i];
            // [0] = [0]  = 0
            // [1] = [1]  = 1
            // [3] = [3]  = 4
            // [0] = [0]  = 0

        }
        System.out.println(Arrays.toString(result));
    }
}
