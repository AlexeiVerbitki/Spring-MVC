package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_8_Classes;

public class EmployeeTest_myself {
    public static void main(String[] args) {


        try
        {
            Date_myself birthday = new Date_myself(1990,22, 23);
            Date_myself hire = new Date_myself(2015,04,15);
            Employee_myself Alexei = new Employee_myself(
                    "Alexei","Verbitki", hire, birthday);
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("Error: %s%n%n", e.getMessage());
        }

    } // end main
}
