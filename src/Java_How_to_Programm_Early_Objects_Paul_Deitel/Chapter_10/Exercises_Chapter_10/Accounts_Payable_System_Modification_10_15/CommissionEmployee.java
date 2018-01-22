package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_10.Exercises_Chapter_10.Accounts_Payable_System_Modification_10_15;// Fig. 10.7: CommissionEmployee.java
// CommissionEmployee class extends Employee.



public class CommissionEmployee extends Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_10.Exercises_Chapter_10.Accounts_Payable_System_Modification_10_15.Employee
{
   private double grossSales; // gross weekly sales
   private double commissionRate; // commission percentage

   // constructor
   public CommissionEmployee(String firstName, String lastName,
      String socialSecurityNumber, double grossSales,
      double commissionRate, int month, int day, int year)
   {
      super(firstName, lastName, socialSecurityNumber, month, day, year);

      setGrossSales(grossSales);
      setCommissionRate(commissionRate);
   }

   // set gross sales amount
   public void setGrossSales(double grossSales)
   {
      if (grossSales < 0.0) // validate
         throw new IllegalArgumentException("Gross sales must be >= 0.0");

      this.grossSales = grossSales;
   }

   // return gross sales amount
   public double getGrossSales()
   {
      return grossSales;
   }

   // set commission rate
   public void setCommissionRate(double commissionRate)
   {
      if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");

      this.commissionRate = commissionRate;
   }

   // return commission rate
   public double getCommissionRate()
   {
      return commissionRate;
   }

   // calculate earnings; override abstract method earnings in Employee
   @Override
   public double getPaymentAmount()
   {
      return getCommissionRate() * getGrossSales();
   }

   // return String representation of CommissionEmployee object
   @Override
   public String toString()
   {
      return String.format("%s\n%s\n%s: $%,.2f; %s: %.2f",
         "commission employee:", super.toString(),
         "gross sales", getGrossSales(),
         "commission rate", getCommissionRate());
   }
} // end class CommissionEmployee



