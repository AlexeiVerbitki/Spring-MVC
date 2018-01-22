package Setter_Java_Book;

public class BreakDemo {
    public static void main(String[] args) {
        int nmax=25;
        for (int n =0; nmax>=25; n++) {
            if ((n*n)>=nmax) break;
            System.out.println("n  = "+ n + "\nn squared = "+ n*n);
        } // for end
    } // main end
}// class end
