package in.athenaeum;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        ZonedDateTime today = ZonedDateTime.now();
        ZonedDateTime newYearInIndia = ZonedDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0, 0), ZoneId.of("Asia/Kolkata"));

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();

        //  Zone conversion
        ZonedDateTime zdtInPdt = newYearInIndia.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
    }
}
