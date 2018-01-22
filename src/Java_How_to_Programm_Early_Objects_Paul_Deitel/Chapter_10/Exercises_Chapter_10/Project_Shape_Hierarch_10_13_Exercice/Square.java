package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_10.Exercises_Chapter_10.Project_Shape_Hierarch_10_13_Exercice;

public class Square extends TwoDimentionalShape {


    public Square(double side) {
        super(side);
    }

    @Override
    public double getArea() {
        return Math.pow(getLength(), 2);
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "\nSide = %.2f\n", getLength());
    }

    @Override
    public void printInterface() {
        toString();
    }

}
