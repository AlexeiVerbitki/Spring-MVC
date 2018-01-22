package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_3.Exercise_Chapter_3;

public class Exercise_3_13_EmployeeTest {
    public static void main(String[] args) {
        Exercise_3_13_Employee employee1 = new Exercise_3_13_Employee("Lee", "Kyacommon", 500);
        Exercise_3_13_Employee employee2 = new Exercise_3_13_Employee("Nick", "Barber", 700);

        System.out.printf("%s %s's salary is %.2f\n", employee1.getFirstName(), employee1.getLastName(), employee1.getSalary());
        System.out.printf("%s %s's salary is %.2f\n", employee2.getFirstName(), employee2.getLastName(), employee2.getSalary());

        System.out.printf("\nNow let's give them a raise of 10%%\n\n");
        employee1.setSalary(employee1.getSalary()*1.1);
        employee2.setSalary(employee2.getSalary()*1.1);

        System.out.printf("%s %s's salary became %.2f\n", employee1.getFirstName(), employee1.getLastName(), employee1.getSalary());
        System.out.printf("%s %s's salary became %.2f\n", employee2.getFirstName(), employee2.getLastName(), employee2.getSalary());
    }
}
