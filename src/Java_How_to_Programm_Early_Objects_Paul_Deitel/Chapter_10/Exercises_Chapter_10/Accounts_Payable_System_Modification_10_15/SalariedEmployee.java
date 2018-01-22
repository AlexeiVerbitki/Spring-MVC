package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_10.Exercises_Chapter_10.Accounts_Payable_System_Modification_10_15;

// Fig. 10.14: SalariedEmployee.java
// SalariedEmployee class that implements interface Payable.
// method getPaymentAmount.
public class SalariedEmployee extends Employee
{
   private double weeklySalary;

   // constructor
   public SalariedEmployee(String firstName, String lastName, 
      String socialSecurityNumber, int month, int day, int year, double weeklySalary)
   {
      super(firstName, lastName, socialSecurityNumber,  month,  day,  year);

      if (weeklySalary < 0.0)
         throw new IllegalArgumentException(
            "Weekly salary must be >= 0.0");

      this.weeklySalary = weeklySalary;
   } 

   // set salary
   public void setWeeklySalary(double weeklySalary)
   {
      if (weeklySalary < 0.0)
         throw new IllegalArgumentException(
            "Weekly salary must be >= 0.0");

      this.weeklySalary = weeklySalary;
   } 

   // return salary
   public double getWeeklySalary()
   {
      return weeklySalary;
   } 

   // calculate earnings; implement interface Payable method that was
   // abstract in superclass Employee                                
   @Override                                                         
   public double getPaymentAmount()                                  
   {                                                                 
      return getWeeklySalary()*4;
   } 

   // return String representation of SalariedEmployee object   
   @Override                                                    
   public String toString()                                     
   {                                                            
      return String.format("salaried employee: \n%s%n%s: $%,.2f",
         super.toString(), "weekly salary", getWeeklySalary());
   } 
} // end class SalariedEmployee
