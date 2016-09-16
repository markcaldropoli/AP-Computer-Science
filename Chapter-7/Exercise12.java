import java.util.Scanner;

public class Exercise12
{

  public static void main(String[] args)
  {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Please input a number: ");
    n = sc.nextInt();
    System.out.println(sumDigits(n));
    sc.close();
  }
  
  public static int sumDigits(int n) {
    int sum = 0;
    while(n > 0) {
      sum = sum + n % 10;
      n /= 10;
    }
    return sum;
  }
  
}
