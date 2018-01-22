package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_4;
import java.util.Scanner;
public class Factorial_4_37 {


double calculatedFactorial;
double e;
double eTox;

    public double factorial (double counter) {
        double f=1;

        double trigger= 0;

        while(trigger==0) {

            if (counter >= 0) {

                while (counter > 0) {

                    f = f * (counter);
                    counter--;
                }
                trigger = 1;
                calculatedFactorial =f;
            }
            else
            System.out.print("\nEnter a non negative number: ");
        }
        return calculatedFactorial;
    } // end factorial

    public double e (double counter){

        double trigger= 0;
        double E =1;

        while(trigger==0) {

            if (counter >= 0) {

                while (counter > 0) {
                    E = E + 1/ factorial(counter);
                    counter--;
                }
                trigger = 1;

            }
        }
        e = E;

        return e;
    }
    //----------------------------------
    public double eToThePowerOfx (double powerOfe, double x){

        double trigger= 0;
        double E =1;


        while(trigger==0) {

            if (powerOfe >= 0) {

                while (powerOfe > 0) {
//                    double counter2= powerOfe;
//                    while (counter2 > 0) {
//                        x=x*x;
//                        counter2--;
//                    }
//                    E = E + powerOfX (x, powerOfe)/ factorial(powerOfe);
                    E = E + Math.pow(x, powerOfe)/ factorial(powerOfe);
                    powerOfe--;
                }
                trigger = 1;

            }
        }
        eTox = E;

        return eTox;
    }

    public double powerOfX ( double x, double powerOfx){

        double power = x;
        while(powerOfx>1) {
            x = x * power;
            powerOfx--;
        }
        return x;
    } // end powerOfX

    public static void main(String[] args) {
        double number;
        double x;
        Factorial_4_37 calculate = new Factorial_4_37();

        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter factorial: ");
        number = input.nextDouble();
        System.out.print("\nEnter the x : ");
        x = input.nextDouble();


        System.out.printf("\n%.2f! = %.2f",number, calculate.factorial(number));
        System.out.printf("\nConstant e = %.3f", calculate.e(number));
        System.out.printf("\ne to the power of x = %.2f", calculate.eToThePowerOfx(number, x));
        System.out.printf("\n%.2f to the power of %.2f = %.2f", number,x, calculate.powerOfX(number,x));
    }

}// end Factorial