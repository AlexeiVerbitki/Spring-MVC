package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_10.Exercises_Chapter_10.Accounts_Payable_System_Modification_10_15;// Fig. 10.13: Employee.java
// Employee abstract superclass that implements Payable.

public abstract class Employee implements Payable
{
   private final String firstName;
   private final String lastName;
   private final String socialSecurityNumber;
   private  String birthDate;

   private int month; // 1-12
   private int day; // 1-31 based on month
   private int year; // any year

   private static final int[] daysPerMonth =
           {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

   // constructor
   public Employee(String firstName, String lastName, 
      String socialSecurityNumber, int month, int day, int year)
   {
      // Employee constructor
      this.firstName = firstName;
      this.lastName = lastName;
      this.socialSecurityNumber = socialSecurityNumber;

//    ------------------------------------
//      Enhancing_Class_Date_8_8 part of the constructor
      if (month <= 0 || month > 12)
         throw new IllegalArgumentException(
                 "month (" + month + ") must be 1-12");

      // check if day in range for month
      if (day <= 0 ||
              (day > daysPerMonth[month] && !(month == 2 && day == 29)))
         throw new IllegalArgumentException("day (" + day +
                 ") out-of-range for the specified month and year");

      // check for leap year if month is 2 and day is 29
      if (month == 2 && day == 29 && !(year % 400 == 0 ||
              (year % 4 == 0 && year % 100 != 0)))
         throw new IllegalArgumentException("day (" + day +
                 ") out-of-range for the specified month and year");

      this.month = month;
      this.day = day;
      this.year = year;
      this.birthDate = String.format("%d/%d/%d", this.month, this.day, this.year);

//      System.out.printf(
//              "Enhancing_Class_Date_8_8 object constructor for date %s%n", this);

   }

//   public Employee(String firstName, String lastName,
//                   String socialSecurityNumber) {
//      // Employee constructor
//      this.firstName = firstName;
//      this.lastName = lastName;
//      this.socialSecurityNumber = socialSecurityNumber;
//   }


      // return first name
   public String getFirstName()
   {
      return firstName;
   } 

   // return last name
   public String getLastName()
   {
      return lastName;
   } 

   // return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   }

   // return birthDate in String format
   public String getBirthDate(){return birthDate;}

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    // return String representation of Employee object
   @Override
   public String toString()
   {
      return String.format("%s %s %d/%d/%d\nSocial security number: %s",
         getFirstName(), getLastName(),month, day, year, getSocialSecurityNumber());
   }
// Как имплементировать 2й тоСтринг с сигнатурой без даты ?
// @Override
//    public String toString()
//    {
//        return String.format("%s %s \nSocial security number: %s\n",
//                getFirstName(), getLastName(), getSocialSecurityNumber());
//    }
   // Note: We do not implement Payable method getPaymentAmount here so 
   // this class must be declared abstract to avoid a compilation error.



} // end abstract class Employee


