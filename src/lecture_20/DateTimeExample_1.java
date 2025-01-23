package lecture_20;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTimeExample_1 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Date date1 = new Date(125, 3, 6);
        System.out.println(date1);

        Date date2 = new Date(-125, 0, 6, 20, 21,22);
        System.out.println(date2);

        System.out.println(date1.getYear());
        System.out.println(date2.getDay());
        System.out.println(date1.getTime());

        date.setYear(-121);
        System.out.println(date);
        date.setTime(-342743727237L);
        System.out.println(date);

        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat("EEEE, dd MMMM");
        String currentDate = simpleDateFormat.format(new Date());
        System.out.println(currentDate);
    }
}
