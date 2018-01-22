package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_8_Classes;

public class Rectangle_8_4 {

    private double length;
    private double width;

    // constructor default
    public Rectangle_8_4(){

        this(0,0);
        System.out.printf("The length were not explicitly set, therefor they were initialized to 0%n%n");
    }

    //constructor
    public Rectangle_8_4(double length, double width) {
        setLength(length);
        setWidth(width);


    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {


        if (length < 0.0)
            throw new IllegalArgumentException("The length is < 0.00 therefore the area will not be calculated%n%n");

        if (length > 20.00)
            throw new IllegalArgumentException("The length is > 20.00 therefore the area will not be calculated%n%n");
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {

        if (width < 0)
            throw new IllegalArgumentException("The width is < 0.00 therefore the area will not be calculated%n%n");
        if (width > 20.00)
            throw new IllegalArgumentException("The width is > 20.00 therefore the area will not be calculated%n%n");
        this.width = width;
    }

    public double Area(){

        return getLength() * getWidth();
    }// end method Area

} // end class Rectangle_8_4

class Rectangle_8_4Test{
    public static void main(String[] args) {

        Rectangle_8_4 Rectangle = new Rectangle_8_4(15.4,9.9);

        System.out.printf("The area is: %.2f m2", Rectangle.Area());
    }
}
