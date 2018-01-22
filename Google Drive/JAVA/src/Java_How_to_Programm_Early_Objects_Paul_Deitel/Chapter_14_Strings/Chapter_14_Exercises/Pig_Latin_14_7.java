package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_14_Strings.Chapter_14_Exercises;
import java.util.Scanner;
public class Pig_Latin_14_7 {

    public  void pigWord(){

        StringBuilder pigSentence = new StringBuilder();
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter your sentence in English:\n");
        String sentence = input.nextLine();
        String[] wordArray = sentence.split(" ");

        for (int counter=0; counter < wordArray.length; counter++){
            StringBuilder word = new StringBuilder();
            word.append(wordArray[counter]);
            word.append(word.charAt(0)).append("ay").append(" ");
            word.deleteCharAt(0);
            pigSentence.append(word);
        }
        System.out.printf("\nYour sentence in Pig Latin is:\n\n");
        System.out.printf("%s",pigSentence);

    }

    public static void main(String[] args) {
        Pig_Latin_14_7 pigLatin = new Pig_Latin_14_7();
        pigLatin.pigWord();


    }
}
