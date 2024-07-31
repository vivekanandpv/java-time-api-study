package in.athenaeum;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2022, Month.JANUARY, 1, 9, 30, 0);

        //  https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        LocalDateTime parsedLdt = LocalDateTime.parse("15-08-2024 08:30:00 am", DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a"));

        //  outputs am/pm; no uppercase. please check:
        //  https://stackoverflow.com/a/13581910
        //  https://stackoverflow.com/a/13581677
        String s = ldt.format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a"));

        LocalDateTime nextLdt = ldt.plus(Duration.of(8737699, ChronoUnit.SECONDS));


        Duration between = Duration.between(ldt, nextLdt);

        //  Period doesn't work with LocalDateTime
        Period period = Period.between(ldt.toLocalDate(), nextLdt.toLocalDate());
    }
}
