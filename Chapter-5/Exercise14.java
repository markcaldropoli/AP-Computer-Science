public class Exercise14
{

  public static void main(String[] args)
  {
    double a, b;
    int temp;
    
    System.out.println("Enter two real numbers: ");
    //I added these
    a = 5.0;
    b = 3.0;
    temp = 2;
    //Swap the numbers:
    temp = (int) a;
    a = b;
    b = temp;
  }

}
