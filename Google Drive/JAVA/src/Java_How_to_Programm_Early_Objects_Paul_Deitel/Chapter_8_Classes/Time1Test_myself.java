package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_8_Classes;

public class Time1Test_myself{
    public static void main(String[] args)
    {
        Time1_myself time = new Time1_myself();
        // display default time
        System.out.printf("\nThe default time is ");
        System.out.println(time.universalTime());
        System.out.println(time.toString());

        time.setTime(20,44,55);

        // What time is it ?
        System.out.printf("\nAfther the time was set the time is\n");
        System.out.println(time.universalTime());
        System.out.println(time.toString());

        try
        {
            time.setTime(99,99,99);
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("\nException: %s", e.getMessage());
        }
        System.out.printf("\n\nTime after the attempt to set an invalid time\n");
        System.out.println(time.universalTime());
        System.out.println(time.toString());

    } // end main

}
