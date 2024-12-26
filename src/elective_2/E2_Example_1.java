package elective_2;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class E2_Example_1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(2,4,6));

        list.add(10);
        list.add(20);
        list.add(100);

        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.remove(Integer.valueOf(20));
        System.out.println(list);

        for (Integer integer : list) {
            System.out.println(integer);

        }






    }
}
