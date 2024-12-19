package lecture_13;

import java.util.*;

public class L13_Example_3 {
    public static void main(String[] args) {
        List<String> dogs = new ArrayList<>(
                Arrays.asList("Rex", "Barny", "Mopsy")
        );

        Iterator<String> iterator = dogs.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

        iterator = dogs.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if(next.equals("Barny")){
                iterator.remove();
            }
        }
        System.out.println(dogs);

        for (String dog : dogs) {
            System.out.println(dog);
        }

    }
}
