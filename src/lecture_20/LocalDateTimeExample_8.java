package lecture_20;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample_8 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2023, 2, 21);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM");
        String format = localDate.format(formatter);
        System.out.println(format);
    }
}
