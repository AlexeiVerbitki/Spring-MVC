package Setter_Java_Book;

public class IfStatementDemo {
    public static void main(String[] args) {
        int a,b,c,d;
                a=2;
                b=3;
        System.out.println("a equals 2, b equals 3");
        if (a<b) System.out.println("a is less than b");
        if (a>b) System.out.println("you will never see this message");
        System.out.println("");
        c=a-b; // с будет -1

        System.out.println("c = -1");
        if (c>0) System.out.println("c>0");
        if (c<0) System.out.println("c<0");
        System.out.println("");

        d=b-a; // d=1
        System.out.println("d=1");
        if (d>0) System.out.println("d is more than 0");
        if (d<0) System.out.println("d is less than 0");
        System.out.println("");

    } //main() method ending
} // IfStatementDemo class ending
