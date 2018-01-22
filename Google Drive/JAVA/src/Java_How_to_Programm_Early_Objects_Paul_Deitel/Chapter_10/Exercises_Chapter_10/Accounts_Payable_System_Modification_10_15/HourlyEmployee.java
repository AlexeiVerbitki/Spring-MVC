package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_10.Exercises_Chapter_10.Accounts_Payable_System_Modification_10_15;// Fig. 10.6: HourlyEmployee.java
// HourlyEmployee class extends Employee.



public class HourlyEmployee extends Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_10.Exercises_Chapter_10.Accounts_Payable_System_Modification_10_15.Employee
{
   private double wage; // wage per hour
   private double hours; // hours worked for week

   // constructor
   public HourlyEmployee(String firstName, String lastName,
      String socialSecurityNumber, double wage, double hours, int month, int day, int year)
   {
      super(firstName, lastName, socialSecurityNumber, month, day, year);

     setHours(hours);
     setWage(wage);
   } 

   // set wage
   public void setWage(double wage)
   {
      if (wage < 0.0) // validate wage
         throw new IllegalArgumentException(
            "Hourly wage must be >= 0.0");

      this.wage = wage;
   } 

   // return wage
   public double getWage()
   {
      return wage;
   } 

   // set hours worked
   public void setHours(double hours)
   {
      if ((hours < 0.0) || (hours > 252)) // validate hours
         throw new IllegalArgumentException(
            "Hours worked must be >= 0.0 and <= 252.0");

      this.hours = hours;
   } 

   // return hours worked
   public double getHours()
   {
      return hours;
   } 

   // calculate earnings; override abstract method earnings in Employee
   @Override                                                           
   public double getPaymentAmount()
   {                                                                   
      if (getHours() <= 168) // no overtime
         return getWage() * getHours();                                
      else                                                             
         return 168 * getWage() + (getHours() - 168) * getWage() * 1.5;
   }                                          

   // return String representation of HourlyEmployee object              
   @Override                                                             
   public String toString()                                              
   {                                                                     
      return String.format("hourly employee:\n%s%n%s: $%,.2f; %s: %,.2f",
         super.toString(), "hourly wage", getWage(),
         "hours worked", getHours());                                   
   }                                    
} // end class HourlyEmployee




