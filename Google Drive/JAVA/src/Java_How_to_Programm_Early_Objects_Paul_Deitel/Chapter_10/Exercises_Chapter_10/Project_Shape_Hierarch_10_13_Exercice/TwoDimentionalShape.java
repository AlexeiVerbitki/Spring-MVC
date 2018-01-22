package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_10.Exercises_Chapter_10.Project_Shape_Hierarch_10_13_Exercice;//package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_10.Exercises_Chapter_10.Project_Shape_Hierarch_10_13_Exercice;

public abstract class TwoDimentionalShape extends Shape implements ShapeInterface {
    private double length;
    private double width;
    private double area;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <0 )
            throw new IllegalArgumentException();
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (length <0 )
            throw new IllegalArgumentException();
        this.width = width;
    }

    public TwoDimentionalShape (double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public TwoDimentionalShape(double param) {
        setLength(param);
    }

    public double getArea(){
        area = getLength()*getWidth();
        return area;
    }

    @Override
    public String toString() {
        return String.format("\nThe object is a %s which is a %s%nThe area = %.2f", this.getClass().getName(),getClass().getSuperclass().getName(),getArea());
    }
} // end TwoDimentionalShape
