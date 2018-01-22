package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_8_Classes;

public class Time1_myself
{
    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second)
    {
        // verify if the set number are in time range
        if (hour < 0 || hour > 24 || minute > 60 || minute <0 || second >60 || second <0)
        {
            throw new IllegalArgumentException(
                    "hour, minute and/or second was out of range");
            }
            this.hour = hour;
            this.minute = minute;
            this.second = second;

        } // end method setTime
    public String universalTime ()
    {
        return String.format("The time in universal format is %2d:%2d:%2d",hour, minute,second );
    }
    public String toString()
    {
        return String.format("The time in american format is  %2d:%2d:%2d %s",
                (hour < 12 ? hour  : hour %12), minute, second, (hour < 12 ? "AM" : "PM") ) ;
    }
}// end class Time 2

