package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_6;
import java.util.Scanner;
import java.security.SecureRandom;

public class Coin_Tossing_6_29 {
    enum Side {HEADS, TAILS};
    enum Coin {TOSS, STOP};
      Side coin;
      Coin selected;
      int heads;
      int tails;

    public void flip(){
        SecureRandom randomSide = new SecureRandom();
        int random = randomSide.nextInt(Coin.values().length);
        switch(random){
            case 0: {
                coin = Side.HEADS;
                 heads++;
                 break;}
            case 1: {
                coin= Side.TAILS;
                tails++;
                break; }

        }
        System.out.print("This time it's "+ coin);
        System.out.printf("\n-----------");
    } // end method flip

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Coin_Tossing_6_29 user = new Coin_Tossing_6_29();

        do {
            System.out.printf("\nSelect would you like to:\nTOSS[1] STOP[2]: ");
            String number = input.next();
            switch (number){
                case "1": case "TOSS": case "Toss": case "toss":
                    user.flip();
                    user.selected = Coin.TOSS;
                    break;
                case "2": case "STOP": case "Stop": case "stop":
                    System.out.printf("\nHere are your stats:\n");
                    user.selected=Coin.STOP;
                    break;
                default:
                    System.out.printf("The option you have selected is not valid, please try again");
                    System.out.printf("\n-----------");
            }




//        for (int i=0; i<10; i++) {
//            coin.flip();
//        }
        } while(user.selected == Coin.TOSS);


        System.out.printf("\nHeads was %d times",user.heads);
        System.out.printf("\nTails was %d times",user.tails);
    }
}
