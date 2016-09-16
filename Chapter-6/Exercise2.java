import java.util.Scanner;

public class Exercise2 {
  
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a value for x: ");
    int x = sc.nextInt();
    System.out.println("Enter a value for y: ");
    int y = sc.nextInt();
    System.out.println(max(x,y));
    sc.close();
  }
  
  public static int max(int x, int y) {
    if (x > y) {
      return x;
    } else {
      return y;
    }
  }
}
