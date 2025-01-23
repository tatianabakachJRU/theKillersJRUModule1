package lecture_20;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample_5 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime localDateTime =
                LocalDateTime.of(2023, 12, 4, 13, 45, 7, 89);
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = now.plusDays(5).plusHours(2);
        System.out.println(localDateTime1);


    }
}
