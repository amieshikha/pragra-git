package Assignments.Assignment1.Methods;

public class TL {
    String colour;
    public void redLight()
    {
        System.out.println("It's Red so You have to stop");
    }
    public void greenLight()
    {
        System.out.println("It's Green so You can go");
    }
    public void yellowLight()
    {
        System.out.println("It's Yellow so You have to wait");
    }

    public static void main(String[] args) {
        System.out.println("Which light is flashing");
        TL tl = new TL();
        tl.redLight();
        tl.yellowLight();
        tl.greenLight();
    }
}
