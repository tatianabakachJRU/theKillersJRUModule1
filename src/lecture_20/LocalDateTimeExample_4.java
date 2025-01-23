package lecture_20;

import java.time.LocalTime;

public class LocalDateTimeExample_4 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime localTime = LocalTime.of(14, 30);
        System.out.println(localTime);

        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());

        LocalTime localTime1 = now.plusHours(2);
        System.out.println(localTime1);



    }
}
