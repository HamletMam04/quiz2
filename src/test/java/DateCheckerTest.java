import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

class DateCheckerTest {
    @Test
    void januaryHas31Days() {
        DateChecker dateChecker = new DateChecker();

        assertTrue(dateChecker.has31Days(Month.JANUARY), "January has 31 days.");
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {
            "JANUARY", "MARCH", "MAY", "JULY", "AUGUST", "OCTOBER", "DECEMBER"
    })
    void monthsWith31DaysReturnTrue(Month month) {
        DateChecker dateChecker = new DateChecker();

        assertTrue(dateChecker.has31Days(month), () -> month + " should have 31 days.");
    }
}
