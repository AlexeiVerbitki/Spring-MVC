package Java_How_to_Programm_Early_Objects_Paul_Deitel;

import java.security.SecureRandom;
public class Vraps_by_Myself {
    private static final int SEVEN = 7;
    private static final int TWO = 2;
    private static final int ELEVEN = 11;


    private static SecureRandom RandomNumbers = new SecureRandom();

    public static int RollDices () {
        int die1 = 1+RandomNumbers.nextInt(6);
        int die2 = 1+RandomNumbers.nextInt(6);
        int sum = die1+die2;


        // display results of this roll
        System.out.printf("Player rolled %d + %d = %d%n",
                die1, die2, sum);

        return sum;
    } //end method RollDice

    private enum Status {WIN, LOST, CONTINUE}

    public static void main(String[] args) {
        int diceToss = RollDices(); // first roll of the dice
        Status tossStatus;
        int myPoint = 0;
        switch(diceToss){
            case SEVEN:
                tossStatus = Status.WIN; break;
            case ELEVEN:
                tossStatus = Status.LOST; break;
            default:
                tossStatus = Status.CONTINUE; break;
        } //  end switch
        if (tossStatus==Status.WIN) System.out.println("You won");
        if (tossStatus==Status.LOST) System.out.println("You Lost");

        myPoint=diceToss;
        System.out.println("On the first throw the player's point is: " +myPoint);

        while (tossStatus==Status.CONTINUE){
            diceToss = RollDices(); // roll dice again
            /*myPoint = RollDices();*/

            if (diceToss==myPoint)
                tossStatus= Status.WIN;

            if (diceToss==ELEVEN)
                tossStatus=Status.LOST;

        }
        if (tossStatus==Status.WIN) System.out.println("You won");
        if (tossStatus==Status.LOST) System.out.println("You Lost");


    } // end main


} // end class Vraps_by_Myself
