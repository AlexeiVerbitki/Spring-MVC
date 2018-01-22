package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_7_Arrays;
import javax.swing.JOptionPane;
import java.security.SecureRandom;
import java.util.Arrays;


public class AirlineReservationSystem {
    static SecureRandom randomSeat = new SecureRandom();
    static int seat;
    static int seat2;
    public static Boolean [] seatPlan = {false,false,false,false,false,false,false,false,false,false,false,};
    static int  maxseatsforclass;





    public static void reserveSeat(int test){
        String input = JOptionPane.showInputDialog("Enter 1 for ecomony\nEnter 2 for Business\nEnter 3 to exit");
        int answer = Integer.parseInt(input);

        if (answer == 1){
            seat = 1 + randomSeat.nextInt(5);
        }
        else if (answer==1){
            seat = 5 + randomSeat.nextInt(6);
        }

        if (seatPlan[seat]==false ) {
            System.out.printf("You have been assigned seat # %d\n", seat);

            seatPlan[seat] = true;

            ++maxseatsforclass;
            if (maxseatsforclass<5)
                reserveSeat(answer);
            else System.out.println("all the seats were reserved for this class");




        }
        else {
//            System.out.printf("\nSeat %d is taken\n", seat);
            if (maxseatsforclass < 5)
                reserveSeat(answer);

        }


    } // end method reserveSeat

    public static void main(String[] args) {


        AirlineReservationSystem run = new AirlineReservationSystem();



            run.reserveSeat(0);

        }
    } // end class AirlineReservationSystem
