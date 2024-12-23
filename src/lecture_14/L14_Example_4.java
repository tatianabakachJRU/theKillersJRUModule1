package lecture_14;

import java.util.*;

public class L14_Example_4 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "a", "b", "c");

        System.out.println(strings);

        Collections.fill(strings, "X");
        System.out.println(strings);

        Set<Integer> integers = new HashSet<>(
                Arrays.asList(3, 1, 4, 100, -250, 8));

        System.out.println(Collections.min(integers));
        System.out.println(Collections.max(integers));

        List<String> strings1 = new ArrayList<>();
        Collections.addAll(strings1, "rex", "fex", "pex", "bex");
        System.out.println(strings1);

        Collections.copy(strings1, strings);
        System.out.println(strings1);


    }
}
