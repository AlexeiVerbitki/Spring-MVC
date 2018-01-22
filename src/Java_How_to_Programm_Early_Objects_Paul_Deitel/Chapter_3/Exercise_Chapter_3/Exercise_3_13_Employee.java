package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_3.Exercise_Chapter_3;

public class Exercise_3_13_Employee {
    private String firstName;
    private String lastName;
    private double salary;

     public void setFirstName (String firstName){
         this.firstName = firstName;

     }
     public void setLastName( String lastName){
         this.lastName = lastName;
     }
     public void setSalary (double salary){
          if (salary >=0)
              this.salary = salary;

          else
              System.out.printf("\nThe salary can not be negative, please try again");
     }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    // counstructor
    public Exercise_3_13_Employee (String firstName, String lastName, double salary){
         setFirstName(firstName);
         setLastName(lastName);
         setSalary(salary);
    }
}// end class Exercise_3_13_Employee{

