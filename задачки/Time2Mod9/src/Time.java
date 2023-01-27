import java.util.Calendar;

public class Time {
    int millis = 999;
    public void getTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        calendar.add(Calendar.MILLISECOND, 1);
        System.out.println(calendar.getTime());
    }
}
