package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_10.Exercises_Chapter_10.Project_Shape_Hierarch_10_13_Exercice;

public class Circle extends TwoDimentionalShape {
    public Circle(double radius, double Pi) {
        super(radius, Pi);

    }

    public Circle(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        return Math.PI * getLength() * getLength();
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "\nRadius = %.2f\n", getLength());
    }

    @Override
    public void printInterface() {
        toString();
    }

}
