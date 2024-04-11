package April2.Practise;

public class RectangleDemo {

    double length;
    double width;
    double area;

    RectangleDemo() {

    }

    public double areaOfRect(double length, double width) {
        area= length * width;
        System.out.println("Area of Rectangle is " + area);
        return area;

    }

    public double perimeterOfRect(double length, double width) {
        area = 2 * (length + width);

        System.out.println("Perimeter of Rectangle is " + area);
        return area;
    }
}


