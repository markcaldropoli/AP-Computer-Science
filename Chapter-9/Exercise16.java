public class Exercise16
{
  public static void main(String [] args) {
    int row = 3;
    int col = 2;
    double[][] test1 = new double[row][col];
    test1[0][0] = 2;
    test1[0][1] = 3;
    test1[1][0] = 4;
    test1[1][1] = 5;
    test1[2][0] = 6;
    test1[2][1] = 7;
    double[][] test2 = new double[row][col];
    test2[0][0] = 1;
    test2[0][1] = 2;
    test2[1][0] = 3;
    test2[1][1] = 4;
    test2[2][0] = 8;
    test2[2][1] = 9;
    System.out.println(covers(test2,test1));
  }
  
  //Returns true if m1 "covers" m2, false otherwise
  //Precondition: m1 and m2 have the same dimensions
  private static boolean covers(double[][] m1, double[][] m2) {
    int count = 0;
    int row = 0;
    for(int r = 0; r < m1.length; r++) {
      for(int c = 0; c < m1[0].length; c++) {
        if(m1[r][c] > m2[r][c]) {
          count++;
        }
        row = r;
      }
    }
    if((double)count/(m1.length*row) > .5) {
      return true;
    }
    return false;
  }
}
