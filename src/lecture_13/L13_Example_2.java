package lecture_13;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class L13_Example_2 {
    public static void main(String[] args) {
        Set<String> fruits = new TreeSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Melon");
        fruits.add("Cherry");
        fruits.add("Banana");
        fruits.add("Banana");
        fruits.add("Banana");

        System.out.println("Fruits HashSet: " + fruits);

        if(fruits.contains("Apple")){
            System.out.println("Apple is in the set");
        } else {
            System.out.println("Apple is not in the set");

        }

        fruits.remove("Cherry");
        System.out.println(fruits);

        System.out.println(fruits.size());

        String oldValue = "Melon";
        String newValue = "Melon111";

        if (fruits.contains(oldValue)){
            fruits.remove(oldValue);
            fruits.add(newValue);
        }

        System.out.println(fruits);

//        fruits.clear();
//        System.out.println(fruits.size());



    }
}
