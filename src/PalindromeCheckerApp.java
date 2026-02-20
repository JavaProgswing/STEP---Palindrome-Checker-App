/**
 * ============================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * ============================================================
 * <p>
 * Use Case 6: Queue + Stack Fairness Check
 * <p>
 * Description:
 * Demonstrates palindrome validation using two
 * different data structures:
 * <p>
 * - Queue (FIFO - First In First Out)
 * - Stack (LIFO - Last In First Out)
 * <p>
 * Characters are inserted into both structures and
 * compared by removing from the front of the queue
 * and the top of the stack.
 * <p>
 * If all characters match, the input string is
 * confirmed as a palindrome.
 *
 * @author Developer
 * @version 6.0
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "civic";
        System.out.println("Input text: " + input);

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();
            char fromStack = stack.pop();

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        System.out.print("Is it a Palindrome? : ");
        System.out.println(isPalindrome);
    }
}