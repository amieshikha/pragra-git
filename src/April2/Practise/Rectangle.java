// Create a Rectangle class, make two variables (length and width) and find the area and perimeter of Rectangle
package April2.Practise;
// simple class program by using void
import java.util.Scanner;
public class Rectangle {
    double width=10;
    double length=10;
    double area;

    public void calculateArea() {
        area = width * length;
        System.out.println("Area of rectangle : " + area);
    }
    public void calculatePerimeter(){
        area = 2 * (length + width);
        System.out.println("Perimeter of Rectangle: " + area);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
    }
}
//  **********************************************************************************************
    // class by using return type
//public double calculateArea(double width, double length){
//    double area= length * width;
//    return area;
//}
//public double calculatePerimeter(double width, double length){
//    double area= 2 * (length + width);
//    return area;
//}
//public static void main(String[] args) {
//        Rectangle rectangle= new Rectangle();
//        double areaOfRect= rectangle.calculateArea(3,4);
//        double perimeterOfRect= rectangle.calculatePerimeter(2 , 3);
//    System.out.println("Area of Rectangle :" + areaOfRect);
//    System.out.println("Perimeter of Rectangle :" +perimeterOfRect);
//    }
//}


