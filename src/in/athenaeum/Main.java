package in.athenaeum;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        //  OffsetTime and OffsetDateTime have time offset from UTC, but this is not necessarily zone

        //  OffsetDateTime, ZonedDateTime and Instant all store an instant on the time-line to
        //  nanosecond precision. Instant is the simplest, simply representing the instant.
        //  OffsetDateTime adds to the instant the offset from UTC/Greenwich, which allows
        //  the local date-time to be obtained. ZonedDateTime adds full time-zone rules.

        OffsetTime ot = OffsetTime.of(8, 30, 0, 0, ZoneOffset.ofHoursMinutes(5,30));

        OffsetDateTime odt = OffsetDateTime.now();  //  only +5.30 is added in India

        //  Conversion to ZonedDateTime
        ZonedDateTime zdt1 = odt.toZonedDateTime(); //  No zone yet!, but can be added .withZoneSameInstant(ZoneId)
        ZonedDateTime zdt2 = odt.atZoneSameInstant(ZoneId.of("Asia/Kolkata"));
    }
}
