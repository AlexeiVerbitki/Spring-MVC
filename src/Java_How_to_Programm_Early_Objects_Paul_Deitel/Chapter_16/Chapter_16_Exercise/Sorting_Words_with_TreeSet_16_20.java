package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_16.Chapter_16_Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/*
16.20 (Sorting Words with a TreeSet) Write a program that uses a String method split to tokenize
a line of text input by the user and places each token in a TreeSet. Print the elements of the
TreeSet. [Note: This should cause the elements to be printed in ascending sorted order.]
*/
public class Sorting_Words_with_TreeSet_16_20 {
    String[] tokens;
    SortedSet<String> sortedSet;

    public void createTreeSet() {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter you text:\n");
        tokens = input.nextLine().toLowerCase().split(" ");
        sortedSet = new TreeSet<>(Arrays.asList(tokens));

    }
    public void printSet (SortedSet<String> sortedSet){
        System.out.printf("\nYour sortedSet looks like this: \n");
        for (String elements : sortedSet)
            System.out.printf("%s\n", elements);
    }

    public static void main(String[] args) {
        Sorting_Words_with_TreeSet_16_20 main = new Sorting_Words_with_TreeSet_16_20();
        main.createTreeSet();
        main.printSet(main.sortedSet);
    }


} // end class
