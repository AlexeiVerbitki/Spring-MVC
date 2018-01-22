package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_8_Classes;
// Fig. 8.9: EmployeeTest.java // Composition demonstration.

public class EmployeeTest
{
    public static void main(String[] args)
    {
        Enhancing_Class_Date_8_8 birth = new Enhancing_Class_Date_8_8(7, 24, 1949);
        Enhancing_Class_Date_8_8 hire = new Enhancing_Class_Date_8_8(3, 12, 1988);
        Employee employee = new Employee("Bob", "Blue", birth, hire);

        System.out.println(employee);
    }
} // end class EmployeeTest