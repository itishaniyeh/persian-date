package persian.date;

import java.util.Locale;
import net.time4j.PlainDate;
import net.time4j.calendar.PersianCalendar;
import net.time4j.format.expert.ChronoFormatter;
import net.time4j.format.expert.PatternType;

public class PersianDate {

    public String convert(PlainDate plainDate) {
        ChronoFormatter<PersianCalendar> formatter
                = ChronoFormatter.setUp(PersianCalendar.axis(), new Locale("en"))
                .addPattern("yyyy/MM/dd", PatternType.CLDR_DATE).build();
        PersianCalendar jalali = plainDate.transform(PersianCalendar.class);
//        System.out.println(formatter.format(jalali));
        return formatter.format(jalali);

    }
}
