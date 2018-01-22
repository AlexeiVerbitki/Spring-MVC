package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_2.Chapter_2_Exercise;
import java.util.Scanner;
public class Exercise_2_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        if (x%2 == 0) {
            System.out.printf("%d id an Even number", x);
        } else {
            System.out.printf("%d id an Odd number", x);
        }

    }
}
