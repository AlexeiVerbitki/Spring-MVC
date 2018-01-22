package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_7_Arrays.Exercise_Chapter_7;
import java.security.SecureRandom;
public class Dice_Rolling_7_17 {
    int dice1;
    int dice2;
    int[][] frequency = new int[7][7];
    private int DICE_FACES = 6;
    int[] frequencyTotal = new int [13];

    public int rollDice(int numberOfThrows){
        SecureRandom random = new SecureRandom();
        int diceTotal=0;
        for (int counter=1; counter < numberOfThrows; counter++) {
            dice1 = 1 + random.nextInt(DICE_FACES);
            dice2 = 1 + random.nextInt(DICE_FACES);
            ++frequency[dice1][dice2];
            ++frequencyTotal[diceTotal];
            diceTotal = dice1 + dice2;
        }
        return diceTotal;
    }
    public void frequency(){

        System.out.printf("\nHere is the frequency in tabular format:\n\n");
        System.out.printf("   1  2  3  4  5  6\n");
        for (int row=1; row < frequency.length; row++){
            System.out.printf("%d ", row);
                for (int column = 1; column < frequency[row].length; column++){
                    System.out.printf("%2d ", frequency[row][column]);
            }
            System.out.printf("\n");
        }

        System.out.printf("\nBelow is the frequency of the roll results:\n\n");
        for (int counter = 2; counter< frequencyTotal.length; counter++){
            System.out.printf("\n%2d = %3d times ",counter, frequencyTotal[counter]);
            for (int counter2 =1; counter2 < frequencyTotal[counter]; counter2++){
                System.out.printf("*");
            }
        }

    }

    public static void main(String[] args) {

        Dice_Rolling_7_17 Dice = new Dice_Rolling_7_17();
//        for (int counter=1; counter < 2400; counter++){
////            System.out.printf("Roll %d = %d\n",counter, Dice.rollDice());
//            ++frequencyTotal[Dice.rollDice()];
//        }
        Dice.rollDice(240);
        Dice.frequency();
    }
}
