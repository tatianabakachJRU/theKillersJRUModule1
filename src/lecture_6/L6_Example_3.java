package lecture_6;

import java.util.Arrays;

public class L6_Example_3 {
    public static void main(String[] args) {
        int[][][] myArray =
                {
                        {
                                {1, 2, 3},
                                {4, 5, 6}
                        },
                        {
                                {7, 8, 9},
                                {10, 11, 12}
                        }
                };

        myArray[1][1][1] = 1000;

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                for (int k = 0; k < myArray[i][j].length; k++) {
                    System.out.print(myArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("*********************");
        System.out.println(Arrays.deepToString(myArray));
    }
}
