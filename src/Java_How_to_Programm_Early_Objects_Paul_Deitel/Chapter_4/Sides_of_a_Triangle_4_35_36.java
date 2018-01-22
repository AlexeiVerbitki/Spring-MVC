/*4.35 (Sides of a Triangle)
Write an application that reads three nonzero values entered by the user
and determines and prints whether they could represent the sides of a triangle.*/
package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_4;
import java.util.Scanner;
public class Sides_of_a_Triangle_4_35_36 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter side A: "); a = input.nextDouble();
        System.out.printf("Enter side B: "); b = input.nextDouble();
        System.out.printf("Enter side C: "); c = input.nextDouble();

        if (a+b >c && a+c > b && b+c > a) {
            if (a*a+b*b == c*c)
                System.out.printf("\nThis could even be a Right Triangle");
            else
                System.out.printf("\nThis could be a triangle");
        }
        else
            System.out.printf("\nIt's not a triangle, sorry");

    }
}
