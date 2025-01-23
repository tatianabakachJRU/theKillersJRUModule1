package lecture_20;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample_7 {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(2023, 2, 21, 20, 21, 22, 3, ZoneId.of("Europe/Paris"));
        System.out.println(zonedDateTime);

        ZonedDateTime now1 = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println(now1);

    }
}
