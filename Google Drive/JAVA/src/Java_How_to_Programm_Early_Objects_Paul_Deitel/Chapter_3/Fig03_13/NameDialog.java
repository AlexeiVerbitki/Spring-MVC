package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_3.Fig03_13;// Fig. 3.13: NameDialog.java
// Obtaining user input from a dialog.
import javax.swing.JOptionPane;

public class NameDialog
{
   public static void main(String[] args)
   {
      // prompt user to enter name
      String name = JOptionPane.showInputDialog("What is your name?");
      
      // create the message
      String message =                                              
         String.format("Welcome, %s, to Java Programming!", name);

      // display the message to welcome the user by name 
      JOptionPane.showMessageDialog(null, message);
   } 
} // end class NameDialog

