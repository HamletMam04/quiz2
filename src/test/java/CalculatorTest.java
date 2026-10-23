import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void sumAddsTwoPositiveNumbers() {
        Calculator calculator = new Calculator();

        assertEquals(5, calculator.sum(2, 3));
    }
}
