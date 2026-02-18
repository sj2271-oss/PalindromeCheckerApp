/**
 * ============================================================
 * MAIN CLASS - PalindromeCheckArray
 * ============================================================
 *
 * Use Case 4: Character Array Based Palindrome Validation
 *
 * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 *
 * At this stage, the application:
 * - Converts string to char array
 * - Uses start and end pointers
 * - Compares characters efficiently
 * - Displays the result
 *
 * This reduces extra memory usage.
 *
 * @author Developer
 * @version 4.0
 */

import java.util.Scanner;

public class PalindromeCheckArray {

    /**
     * Application entry point for UC4.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declare and initialize the input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the string into a character array
        char[] chars = input.toCharArray();

        // Initialize pointers
        int start = 0;
        int end = chars.length - 1;

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Continue comparison until pointers cross
        while (start < end) {

            if (Character.toLowerCase(chars[start]) != Character.toLowerCase(chars[end])) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display the result
        if (isPalindrome) {
            System.out.println("Result: The string is a PALINDROME.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        scanner.close();
    }
}
