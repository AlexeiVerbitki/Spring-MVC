package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_10.Exercises_Chapter_10.CarbonFootprint_Interface_Polymorphism_10_16;

import java.util.ArrayList;
import java.util.Scanner;

public class CarbonTest {
    public static void main(String[] args) {
//        CarbonFootprintInterface building = new Building();
//        building.carbonFootprint();
//
//        CarbonFootprintInterface car = new Car();
//        car.carbonFootprint();
//
//        CarbonFootprintInterface bicycle = new Bicycle();
//        bicycle.carbonFootprint();

        ArrayList<CarbonFootprintInterface> carbonArray = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int select = 0;
        do {
            System.out.printf("\nSelect which carbon footprint would you like to calculate ?:\n1: Building\n2: Car\n3: Bicycle\n4: All the above\n Select: ");

            try {
                select = input.nextInt();
                if (select < 0 || select > 4)
                    throw new IllegalArgumentException();
                carbonArray.add(new Building());
                carbonArray.add(new Car());
                carbonArray.add(new Bicycle());
                switch (select){
                    case 1:
                        carbonArray.get(0).carbonFootprint();
                        select=0;
                        break;
                    case 2:
                        carbonArray.get(1).carbonFootprint();
                        select=0;
                        break;
                    case 3:
                        carbonArray.get(2).carbonFootprint();
                        select=0;
                        break;
                    case 4:
                        for (CarbonFootprintInterface element : carbonArray)
                            element.carbonFootprint();
                        select=0;
                        break;
                }


            } catch (IllegalArgumentException e) {
                System.out.printf("\nonly 1 - 4 is allowed\n");
                select = 1;
            }
        } while (select > 0 && select < 4);


    }
}
