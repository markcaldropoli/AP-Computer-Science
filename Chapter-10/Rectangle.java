public class Rectangle
{
  private static int width;
  private static int height;
  
  public Rectangle(int w, int h) {
    if(w > 0 && h > 0) {
      width = w;
      height = h;
    } else {
      System.out.println("The inputed width or height is not greater than 0");
    }
  }
  
  public Rectangle(int s) {
    this();
    if(width > 0 && height > 0) {
      @SuppressWarnings("unused")
      Rectangle r = new Rectangle(s,s);
    } else {
      System.out.println("The inputed length is not greater than 0");
    }
  }
  
  public Rectangle() {
    @SuppressWarnings("unused")
    Rectangle r = new Rectangle(1,1);
  }
  
  public boolean isSquare() {
    if(width == height) {
      return true;
    } else {
      return false;
    }
  }
  
  public void quadratize() {
    if(this.isSquare() == false) {
      int s = (width+height)/2;
      System.out.println("The rectangle is now " + s + " by " + s);
    }
  }
  
  public String toString() {
    return "The rectangle's width is "+width+" and the rectangle's height is "+height;
  }
  
  public static void main(String [] args) {
    Rectangle r1 = new Rectangle(5,7);
    System.out.println(r1.toString());
    if(r1.isSquare()) System.out.println("The rectangle is a square");
    else System.out.println("The rectangle is not a square");
    r1.quadratize();
    System.out.println();
    Rectangle r2 = new Rectangle(5);
    System.out.println(r2.toString());
    if(r2.isSquare()) System.out.println("The rectangle is a square");
    else System.out.println("The rectangle is not a square");
  }
}
