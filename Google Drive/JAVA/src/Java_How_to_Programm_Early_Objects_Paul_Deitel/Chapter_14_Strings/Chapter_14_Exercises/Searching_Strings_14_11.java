package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_14_Strings.Chapter_14_Exercises;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Searching_Strings_14_11 {
    public void search() {
        Scanner input = new Scanner(System.in);
        int frequency=0;
        int lastPosition = 0;
        System.out.printf("Enter your sentence:\n");
        String sentence = input.nextLine();
        System.out.printf("Enter look up character:\n");
//        String character = input.nextLine();
        String character = input.nextLine();
//        for (int counter = 0; lastPosition >=0; counter++) {
//            lastPosition = sentence.indexOf(character, lastPosition+1);
////            System.out.printf("Last position: %s\n",sentence.indexOf(character, lastPosition));
//            if (lastPosition>0)
//            frequency++;
//        }
        Pattern expression = Pattern.compile("[a-z]*");
        Matcher matcher = expression.matcher(character);
        while (matcher.find()){
            frequency++;
        }

        System.out.printf("\nCharacter %s was found %d times",character, frequency);
    }

    public static void main(String[] args) {
        Searching_Strings_14_11 sentence = new Searching_Strings_14_11();
        sentence.search();


    }
}