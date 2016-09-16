import java.util.Scanner;

public class Exercise19
{
  public static void main(String [] args) {
    int correct = 0;
    boolean like = false;
    
    Scanner sc = new Scanner(System.in);
    String input;
    System.out.println("Try to figure out what Cooney likes: \n");
    System.out.println("COONEY likes MOON but he doesn't like SUN");
    System.out.println("COONEY likes SOCCER but he doesn't like HOCKEY");
    System.out.println("COONEY likes SUMMER but he doesn't like SPRING\n");
    System.out.println("Does Cooney like ... (enter one word below)");
    
    while(correct < 5) {
      input = sc.nextLine();
      
      for(int pos = 0; pos < input.length()-1; pos++) {
        if(input.charAt(pos) == input.charAt(pos + 1)) {
          like = true;
        }
      }
      
      if(like == true) {
        correct++;
        System.out.println("Yes, Cooney likes " + input.toUpperCase());
      } else {
        correct = 0;
        System.out.println("No, Cooney doesn't like " + input.toUpperCase());
      }
      
      like = false;
      
    }
    
    System.out.println("\nYou have correctly guessed what Cooney likes!");
    sc.close();
    
  }
  
}
