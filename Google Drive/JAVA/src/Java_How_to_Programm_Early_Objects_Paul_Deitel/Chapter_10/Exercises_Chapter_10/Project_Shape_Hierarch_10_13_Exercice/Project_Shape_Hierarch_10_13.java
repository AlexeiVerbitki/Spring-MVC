package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_10.Exercises_Chapter_10.Project_Shape_Hierarch_10_13_Exercice;/*10.13 (Project: Shape Hierarchy) Implement the Shape hierarchy shown in Fig. 9.3.
1)Each Two- DimensionalShape should contain method getArea to calculate the area of the two-dimensional
shape.
2) Each ThreeDimensionalShape should have methods getArea and getVolume to calculate the
surface area and volume, respectively, of the three-dimensional shape.
3) Create a program that uses an array of Shape references to objects of each concrete class in the hierarchy.
4) The program should print a text description of the object to which each array element refers.
5) Also, in the loop that processes all the shapes in the array, determine whether each shape is a TwoDimensionalShape or a
ThreeDimensionalShape. If it’s a TwoDimensionalShape, display its area. If it’s a ThreeDimensionalShape,
display its area and volume.*/
//package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_10.Exercises_Chapter_10.Project_Shape_Hierarch_10_13_Exercice;

import java.util.ArrayList;

public class Project_Shape_Hierarch_10_13 {
    public static void main(String[] args) {
        ArrayList<TwoDimentionalShape> twoDimentionalShapes = new ArrayList<>();
        ArrayList<ThreeDimentionalShape> threeDimentionalShapes = new ArrayList<>();
        ArrayList<Shape> shape = new ArrayList<>();
        twoDimentionalShapes.add(new Triangle(3, 4, 90));
//        System.out.printf(triangle.toString());

//        twoDimentionalShapes.add(new Circle(5, Math.PI));
//        twoDimentionalShapes.add(new Circle(4));
//        twoDimentionalShapes.add(new Square(6));
//        threeDimentionalShapes.add(new Cube(4));
//        threeDimentionalShapes.add(new Sphere(4));
////        System.out.printf(circle.toString());
//        for (TwoDimentionalShape element : twoDimentionalShapes) {
//            System.out.printf(element.toString());
//        }
//        for (ThreeDimentionalShape element2 : threeDimentionalShapes) {
//
//            System.out.printf(element2.toString());
//        }

        shape.add(new Circle(5, Math.PI));
        shape.add(new Circle(4));
        shape.add(new Square(6));
        shape.add(new Cube(4));
        shape.add(new Sphere(4));

        for (Shape element : shape) {
            if (element instanceof Cube){
                System.out.printf("__________________\nCube before downcasting");
                System.out.printf(element.toString());
                Cube cube = (Cube) element;
                cube.setHeight(10);
                System.out.printf("__________________\nCube after downcasting");
            }
            System.out.printf(element.toString());
        }

        System.out.printf("\n__________________\nNow let's try with an interface:\n__________________\n");
        ArrayList<ShapeInterface> shapeInterfaces = new ArrayList<>();
        shapeInterfaces.add(new Circle(5));
        shapeInterfaces.add(new Square(6));
        shapeInterfaces.add(new Cube(4));
        shapeInterfaces.add(new Sphere(4));

        for (ShapeInterface element : shapeInterfaces) {
            if (element instanceof Cube){
                System.out.printf("__________________\nCube before downcasting interface");
                System.out.printf(element.toString());
                Cube cube = (Cube) element;
                cube.setHeight(10);
                System.out.printf("__________________\nCube after downcasting interface");
            }
            System.out.printf(element.toString());
        }

    } // end main
}
