package Java_How_to_Programm_Early_Objects_Paul_Deitel;
import java.util.Scanner; import javax.swing.JOptionPane;

// Solving the class-average problem using counter-controlled repetition.
public class ClassAverage {
    public static void main(String[] args) {
        int total = 0;
        for (int i=1; i<=4; i++){
            String gradeMessage = JOptionPane.showInputDialog("Enter your grade");
            int grade = Integer.parseInt(gradeMessage);
            total= total + grade;


        }// end for

        double averageGrade = total / 10;
        System.out.println("Your total grade is: "+ total);
        System.out.println("Your class average grade is: $s"+ averageGrade);
        String message = String.format("Your class average grade is: ", averageGrade);
        JOptionPane.showMessageDialog(null, message);
    }//  end main
} // end class ClassAverage
