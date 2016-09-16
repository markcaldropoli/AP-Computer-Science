public class Exercise5
{
  public static void main(String [] args) {
    System.out.println(getRandomRps());
  }
  
  public static char getRandomRps() {
    int range = 13;
    char[] rps = new char[14];
    rps[0] = 'r';
    rps[1] = 'r';
    rps[2] = 'r';
    rps[3] = 'p';
    rps[4] = 'p';
    rps[5] = 'p';
    rps[6] = 'p';
    rps[7] = 'p';
    rps[8] = 's';
    rps[9] = 's';
    rps[10] = 's';
    rps[11] = 's';
    rps[12] = 's';
    rps[13] = 's';
    return rps[(int) (range * Math.random() + 1)];
  }
}
