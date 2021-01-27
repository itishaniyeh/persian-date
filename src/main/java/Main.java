
import net.time4j.PlainDate;
import net.time4j.SystemClock;
import persian.date.PersianDate;

public class Main {

    public static void main(String[] args) {
        PlainDate today = SystemClock.inLocalView().today();
        PersianDate pd = new PersianDate();
        System.out.println("jalali date is: " + pd.convert(today));
    }
}
