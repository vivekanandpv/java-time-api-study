package in.athenaeum;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalAdjusters;

public class Main {

    public static void main(String[] args) {
	    //  Instant is a point on the eternal timeline
        //  This has no meaning per se to humans
        //  This way of profiling for performance may not be a good approach
        Instant startInstant = Instant.now();

        for (int i = 0; i < 1_000_000_000; i++) {
            //  some code
        }

        Instant endInstant = Instant.now();

        //  Duration is a measure between two Temporal instances
        //  Instant implements Temporal
        //  https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/temporal/Temporal.html
        Duration duration = Duration.between(startInstant, endInstant);
        System.out.println(duration.toNanos()); //  .toSeconds() was introduced in Java 9, use .getSeconds() in Java 8
    }
}
