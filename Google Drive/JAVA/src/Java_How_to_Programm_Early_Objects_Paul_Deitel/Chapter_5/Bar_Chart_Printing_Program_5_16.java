package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_5;
import java.util.Scanner;
public class Bar_Chart_Printing_Program_5_16 {


    public static void asterics (int number){
        for (int counter = 0 ; counter < number; counter++){
            System.out.printf("*");
        }
        System.out.printf("\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: "); int a = input.nextInt();
        System.out.printf("Enter a number: "); int b = input.nextInt();
        System.out.printf("Enter a number: "); int c = input.nextInt();
        System.out.printf("Enter a number: "); int d = input.nextInt();
        System.out.printf("Enter a number: "); int e = input.nextInt();
        System.out.printf("\n\n");

        asterics(a);
        asterics(b);
        asterics(c);
        asterics(d);
        asterics(e);
    }
}
