package March23.Practise;

public class Swapping {
    public static void main(String[] args){
        int x= 40;
        int y= 50;
        int z;
        System.out.println("Before swapping the values are:");
        System.out.println("Value of x:" +x+ " and the value of y:" +y);
         z = x;
         x = y;
         y = z;

        System.out.println("After swapping the values are:");
        System.out.println("Value of x:" +x+ " and the value of y:" +y);
    }
}
