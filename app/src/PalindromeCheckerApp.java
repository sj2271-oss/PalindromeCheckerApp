/**
 * ===============================
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * ===============================
 *
 * : Print a Hardcoded Palindrome Result
 *
 * Description:
 * This class extends the startup flow by
 * checking a hardcoded string for palindrome status.
 *
 * At this stage, the application:
 * - Starts execution from the main() method
 * - Displays a welcome message and version
 * - Checks a hardcoded string ("madam")
 * - Prints whether it is a palindrome
 *
 * @author Developer
 * @version 2.0
 */
public class PalindromeCheckerApp {
    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Startup flow
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 2.0");
        System.out.println("System initialized successfully.");

        // Hardcoded string
        String word = "madam";

        // Palindrome check
        String reversed = new StringBuilder(word).reverse().toString();
        if (word.equalsIgnoreCase(reversed)) {
            System.out.println("The word \"" + word + "\" IS a palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a palindrome.");
        }
    }
}
