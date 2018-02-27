package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_16.Chapter_16_Exercise;
/*
16.16 (Counting Duplicate Words) Write a program that determines and prints the number of
duplicate words in a sentence. Treat uppercase and lowercase letters the same. Ignore punctuation.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Counting_Duplicate_Words_16_16 {
    Scanner input = new Scanner(System.in);
    String[] tokens;

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Counting_Duplicate_Words_16_16 main = new Counting_Duplicate_Words_16_16();
        main.createMap(map);
        main.displayMap(map);

    } // end main

    public void createMap(Map<String, Integer> map) {
        System.out.printf("Enter your sentence:\n");
        tokens = input.nextLine().toLowerCase().split(" ");

        for (String key : tokens) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else
                map.put(key, 1);
        }

    } // end createMap

    public void displayMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1)
                System.out.printf("%-10s %d\n", entry.getKey(), entry.getValue());
        }


    }

}


