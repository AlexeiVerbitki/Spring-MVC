package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_3.fig03_05_06;// Fig. 3.6: AccountTest.java
// Using the Account2 constructor to initialize the name instance
// variable at the time each Account2 object is created.

public class AccountTest
{
   public static void main(String[] args)
   { 
      // create two Account2 objects
      Account account1 = new Account("Jane Green");
      Account account2 = new Account("John Blue"); 

      // display initial value of name for each Account2
      System.out.printf("account1 name is: %s%n", account1.getName());
      System.out.printf("account2 name is: %s%n", account2.getName());
   } 
} // end class AccountTest


