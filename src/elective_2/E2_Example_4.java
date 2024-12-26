package elective_2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class E2_Example_4 {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(1);
        deque.addLast(30);

        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
    }
}
