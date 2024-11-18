package lecture_5;

import java.util.Arrays;

public class L5_Example_2 {
    public static void main(String[] args) {

        int[] myArray = new int[10];
        myArray[0] = 2;
        myArray[2] = 8;
        myArray[7] = 10 * 3 + 6;
        myArray[9] = myArray[0]+ myArray[2];

        System.out.println(Arrays.toString(myArray));

        // адрес первой ячейки + индекс * количество памяти занимаемое
                                        // одним элементом массива
        // 45 + 3 * 4



    }
}
