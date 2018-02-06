package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_17_Lambda.Chapter_17_Exercices.Summarizing_the_Characters_in_a_File_17_9;// Fig. 17.17: StreamOfLines.java
/*
17.9 (Summarizing the Characters in a File) Modify the program of Fig. 17.17 to summarize
the number of occurrences of every character in the file.
*/

// Counting word occurrences in a text file.
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StreamOfLines
{
   public static void main(String[] args) throws IOException
   {
      // Regex that matches one or more consecutive whitespace characters
      Pattern pattern = Pattern.compile("");

      // count occurrences of each word in a Stream<String> sorted by word
      Map<String, Long> wordCounts = 
         Files.lines(Paths.get("/Users/Alexei/Google Drive/JAVA/src/Java_How_to_Programm_Early_Objects_Paul_Deitel/Chapter_17_Lambda/Exercises_17/Summarizing_the_Characters_in_a_File_17_9/Chapter2Paragraph.txt"))
//              .map(line -> line.replaceAll("\\p{Punct}", ""))
              .flatMap(line -> pattern.splitAsStream(line))
              .collect(Collectors.groupingBy(String::toLowerCase,
                 TreeMap::new, Collectors.counting()));
      
      // display the words grouped by starting letter
      wordCounts.entrySet()
         .stream()
         .collect(
            Collectors.groupingBy(entry -> entry.getKey().charAt(0),
               TreeMap::new, Collectors.toList()))
         .forEach((letter, wordList) -> 
            { 
               System.out.printf("%n%C%n", letter);
               wordList.stream().forEach(word -> System.out.printf(
                  "%13s: %d%n", word.getKey(), word.getValue()));
            });
   }
} // end class StreamOfLines


