package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_7_Arrays.Exercise_Chapter_7.old_Exercise;

public class Exercise_7_10 {
//    int [] commisionPay;
    int [] commission;


    // constructor
    public Exercise_7_10(int [] commission){
        this.commission = commission;
    }
// total commission
    public  void Calculations() {
        double total = 0;
        for (int salary : commission) {
            total += salary;
        }



        System.out.printf("%nThe total salary = %f%nTotal commission = %f%n", total, total/100*9);

// ranges
        System.out.printf("%nSalary   Frequency  Sales Commission  Bar Chart");
        int[] frequency = new int[11];
        double [] commisionPay = new double[11];
        for (int counter : commission) {
                ++frequency[counter / 100];
                commisionPay[counter / 100] += counter;
        }

        for (int i=0; i < frequency.length; i++) {
            if (i == 10){
                System.out.printf("\n1000+ = ", frequency[i]);}
            else
                System.out.printf("%n%d00-%d99 =    %-9d %-18f", i, i, frequency[i], commisionPay[i]/100*9);

            for (int counter =1; counter <= frequency[i]; counter++)
                System.out.print("*");

        }

//        for (int counter : frequency){
//            System.out.println("");
//            for (int stars=1; stars <= counter; stars++ )
//                System.out.print("*");
//        }


    }



    public static void main(String[] args) {
        int[] commissions = {100, 200, 300, 555, 501, 599, 999, 552, 557,598, 420, 500, 700 ,150, 480, 634,984,562};
        Exercise_7_10 SalesCommissions = new Exercise_7_10(commissions);
       SalesCommissions.Calculations();




    }
}
