/**
 * This program prompts the user to enter his or her
 * first name and last name and displays a greeting
 * message
 * @author Mark Caldropoli
 *
 */
import java.util.Scanner;

public class Greetings
{

  public static void main(String[] args)
  {
    Scanner kboard = new Scanner(System.in);
    System.out.println("Enter your first name:");
    String firstName = kboard.nextLine();
    System.out.println("Enter your last name:");
    String lastName = kboard.nextLine();
    System.out.println("Hello, " + firstName + " " + lastName + ".");
    System.out.println("Welcome to Java!");
    kboard.close();
  }

}
