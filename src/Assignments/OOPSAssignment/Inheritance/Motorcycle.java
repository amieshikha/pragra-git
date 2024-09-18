package Assignments.OOPSAssignment.Inheritance;

public class Motorcycle extends Vehicle{
    int numCylinders;

    public Motorcycle(String make, String model, int year, int numCylinders) {
        super(make, model, year);
        this.numCylinders = numCylinders;
    }
        public void displayCylinders(){
            System.out.println("Cylinders presence in motorcycle: " +numCylinders);
        }
    }

