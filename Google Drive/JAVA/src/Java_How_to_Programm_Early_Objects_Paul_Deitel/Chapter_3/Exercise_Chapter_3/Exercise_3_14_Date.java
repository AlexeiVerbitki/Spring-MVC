package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_3.Exercise_Chapter_3;

public class Exercise_3_14_Date {
    int day;
    int month;
    int year;



    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (1900 <= year && year <=2017)
            this.year = year;
        else System.out.printf("The year can't be less than 1900 and more that the current\n");
    }
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 12 | month <1)
            System.out.printf("The month can be from 1 to 12\n");
        else
        this.month = month;
    }
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (month==1 |month==3|month==5|month==7|month==8|month==10|month==12){
            if (day >0 && day<=31)
                this.day = day;
                else
                System.out.printf("Please select a day for this month between 1 and 31\n"); }

        else {
            if (month==2){
                if (year%4!=0){
                    if (day >0 && day <=28)
                    this.day = day;
                    else
                    System.out.printf("February only has 28 days, please select a day between 1 and 28\n");}
            else
                if (day > 0 && day <=29)
                    this.day = day;
                else
                    System.out.printf("February only has 29 days, please select a day between 1 and 29\n");
            }


        else
            if (day >0 && day <=30)
                this.day=day;
            else
                System.out.printf("Please select a day for this month between 1 and 30\n");
        }

    } // end method set day

    public void displayDate(){
        if (day!=0 && month!=0 && year!=0)
//        if (month!=0)
            System.out.printf("\nThe date is: %d / %d / %d", getDay(), getMonth(), getYear());
    }

}
