package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_17_Lambda.Chapter_17_Exercices.Manipulating_a_Stream_Invoice_7_11;

import Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_10.Exercises_Chapter_10.Accounts_Payable_System_Modification_10_15.Invoice;
import javafx.beans.binding.ListBinding;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

/*
Use the class Invoice provided in the exercises folder
with this chapter’s examples to create an array of Invoice objects. Use the sample data shown in
Fig. 17.20. Class Invoice includes four properties—a PartNumber (type int), a PartDescription
(type String), a Quantity of the item being purchased (type int) and a Price (type double). Perform
the following queries on the array of Invoice objects and display the results:
a) Use lambdas and streams to sort the Invoice objects by PartDescription, then display
the results.
b) Use lambdas and streams to sort the Invoice objects by Price, then display the results.
c) Use lambdas and streams to map each Invoice to its PartDescription and Quantity,
sort the results by Quantity, then display the results.
d) Use lambdas and streams to map each Invoice to its PartDescription and the value of
the Invoice (i.e., Quantity * Price). Order the results by Invoice value.
e) Modify Part (d) to select the Invoice values in the range $200 to $500.
*/
public class Manipulating_Stream_invoice_17_11 {
    public static void main(String[] args) {
        ArrayList<Invoice> invoiceArrayList = new ArrayList<>();
        invoiceArrayList.add(new Invoice("83", "Electric sander", 7, 57.98));
        invoiceArrayList.add(new Invoice("24", "Power saw", 18, 99.99));
        invoiceArrayList.add(new Invoice("7", "Sledge hammer", 11, 21.50));
        invoiceArrayList.add(new Invoice("77", "Hammer", 76, 11.99));
        invoiceArrayList.add(new Invoice("39", "Lawn mower", 3, 79.50));
        invoiceArrayList.add(new Invoice("68", "Screwdriver", 106, 6.99));
        invoiceArrayList.add(new Invoice("56", "Jig saw", 21, 11));
        invoiceArrayList.add(new Invoice("3", "Wrench", 34, 7.5));

        System.out.printf("Invoice:");

//       invoiceArrayList.stream().sorted((invoice1, invoice2) -> invoice1.getPartDescription().compareToIgnoreCase(invoice2.getPartDescription())).forEach(element -> System.out.printf("\n%s",element));
        /*a) */
        System.out.printf("Sort by Description\n");
        invoiceArrayList.stream().sorted(Comparator.comparing(Invoice::getPartDescription)).forEach(element -> System.out.printf("\n%s", element));

       /*b) */
        System.out.printf("\n\n------------------------\nSort by Price:");
        invoiceArrayList.stream().sorted(Comparator.comparing(Invoice::getPricePerItem)).forEach(element -> System.out.printf("\n%s", element));

        /*c) */
        System.out.printf("\n\n------------------------\nSort by Part and Quantity:\n");
        invoiceArrayList.stream().sorted(Comparator.comparing(Invoice::getQuantity)).map((partQuantity) -> (partQuantity.getPartDescription() + " - " + partQuantity.getQuantity())).forEach(v -> System.out.printf("%s\n", v));

        /*d) */
        System.out.printf("\n\n------------------------\nSort by Part and Value:\n");
        invoiceArrayList.stream().sorted(Comparator.comparing(value -> value.getQuantity() * value.getPricePerItem()))
                .map((value) -> (value.getPartDescription() + " - " + value.getQuantity() * value.getPricePerItem()) + "$ total value")
                .forEach(v -> System.out.printf("%s\n", v));

         /*e) */
        System.out.printf("\n\n------------------------\nSort by Part and Value between $200 and $500:\n");

        Predicate<Invoice> lessThan500MoreThan200 = (value1) -> (value1.getPricePerItem() * value1.getQuantity() < 500
                && value1.getPricePerItem() * value1.getQuantity() > 200);

        invoiceArrayList
                .stream()
                .filter(lessThan500MoreThan200)
                .sorted(Comparator.comparing(value -> value.getQuantity() * value.getPricePerItem()))
                .map((value) -> (value.getPartDescription() + " - " + value.getQuantity() * value.getPricePerItem()) + "$ total value")
                .forEach(v -> System.out.printf("%s\n", v));

    }
}