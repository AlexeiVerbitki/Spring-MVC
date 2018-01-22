package Setter_Java_Book;

abstract class Shape {
    abstract double area(); // method area
} // end class Shape

class Point extends Shape{
    public String toString () {return "dot";}
    double area() {return 0;};
}// end Point class

class Triangle extends Shape {
    int cathetus1;
    int cathetus2;



    Triangle (int cathetus1, int cathetus2){
        this.cathetus1 = cathetus1;
        this.cathetus2 = cathetus2;
    }// end Tringle constructor

    public String toString(){return"Triangle";}

    double area(){
        return (cathetus1*cathetus2/2.0);
    } // end area methos
} // end class Triangle

class Circle extends Shape{
    double radius;

    Circle(int radius){
        this.radius=radius;
    } // end Constructor Circle

    public String toString (){return"Circle";}

    double area(){
        return (radius * radius * 3.14);
    } // end method area
} // end class Circle

public class ShapeDemo {
    public static void main(String[] args) {
        Point p = new Point();
        Triangle t = new Triangle(5,3);
        Circle c = new Circle(9);
        Shape[] s = {p, t, c};

        for (int i=0; i<s.length; i++ ){
            System.out.println(s[i].toString() + ":" + s[i].area());
        }
    }
}
