import java.util.ArrayList;
import java.util.List;

public class task1 {

    // Recursive Binary Search for the first occurrence of the target in an integer array
    public static int binarySearchRecursive(int[] arr, int target, int low, int high) {
        // Check for invalid input
        if (arr == null || arr.length == 0) {
            return -1; // Array is empty or null
        }

        if (low > high) {
            return -1; // Base case: element not found
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            // Ensure that this is the first occurrence
            if (mid == 0 || arr[mid - 1] != target) {
                return mid; // First occurrence found
            } else {
                return binarySearchRecursive(arr, target, low, mid - 1); // Search left for first occurrence
            }
        }

        // Recursively search in the left or right half
        if (arr[mid] > target) {
            return binarySearchRecursive(arr, target, low, mid - 1); // Search left
        } else {
            return binarySearchRecursive(arr, target, mid + 1, high); // Search right
        }
    }

    // Recursive Binary Search for the first occurrence of the target in a string array
    public static int binarySearchRecursive(String[] arr, String target, int low, int high) {
        // Check for invalid input
        if (arr == null || arr.length == 0) {
            return -1; // Array is empty or null
        }

        if (low > high) {
            return -1; // Base case: element not found
        }

        int mid = low + (high - low) / 2;

        if (arr[mid].equals(target)) {
            // Ensure that this is the first occurrence
            if (mid == 0 || !arr[mid - 1].equals(target)) {
                return mid; // First occurrence found
            } else {
                return binarySearchRecursive(arr, target, low, mid - 1); // Search left for first occurrence
            }
        }

        // Recursively search in the left or right half
        if (arr[mid].compareTo(target) > 0) {
            return binarySearchRecursive(arr, target, low, mid - 1); // Search left
        } else {
            return binarySearchRecursive(arr, target, mid + 1, high); // Search right
        }
    }

    // Recursive method to find all indices of the target value in an integer array
    public static void findAllIndices(int[] arr, int target, int low, int high, List<Integer> result) {
        if (arr == null || arr.length == 0) {
            return; // Array is empty or null
        }

        if (low > high) {
            return; // Base case: element not found
        }

        int mid = low + (high - low) / 2;

        // Check if the middle element matches the target
        if (arr[mid] == target) {
            result.add(mid);
            // Search left of mid for other occurrences
            findAllIndices(arr, target, low, mid - 1, result);
            // Search right of mid for other occurrences
            findAllIndices(arr, target, mid + 1, high, result);
            return;
        }

        // Recursively search in the left or right half
        if (arr[mid] > target) {
            findAllIndices(arr, target, low, mid - 1, result); // Search left
        } else {
            findAllIndices(arr, target, mid + 1, high, result); // Search right
        }
    }

    // Method to find and return all indices of the target value, sorted
    public static List<Integer> findAllIndicesSorted(int[] arr, int target, int low, int high) {
        List<Integer> result = new ArrayList<>();
        findAllIndices(arr, target, low, high, result);
        result.sort(Integer::compareTo); // Sort the indices
        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Testing with integer array
        int[] intArray = {1, 2, 4, 4, 4, 5, 6, 7};
        System.out.println("Index of 4 in intArray: " + binarySearchRecursive(intArray, 4, 0, intArray.length - 1));

        List<Integer> indices = findAllIndicesSorted(intArray, 4, 0, intArray.length - 1);
        System.out.println("All indices of 4 in intArray: " + indices);

        // Testing with string array
        String[] strArray = {"apple", "banana", "cherry", "date"};
        System.out.println("Index of 'banana' in strArray: " + binarySearchRecursive(strArray, "banana", 0, strArray.length - 1));
    }
}
