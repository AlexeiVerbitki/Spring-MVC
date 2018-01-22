package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_8_Classes;
// Fig. 8.8: Employee.java // Employee class with references to other objects.

public class Employee
{
    private String firstName;
    private String lastName;
    private Enhancing_Class_Date_8_8 birthEnhancingClassDate88;
    private Enhancing_Class_Date_8_8 hireEnhancingClassDate88;

    // constructor to initialize name, birth date and hire date
    public Employee(String firstName, String lastName, Enhancing_Class_Date_8_8 birthEnhancingClassDate88,
                    Enhancing_Class_Date_8_8 hireEnhancingClassDate88)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthEnhancingClassDate88 = birthEnhancingClassDate88;
        this.hireEnhancingClassDate88 = hireEnhancingClassDate88;
    }

    // convert Employee to String format
    public String toString()
    {
        return String.format("%s, %s  Hired: %s  Birthday: %s",
                lastName, firstName, hireEnhancingClassDate88, birthEnhancingClassDate88);
    }
} // end class Employee