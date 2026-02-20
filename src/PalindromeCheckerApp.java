/**
 * ============================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * ============================================================
 * <p>
 * Use Case 5: Stack Based Palindrome Checker
 * <p>
 * Description:
 * Validates a palindrome using a Stack data structure
 * which follows the LIFO principle.
 *
 * @author Developer
 * @version 5.0
 */

import java.util.Stack;


public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "noon";
        System.out.println("Input text: " + input);

        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.print("It is a Palindrome? : ");
        System.out.println(isPalindrome);
    }

}