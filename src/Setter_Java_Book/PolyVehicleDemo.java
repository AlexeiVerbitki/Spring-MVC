package Setter_Java_Book;

class Vehicle_3_21_page_109 {
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup; // fuel consuption

    Vehicle_3_21_page_109(int passengers, int wheels, int maxspeed, int burnup){
        this.passengers = passengers;
        this.setWheels(wheels);
        this.maxspeed = maxspeed;
        this.burnup = burnup;

    } // end constructor Vehicle

    Vehicle_3_21_page_109(){
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
    public String toString (){
        return "Vehicle(passengers = "+ passengers+ ";" + "wheels = "+ wheels+ ";" + "maxspeed = "+ maxspeed+";"+ "burnup = "+ burnup+ ";"+ ")";
    } // end toString

} // end class Vehicle

class Auto_3_21_page_109 extends Vehicle_3_21_page_109 {
    boolean sunroof;

    Auto_3_21_page_109(int f, int g, int h, int j, boolean sunroof){
        super (f,g,h,j);
        this.sunroof=sunroof;
    }

    Auto_3_21_page_109(boolean sunroof){
        this(4,4,200,12, sunroof);
    }
    public String toString (){
        return "Auto(passengers = " + passengers + ";" + "wheels = " + super.getWheels() + ";" + "maxspeed = " + super.getMaxspeed() + ";" + "burnup = " + burnup + ";" + "sunroof = " + sunroof + ")";
    } // end toString
} // end class Auto_3_20_page_107

class PolyVehicleDemo_3_21_page_109 {
    public static void main(String[] args) {

        Auto_3_21_page_109 a = new Auto_3_21_page_109(true);
        Vehicle_3_21_page_109 v = new Vehicle_3_21_page_109();

        Vehicle_3_21_page_109 [] pvd = {a,v};
        int i=0;
        System.out.println(pvd[i].toString());
    }
}
