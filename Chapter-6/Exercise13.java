import java.util.Scanner;

public class Exercise13
{
  public static boolean isLeapYear(int year) {
    double quarterYear = year /4.0;
    double year100 = year / 100.0;
    double year400 = year / 400.0;
    if (quarterYear == year/4 && (year100 != year/100) || year400 == year/400){
      return true;
    } else {
      return false;
    }
  }
  
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a year: ");
    int year = sc.nextInt();
    System.out.println(isLeapYear(year));
    sc.close();
  }
}
