package in.athenaeum;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        LocalDate newYear = LocalDate.of(2022, Month.JANUARY, 1);
        LocalDate financialStart = LocalDate.of(2022, Month.APRIL, 1);

        //  Period is year, month, and day
        //  Period implements TemporalAmount interface
        //  https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/temporal/TemporalAmount.html
        Period q4 = Period.between(newYear, financialStart);
        System.out.println(q4.getMonths());

        //  Creating period
        Period twoMonthsAnd5Days = Period.ofMonths(2).plusDays(5);

        //  LocalDate plus (minus) can also work with Period (as TemporalAmount)
        newYear.plus(twoMonthsAnd5Days);
    }
}
