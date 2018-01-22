package Java_How_to_Programm_Early_Objects_Paul_Deitel;

public class Student {
    private String name;
    private double average;

    public Student (String name, double average ){
        this.setName(name);
        if (average > 0) {
            if (average <= 0) {
                this.setAverage(average);
            }
        }

    }

    void setName(String name){

        this.name=name;
    }

    public void setAverage(double average) {

        this.average = average;
    }
} // end Student class

