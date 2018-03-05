package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_6.fig06_11_12;// Fig. 6.11: DrawSmiley.java
// Demonstrates filled shapes.
import Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_16.Chapter_16_Exercise.Color_Chooser_16_15;
import Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_16.Chapter_16_Exercise.myColor;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawSmiley extends JPanel implements myColor
{
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);


//      Color_Chooser_16_15 myColor = new Color_Chooser_16_15();


      // draw the face
      
      g.setColor(new Color_Chooser_16_15().choose("green"));
      g.fillOval(10, 10, 200, 200);
      
      // draw the eyes
      g.setColor(Color.BLACK);
      g.fillOval(55, 65, 30, 30);
      g.fillOval(135, 65, 30, 30);
      
      // draw the mouth
      g.fillOval(50, 110, 120, 60);
      
      // "touch up" the mouth into a smile
      g.setColor(Color.YELLOW);
      g.fillRect(50, 110, 120, 30);
      g.fillOval(50, 120, 120, 40);
   } 
} // end class DrawSmiley

