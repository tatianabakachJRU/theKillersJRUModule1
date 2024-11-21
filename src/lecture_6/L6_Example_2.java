package lecture_6;

import java.util.Arrays;

public class L6_Example_2 {
    public static void main(String[] args) {
        int[][] ints = new int[4][];

        ints[0] = new int[2];
        ints[1] = new int[3];
        ints[2] = new int[1];
        ints[3] = new int[2];

        ints[0][0] = 100;
        ints[1][1] = 1;
        ints[2][0] = 8;
        ints[3][1] = 11;

        for (int i = 0; i < ints.length; i++) { // по внешнему массиву
            for (int j = 0; j < ints[i].length; j++) { // по внутренним массивам
                System.out.print(ints[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("*************");
        System.out.println(Arrays.deepToString(ints));
    }
}
