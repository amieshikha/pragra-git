// Find the Area and Circumference of Circle

package April2.Practise;

public class Circle {

    double radius;

    double area;
    public double AreaOfCircle(double radius){
        area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
        return area;
    }
    public double CircumferenceOfCircle(double radius){
        area= 2 * Math.PI * radius;
        System.out.print("Circumference of circle " + area);
        return area;
    }

    public static void main(String[] args) {
        Circle circle= new Circle();
        circle.AreaOfCircle(2);
        circle.CircumferenceOfCircle(3);
    }
    }

