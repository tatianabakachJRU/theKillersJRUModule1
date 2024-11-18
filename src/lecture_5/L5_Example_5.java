package lecture_5;

import java.util.Arrays;

public class L5_Example_5 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));

        System.out.println("*********************");

        int[] num1 = {1, 2, 3};
        int[] num2 = {1, 2, 3};
        System.out.println(Arrays.equals(num1, num2));
        System.out.println(num1[0] == num1[1]);

        String[] strs1 = {"Ania", "Vania", "Ania"};
        String[] strs2 = {"Tania", "Vania", "Ania"};
        System.out.println(Arrays.equals(strs1, strs2));
        System.out.println(strs1[1].equals(strs1[0]));

        System.out.println("**************");
        int[] numbersForFill = new int[5];
        Arrays.fill(numbersForFill, 100);
        System.out.println(Arrays.toString(numbersForFill));

        String[] stringsForFill = new String[10];
        Arrays.fill(stringsForFill, 3, 7, "Ania");
        System.out.println(Arrays.toString(stringsForFill));

        System.out.println("*********************");

        int[] numbersForSort = {-100, 2, 0, 15, -16, 800, 3};
        System.out.println(Arrays.toString(numbersForSort));
        Arrays.sort(numbersForSort);
        System.out.println(Arrays.toString(numbersForSort));
        Arrays.sort(strs2);
        System.out.println(Arrays.toString(strs2));

        System.out.println("********************");

        int[] numbersForCopy = {2, 4, 6, 8, 10};
        int[] numbersCopy = Arrays.copyOf(numbersForCopy, 3);
        System.out.println(Arrays.toString(numbersCopy));

        int[] numbersCopyRange = Arrays.copyOfRange(numbersForCopy, 1, 3);
        System.out.println(Arrays.toString(numbersCopyRange));

    }
}
