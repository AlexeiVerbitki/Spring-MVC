package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_5;
// Fig. 5.26: Shapes.java // Demonstrates drawing different shapes.
import java.awt.Graphics; //handle the display
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Shapes extends JPanel
{
    private int choice; // user's choice of which shape to draw

    // constructor sets the user's choice
    public Shapes(int userChoice)
    {
        choice = userChoice;
    }

    // draws a cascade of shapes starting from the top-left corner
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        for (int i = 0; i < 10; i++)
        {
            // pick the shape based on the user's choice
            switch (choice)
            {
                case 1: // draw rectangles
                    g.drawRect(10 + i * 10, 10 + i * 10,
                            50 + i * 10, 50 + i * 10);
                    break;
                case 2: // draw ovals
                    g.drawOval(100 - (i * 10)/2, 100 - (i * 10)/2,
                            50 + i * 10, 50 + i * 10);
                    break;
            }
        }
    }
} // end class Shapes

// Fig. 5.27: ShapesTest.java
// Test application that displays class Shapes.
