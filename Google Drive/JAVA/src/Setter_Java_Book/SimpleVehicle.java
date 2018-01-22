package Setter_Java_Book;

public class SimpleVehicle {
    int passengers;

} // end SimpleVehicle class

class RefType {
    public static void main(String[] args) {
        SimpleVehicle car1, car2;
        car1 = new SimpleVehicle();
        car1.passengers = 25;
        car2=car1;
        System.out.println("\ncar1 = " + car1.passengers + "\ncar2 = "+ car2.passengers);

        car2.passengers = 50;
        System.out.println("\nafter car2 became 50 " +
                "\ncar1 = " + car1.passengers + "\ncar2 = "+ car2.passengers);

    } // end main
} //end SimpleVehicle class
