package April2.Practise;
// simple class program by using void
import java.util.Scanner;
public class Rectangle {
    double width;
    double length;
    double area;
//    public void calculateArea(){
//        area= width * length;
//        System.out.print("Area of rectangle : " +area);
// }
//  **********************************************************************************************
    // class by using return type
//public double calculateArea(double width, double length){
//    double area= length * width;
//    return area;
//}
//public static void main(String[] args) {
//        Rectangle rectangle= new Rectangle();
//        double areaOfRect= rectangle.calculateArea(3,4);
//    System.out.print("Area of Rectangle :" + areaOfRect);
//    }
//}

// ************************************************************************************************
// Find the Area and Perimeter of Rectangle
public double calculateArea(double width, double length){
    double area= length * width;
    return area;
}
public double calculatePerimeter(double width, double length){
    double area= 2 * ( length + width);
    return area;
}
public static void main(String[] args) {
    Rectangle rectangle= new Rectangle();
    double areaOfRect= rectangle.calculateArea(2,4);
    double perimeterOfRect = rectangle.calculatePerimeter(2,4);
    System.out.println("Area of Rectangle :" + areaOfRect);
    System.out.println("Perimeter of Rectangle :" +perimeterOfRect);
}
}



