package Java_How_to_Programm_Early_Objects_Paul_Deitel;
// Fig. 3.5: Account2.java // Account2 class with a constructor that initializes the name.

public class Account
{
    private String name; // instance variable

    // constructor initializes name with parameter name
    public Account(String name) // constructor name is class name
    {
        this.name = name;
    }

    // method to set the name
    public void setName(String name)
    {
        this.name = name;
    }

    // method to retrieve the name
    public String getName()
    {
        return name;
    }
} // end class Account2

