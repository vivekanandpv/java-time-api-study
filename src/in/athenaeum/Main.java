package in.athenaeum;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        //  Use LocalDate for representing only the dates
        LocalDate newYear = LocalDate.of(2022, 1, 1); //  see LocalDate.now() and other factory methods

        //  Use LocalTime for representing only times (without timezone or daylight saving)
        LocalTime noon = LocalTime.NOON;
        LocalTime officeStart = LocalTime.of(9, 30, 0);

        //  Parsing dates
        //  https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        LocalDate diwali = LocalDate.parse("24-10-2022", DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        //  Formatting the output
        String diwaliAsString = diwali.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
}
