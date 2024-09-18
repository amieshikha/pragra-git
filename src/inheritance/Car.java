package inheritance;

public class Car extends Vehicle {
    String brand="Camry";

    @Override
    public void feature() {
        System.out.println("Feature from class car");
    }

//    public void feature(String name){
//        System.out.println(name);
//    }

    public static void main(String[] args) {
        Car myCar= new Car();
        myCar.feature();
        System.out.println(myCar.brand);

        //myCar.feature();
        System.out.println(myCar.modelName + "  " + myCar.brand);
    }

}



