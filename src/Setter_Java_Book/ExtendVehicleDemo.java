package Setter_Java_Book;

class Vehicle_3_19 {
     int passengers;
     private int wheels;
     private int maxspeed;
     int burnup; // fuel consuption

     Vehicle_3_19 (int passengers, int wheels, int maxspeed, int burnup){
         this.passengers = passengers;
         this.setWheels(wheels);
         this.maxspeed = maxspeed;
         this.burnup = burnup;

     } // end constructor Vehicle

     Vehicle_3_19(){
         this.passengers = 4;
         this.wheels = 4;
         this.maxspeed = 160;
         this.burnup=20;
     }

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

     // sub-class Auto of the base Vehicle class

}
 class Auto extends Vehicle_3_21_page_109 {
     boolean sunroof; //sunroof existance


     Auto (int passengers, int wheels, int maxspeed, int burnup, boolean sunroof){
         super(passengers, wheels, maxspeed, burnup);
         this.sunroof=sunroof;
     } // end Auto (int, int, int, int, boolean)

     Auto (boolean sunroof){
         this(4,4,200,12, sunroof);
     } // end Auto boolean constructor

 } // end class Auto

public class ExtendVehicleDemo {
    public static void main(String[] args) {
        Auto bmw = new Auto (true);


        System.out.println("bmw max speed = "+bmw.getMaxspeed()+
                "\nbmw driving distance = "+ bmw.distance(1.5)+
                "\nSunroof existence = "+ bmw.sunroof);

    }
}

