package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_7_Arrays.Exercise_Chapter_7.old_Exercise;

import java.security.SecureRandom;
public class Exercise_7_17 {

 public static void main(String[] args) {
  RolltheDice.RollDie();
 }

} // end class Exercise_7_17

 class RolltheDice {

 static SecureRandom DiceToss = new SecureRandom();

 public static void RollDie() {

  int[] sumArray = new int[360001];
  int[] frequency = new int[13];

  for (int i = 0; i < 360000; i++) {
   int die1 = 1 + DiceToss.nextInt(6);
   int die2 = 1 + DiceToss.nextInt(6);

   int sum = die1 + die2;
   sumArray[i] = sum;
  }

   for(int element: sumArray) {
    System.out.printf("%d ", element);
   }

    for (int count : sumArray) {
     ++frequency[count];
    }
    for (int i=0; i < frequency.length; i++)
     System.out.printf("\nThe sum %2d was rolled %d times", i , frequency[i]);









  } // end method

} // end class DieRoll