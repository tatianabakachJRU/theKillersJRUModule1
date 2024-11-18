package lecture_5;

public class L5_Example_4 {
    public static void main(String[] args) {
        //1
        int[] numbers;
        numbers = new int[10];
        //2
        int[] numbers1 = new int[10];
        //3
        int[] numbers3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i : numbers3) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Number: " + i);
        }

        System.out.println("*************");

        numbers3[2] = 100;

        for (int i = 0; i < 5; i++) {
            if (numbers3[i] % 2 == 0) {
                continue;
            }
            System.out.println("Number: " + numbers3[i]);
        }


    }
}
