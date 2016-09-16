public class Exercise18a
{
  public static void main(String [] args) {
    int[] ints = new int[5];
    ints[0] = 1;
    ints[1] = 1;
    ints[2] = 1;
    ints[3] = 1;
    ints[4] = 1;
    System.out.println(sum(ints));
  }
  
  public static int sum(int[] ints) {
    int sum = 0;
    int temp = 0;
    for(int pos : ints) {
      pos = temp;
      if(pos < ints.length) {
        sum += ints[pos];
        temp++;
      } else {
        break;
      }
    }
    return sum;
  }
  
  
  
}
