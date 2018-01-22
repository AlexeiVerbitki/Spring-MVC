package Setter_Java_Book;

public class InstanceOfDemo {
    public static void main(String[] args) {
        Auto_3_21_page_109 a = new Auto_3_21_page_109(2,4,160,30,true);
        Vehicle v = new Vehicle();
        Vehicle[] va = {v};
        for (int i = 0; i<va.length; i++){
            if( va[i] instanceof Moveable){
                Moveable m = (Moveable) va[i];
                m.move(10+i*34, 34);

            }
        }
    }
}
