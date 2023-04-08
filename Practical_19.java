import java.awt.*;
import java.applet.*;
public class Practical_19 extends Applet {
   public void paint(Graphics g) {
      // Draw three lines
      g.drawLine(10, 10, 100, 10);
      g.drawLine(10, 20, 100, 20);
      g.drawLine(10, 30, 100, 30);
      // Draw a rectangle
      g.drawRect(120, 10, 80, 40);
      // Draw a filled rectangle
      g.fillRect(220, 10, 80, 40);
      // Draw a rounded rectangle
      g.drawRoundRect(320, 10, 80, 40, 20, 20);
   }
}