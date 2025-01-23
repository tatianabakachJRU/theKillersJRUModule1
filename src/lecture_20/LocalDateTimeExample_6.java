package lecture_20;

import java.time.Instant;

public class LocalDateTimeExample_6 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);

        Instant instant = Instant.ofEpochSecond(1609724234L);
        System.out.println(instant);

        long epochMilli = now.toEpochMilli();
        System.out.println(epochMilli);

        Instant instant1 = now.plusSeconds(60);

        if(instant.isBefore(instant1)){
            System.out.println("");
        }


    }
}
