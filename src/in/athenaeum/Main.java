package in.athenaeum;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        LocalDate newYear = LocalDate.of(2022, Month.JANUARY, 1);


        //  All the date time apis in java.time are immutable
        //  General additions (also check minus)
        //  plus and minus do not mutate, but produce new instances
        LocalDate result1 = newYear.plus(Period.ofDays(12));
        LocalDate result2 = newYear.plus(12, ChronoUnit.DAYS);
        LocalDate result3 = newYear.plus(Period.ofWeeks(2));

        //  Specific additions (also check minus)
        LocalDate result4 = newYear.plusDays(2);
        LocalDate result5 = newYear.plusMonths(1);
        LocalDate result6 = newYear.plusYears(1);
    }
}
