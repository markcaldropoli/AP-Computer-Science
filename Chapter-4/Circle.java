public class Circle
{
  //Field
  private int radius;
  
  //Constructor
  public Circle(int r)
  {
    radius = r;
  }
  
  //Accessor
  public int getRadius()
  {
    return radius;
  }
  
  //Method that gets the area of the circle
  public double getArea()
  {
    double a = Math.PI * (radius * radius);
    
    return a;
  }
  
}
