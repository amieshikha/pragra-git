package March23.ScannerDemo;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        int x= scanner.nextInt();
        System.out.print("Enter the value of y : ");
        int y= scanner.nextInt();
        int Product= x * y;
        System.out.println("Multiplication of x and y is : " + Product);


    }
}

// What if i want to print the values of x and y in system.out.println