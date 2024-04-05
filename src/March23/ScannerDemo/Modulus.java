package March23.ScannerDemo;

import java.util.Scanner;

public class Modulus {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the value of x : " );
        double x= scanner.nextDouble();
        System.out.print("Enter the value of y : " );
        double y= scanner.nextDouble();
        double modulus= x % y;
        System.out.print("Modulus of x and y is " + modulus);
    }
}
