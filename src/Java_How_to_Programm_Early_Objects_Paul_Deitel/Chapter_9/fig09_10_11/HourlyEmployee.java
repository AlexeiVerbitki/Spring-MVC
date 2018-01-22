package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_9.fig09_10_11;

public class HourlyEmployee extends CommissionEmployee {
    private double hour;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,
                          double hour, double wage){
        super(firstName, lastName, socialSecurityNumber);
        setHour(hour);
        setWage(wage);

    } // end constructor

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        if (hour <0 || hour >168)
            throw new IllegalArgumentException("hours should be between 0 and 168 for 1 week");
        this.hour = hour;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0)
            throw new IllegalArgumentException("Wage can't be negative");
        this.wage = wage;
    }

    @Override
    public double earnings() {
        return getHour()*getWage();
    }

    @Override
    public String toString() {
        return "\nHourlyEmployee " + getFirstName() + " " + getLastName() + "'s"+
                "\nhour = " + getHour() +
                "\nwage = " + getWage() +
                "\nearnings = " + earnings();
    }
}
