package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_8_Classes;

public class Date_myself {
    private int year;
    private int month;
    private int day;

    public Date_myself(int year, int month, int day)
    {
        if (month <= 0 || month >12 )
            throw new IllegalArgumentException(month + " is not a valid month" );

        this.year=year;
        this.month = month;
        this.day=day;
    }
public String toString()
{
    return String.format("%d/%d/%d", year, month, day);
}

}// end Date_myself
