package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_16.Chapter_16_Exercise;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicate_Elimination_16_13 {
    Set<String> uniquesSet = new HashSet<>();
    Scanner input = new Scanner(System.in);
    String [] words;
    public Duplicate_Elimination_16_13(){
        System.out.printf("Enter your names:\n");
        words = input.nextLine().split(" ");


        for (String element : words)
            uniquesSet.add(element);

    }
    public void Search (){
        System.out.printf("Enter the search word:\n");
        String search = input.nextLine();
        if (uniquesSet.contains(search))
            System.out.printf("Word Found");
            else
            System.out.printf("Word not found");
    }
    public static void main(String[] args) {
        Duplicate_Elimination_16_13 exercise = new Duplicate_Elimination_16_13();

        exercise.Search();


//        for (String element : uniquesSet)
//            System.out.printf("\n%s", element);
    }
}
