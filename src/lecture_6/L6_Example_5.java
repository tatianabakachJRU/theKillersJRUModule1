package lecture_6;

import java.util.Arrays;

public class L6_Example_5 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println(Arrays.toString(numbers));

        for (int number : numbers) {
            number = number * 2;
            System.out.println(number);
        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }

        System.out.println(Arrays.toString(numbers));


    }
}
