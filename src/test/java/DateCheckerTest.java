import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
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

    /**
     * February returns false because it has 28 or 29 days, never 31 days.
     */
    @ParameterizedTest
    @EnumSource(value = Month.class, names = {
            "FEBRUARY", "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"
    })
    void monthsWithout31DaysReturnFalse(Month month) {
        DateChecker dateChecker = new DateChecker();

        assertFalse(dateChecker.has31Days(month), () -> month + " should not have 31 days.");
    }

    @Test
    void nullMonthIsRejected() {
        DateChecker dateChecker = new DateChecker();

        assertThrows(NullPointerException.class, () -> dateChecker.has31Days(null),
                "A null month must be rejected.");
    }
}
