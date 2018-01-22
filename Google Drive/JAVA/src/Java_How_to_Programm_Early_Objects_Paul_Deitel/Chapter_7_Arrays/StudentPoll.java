package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_7_Arrays;
// Fig. 7.8: StudentPoll.java // Poll analysis program.


public class StudentPoll
{

    public static void main(String[] args)
    {
        // student response array (more typically, input at run time)
        int[] responses = {1, 2, 5, 4, 13, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3,
                2, 3, 3, 2, 14};
        int[] frequency = new int[6]; // array of frequency counters

        // for each answer, select responses element and use that value
        // as frequency index to determine element to increment


        for (int answer = 0; answer < responses.length; answer++)
        {
            try
            {
                ++frequency[responses[answer]];
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e); // invokes toString method
                System.out.printf("   responses[%d] = %d%n%n",
                        answer, responses[answer]);
            }
        }

        System.out.printf("%s%10s%n", "Rating", "Frequency");

        // output each array element's value
        for (int rating = 1; rating < frequency.length; rating++) {
            Asterics asterics = new Asterics();
            System.out.print("\t"+ rating);
            System.out.print("\t\t" + frequency[rating]);
            asterics.Counter(frequency[rating]);



//            System.out.printf("%6d%10d%n", rating, frequency[rating]);

        }



    }
} // end class StudentPoll