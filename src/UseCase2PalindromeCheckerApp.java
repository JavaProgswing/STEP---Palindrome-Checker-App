/**
 * =========================================================
 * MAIN CLASS — UseCase1PalindromeApp
 * =========================================================
 * <p>
 * Use Case 1: Application Entry & Welcome Message
 * <p>
 * Description:
 * This class represents the entry point of the
 * Palindrome Checker Management System.
 * <p>
 * At this stage, the application:
 * - Starts execution from the main() method
 * - Displays a welcome message
 * - Shows application version
 * <p>
 * No palindrome logic is implemented yet.
 * <p>
 * The goal is to establish a clear startup flow.
 *
 * @author Developer
 * @version 1.0
 */

public class UseCase2PalindromeCheckerApp {

    /**
     * Application entry point.
     * <p>
     * This is the first method executed by the JVM
     * when the program starts.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "madam";
        boolean result = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                result = false;
                break;
            }
        }

        System.out.println("Is it a Palindrome?: " + result);
    }

}