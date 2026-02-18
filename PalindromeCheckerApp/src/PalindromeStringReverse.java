/**
 * ============================================================
 * MAIN CLASS - PalindromeCheckString
 * ============================================================
 *
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 *
 * This introduces transformation-based validation.
 *
 * @author Developer
 * @version 3.0
 */

import java.util.Scanner;

public class PalindromeStringReverse {

    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read input string
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        // Reverse the string
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Display reversed string
        System.out.println("Reversed String: " + reversed);

        // Compare original and reversed strings
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("Result: The string is a PALINDROME.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        scanner.close();
    }
}