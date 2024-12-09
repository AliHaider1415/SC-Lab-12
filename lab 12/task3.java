import java.util.Scanner;

public class task3 {
    /**
     * Recursive function to calculate the sum of digits of a given integer.
     * If the number is negative, it is converted to positive before calculation.
     *
     * @param number the input integer (can be negative or non-negative)
     * @return the sum of the digits of the absolute value of the number
     */
    public static int sumOfDigits(int number) {
        // Convert the number to positive if it is negative
        if (number < 0) {
            number = Math.abs(number);
        }

        // Base case: if the number is 0, the sum of digits is 0
        if (number == 0) {
            return 0;
        }

        // Recursive case: Add the last digit to the result of sumOfDigits of the remaining number
        return (number % 10) + sumOfDigits(number / 10);
    }

    public static void main(String[] args) {
        // Input a non-negative integer from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (positive or negative): ");
        int inputNumber = scanner.nextInt();

        // Calculate and display the sum of digits
        int result = sumOfDigits(inputNumber);
        System.out.println("The sum of digits of " + inputNumber + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}
