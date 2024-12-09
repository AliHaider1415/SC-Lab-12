import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class task1_test {

    @Test
    void testBinarySearchRecursive() {
        int[] intArray = {1, 2, 4, 4, 4, 5, 6, 7};
        assertEquals(2, task1.binarySearchRecursive(intArray, 4, 0, intArray.length - 1));
        assertEquals(-1, task1.binarySearchRecursive(intArray, 10, 0, intArray.length - 1));

        String[] strArray = {"apple", "banana", "cherry", "date"};
        assertEquals(1, task1.binarySearchRecursive(strArray, "banana", 0, strArray.length - 1));
        assertEquals(-1, task1.binarySearchRecursive(strArray, "pear", 0, strArray.length - 1));
    }

    @Test
    void testFindAllIndices() {
        int[] intArray = {1, 2, 4, 4, 4, 5, 6, 7};
        List<Integer> result = task1.findAllIndicesSorted(intArray, 4, 0, intArray.length - 1);
        assertEquals(List.of(2, 3, 4), result);
    }
}
