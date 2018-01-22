package Setter_Java_Book;

public class Vehicle {
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup; // fuel consuption

    Vehicle (int passengers, int wheels, int maxspeed, int burnup){
        this.passengers = passengers;
        this.setWheels(wheels);
        this.maxspeed = maxspeed;
        this.burnup = burnup;

    } // end constructor Vehicle

    Vehicle () {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup=20;
    } // default constructor Vehicle

     double distance(double interval) {
        double val = this.maxspeed * interval;
        return val;
    } //end distance (double interval) method

    int getMaxspeed(){
        return this.maxspeed;
    }
    int getWheels(){
        return this.wheels;
    }

    // method to write the number of wheels
    void setWheels (int wheels){
        //verify the wheels number
        if ((wheels < 1) || (wheels > 24)) {
            System.out.println("Не верно указано кол-во колес");
            return;
        }
        this.wheels = wheels;
    }

} // end Vehicle class

    class VehicleGetSetMethod {
        public static void main(String[] args) {
            Vehicle ferrari = new Vehicle(2, -2, 360, 12);
            System.out.println("Max speed of a Ferrari is "+ ferrari.getMaxspeed()+ "km/h");
            System.out.println("The number wheels " + ferrari.getWheels());

            ferrari.setWheels(4);
            System.out.println("The number of wheel a Ferrari has (after use of setWheels) = "+ ferrari.getWheels());

        } // end main Method
    } // end Vehicle getSetMethod



