package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_5;
import java.util.Scanner;
public class Calculating_Sales_5_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=0;

        System.out.printf("Please enter products and their corresponding quantities\n" +
                          "To stop enter -1 in the product field\n" +
                "P.S. we currently have only 5 products in the system.\n");
        while (i !=-1){
            System.out.printf("\nProduct: "); int product1 = input.nextInt();
            System.out.printf("Quantity: "); int quantity1 = input.nextInt();
            switch(product1){
                case 1:
                    System.out.printf("Product 1 value is %.2f\n", quantity1*2.98);
                    break;
                case 2:
                    System.out.printf("Product 2 value is %.2f\n", quantity1*4.5);
                    break;
                case 3:
                    System.out.printf("Product 3 value is %.2f\n", quantity1*9.98);
                    break;
                case 4:
                    System.out.printf("Product 4 value is %.2f\n", quantity1*4.49);
                    break;
                case 5:
                    System.out.printf("Product 5 value is %.2f\n", quantity1*6.87);
                    break;
                case -1:
                    System.out.printf("Program terminated");
                    break;
                default:
                    System.out.printf("This product is not registered\n");

            }
            i=product1;

        } // end while

    }
} // end class Calculating_Sales_5_17
