//Chapter 3 Question 12 (a)

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.Timer;

@SuppressWarnings("unused")
public class Morning extends JFrame
{
  private EasySound rooster;

  /**
   *   Constructor
   */
  public Morning()
  {
    super("Morning");
    //To loop annoying rooster sound
    int x = 0;
    int y = 0;
    // Use above
    rooster = new EasySound("roost.wav");
    //Remove while to stop loop
    while(x <= y){
    rooster.play();
    }
    Container c = getContentPane();
    c.setBackground(Color.WHITE);
  }

  public static void main(String[] args)
  {
    Morning morning = new Morning();
    morning.setSize(300, 150);
    morning.setDefaultCloseOperation(EXIT_ON_CLOSE);
    morning.setVisible(true);
  }
}  
