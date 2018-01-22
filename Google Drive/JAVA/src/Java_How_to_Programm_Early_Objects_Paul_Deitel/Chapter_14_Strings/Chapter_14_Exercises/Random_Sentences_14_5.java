package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_14_Strings.Chapter_14_Exercises;
import java.security.SecureRandom;
public class Random_Sentences_14_5 {
    String[] article = {"the", "a", "one", "some","any"};
    String[] noun = {"boy", "girl", "dog", "town" , "car"};
    String[] verb = {"drove", "jumped", "ran", "walked" , "skipped"};
    String[] preposition = {"to", "from", "over", "under" , "on"};

    public  StringBuilder generateRandomSenences (){
        SecureRandom randomNumber = new SecureRandom();
        StringBuilder sentence = new StringBuilder();
        int randomArticle = randomNumber.nextInt(article.length);
        int randomNoun = randomNumber.nextInt(noun.length);
        int randomVerb = randomNumber.nextInt(article.length);
        int randomPreposition = randomNumber.nextInt(article.length);

//        firstLetter = Character.toUpperCase(article[randomArticle].charAt(0));

        sentence.append(Character.toUpperCase(article[randomArticle].charAt(0))).append(article[randomArticle]).append(" ").append(noun[randomNoun]).append(" ")
                .append(verb[randomVerb]).append(" ").append(preposition[randomPreposition]).append(".").append("\n");
        sentence.deleteCharAt(1);


        return sentence;
    }

    public static void main(String[] args) {
        Random_Sentences_14_5 randomSentences = new Random_Sentences_14_5();
        for (int i=0; i<20; i++) {
            System.out.printf("%s", randomSentences.generateRandomSenences());
        }

    }
}