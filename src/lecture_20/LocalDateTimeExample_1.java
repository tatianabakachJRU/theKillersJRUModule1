package lecture_20;

import java.time.LocalDate;

public class LocalDateTimeExample_1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate localDate = LocalDate.of(2023, 2, 21);
        System.out.println(localDate);

        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getYear());

        LocalDate localDate1 = now.minusDays(10);
        System.out.println(localDate1);

        if (now.isAfter(localDate1)){
            System.out.println("Now is after localDate1");
        }

    }
}
