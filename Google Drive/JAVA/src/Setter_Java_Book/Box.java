package Setter_Java_Book;

public class Box {
    private double length;
    private double width;
    private double height;
    private double density;

    Box (double lenght, double width, double height){
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
        this.setDensity(density);
    }

    double getLength(){
        return this.length;
    } // end getLength

    double getWidth(){
        return this.width;
    } // end getWidth

    double getHeight(){
        return this.height;
    } // end getHeight

    double getDensity(){
        return this.density;
    }


    void setLength(double length) {
        if (length < 1) {
            System.out.println("length can not be 1<");
            return;
        }
        this.length=length;

    }

    void setWidth(double width){
        if (width<1){
            System.out.println("width can not be 1<");
            return;
        }
        this.width = width;
    }

    void setHeight(double height) {
        if (height < 1) {
            System.out.println("height can not be <1");
            return;
        }
        this.height = height;

    }

    void setDensity(double density){
        this.density = density;
        System.out.println("density = "+ this.density);
    }
        double BoxWeight(){
        double val = this.height * this.width * this.height * this.density;
        return val;
    }
} // end class Box

class AmazonBox{
    public static void main(String[] args) {
        Box AmazonBox = new Box(-2,-2,-2);
        AmazonBox.setLength(2);
        System.out.println("AmazonBox length after setLength = " + AmazonBox.getLength());

        AmazonBox.setWidth(2);
        System.out.println("AmazonBox width after setWidth = " + AmazonBox.getWidth());

        AmazonBox.setHeight(2);
        System.out.println("AmazonBox Height after setHeight = " + AmazonBox.getHeight());

        AmazonBox.setDensity(10);
        System.out.println("AmazonBox density after setDensity = "+ AmazonBox.getDensity());


        System.out.println("Amazon Box Weight = "+ AmazonBox.BoxWeight());


    }
} // end class AmazonBox
