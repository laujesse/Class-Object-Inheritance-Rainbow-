// Chapter 5 Question 27

// ________________________________________________
//Jesse Lau
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rainbow extends JPanel
{
  // Declare skyColor:
  // ________________________________________________
  private Color skyColor = Color.CYAN;
  
  
  public Rainbow()
  {
      setBackground(skyColor);
  }

  // Draws the rainbow.
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int width = getWidth();    
    int height = getHeight();

    // Declare and initialize local int variables xCenter, yCenter
    // that represent the center of the rainbow rings:
    // ________________________________________________
    int xCenter = 1/2 * width;
    int yCenter = 3/4 * height;
    // Declare and initialize the radius of the large semicircle:
    // ________________________________________________
    int largeRadius = 1/4 * width;
    g.setColor(Color.RED);

    // Draw the large semicircle:
    // g.fillArc( ______________ );
    g.fillArc( 50, 30, 200, 200, 0, 180);
    
    // Declare and initialize the radii of the small and medium
    // semicircles and draw them:
    // ________________________________________________
    int secondRadius = 1/4 * height;
    g.setColor(Color.MAGENTA);
    g.fillArc( 75, 55, 150, 150, 0, 180);
    double thirdRadius = Math.sqrt(largeRadius * secondRadius);
    g.setColor(Color.GREEN);
    g.fillArc(89, 67, 125, 125, 0, 180);
    // Calculate the radius of the innermost (sky-color) semicircle
    // so that the width of the middle (green) ring is the
    // arithmetic mean of the widths of the red and magenta rings:
    // ________________________________________________
    int fourthRadius = (width + height)/8;
    g.setColor(skyColor);
    g.fillArc(101, 80, 100, 100, 0, 180);
    // Draw the sky-color semicircle:
    // ________________________________________________
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(300, 300, 300, 200);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Rainbow());
    w.setVisible(true);
  }
}
