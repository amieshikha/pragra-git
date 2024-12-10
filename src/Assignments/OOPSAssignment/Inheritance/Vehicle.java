/* Create a Java program to model different types of vehicles.
 Define a superclass called [Vehicle], which has the following attributes and methods:
Attributes: [make, model, year] Methods: [start(), stop(), displayInfo()]
create two subclasses Car and Motorcycle that inherit from the Vehicle class.
Each subclass should have an additional attribute specific to its type ([numDoors] for Car and [numCylinders] for Motorcycle),
along with any necessary methods.
Create a subclass [ElectricCar] that inherits from the Car class.
ElectricCar should have an additional attribute [batteryCapacity] and a method [chargeBattery()].
write a Main class to demonstrate the functionality of these classes by [creating objects of Car, Motorcycle, and ElectricCar
 and
calling their methods.]
 */


package Assignments.OOPSAssignment.Inheritance;

public class Vehicle {
    String make;
    String model;
    int year;
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println("Car is on");
    }

    public void stop() {
        System.out.println("Car is off");
    }

    public void displayInfo() {
        System.out.println("Make : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year  :  " + year);
    }

}
