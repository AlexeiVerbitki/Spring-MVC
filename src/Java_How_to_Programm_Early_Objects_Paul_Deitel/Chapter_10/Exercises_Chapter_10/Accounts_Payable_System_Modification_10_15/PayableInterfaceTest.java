package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_10.Exercises_Chapter_10.Accounts_Payable_System_Modification_10_15;

// Fig. 10.15: PayableInterfaceTest.java
// Payable interface test program processing Invoices and 
// Employees polymorphically.
public class PayableInterfaceTest 
{
   public static void main(String[] args)
   {
      // create four-element Payable array
      Payable[] payableObjects = new Payable[6];
      
      // populate array with objects that implement Payable
      payableObjects[0] = new SalariedEmployee("Serghey","Sharkov", "666-10-0503", 2,2,1970,500);
      payableObjects[1] = new BasePlusCommissionEmployee("Olari","Sergiu", "111-222-3333", 5000,0.1,1000,1,1,1980);
      payableObjects[2] = new CommissionEmployee("John", "Smith", "111-11-1111", 12000,0.30,10,12,1987);
//      payableObjects[3] = new HourlyEmployee("Lisa", "Barnes", "888-88-8888", 10,178, 01,18,1988);

      payableObjects[4] = new Invoice("01234", "seat", 2, 375.00);
      payableObjects[5] = new Invoice("56789", "tire", 4, 79.95);

      System.out.println(
         "Invoices and Employees processed polymorphically:");
      // Cycle 12 months
       double grossalesin6months=0;
       for (int i=1; i<13; i++) {
         System.out.printf("%n---------------------%n%nThe salary for the %d month is the following:%n", i);

         // generically process each element in array payableObjects
         for (Payable currentPayable : payableObjects) {
             double monthlySalary = currentPayable.getPaymentAmount();

             System.out.printf("%n%s%n",
                     currentPayable.toString() );// could invoke implicitly);
             if (currentPayable instanceof SalariedEmployee)
             {
                 SalariedEmployee salariedEmployee = (SalariedEmployee) currentPayable;
                 if (salariedEmployee.getMonth() == i)

                 {
                     monthlySalary += 100.00;
// // in case you calculate the weekly salary using set
//  salariedEmployee.setWeeklySalary(salariedEmployee.getWeeklySalary()+100);
//                     System.out.printf("%n%s %n%s: $%,.2f%n",
//                             currentPayable.toString(), // could invoke implicitly
//                             "payment due to birthday", currentPayable.getPaymentAmount()+100);
                     System.out.printf("This month you get $100 bonus for your Birthday%n");
                 }


             }
             //Как быть если суб класс является инстансом супер класса и супер класс вызывается вместо него ???
             if (currentPayable instanceof CommissionEmployee & !(currentPayable instanceof BasePlusCommissionEmployee) ){
                 CommissionEmployee commissionEmployee = (CommissionEmployee) currentPayable;
                 grossalesin6months +=  commissionEmployee.getGrossSales();
                 System.out.printf("grossalesin6months = %.2f\n",grossalesin6months);
                 if (i%6==0 && grossalesin6months > 50000){
                     System.out.printf("Congratulation, you have achieved your 6 months target\nYou get a bonus of $2000\n");
                     monthlySalary+= 2000;
                     grossalesin6months =0;
                 }
             }

          System.out.printf("Payment due %s%n",monthlySalary);
             // output currentPayable and its appropriate payment amount
//             System.out.printf("Payment due this week %s%n", currentPayable.getPaymentAmount());
// in case you calculate the weekly salary using set
         }
      }
   } // end main
} // end class PayableInterfaceTest


