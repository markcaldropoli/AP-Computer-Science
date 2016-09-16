import java.util.Scanner;

public class Exercise3
{
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a value for x: ");
    int x = sc.nextInt();
    System.out.println("Enter a value for y: ");
    int y = sc.nextInt();
    System.out.println("Enter a value for z: ");
    int z = sc.nextInt();
    System.out.println(max(x,y,z));
    System.out.println(max2(x,y,z));
    sc.close();
  }
  
  public static int max(int x, int y, int z) {
    return Math.max(x,Math.max(y,z));
  }
  
  public static int max2(int x, int y, int z) {
    if(x > y && x > z) {
      return x;
    } else if(y > x && y > z) {
      return y;
    } else if (z > x && z > y) {
      return z;
    } else if (y == z) {
      return y;
    }
    return x;
  }
}
