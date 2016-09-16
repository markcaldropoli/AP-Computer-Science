public class Exercise9
{
  public static void main(String[] args) {
    int count = 7;
    int total = 55;
    int pages = 11;
    int words = 1357;
    count += (total/pages-5)*words-1;
    System.out.println(count);
  }
}
