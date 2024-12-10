// Inheritance
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

public class Inheritance {
        public static void main(String[] args) {

                Car car = new Car("Honda", "CRV", 2022, 4);
                System.out.println("...Car...");
                car.displayInfo();
                car.displayDoors();
                car.start();
                ElectricCar ec = new ElectricCar("Toyota", "Camry", 2020, 4, 200);
                System.out.println("...ElectricCar...");
                ec.displayInfo();
                ec.printCapacity();
                ec.chargeBattery();
                Motorcycle mc= new Motorcycle("Honda", "Kinetic",2018, 3);
                System.out.println("...Motorcycle...");
                mc.displayInfo();
                mc.displayCylinders();
                mc.start();

        }
}



//public class VehicleMain {
//    public static void main(String[] args) {
//        Car car = new Car("Honda", "Civic", 2024, 4);
//        car.displayInfo();
//        car.displayDoors();
//        car.start();
//        System.out.println("--------------");
//
//        ElectricCar electricCar = new ElectricCar("Tesla", "Y", 2022, 4, 400 );
//        electricCar.displayInfo();
//        electricCar.printCapacity();
//        electricCar.chargeBattery();
//        System.out.println("--------------");
//
//        Motorcycle motorcycle = new Motorcycle("Harley Davidson", "Road King", 2023, 2);
//        motorcycle.displayInfo();
//        motorcycle.displayCylinders();
//        motorcycle.stop();
//        System.out.println("--------------");
//
//    }
//}