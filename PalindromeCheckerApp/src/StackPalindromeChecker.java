/**
 * ============================================================
 * MAIN CLASS - StackPalindromeChecker
 * ============================================================
 *
 * Use Case 5: Stack Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 *
 * At this stage, the application:
 * - Pushes characters into a stack
 * - Pops them in reverse order
 * - Compares with original sequence
 * - Displays the result
 *
 * This maps stack behavior to reversal logic.
 *
 * @author Developer
 * @version 5.0
 */

import java.util.Scanner;
import java.util.Stack;

public class StackPalindromeChecker {

    /**
     * Application entry point for UC5.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declare and initialize the input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Iterate again through original string
        for (char c : input.toCharArray()) {
            if (Character.toLowerCase(c) != Character.toLowerCase(stack.pop())) {
                isPalindrome = false;
                break;
            }
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

