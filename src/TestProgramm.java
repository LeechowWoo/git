import java.util.Calendar;
import java.util.Date;

public class TestProgramm {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
//        System.out.println(c);
        int i=c.get(Calendar.YEAR);
        System.out.println(i);
    }
}