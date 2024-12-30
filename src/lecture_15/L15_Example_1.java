package lecture_15;

import java.util.Arrays;

public class L15_Example_1 {
    public static void main(String[] args) {
        Day day = Day.TUESDAY;
        System.out.println(day);

        if(day == Day.SATURDAY || day.equals(Day.valueOf("SUNDAY"))){
            System.out.println("I'm resting");
        } else {
            System.out.println("I need to work a little");
        }

        Day[] values = Day.values();
        System.out.println(Arrays.toString(values));

        System.out.println(Day.FRIDAY.ordinal());
    }
}
