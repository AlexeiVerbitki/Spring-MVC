package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_5;
import java.util.Scanner;
public class Find_the_Smallest_Value_5_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int smallest;
        int number;

        System.out.printf("Enter how many numbers you would like to compare: ");
        int counter = input.nextInt();

        System.out.printf("\nEnter number 1: ");
        number = input.nextInt();
        smallest = number;

        for (int i =2; i < counter+2; i++) {

            System.out.printf("\nEnter number %d: ", i);
            number = input.nextInt();
            if (number <= smallest)
                smallest = number;
        }
        System.out.printf("\nThe smallest number is: %d", smallest);
    }
}
