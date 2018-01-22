package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_9.fig09_10_11;// BasePlusCommissionEmployeeTest.java
// Testing class BasePlusCommissionEmployee.

public class BasePlusCommissionEmployeeTest
{
   public static void main(String[] args) 
   {
      // instantiate BasePlusCommissionEmployee object
      BasePlusCommissionEmployee employee = 
         new BasePlusCommissionEmployee(
            "Bob", "Lewis", "333-33-3333", 5000, 0.2, 300);
      
      // get base-salaried commission employee data
      System.out.println(
         "Employee information obtained by get methods:");
      System.out.printf("%n%s %s%n", "First name is",
         employee.getFirstName());
      System.out.printf("%s %s%n", "Last name is",
         employee.getLastName());
      System.out.printf("%s %s%n", "Social security number is",
         employee.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "Gross sales is",
         employee.getGrossSales());
      System.out.printf("%s %.2f%n", "Commission rate is",
         employee.getCommissionRate());
      System.out.printf("%s %.2f%n", "Base salary is",
         employee.getBaseSalary());

      employee.setBaseSalary(1000);

      System.out.printf("%n%s:%n%n%s%n",
         "Updated employee information obtained by toString",
         employee.toString());

      System.out.printf("Hourly Employee:\n");
      HourlyEmployee hourlyEmployee = new HourlyEmployee("Bob", "Lewis", "333-33-3333", 160,10 );

      System.out.printf(hourlyEmployee.toString());
   } // end main
} // end class BasePlusCommissionEmployeeTest


