
public class Die
{
  private int rollNumber;
  public void roll() {
    int range = (6 - 1) + 1;
    rollNumber = (int)(Math.random() * range) + 1;
  }
  
  public int getNumDots() {
    return rollNumber;
  }
  
}
