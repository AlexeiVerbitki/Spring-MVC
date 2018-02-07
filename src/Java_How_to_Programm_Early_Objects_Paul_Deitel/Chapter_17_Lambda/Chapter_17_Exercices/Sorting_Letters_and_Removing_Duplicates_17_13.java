package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_17_Lambda.Chapter_17_Exercices;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Sorting_Letters_and_Removing_Duplicates_17_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Input your letters:\n");
        List<Character>  characters = new ArrayList<>();
        char[] letters = input.nextLine().toCharArray();
        for (char element: letters)
            characters.add(element);

        System.out.printf("\nYour letters in ascending order and without duplicates\n");
        characters.stream().distinct().sorted().forEach(value-> System.out.printf("%s",value));
        System.out.printf("\n");
        System.out.printf("\nYour letters in descending order and without duplicates\n");
        characters.stream().distinct().sorted(Comparator.reverseOrder()).forEach(value-> System.out.printf("%s",value));
    }
}
