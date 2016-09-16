
public class Cylinder
{
  //Fields
  private Circle base;
  private int height;
  
  //Constructor
  public Cylinder(int r, int h)
  {
    base = new Circle(r);
    height = h;
  }
  
  //Method that gets the volume of a cylinder
  public double getVolume()
  {
    double v = base.getArea() * height;
    
    return v;
  }
  
}
