package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_3.fig03_01_02;// Fig. 3.1: Account2.java
// Account2 class that contains an name instance variable
// and methods to set and get its value.

public class Account
{
   private String name; // instance variable
 
   // method to set the name in the object              
   public void setName(String name)      
   {                                             
      this.name = name; // store the name
   }         

   // method to retrieve the name from the object
   public String getName()        
   {                                    
      return name; // return value of name to caller        
   }         
} // end class Account2



