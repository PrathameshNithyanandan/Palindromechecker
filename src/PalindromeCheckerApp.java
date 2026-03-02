
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class PalindromeCheckerApp {
  public static boolean isPal(String str) {
  
      if (str == null) {
          return false;
      }
  
      String s = str.replaceAll("\\s+", "").toLowerCase();
  
      Deque<Character> dq = new ArrayDeque<Character>();
  
      for (int i = 0; i < s.length(); i++) {
          char c = s.charAt(i);
          dq.addLast(c);
      }
  
      boolean flag = true;
  
      while (dq.size() > 1) {
  
          char f = dq.removeFirst();
          char r = dq.removeLast();
  
          if (f != r) {
              flag = false;
              break;
          }
      }
  
      return flag;
  }
  
  public static void main(String[] args) {
  
      Scanner sc = new Scanner(System.in);
  
      System.out.println("==== UC7: Deque-Based Palindrome Checker ====");
      System.out.print("Enter a word or phrase: ");
  
      String input = sc.nextLine();
  
      boolean res = isPal(input);
  
      if (res == true) {
          System.out.println("Result: The given input IS a Palindrome.");
      } else {
          System.out.println("Result: The given input is NOT a Palindrome.");
      }
  
      sc.close();
  }
