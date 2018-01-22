package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_4;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int i = 0;

        while (i == 0) {
            System.out.printf("\nEnter the number of employees from 1 to 3\n");
            int x = input.nextInt();
            if (x < 1 || x > 3) {
                if (counter == 0)
                    System.out.printf("I said from 1 to 3, not more not less\n");
                else
                    System.out.printf("Read the description dammit: 1 to 3\n");
                counter++;
            } else {
                counter = x;
                i = 1;
            }
        } // end while

        if (counter == 1) {
//            employee employee1 = new employee(input.next(), input.nextDouble(), input.nextDouble());
            System.out.printf("Enter employee 1 Name, hours, rate\n");
//            System.out.print("name: "); String employee = input.next();
//            System.out.print("hours: "); double hours = input.nextDouble();
//            System.out.print("rate: $"); double rate = input.nextDouble();
//
//            employee employee1 = new employee(employee, hours, rate);
            employee2 employee1 = new employee2();

            employee1.salary2();
        }
//        else {
//        if (counter == 2) {
////                    System.out.printf("Enter employee 1 Name, hours, rate\n");
////                    employee employee1 = new employee(input.next(), input.nextDouble(), input.nextDouble());
////                    System.out.printf("The employee's pay is: $%.2f\n", employee1.salary());
////
////                    System.out.printf("Enter employee 2 Name, hours, rate\n");
////                    employee employee2 = new employee(input.next(), input.nextDouble(), input.nextDouble());
////                    System.out.printf("The employee's pay is: $%.2f\n", employee2.salary());
//
//            System.out.printf("Enter employee 1 Name, hours, rate\n");
//            System.out.print("name: "); String name = input.next();
//            System.out.print("hours: "); double hours = input.nextDouble();
//            System.out.print("rate: $"); double rate = input.nextDouble();
//
//            employee employee1 = new employee(name, hours, rate);
//            System.out.printf("\n%s's pay is: $%.2f\n",name, employee1.salary());
////                    ----------------------
//            System.out.printf("\nEnter employee 1 Name, hours, rate\n");
//            System.out.print("name: "); String name2 = input.next();
//            System.out.print("hours: "); double hours2 = input.nextDouble();
//            System.out.print("rate: $"); double rate2 = input.nextDouble();
//
//            employee employee2 = new employee(name2, hours2, rate2);
//            System.out.printf("\n%s's pay is: $%.2f\n",name2, employee2.salary());
////
//        }
//        else
//        if(counter ==3){
//            System.out.printf("Enter employee 1 Name, hours, rate\n");
//            employee employee1 = new employee(input.next(), input.nextDouble(), input.nextDouble());
//            System.out.printf("The employee's pay is: $%.2f\n", employee1.salary());
//
//            System.out.printf("Enter employee 2 Name, hours, rate\n");
//            employee employee2 = new employee(input.next(), input.nextDouble(), input.nextDouble());
//            System.out.printf("The employee's pay is: $%.2f\n", employee2.salary());
//
//            System.out.printf("Enter employee 3 Name, hours, rate\n");
//            employee employee3 = new employee(input.next(), input.nextDouble(), input.nextDouble());
//            System.out.printf("The employee's pay is: $%.2f\n", employee3.salary());
//        }
//    }
//}


    }// end class Salary_Calculator_4_20
}

 class employee2 {
    Scanner input = new Scanner(System.in);
    String employee;
    double hours;
    double rate;
    double pay2;

    public employee2() {
        System.out.print("name: ");
        this.employee = input.next();

        System.out.print("hours: ");
        double hours = input.nextDouble();
        if (hours >= 0)
            this.hours = hours;
        else {
            System.out.printf("Hours cant be nagative\n");
            this.hours = input.nextDouble();
        }

        System.out.print("rate: $");
        double rate = input.nextDouble();
        if (rate >= 0)
            this.rate = hours;
        else {
            System.out.printf("Hours cant be nagative\n");

        }

    } // end constructor

    public void  salary2() {

        if (hours <= 40)
            pay2 = hours * rate;
        else
            pay2 = 40 * rate + ((hours - 40) * (rate / 2));
        System.out.printf("%s's pay is: $%.2f\n",employee, pay2);
    }// end method salary
}// end class employee

