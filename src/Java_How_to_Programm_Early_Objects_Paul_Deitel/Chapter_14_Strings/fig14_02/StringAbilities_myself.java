package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_14_Strings.fig14_02;

public class StringAbilities_myself {
    public static void main(String[] args) {
        String message = new String("evil deserts");

        char [] letterArray = new char[12];
        char [] letterArray2 = new char[12];
        int arrayPosition =0;

        System.out.printf("The initial message is: \n%s\n", message);
        System.out.printf("\n");
        System.out.print("The message backwards: \n");
        for (int count = message.length()-1; count >=0; count --){
            System.out.printf("%s", message.charAt(count));

            letterArray[arrayPosition]= message.charAt(count);
            arrayPosition++;
        } // end for

        System.out.print("\nletterArray message is:\n");
        for (char character : letterArray) {
            System.out.printf("%c", character);
        }

        message.getChars(2,7,letterArray2,2);

        System.out.printf("\n\nletterArray2: \n");
        for (char character : letterArray2) {
            System.out.printf("%c", character);
        }

//        System.out.printf("\n\nletterArray2 : %s", letterArray2.toString());


    } // end main
} // end class
