import java.util.Scanner;


public class CircleTest
{

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a value for the radius of the circle:");
    int r = sc.nextInt();
    Circle c = new Circle(r);
    System.out.println("The area of the circle is " + c.getArea() + ".");
    sc.close();
  }

}
