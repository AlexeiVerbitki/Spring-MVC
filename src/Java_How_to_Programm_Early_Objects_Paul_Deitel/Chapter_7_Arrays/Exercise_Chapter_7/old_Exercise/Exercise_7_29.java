package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_7_Arrays.Exercise_Chapter_7.old_Exercise;
import javax.swing.JOptionPane;
public class Exercise_7_29 {
    int n1 = 0;
    int n2 = 1;
    int n3;



    public void fibbonaci (int rounds){
        System.out.printf("0 1 ");
        for (int i =0; i< rounds; i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.printf("%d ", n3);

        }

    } // end method fibbonaci

    public static void main(String[] args) {
        Exercise_7_29 run = new Exercise_7_29();
        String input = JOptionPane.showInputDialog("Enter Fibonacci(n)");
        int enteredInt = Integer.parseInt(input);

        run.fibbonaci(enteredInt);
    }
} // end class Exercise_7_29
