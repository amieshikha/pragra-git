package April6;

public class DateDemo {
    int day;
    int month;
    int year;

    DateDemo(int day, int month, int year)
    {
        this.day =day;
        this.month= month;
        this.year= year;
    }
public void printDate(){
    System.out.println("Date : " + day + " / " + month + " / " + year);
}
}