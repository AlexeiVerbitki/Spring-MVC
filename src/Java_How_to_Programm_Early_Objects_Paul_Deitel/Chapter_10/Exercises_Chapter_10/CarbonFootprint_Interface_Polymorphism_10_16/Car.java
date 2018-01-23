package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_10.Exercises_Chapter_10.CarbonFootprint_Interface_Polymorphism_10_16;

import java.util.Scanner;

public class Car implements CarbonFootprintInterface {
    private double mpg;
    private double mileage;
    private double carbonFootprint;

    public Car() {

    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        if (mpg < 0)
            throw new IllegalArgumentException("mpg can't be < 0");
        this.mpg = mpg;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        if (mpg < 0)
            throw new IllegalArgumentException("mileage can't be < 0");
        this.mileage = mileage;
    }

    public double getCarbonFootprint() {
        return carbonFootprint;
    }

    public void setCarbonFootprint(double carbonFootprint) {
        this.carbonFootprint = carbonFootprint;
    }

    @Override
    public void carbonFootprint() {
        Scanner input = new Scanner(System.in);
        System.out.printf("\nEnter your car's mpg: ");
        setMpg(input.nextDouble());

        System.out.printf("Enter the amount of miles you do a year: ");
        setMileage(input.nextDouble());
        carbonFootprint= getMileage() / getMpg() * 8.91;
        print();
        //Unleaded gasoline emits 8.91 kg of CO2 per gallon. (Source: US DOE 1605(b) Voluntary Reporting of Greenhouse Gases Program.)
    }
    @Override
    public String toString(){
        return String.format("%.2f",carbonFootprint);
    }
}
