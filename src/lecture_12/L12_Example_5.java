package lecture_12;

import java.util.ArrayList;

public class L12_Example_5 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        System.out.println(fruits.size());

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println(fruits.size());

        fruits.add(1, "Carrot");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        fruits.set(2, "Blueberry");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 0 1 2 3 4 5 6
        // 1 3 5 6

        fruits.remove(2);
        fruits.remove("Apple");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println(fruits.get(1));


    }
}
