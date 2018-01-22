package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_7_Arrays.Exercise_Chapter_7;

import Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_7_Arrays.DeckOfCards;

public class deckTest {
    public static void main(String[] args) {
        deckOfCards deck = new deckOfCards();
//        deck.shuffle();
//        deck.dealCards();

        for (int i=1; i <= 5; i++){
            deck.dealOneCard();
            if (i%4==0)
                System.out.printf("\n");
        }
//        deck.shuffle();
//        for (int i=1; i <= 5; i++) {
//            deck.dealOneCard();
//            if (i % 4 == 0)
//                System.out.printf("\n");
//        }
    } // end main
}
