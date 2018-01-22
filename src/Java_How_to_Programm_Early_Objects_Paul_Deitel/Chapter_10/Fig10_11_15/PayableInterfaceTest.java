package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_10.Fig10_11_15;

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
      payableObjects[1] = new SalariedEmployee("Olari","Sergiu", "111-222-3333", 10,10,1960,400);
      payableObjects[2] = new SalariedEmployee("John", "Smith", "111-11-1111", 12,31,1990, 800.00);
      payableObjects[3] = new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1,15,1980,1200.00);

      payableObjects[4] = new Invoice("01234", "seat", 2, 375.00);
      payableObjects[5] = new Invoice("56789", "tire", 4, 79.95);

      System.out.println(
         "Invoices and Employees processed polymorphically:");
      // Cycle 12 months
      for (int i=1; i<13; i++) {
         System.out.printf("%n---------------------%n%nThe salary for the %d month is the following:%n", i);
         // generically process each element in array payableObjects
         for (Payable currentPayable : payableObjects) {
             double monthlySalary = currentPayable.getPaymentAmount()*4;

             System.out.printf("%n%s%n",
                     currentPayable.toString() );// could invoke implicitly);
             if (currentPayable instanceof SalariedEmployee)
             {
                 SalariedEmployee salariedEmployee = (SalariedEmployee) currentPayable;
                 if (salariedEmployee.month == i)

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

          System.out.printf("Payment due this week %s%n",monthlySalary);
             // output currentPayable and its appropriate payment amount
//             System.out.printf("Payment due this week %s%n", currentPayable.getPaymentAmount());
// in case you calculate the weekly salary using set
         }
      }
   } // end main
} // end class PayableInterfaceTest

