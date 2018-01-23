package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_10.Exercises_Chapter_10.CarbonFootprint_Interface_Polymorphism_10_16;

public interface CarbonFootprintInterface {
    void carbonFootprint();

    default void print() {
        System.out.printf("\nThe %s's carbon footprint is: %s kg CO2\n" , this.getClass().getSimpleName(), toString());
    }
}
