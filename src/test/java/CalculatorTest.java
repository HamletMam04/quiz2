import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    void multiplyHandlesANegativeFactor() {
        Calculator calculator = new Calculator();

        assertEquals(-12, calculator.multiply(4, -3));
    }

    @Test
    void multiplyByZeroReturnsZero() {
        Calculator calculator = new Calculator();

        assertEquals(0, calculator.multiply(9, 0));
    }

    @Test
    void divideReturnsTheIntegerQuotient() {
        Calculator calculator = new Calculator();

        assertEquals(3, calculator.divide(13, 4));
    }

    @Test
    void divideByZeroThrowsArithmeticException() {
        Calculator calculator = new Calculator();

        assertThrows(ArithmeticException.class, () -> calculator.divide(8, 0));
    }
}
