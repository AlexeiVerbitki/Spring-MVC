package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_7_Arrays;
// Fig. 7.21: InitArray.java // Initializing an array using command-line arguments.

public class InitArray
{
    public static void main(String[] args)
    {
        // check number of command-line arguments
        if (args.length != 3)
            System.out.printf(
                    "Error: Please re-enter the entire command, including%n" +
                            "an array size, initial value and increment.%n");
        else
        {
            // get array size from first command-line argument
            int arrayLength = Integer.parseInt(args[0]);
            int[] array = new int[arrayLength];

            // get initial value and increment from command-line arguments
            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

            // calculate value for each array element
            for (int counter = 0; counter < array.length; counter++)
                array[counter] = initialValue + increment * counter;

            System.out.printf("%s%8s%n", "Index", "Value");

            // display array index and value
            for (int counter = 0; counter < array.length; counter++)
                System.out.printf("%5d%8d%80s%n", counter, array[counter],"array[counter] = initialValue + increment * counter;" );
        }
    }
} // end class InitArray


/*
// Fig. 7.17: InitArray.java // Initializing two-dimensional arrays.

public class InitArray
{
    // create and output two-dimensional arrays
    public static void main(String[] args)
    {
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};

        System.out.println("Values in array1 by row are");
        outputArray(array1); // displays array1 by row

        System.out.printf("%nValues in array2 by row are%n");
        for (int column = 0; column < array2[2].length; column++)
            array2[2][column] = 0;

        outputArray(array2); // displays array2 by row
    }

    // output rows and columns of a two-dimensional array
    public static void outputArray(int[][] array)
    {
        // loop through array's rows
        for (int row = 0; row < array.length; row++)
        {
            // loop through columns of current row
            for (int column = 0; column < array[row].length; column++)
                System.out.printf("%d  ", array[row][column]);

            System.out.println();
        }
    }
} // end class InitArray*/
