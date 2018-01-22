package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_3.Exercise_Chapter_3;

public class Exercise_3_12_InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Balka", "#1", -30, -50);

//        invoice.setQuantity(100);
//        invoice.setPrice(50);
//        invoice.setPartNumber("Balka");
//        invoice.setPartNumber("#2");

        System.out.printf("Price: %.2f\n", invoice.getPrice());
        System.out.printf("Quantity: %d\n", invoice.getQuantity());
        System.out.printf("Part Description: %s\n",invoice.getPartDescription());
        System.out.printf("Part Number: %s\n", invoice.getPartNumber());

        invoice.getInvoice();






    }
}
