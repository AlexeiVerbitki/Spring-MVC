package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_10.Exercises_Chapter_10.CarbonFootprint_Interface_Polymorphism_10_16;
/*U.S. average energy consumption per sq ft = 12.8 kWh
Average energy consumption per sq ft for a home smaller than 500 sq ft = 44.2 kWh*/

import java.util.Scanner;

public class Building implements CarbonFootprintInterface {
    private final static String[] NERCregionAcronim = {"", "ASCC", "FRCC", "HICC", "MRO", "NPC", "RFC", "SERC", "SPP", "TRE", "WECC"};
    private final static double[] NERCregionEmission = {0, 914.0, 1203.8, 1509.5, 1179.5, 1266.1, 557.8, 1418.7, 1429.9, 1084.0, 894.3};
    private final static String[] NERCregionName = {"", "Alaska Systems Coordinating Council", "Florida Reliability Coordinating Council", "Hawaiian Islands Coordinating Council", "Midwest Reliability Organization", "Northeast Power Coordinating Council", "Reliability First Corporation", "SERC Reliability Corporation", "Southwest Power Pool", "Texas Regional Entity", "Western Electricity Coordinating Council"};
    private String people;
    private double sqft;
    private double carbonFootprint;

    @Override
    public void carbonFootprint() {

        for (int i = 1; i < NERCregionAcronim.length; i++) {
            System.out.printf("\n%2d: %4s - %-43s %7.2f kgCO2 / mWh", i, NERCregionAcronim[i], NERCregionName[i], NERCregionEmission[i]);
        }
        // Region select
        Scanner input = new Scanner(System.in);
        int select = 0;
        do {
            System.out.printf("\n\nSelect the region you live in: ");
            try {
                select = input.nextInt();

                if (select < 0 || select > NERCregionEmission.length)
                    throw new IllegalArgumentException();

                // sqft select
                System.out.printf("Enter the sqft of you building: ");
                sqft = input.nextDouble();
//
                if (sqft < 500)
                    carbonFootprint = sqft * 44.2 / 1000 * NERCregionEmission[select];
                else
                    carbonFootprint = sqft * 12.8 / 1000 * NERCregionEmission[select];
                print();

                System.out.printf("\nTo calculate again select 1 | To stop select 0 : ");
                select = input.nextInt();
                System.out.printf("----------------------------------------------------\n");
            } catch (IllegalArgumentException e) {
                System.out.printf(select + " is not a valid selection\nPlease select one of the option above: from 1 to 10");
                select = 1;
            }
        } while (select > 0 && select < 10);

    }// end carbonFootprint

    @Override
    public String toString() {
        return String.format("%.2f", carbonFootprint);
    }
}
