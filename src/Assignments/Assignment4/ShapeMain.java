package Assignments.Assignment4;

public class ShapeMain {
    public static void main(String[] args) {
//        Shape shape= new Shape(4,2, 1, 2);
//        shape.areaOfCircle();
//        shape.areaOfSquare();
//        shape.areaOfRectangle();
MOShape mo= new MOShape();
        System.out.println("Area of rectangle is " +mo.area(2, 4));
        System.out.println("Area of circle is " +mo.area(Math.PI * 1.2 * 1.2));
        System.out.println("Area of square is " +mo.area(2.2));
    }
}
 // 50.26, 4.0, 2.0