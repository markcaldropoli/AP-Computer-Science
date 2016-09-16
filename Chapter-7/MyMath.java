import java.util.Scanner;

public class MyMath
{
  /**
   * Returns the sum of all integers from 1 to n, if n >= 1,
   * and 0 otherwise.
   */
  public static int sumUpTo(int n)
  {
    int sum = 0;

    for (int k = 1; k <= n; k++)
      sum += k;

    return sum;
  }

  /**
   * Returns 1 * 2 * ... * n, if n >= 1; otherwise returns 1
   */
  public static long factorial(int n)
  {
    long f = 1;

    for (int k = 2; k <= n; k++)
      f *= k;

    return f;
  }

  /**
   * Returns true if n is a prime; otherwise returns false
   */
  public static boolean isPrime(int n)
  {
    if (n <= 1)
      return false;

    int m = 2;

    while (m * m <= n)
    {
      if (n % m == 0)
        return false;
      m++;
    }

    return true;
  }

  /**
   * Tests Goldbach conjecture for even numbers up to bigNum
   */
  public static boolean testGoldbach(int bigNum)
  {
    for (int n = 6; n <= bigNum; n += 2)  // obviously true for n = 4
    {
      boolean found2primes = false;

      for (int p = 3; p <= n/2; p += 2)
      {
        if (isPrime(p) && isPrime(n - p))
          found2primes = true;
      }

      if (!found2primes)
      {
        System.out.println(n + " is not a sum of two primes!");
        return false;
      }
    }

    return true;
  }
  
  public static boolean isPerfect (long n)
  {
   boolean perfect = true;
   long sum = 0;
   long perfectNumber = n;

   for (long factor = 1; factor <= perfectNumber/2 ; factor++)
   {
    if(perfectNumber % factor == 0)
     sum += factor;
   }
   
   if (n <= 1)
   {
    perfect = false;
   } else if (perfectNumber == sum )
   {
    perfect = true;
   } else
    perfect = false;
   
   return perfect;
   
  }
  
  /*********************************************************************/

  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);
    int n = 1;
    
/**
    do
    {
      System.out.print("Enter an integer from 4 to 20: ");
      n = kb.nextInt();
    } while (n < 4 || n > 20);
**/
    kb.close();

/**    System.out.println();
    System.out.println("1 + ... + " + n + " = " + sumUpTo(n));
    System.out.println(n + "! = " + factorial(n));
    System.out.println("Primes: ");
    for (int k = 1; k <= n; k++)
      if (isPrime(k))
        System.out.print(k + " ");
    System.out.println();
    System.out.println("Goldbach conjecture up to " + n + ": " + testGoldbach(n));
    
    int count = 0;
    
    while(count < 4) {
      if(isPerfect(n) == true) {
        System.out.println(n);
        count++;
      }
      n++;
    }**/
    
    System.out.println("************************");
    
    int x = 1000000000;
    int count2 = 0;
    
    while(n != x) {
      if(count2 != 6) {
        if(isPrime((int) (Math.pow(2,n)-1))) {
          long perfect = (long)(Math.pow(2,n-1)*(Math.pow(2,n)-1));
          if(perfect % 2 == 0) {
            System.out.println("Mersenne Prime: " + (Math.pow(2,n) - 1));
            System.out.println("Perfect Number: " + perfect);
            count2++;
          }
        }
      }
      n++;
    }
  }
}

