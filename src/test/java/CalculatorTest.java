import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void sumAddsTwoPositiveNumbers() {
        Calculator calculator = new Calculator();

        assertEquals(5, calculator.sum(2, 3));
    }

    @Test
    void subtractFindsTheDifferenceOfPositiveNumbers() {
        Calculator calculator = new Calculator();

        assertEquals(3, calculator.subtract(7, 4));
    }

    @Test
    void subtractHandlesNegativeNumbers() {
        Calculator calculator = new Calculator();

        assertEquals(-10, calculator.subtract(-4, 6));
    }
}
