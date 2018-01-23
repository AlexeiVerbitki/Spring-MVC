package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_10.Exercises_Chapter_10.CarbonFootprint_Interface_Polymorphism_10_16;

public class Bicycle implements CarbonFootprintInterface{
    @Override
    public void carbonFootprint() {
        print();
    }

    @Override
    public String toString() {
        return "0";
    }
}
