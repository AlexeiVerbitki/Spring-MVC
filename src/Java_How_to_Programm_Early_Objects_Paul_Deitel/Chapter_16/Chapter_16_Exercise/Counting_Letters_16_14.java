package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_16.Chapter_16_Exercise;// Fig. 16.18: WordTypeCount.java
// Program counts the number of occurrences of each word in a String.
/*
16.14 (Counting Letters) Modify the program of Fig. 16.18 to count the number of occurrences
of each letter rather than of each word. For example, the string "HELLO THERE" contains two Hs, three
Es, two Ls, one O, one T and one R. Display the results.
*/
import java.util.*;

public class Counting_Letters_16_14
{
   public static void main(String[] args)
   {
      // create HashMap to store String keys and Integer values
      Map<String, Integer> myMap = new HashMap<>(); 

      createMap(myMap); // create map based on user input
      displayMap(myMap); // display map content
   } // end main

   // create map from user input
   private static void createMap(Map<String, Integer> map)
   {
      Scanner scanner = new Scanner(System.in); // create scanner
      System.out.println("Enter a string:"); // prompt for user input
      String input = scanner.nextLine();

      // tokenize the input
      String[] tokens = input.split("");
               
      // processing input text 
      for (String token : tokens) 
      {
         String word = token.toLowerCase(); // get lowercase word
                  
         // if the map contains the word
         if (map.containsKey(word)) // is word in map
         {
            int count = map.get(word); // get current count
            map.put(word, count + 1); // increment count
         } 
         else 
            map.put(word, 1); // add new word with a count of 1 to map
      }
      map.remove(" " );
   }

   
   // display map content
   private static void displayMap(Map<String, Integer> map) 
   {     
      Set<String> keys = map.keySet(); // get keys

      // sort keys
      TreeSet<String> sortedKeys = new TreeSet<>(keys);

      System.out.printf("%nMap contains:%nKey\t\tValue%n");

      // generate output for each key in map
      for (String key : sortedKeys)
         System.out.printf("%-10s%10s%n", key, map.get(key));
      
      System.out.printf(
         "%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
   } 
} // end class WordTypeCount



