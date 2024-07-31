package in.athenaeum;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2024, 1, 1);
        LocalDate ld1 = LocalDate.of(2024, 3, 31);
        LocalDate ld2 = LocalDate.of(2024, 1, 1);

        //  these APIs work with LocalTime, LocalDateTime, ZonedDateTime as well
        boolean r1 = ld.isBefore(ld1);
        boolean r2 = ld1.isAfter(ld);
        boolean r3 = ld1.isEqual(ld2);
    }
}
