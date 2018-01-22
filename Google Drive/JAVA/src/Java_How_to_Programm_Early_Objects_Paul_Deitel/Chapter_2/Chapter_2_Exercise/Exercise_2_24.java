package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_2.Chapter_2_Exercise;
import java.util.Scanner; // program uses class Scanner
public class Exercise_2_24 {
    public static void main(String[] args) {
        int v, w, x, y, z, largest, smallest;

        // create Scanner to obtain input from command line
        Scanner input = new Scanner(System.in);


        v = input.nextInt();
        w = input.nextInt();
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();

        largest = v;
        smallest = v;
        if (w > largest) largest = w;

        if (x > largest) largest = x;

        if (y > largest) largest = y;

        if (z > largest) largest = z;

        if (w < smallest) largest = w;

        if (x < smallest) largest = x;

        if (y < smallest) largest = y;

        if (z < smallest) largest = z;
        System.out.printf("%d is the largest", largest);
        System.out.printf("\n%d is the smallest", smallest);

    }
}