// write a java program to that converts temperature from Celsius to Fahrenheit and Celsius to Kelvin.
// Use method overloading to perform that.

package Assignments.Assignment4;

public class Temperature {
    double celsius;
    double fahrenheit;
    double kelvin;

    public Temperature(double celsius, double fahrenheit, double kelvin) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
        this.kelvin = kelvin;
    }
    public void cToF(){
        double ftemp = (celsius * 1.8) + 32;
        System.out.println("Converted temperature from Celsius to Fahrenheit   " + ftemp);
    }
    public void cToK(){
        double ktemp= celsius + 273.15;
        System.out.println("Temperature in Kelvin " + ktemp);
    }
}
