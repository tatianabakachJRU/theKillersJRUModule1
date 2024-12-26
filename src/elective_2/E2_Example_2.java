package elective_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class E2_Example_2 {
    public static void main(String[] args) {
        int numberOfOperations = 1000;

        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfOperations; i++) {
            arrayList.add(numberOfOperations);
        }
        for (int i = 0; i < numberOfOperations; i++) {
            arrayList.add(1, i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList: " + (endTime - startTime));

        List<Integer> linkedList = new LinkedList<>();
        startTime = System.nanoTime();
        for (int i = 0; i < numberOfOperations; i++) {
            linkedList.add(numberOfOperations);
        }
        for (int i = 0; i < numberOfOperations; i++) {
            linkedList.add(1, i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList: " + (endTime - startTime));


    }
}
