import java.util.Scanner;

public class Exercise11
{

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("What is your favorite ice cream flavor?");
    String favoriteFlavor = sc.nextLine();
    System.out.println("Oh, " + favoriteFlavor + " tastes terrible!");
    System.out.println("Just joking! I like all ice cream flavors!");
    sc.close();
  }

}
