public class Exercise24
{
  public static void main(String [] args) {
    int a[] = {1,2,3,4,5};
    rotate(a,-2);
    System.out.println();
    rotate(a,4);
  }
  
  public static void rotate(int[] a, int d) {
    if(d < 0) {
      for(int count = 0; count > d; count--) {
        rotateLeft(a);
      }
    } else {
      for(int count = 0; count < d; count++) {
        rotateRight(a);
      }
    }
  }
  
  public static void rotateLeft(int[] a) {
    int[] b = a.clone();
    int count1 = 1;
    for(int count = 0; count < a.length - 1; count++) {
      a[count] = b[count1];
      count1++;
    }
    a[a.length - 1] = b[0];
    for(int count = 0; count < a.length; count++) {
      System.out.print(a[count]);
    }
    System.out.println();
  }
  
  public static void rotateRight(int[] a) {
   int result = a[a.length - 1]; 
   for(int count = a.length - 1; count > 0; count--) {
     a[count] = a[count - 1];
   }
   a[0] = result;
   for(int count = 0; count < a.length; count++) {
     System.out.print(a[count]);
   }
   System.out.println();
  }
}
