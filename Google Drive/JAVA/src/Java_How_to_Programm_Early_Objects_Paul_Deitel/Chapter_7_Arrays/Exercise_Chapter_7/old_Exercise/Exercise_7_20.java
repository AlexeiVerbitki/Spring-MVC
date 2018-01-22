package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_7_Arrays.Exercise_Chapter_7.old_Exercise;
import java.security.SecureRandom;
class Calculations {

}

public class Exercise_7_20 {
    /*Here's how the array will look like:
    *           Salesperson1  Salesperson2 Salesperson3 Salesperson4
    * Product 1       x       y
    * Product 2       x       y
    * Product 3       x       y
    *
    * */
    public static final int  SALESPEOPLE = 4;
    public static final int  PRODUCTS = 5;
    static int [][] sales = new int [PRODUCTS][SALESPEOPLE];
    static SecureRandom RandomSales = new SecureRandom();

    public void Totals(int sales[][]){
        System.out.printf("%-5s%-5s%-5s%-5s", "          Person 1 ","Person 2 ","Person 3 ", "Person 4\n");
        int columnTotal = 0;
        for (int row =0; row < sales.length; row++) {
            System.out.printf("Product %-4d", row + 1);
            int rowTotal = 0;
            columnTotal = 0;

            for (int column = 0; column < sales[row].length; column++) {
                System.out.printf("%-9d", sales[row][column]);
                rowTotal = rowTotal + sales[row][column];
            }
            System.out.println("| Total = " + rowTotal);
        }
// Calculate and print Column totals
        System.out.printf("%-7s%-10s%-10s%-10s", "          Total 1 ","Total 2 ","Total 3 ", "Total 4\n          ");
            for (int col=0; col < sales[col].length; col++){
                for (int r =0; r < sales.length; r++) {
                    columnTotal += sales[r][col];

                }
                System.out.printf("%-10d", columnTotal);
                columnTotal=0;
        }

    } // end Totals method

    public static void main(String[] args) {
        // create Random sales data
        for (int row =0; row < sales.length; row++){
            for (int column=0; column < sales[row].length; column++)
                sales[row][column] = RandomSales.nextInt(999);
        }
        // Print the rows an columns

        Exercise_7_20 Sales = new Exercise_7_20();
        Sales.Totals(sales);
    }// end main

} // end class Exercise_7_20

