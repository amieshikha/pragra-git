package March23.ScannerDemo;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x= scanner.nextInt();
        System.out.println("Enter the value of y");
        int y= scanner.nextInt();
        int Division= x / y;
        System.out.println("Division of x and y is : " +Division);


    }
}
