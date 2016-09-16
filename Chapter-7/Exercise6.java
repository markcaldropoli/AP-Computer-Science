import java.util.Scanner;

public class Exercise6
{
  
  private static double growthRate = 1.005;
  private static double currentPop = 123.8;
  
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a target population number (in millions): ");
    double pop = sc.nextDouble();
    System.out.println("The target population number is " + (pop * 1000000) + " people.");
    System.out.println("Mexico is projected to reach "+ pop + " million people in " + population(pop));
    sc.close();
  }
  
  public static int population(double pop) {
    int year = 2014;
    double projectedPop = pop;
    while(currentPop < projectedPop) {
      currentPop *= growthRate;
      year++;
    }
    
    return year;
  }
  
}
