import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class task3_test {
    

    @Test
    void testPositiveNumbers() {
        assertEquals(6, task3.sumOfDigits(123));
        assertEquals(10, task3.sumOfDigits(55));
        assertEquals(0, task3.sumOfDigits(0));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(6, task3.sumOfDigits(-123));
        assertEquals(10, task3.sumOfDigits(-55));
    }

    @Test
    void testEdgeCases() {
        assertEquals(1, task3.sumOfDigits(1));
        assertEquals(1, task3.sumOfDigits(-1));
        assertEquals(45, task3.sumOfDigits(123456789));
    }


}
