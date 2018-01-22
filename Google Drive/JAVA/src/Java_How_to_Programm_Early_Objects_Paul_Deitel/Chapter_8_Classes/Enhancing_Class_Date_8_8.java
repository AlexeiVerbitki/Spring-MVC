package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_8_Classes;
// Fig. 8.7: Enhancing_Class_Date_8_8.java // Enhancing_Class_Date_8_8 class declaration.

public class Enhancing_Class_Date_8_8
{
    private int month; // 1-12
    private int day; // 1-31 based on month
    private int year; // any year

    private static final int[] daysPerMonth =
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // constructor: confirm proper value for month and day given the year
    public Enhancing_Class_Date_8_8(int month, int day, int year)
    {
        // check if month in range
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

        if (year <1800)
            throw new IllegalArgumentException("year " + year + " is less than the excepted 1800");

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf(
                "Enhancing_Class_Date_8_8 object constructor for date %s%n", this);
    }

    // return a String of the form month/day/year
    public String toString()
    {
        return String.format("%d/%d/%d", month, day, year);
    }

    public static void main(String[] args) {
        Enhancing_Class_Date_8_8 enhancingClassDate88 = new Enhancing_Class_Date_8_8(02,28,1801);
        System.out.printf(enhancingClassDate88.toString());
    }
} // end class Enhancing_Class_Date_8_8

