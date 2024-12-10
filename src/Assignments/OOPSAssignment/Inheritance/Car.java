package Assignments.OOPSAssignment.Inheritance;

public class Car extends Vehicle{

    int numDoors;

    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }
    public void displayDoors(){
            System.out.println("Number of Doors: " +numDoors);
        }
    }



