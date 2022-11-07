import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversePolishNotationCalculatorTest {

    @Test
    public void shouldCalculateAddition() {
        ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();
        assertEquals(2, calculator.calculatePolishNotation("1 1 +"));
    }

    @Test
    public void shouldCalculateAdditionWithNegativeNumber() {
        ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();
        assertEquals(0, calculator.calculatePolishNotation("1 -1 +"));
    }

    @Test
    public void shouldCalculateSubtraction() {
        ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();
        assertEquals(0, calculator.calculatePolishNotation("1 1 -"));
    }

    @Test
    public void shouldCalculateMultiplication() {
        ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();
        assertEquals(6, calculator.calculatePolishNotation("2 3 *"));
    }

    @Test
    public void shouldCalculateSumWithDoubleSpace() {
        ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();
        assertEquals(2, calculator.calculatePolishNotation("1  1 +"));
    }
}