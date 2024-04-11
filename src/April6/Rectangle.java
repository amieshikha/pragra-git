package April6;

public class Rectangle {
    double length;
    double width;
    double area;
    public void areaOfRect(double length, double width){
        area= length * width;
        System.out.println("Area of Rectangle is : " + area);
    }
    public void perimeterOfRect(double length, double width){
        area= 2 * (length + width);
        System.out.println("Perimeter of Rectangle is : " + area);
    }
}
