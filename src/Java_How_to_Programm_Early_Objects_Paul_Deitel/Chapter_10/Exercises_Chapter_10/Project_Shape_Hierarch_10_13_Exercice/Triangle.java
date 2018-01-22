package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_10.Exercises_Chapter_10.Project_Shape_Hierarch_10_13_Exercice;//package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_10.Exercises_Chapter_10.Project_Shape_Hierarch_10_13_Exercice;

public class Triangle extends TwoDimentionalShape {
    private double angle;

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        if (angle< 0 || angle >180)
            throw new IllegalArgumentException("The triangle angle should be between 0 and 180");
        this.angle = angle;
    }

    public Triangle(double sideA, double sideB, double angle){
        super(sideA, sideB);
        setAngle(angle);

    }// end constructor Triangle

    @Override
    public double getArea(){
        return super.getArea()/2*Math.sin(getAngle());
    }

    @Override
    public String toString(){
        return String.format(super.toString()+"\nSide a = %.2f\nSide b = %.2f\nAngle = %.2f\n",getLength(), getWidth(), getAngle());
    }
    @Override
    public void printInterface() {
        toString();
    }

}// end class Triangle
