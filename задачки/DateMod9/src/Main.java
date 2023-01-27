import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //Date date = new Date(11111111111L);
        new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");

        System.out.println("Сейчас " + dateFormat.format(calendar.getTime()));
        //System.out.println(date);
    }
}