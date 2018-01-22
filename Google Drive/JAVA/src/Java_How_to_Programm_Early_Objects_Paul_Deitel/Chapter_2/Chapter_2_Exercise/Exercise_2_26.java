package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_2.Chapter_2_Exercise;
import java.util.Scanner;
public class Exercise_2_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y;
        System.out.printf("x= ");
        x = input.nextInt();

        System.out.printf("\ny= ");
        y = input.nextInt();

        if (x % y == 0) {
            System.out.printf("y is the multiple of x");
        } else
            if (y % x == 0)
            System.out.printf("x is the multiple of y");
        else
                System.out.printf("Neither x or y are multipliers of each other");
    }
}
