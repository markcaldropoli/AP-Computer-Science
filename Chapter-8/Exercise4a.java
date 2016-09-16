import java.util.Scanner;

public class Exercise4a
{
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a date in the format mm/dd/yyyy: ");
    String date = sc.next();
    System.out.println(date(date));
    sc.close();
  }
  
  public static String date(String dateStr) {
    dateStr = dateStr.substring(3,5) + "-" + dateStr.substring(0,2) + "-" + dateStr.substring(6);
    return dateStr;
  }
}
