package Setter_Java_Book.Chapter_4_and_5;

public class Recursion_and_Factorial_5_4 {
    long computeI(int n) {
        long result=1;
        for (int i=1; i<=n;i++){
            result *= i;
            System.out.println(i + "! = " + result);
        }
        return result;
    }


        long Recursion_Factorial (int n){
        if (n==1) return n;
        return Recursion_Factorial((n-1)*n);

    }// end method Recursion_Factorial

}// end Recursion_and_Factorial_5_4 class

    class RecursionDemo {
        public static void main(String[] args) {
            Recursion_and_Factorial_5_4 f = new Recursion_and_Factorial_5_4();
            f.computeI(5);

            System.out.println("------------------------------");
            for (int r = 1; r <= 6; r++) {
                System.out.println("! = " + f.Recursion_Factorial(r));
            }
        }
    }