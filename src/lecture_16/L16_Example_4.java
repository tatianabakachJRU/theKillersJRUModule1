package lecture_16;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class L16_Example_4 {
    public static void main(String[] args) {
        recursiveMethod();
        List<Object> list = new ArrayList<>();
        while (true){
            list.add(new Object());
        }
    }

    public static void recursiveMethod(){
        recursiveMethod();
    }
}
