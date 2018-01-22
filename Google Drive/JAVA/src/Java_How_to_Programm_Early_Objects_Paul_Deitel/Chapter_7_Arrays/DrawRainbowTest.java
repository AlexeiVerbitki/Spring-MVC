package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_7_Arrays;


// Fig. 7.26: DrawRainbowTest.java
// Test application to display a rainbow.
import javax.swing.JFrame;

public class DrawRainbowTest
{
    public static void main(String[] args)
    {
        DrawRainbow panel = new DrawRainbow();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(1024, 768);
        application.setVisible(true);
    }
} // end class DrawRainbowTest