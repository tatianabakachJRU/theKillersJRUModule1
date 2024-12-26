package elective_2;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class E2_Example_3 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("A");
        queue.add("E");
        queue.add("C");
        System.out.println(queue);

        System.out.println(queue.peek());

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        System.out.println(queue.isEmpty());
    }
}
