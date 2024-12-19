package lecture_13;

import java.util.*;

public class L13_Example_1 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        List<Integer> numbers;

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(1);
        integers.add(1);
        LinkedList<Integer> integers1 = new LinkedList<>();
        integers1.add(3);
        integers1.add(3);
        integers1.add(3);
        numbers = integers;
        numbers = integers1;

    }
}
