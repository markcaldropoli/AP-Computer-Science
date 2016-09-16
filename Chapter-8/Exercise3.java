import java.util.Scanner;

public class Exercise3
{

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please input a social security: ");
    String ss = sc.next();
    System.out.println(removeDashes(ss));
    sc.close();
  }
  
  public static String removeDashes(String ss) {
    StringBuffer sb = new StringBuffer();
    sb.append(ss);
    sb.deleteCharAt(3);
    sb.deleteCharAt(5);
    String result = sb.toString();
    return result;
  }

}
