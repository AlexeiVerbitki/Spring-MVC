package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_7_Arrays.Exercise_Chapter_7.old_Exercise;
import java.security.SecureRandom;

public class Exercise_7_18 {
    // Which throw resulted in wins
    static int [] wins = new int[1001];

    // Which throw resulted in wins
    static int [] loses = new int[1001];

    static int[] gameLength = new int[1001];

   static int throwsCount = 0;
    // create secure random number generator for use in method rollDice
    private static final SecureRandom randomNumbers = new SecureRandom();

    // enum type with constants that represent the game status
    private enum Status {CONTINUE, WON, LOST};

    // constants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    // plays one game of craps
    public static void main(String[] args)
    {
        int myPoint = 0; // point if no win or loss on first roll
        Status gameStatus; // can contain CONTINUE, WON or LOST

        // for Cycle

        for (int count =1; count < 1001; count++) {

        int sumOfDice = rollDice(); // first roll of the dice


            // determine game status and point based on first roll
            switch (sumOfDice) {
                case SEVEN: // win with 7 on first roll
                case YO_LEVEN: // win with 11 on first roll
                    gameStatus = Status.WON;
                    ++wins[count];

                    break;
                case SNAKE_EYES: // lose with 2 on first roll
                case TREY: // lose with 3 on first roll
                case BOX_CARS: // lose with 12 on first roll
                    gameStatus = Status.LOST;
                    ++loses[count];

                    break;
                default: // did not win or lose, so remember point
                    gameStatus = Status.CONTINUE; // game is not over
                    myPoint = sumOfDice; // remember the point
                    System.out.printf("Point is %d%n", myPoint);

                    break;
            }

            // while game is not complete
            while (gameStatus == Status.CONTINUE) // not WON or LOST
            {
                sumOfDice = rollDice(); // roll dice again


                // determine game status
                if (sumOfDice == myPoint) // win by making point{
                {
                    gameStatus = Status.WON;
                    ++wins[count];
                } else if (sumOfDice == SEVEN) { // lose by rolling 7 before point
                    gameStatus = Status.LOST;
                    ++loses[count];
                }

            }

            // display won or lost message
            if (gameStatus == Status.WON)
                System.out.printf("Player wins in round %d \n--------------\n", count);
            else
                System.out.printf("Player loses in round %d \n--------------\n", count);

            gameLength[count] = throwsCount;
            throwsCount=0;
        }// end for Cycle

        System.out.printf("\nYou threw the dice %d times", throwsCount);

        Exercise_7_18.WinCount(wins);
    } // end main

    // roll dice, calculate sum and display results
    public static int rollDice()
    {
        ++throwsCount;
        // pick random die values
        int die1 = 1 + randomNumbers.nextInt(6); // first die roll
        int die2 = 1 + randomNumbers.nextInt(6); // second die roll

        int sum = die1 + die2; // sum of die values

        // display results of this roll
        System.out.printf("Player rolled %d + %d = %d%n",
                die1, die2, sum);


        return sum;
    }
    public static void WinCount(int [] winArray){
        System.out.printf("\n\nRound        Wins       Loses\n");

        for (int i=1; i < wins.length; i++) {

            System.out.printf("% -12d  %-10d  %d\n", i, wins[i], loses[i]);

        }
        for (int i=1; i < gameLength.length; i++) {
                System.out.printf("\nRound %d length was %d", i, gameLength[i]);


        }
        int total=0;
        for (int val: gameLength)
            total +=val;
        int average = total/ gameLength.length;
        System.out.printf("\n\nTotal game length is %d\nThe average game length is %d", total, average);
        System.out.println("\nGame length = "+ gameLength.length);
    }
} // end class Exercise_7_18