import java.util.Scanner;


public class Exercise18a
{
  
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a word: ");
    String word = sc.next();
    isPalindrome(word);
    sc.close();
  }
  
  public static boolean isPalindrome(String word) {
    int pos = word.length();
    for(int i = 0; i < pos/2; i++) {
      if(word.charAt(i) != word.charAt(pos - i - 1)) {
        System.out.println(word.toUpperCase() + " is not a palindrome.");
        return false;
      }
    }
    System.out.println(word.toUpperCase() + " is a palindrome.");
    return true;
  }
  
}
