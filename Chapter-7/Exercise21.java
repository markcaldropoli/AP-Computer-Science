import java.util.Scanner;

public class Exercise21
{

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please input a number: ");
    int n = sc.nextInt();
    printCheckerboard(n);
    sc.close();
  }
  
  public static void printCheckerboard(int n) {
    for(int x = 0; x < n; x++) {
      for(int y = 0; y < n; y++) {
        if(x % 2 != 0) {
          if(y % 2 != 0) {
            System.out.print("#");
          } else {
            System.out.print("o");
          }
        } else {
          if(y % 2 == 0) {
            System.out.print("#");
          } else {
            System.out.print("o");
          }
        }
        
      }
      System.out.println();
    }
  }
}
