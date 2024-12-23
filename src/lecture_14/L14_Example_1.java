package lecture_14;

import java.util.*;

public class L14_Example_1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("DraKo", 100);
        map.put("Grendex", 150);
        map.put("Treex", 10);  //
        map.put("Treex", 2700); // treex есть

        System.out.println(map.get("DraKo"));

        if(map.containsKey("Treex")){
            System.out.println("Super!!!!" + map.get("Treex"));
        }

        System.out.println(map.size());

        map.remove("DraKo");

        for (String key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}
