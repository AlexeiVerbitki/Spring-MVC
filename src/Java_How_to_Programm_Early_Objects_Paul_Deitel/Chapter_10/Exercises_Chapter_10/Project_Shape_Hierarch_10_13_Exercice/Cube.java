package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_10.Exercises_Chapter_10.Project_Shape_Hierarch_10_13_Exercice;

public class Cube extends ThreeDimentionalShape {
    public Cube(double side) {
        super(side);

    }

    @Override
    public double getVolume() {
        Square square = new Square(getHeight());
        return square.getArea() * getHeight();
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "\nRadius = %.2f\n", getHeight());

    }
    @Override
    public void printInterface() {
        toString();
    }
}
