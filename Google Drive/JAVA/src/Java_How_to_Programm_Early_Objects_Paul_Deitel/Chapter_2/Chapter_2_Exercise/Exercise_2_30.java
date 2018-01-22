package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_2.Chapter_2_Exercise;
import java.util.Scanner;
public class Exercise_2_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, tensOfThousands, thousands, hudreds, tens, units;
        x = input.nextInt();

        tensOfThousands = x / 10000;
        thousands = x / 1000;
        hudreds = x / 100 ;
        tens = x / 10 - x % 1;
        units = x / 1000 - x % 100;


        System.out.printf("%d\t", tensOfThousands);
        System.out.printf("%d\t", thousands);
        System.out.printf("%d\t", hudreds);
        System.out.printf("%d\t", tens);
        System.out.printf("%d\t", units);

    }
}
