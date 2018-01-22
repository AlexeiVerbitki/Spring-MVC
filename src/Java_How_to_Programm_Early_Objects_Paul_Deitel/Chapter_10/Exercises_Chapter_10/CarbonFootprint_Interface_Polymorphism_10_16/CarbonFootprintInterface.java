package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_10.Exercises_Chapter_10.CarbonFootprint_Interface_Polymorphism_10_16;

public interface CarbonFootprintInterface {
    double carbonFootprint();

    default String print() {
        return String.format("\nThe carbon footprint for %s is:\n%s" , this, toString());
    }
}
