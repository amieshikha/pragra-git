// Create a Shape class which calculates the area of Circle, square, rectangle and show the usage of method overloading.

package Assignments.Assignment4;


public class Shape {
    double radius;
    double side;
    double length;
    double width;
    double area;

    public Shape(double radius, double side, double length, double width) {
        this.radius = radius;
        this.side = side;
        this.length = length;
        this.width = width;
    }
    public void areaOfCircle(){

        area= Math.PI * radius * radius;
        System.out.println("Area of circle is: " + area);
    }
    public void areaOfSquare(){
        area= side * side;
        System.out.println("Area of Square is: " + area);
    }
    public void areaOfRectangle(){
        area = length * width;
        System.out.println("Area of Rectangle is: " + area);
    }
}
