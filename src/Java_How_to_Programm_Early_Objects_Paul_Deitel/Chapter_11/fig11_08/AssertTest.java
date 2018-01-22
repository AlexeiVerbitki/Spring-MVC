package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_11.fig11_08;// Fig. 11.8: AssertTest.java
// Checking with assert that a value is within range.

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.*;

public class AssertTest {
    private final static Logger LOGGER = Logger.getLogger(AssertTest.class.getName());

    public static void main(String[] args) {

        int number = 0;
        String hello = "0";
//      if (hello.equals(Integer.toString(number))) {
//         LOGGER.warning("Error in input");


        System.out.print("Enter a number between 0 and 10: ");

        try (Scanner input = new Scanner(System.in)){
            number = input.nextInt();

            assert (number >= 0 && number <= 10) : "bad number: " + number;
        } catch (AssertionError e) {
            System.out.printf(e.getMessage());
        }


//      System.out.printf("You entered %d%n", number);
            System.out.printf("\nCatch executed due to InputMismatchException");

        // end class AssertTest
    }
}
