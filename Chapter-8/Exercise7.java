public class Exercise7
{

  public static void main(String[] args)
  {
    System.out.println(convertName("von Neumann, John"));

  }
  
  public static String convertName(String name) {
    int pos = 0;
    String result;
    while(name.charAt(pos) != ',') {
      pos++;
    }
    String last = name.substring(0,pos);
    String first = name.substring(pos+1,name.length());
    result = first + " " + last;
    return result;
  }

}
