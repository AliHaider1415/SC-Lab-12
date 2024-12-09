import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class task2_test {

    @Test
    void testAddition() {
        assertEquals(7.0, task2.calculate(3, 4, '+'), "3 + 4 should equal 7");
        assertEquals(0.0, task2.calculate(5, -5, '+'), "5 + (-5) should equal 0");
    }

    @Test
    void testSubtraction() {
        assertEquals(-1.0, task2.calculate(3, 4, '-'), "3 - 4 should equal -1");
        assertEquals(10.0, task2.calculate(5, -5, '-'), "5 - (-5) should equal 10");
    }

    @Test
    void testMultiplication() {
        assertEquals(12.0, task2.calculate(3, 4, '*'), "3 * 4 should equal 12");
        assertEquals(0.0, task2.calculate(5, 0, '*'), "5 * 0 should equal 0");
    }

    @Test
    void testDivision() {
        assertEquals(2.0, task2.calculate(6, 3, '/'), "6 / 3 should equal 2");
        assertEquals(-2.0, task2.calculate(6, -3, '/'), "6 / (-3) should equal -2");
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> task2.calculate(6, 0, '/'), "Division by zero should throw ArithmeticException");
    }

    @Test
    void testInvalidOperator() {
        assertThrows(IllegalArgumentException.class, () -> task2.calculate(6, 3, '^'), "Invalid operator should throw IllegalArgumentException");
    }

    @Test
    void testFloatingPointNumbers() {
        assertEquals(5.5, task2.calculate(2.5, 3.0, '+'), "2.5 + 3.0 should equal 5.5");
        assertEquals(2.75, task2.calculate(5.5, 2.75, '-'), "5.5 - 2.75 should equal 2.75");
        assertEquals(8.0, task2.calculate(2.0, 4.0, '*'), "2.0 * 4.0 should equal 8.0");
        assertEquals(2.5, task2.calculate(5.0, 2.0, '/'), "5.0 / 2.0 should equal 2.5");
    }
}
