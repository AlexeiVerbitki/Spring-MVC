package Java_How_to_Programm_Early_Objects_Paul_Deitel;

public class DiamondPrint {
    public static void main(String[] args) {
        int diamondSize=19;
        int a = diamondSize%2;
            for (int i=1; i<diamondSize; i+=2){

                for (int spaces = 1; spaces < diamondSize-i; spaces+=2){
                    System.out.print(" ");
                }

                for(int asterics = diamondSize-i; asterics <diamondSize; asterics++){
                    System.out.print("*");
                }
                System.out.println("");
            } // end for

        for (int i=1; i<diamondSize; i+=2){

            for(int asterics = diamondSize-i-2; asterics < diamondSize; asterics+=2){
                System.out.print(" ");
            }

            for (int spaces = i; spaces < diamondSize-3; spaces++){
                System.out.print("*");
            }


            System.out.println("");
        } // end for

        } // end main
    }  // end class DiamondPrint

