package lecture_14;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class L14_Example_2 {
    public static void main(String[] args) {
        Comparator<String> stringLengthComparator = new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());

            }
        };

        Map<String, Integer> map = new TreeMap<>(stringLengthComparator);

        map.put("Apple", 100);
        map.put("Cat", 10);
        map.put("Banana", 1);

        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }


    }
}
