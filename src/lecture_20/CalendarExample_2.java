package lecture_20;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExample_2 {
    public static void main(String[] args) {
        Calendar calendar1 = Calendar.getInstance();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println(calendar1);
        System.out.println(gregorianCalendar);

        GregorianCalendar calendar
                = new GregorianCalendar(2023, 5, 6);
        int era = calendar.get(Calendar.ERA);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.println(era + " " + year + " " + dayOfWeek + " " + hour);
        System.out.println(calendar1.getTime());

        calendar.set(Calendar.YEAR, 2030);
        System.out.println(calendar.getTime());


    }
}
