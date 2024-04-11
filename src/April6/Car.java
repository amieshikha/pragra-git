package April6;

public class Car {
    String colour;
    String brand;
    double price;
    Car(){
        colour= "Silver";
        brand= "CRV";
        price= 200.200;
        System.out.println("Colour:  " + colour + ", Brand:  " + brand + ", Price:  " + price );
    }

    public void displayCarInfo() {
        System.out.println("Car colour: " + colour);
        System.out.println("Brand: " + brand);
        System.out.println("Price : " + price);
    }
}