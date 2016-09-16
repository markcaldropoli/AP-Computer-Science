import java.util.Scanner;


public class CylinderTest
{

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the value of the radius of the circle:");
    int r = sc.nextInt();
    System.out.println("Please enter the value of the height of the circle:");
    int h = sc.nextInt();
    Cylinder c = new Cylinder(r,h);
    System.out.println("The volume of the cylinder is " + c.getVolume() + ".");
    sc.close();
  }

}
