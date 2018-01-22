package Setter_Java_Book;

class VehicleDemo {
    public static void main(String[] args) {

        Vehicle ferrari = new Vehicle(2,4,360, 12 );
        double distance = ferrari.distance(0.5);


        System.out.println("\nIn 30 minutes car1 travels " + distance + " km");
//        System.out.println("Ferrari max speed is " + ferrari.maxspeed);
    } // end main
} // end class VehicleDemo