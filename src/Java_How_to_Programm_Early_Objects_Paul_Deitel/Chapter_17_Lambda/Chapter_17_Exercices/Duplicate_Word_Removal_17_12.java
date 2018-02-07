package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_17_Lambda.Chapter_17_Exercices;
/*
17.12 (Duplicate Word Removal) Write a program that inputs a sentence from the user (assume
no punctuation), then determines and displays the unique words in alphabetical order. Treat uppercase
and lowercase letters the same.
*/

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Duplicate_Word_Removal_17_12 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words;
        ArrayList<String> wordsList = new ArrayList();
//        String sentence = input.nextLine();
//        words = sentence.split(" ");
        words = input.nextLine().split(" ");
        for (String element : words)
            wordsList.add(element);

//        Stream.of(words).filter(word -> Collections.frequency(word,words)==1).sorted().forEach(value-> System.out.printf("%s\n",value));
        wordsList.stream().map(String::toLowerCase).sorted().distinct().forEach((value)-> System.out.printf("%s\n",value));

    }
}
