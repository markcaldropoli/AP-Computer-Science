import java.util.Scanner;

public class Exercise26
{

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a value for a: ");
    int a = sc.nextInt();
    System.out.println("Please enter a value for b: ");
    int b = sc.nextInt();
    System.out.println(gcf(a,b));
    sc.close();
  }
  
  // Returns GCF of a and b
  // Precondition: a > 0, b > 0
  public static int gcf(int a, int b) {
    while(b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }
  
}
