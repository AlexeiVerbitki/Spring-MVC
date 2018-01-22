package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_7_Arrays.Exercise_Chapter_7;
import java.security.SecureRandom;
public class deckOfCards {
    String[] face =  {"Ace", "Deuce", "Three", "Four", "Five", "Six","Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    String[] suite = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static int NUMBER_OF_CARDS = 52;
    card[] deck = new card[NUMBER_OF_CARDS];
    int currentCard;

    public deckOfCards(){

        for (int counter=0; counter < deck.length; counter++){
            deck[counter] = new card(face[counter%13],suite[counter/13]);
        }
    } // end constructor

    public void shuffle(){
        for(int first=0; first<deck.length;first++){
            SecureRandom random = new SecureRandom();
            int second = random.nextInt(NUMBER_OF_CARDS);
            card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
            currentCard =0;
        }
    } // end shuffle

    public void dealCards(){
        for (int counter = 1; counter<=NUMBER_OF_CARDS; counter++){
            System.out.printf("%-19s", deck[counter-1].toString());
            if (counter%4 ==0)
                System.out.printf("\n");

        }
    }// end dealCards
    public void dealOneCard(){
        System.out.printf("%-19s", deck[currentCard++].toString());
    }
}
