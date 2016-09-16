import java.util.Scanner;

public class Exercise3
{
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please input a value for a: ");
    int a = sc.nextInt();
    System.out.println("Please input a value for b: ");
    int b = sc.nextInt();
    System.out.println(product(a,b));
    sc.close();
  }
  
  // Returns the product of a and b
  // Precondition: a >= 0, b >= 0
  public static int product(int a, int b) {
    int result = 0;
    while(a > 0) {
      result += b;
      a--;
    }
    return result;
  }
  
}
