package in.athenaeum;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        //  month can also be an enum
        //  January is value 1 (contrasting java.util.Date's zero-indexed months)
        LocalDate newYear = LocalDate.of(2022, Month.JANUARY, 1);

        //  In contrast to java.util.Date, the DayOfWeek starts with Monday (value 1)
        //  Saturday is 6 and Sunday is 7
        DayOfWeek day = newYear.getDayOfWeek();

        //  getting value
        int dayValue = day.getValue();
    }
}
