/**
 * ============================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * ============================================================
 * <p>
 * Use Case 4: Character Array Based Validation
 * <p>
 * Description:
 * Validates a palindrome by converting the string into
 * a character array and comparing characters using
 * the two-pointer technique.
 *
 * @author Developer
 * @version 4.0
 */


public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "madam";
        System.out.println("Input text: " + input);

        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.print("It is a Palindrome? : ");
        System.out.println(isPalindrome);
    }

}