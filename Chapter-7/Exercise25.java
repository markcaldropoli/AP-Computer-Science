import java.util.Scanner;


public class Exercise25
{

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a cent value: ");
    int cents = sc.nextInt();
    money(cents);
    sc.close();
  }
  
  public static void money(int m) {
    // q = quarters, d = dimes, n = nickels, p = pennies
    for(int q = 0; q * 25 < m; q++) {
      
      for(int d = 0; d * 10 < m - (q * 25); d++) {
        
        for(int n = 0; n * 5 < m - (q * 25) - (d * 10); n++) {
        int p = m - (q * 25) - (d * 10) - (n * 5);
        System.out.print(m + " Cents = " + q + " quarters " + d + " dimes " + n + " nickels " + p + " pennies \n");
        }
      }
    }
  }

}
