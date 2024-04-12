package Assignments.Assignment4;

public class MOShape {
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    public double area(double length, double width) {
        return length * width;
    }

    public double area(int side) {
        return side * side;
    }
}