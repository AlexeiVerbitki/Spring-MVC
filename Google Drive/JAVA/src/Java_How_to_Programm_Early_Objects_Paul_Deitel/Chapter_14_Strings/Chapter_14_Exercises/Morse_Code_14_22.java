package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_14_Strings.Chapter_14_Exercises;
import java.util.Scanner;
public class Morse_Code_14_22 {

    String letterString = " abcdefghigklmnopqrstuvwxyz";
    String[] letters = {" ","a","b","c","d","e","f","g","h","i","g","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    String[]code = {" ",".-","-...","-.-.","-..",".","...-.","--.","....","..",".---","-.-",".-..","--",
                    "-.","---",".--.","--.-", ".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

//this method was first and I find it more elegant
    public void convert(String sentence){

        for (int counter =0; counter <sentence.length(); counter++){
            sentence.charAt(counter); // letter at index counter
            letterString.indexOf(sentence.charAt(counter)); //index of the letter in String letters
            System.out.printf("%s  ", code[letterString.indexOf(sentence.charAt(counter))]);
        }

    } // end convert

    public void lettrsToMorse(String sentence){

       for (int i= 0; i < sentence.length(); i++) {
           for (int counter = 0; counter < letters.length; counter++) {
               if (sentence.substring(i, i + 1).equals(letters[counter])) {
                   System.out.printf("%s  ", code[counter]);
               }
           }
       }
   } // end lettrsToMorse

    public void morseToLetters(String sentence){
       String[] symbols = sentence.split("\\s");

        for (int i= 0; i < symbols.length; i++) {
            for (int counter = 0; counter < code.length; counter++) {
                if (symbols[i].equals(code[counter])) {
//                    System.out.printf("%s", letterString.charAt(counter));
                    System.out.printf("%s", letters[counter]);
                }
            }
        }

    } // end morseToLetters

    public static void main(String[] args) {
        Morse_Code_14_22 code = new Morse_Code_14_22();
        Scanner input = new Scanner(System.in);
        System.out.printf("Would you like to conver to:\n" +
                "1: to Morse\n" +
                "2: to English\n");
        String selector = input.nextLine();

        System.out.printf("\nEnter your sentence: \n");
        String sentence = input.nextLine();
        switch (selector) {
            case "1": case "Morse": case "morse":
                System.out.printf("\nYour sentence in Morse:\n");
                code.lettrsToMorse(sentence);
                break;
            case "2": case "English": case "english":
                System.out.printf("\nYour sentence in English:\n");
                code.morseToLetters(sentence);
                break;
            default:
                System.out.printf("You had one job: pick 1 or 2...\n" +
                        "Let's pretend this never happened.");
        }

    }

}
//thisisasimpleyetchallengingcache
// - .... .. ... / .. ... / .- / ... .. -- .--. .-.. . --..-- / -.-- . - / -.-. .... .- .-.. .-.. . -. --. .. -. --. / -.-. .- -.-. .... . .-.-.-


