package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_15.fig15_12;// Fig. 15.13: JFileChooserTest.java
// Tests class JFileChooserDemo.
import java.io.IOException;
import javax.swing.JFrame;

public class JFileChooserTest
{
   public static void main(String[] args) throws IOException
   {
      JFileChooserDemo application = new JFileChooserDemo();
      application.setSize(400, 400); 
      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      application.setVisible(true); 
   } 
} // end class JFileChooserTest
