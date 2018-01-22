package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_14_Strings.Chapter_14_Exercises;
import java.util.Scanner;

public class Displaying_a_Sentence_with_Its_Words_Reversed_14_9 {

    public void reverse (){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter your sentence:\n");
        String sentence = input.nextLine();
        String[] wordArray = sentence.split(" ");

        for (int i = wordArray.length-1; i >=0; i-- ){
            System.out.printf("%s ", wordArray[i]);
        }
    }

    public static void main(String[] args) {
        Displaying_a_Sentence_with_Its_Words_Reversed_14_9 sentence = new Displaying_a_Sentence_with_Its_Words_Reversed_14_9();
        sentence.reverse();
    }
}

