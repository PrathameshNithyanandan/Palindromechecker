
import java.util.Scanner;

public class PalindromeCheckerApp {
    public static boolean isPalindrome(String content) {
        content = content.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = content.length() - 1;

        while (left < right) {
            if (content.charAt(left) != content.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }



}
