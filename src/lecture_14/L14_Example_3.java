package lecture_14;

import java.util.Map;
import java.util.TreeMap;

public class L14_Example_3 {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Apple", 100);
        map.put("Cat", 10);
        map.put("Banana", 1);

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.lowerKey("Apple"));
        System.out.println(map.higherKey("Cat"));

    }
}
