package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_10.Exercises_Chapter_10.Project_Shape_Hierarch_10_13_Exercice;

public class Sphere extends ThreeDimentionalShape {
    public Sphere(double radius, double radius2, double Pi) {
        super(radius, radius2,Pi);

    }

    public Sphere(double radius) {
        super(radius);
    }

    @Override
    public double getVolume() {
        Circle circle = new Circle(getHeight());
        return circle.getArea() * getHeight()*4/3;
//        return Math.pow(getHeight(),3)*4/3*Math.PI;
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
