public class Question22
{
  public static void main(String [] args) {
    char[] hello = {' ', 'h', 'e', 'l', 'l', 'o'};
    int i = 0;
    while(i < 5) {
      hello[i] = hello[i+1];
      i++;
    }
    hello[5] = '!';
  }
}
