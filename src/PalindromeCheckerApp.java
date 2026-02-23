public class PalindromeCheckerApp {
    static boolean palindrome(String word) {
        String revword = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            revword += word.charAt(i);
        }
        if (word.equals(revword)) {
            System.out.println("palindrome word");
            return true;


        } else {
            System.out.println("not a palindrome word");
            return false;

        }

    }
}