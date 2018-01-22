package Setter_Java_Book;

public class BlockForCycle {
    public static void main(String[] args) {
        int x=100;
        for (int i=1;i<10; i++) {
            System.out.println("x = " + (x-i));
            x=(x-i);
        }
    }
}
