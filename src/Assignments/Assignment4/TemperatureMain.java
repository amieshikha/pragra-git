package Assignments.Assignment4;

public class TemperatureMain {
    public static void main(String[] args) {
        System.out.println("Temperature in Celsius: ");

        Temperature t= new Temperature(36, 0, 0);
        t.cToF();
        t.cToK();
    }
}
