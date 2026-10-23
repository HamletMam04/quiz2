import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class DateCheckerTest {
    @Test
    void januaryHas31Days() {
        DateChecker dateChecker = new DateChecker();

        assertTrue(dateChecker.has31Days(Month.JANUARY), "January has 31 days.");
    }
}
