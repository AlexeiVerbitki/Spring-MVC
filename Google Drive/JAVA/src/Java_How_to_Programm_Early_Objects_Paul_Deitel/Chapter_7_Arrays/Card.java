package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_7_Arrays;
// Fig. 7.9: Card.java q// Card class represents a playing card.

public class Card
{
    private final String face; // face of card ("Ace", "Deuce", ...)
    private final String suit; // suit of card ("Hearts", "Diamonds", ...)

    // two-argument constructor initializes card's face and suit
    public Card(String face, String suit)
    {
        this.face = face;
        this.suit = suit;
    }

    // return String representation of Card
    public String toString()
    {
        return face + " of " + suit;
    }
} // end class Card