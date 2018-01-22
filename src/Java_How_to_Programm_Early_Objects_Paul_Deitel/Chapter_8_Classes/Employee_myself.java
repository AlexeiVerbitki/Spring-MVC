package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_8_Classes;

public class Employee_myself {
    private String name;
    private String lastName;
    private Date_myself hire;
    private Date_myself birthday;

    public Employee_myself(String name, String lastName, Date_myself hire, Date_myself birthday)
    {
        this.name=name;
        this.lastName=lastName;
        this.hire = hire;
        this.birthday=birthday;
    }
    public String toString()
    {
      return  String.format("%s %s %s, hired: %s", name,lastName,birthday, hire);
    }
}
