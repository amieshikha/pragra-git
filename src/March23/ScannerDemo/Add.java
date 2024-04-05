package March23.ScannerDemo;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the value of x");
        int x= scanner.nextInt();
        System.out.print("Enter the value of y");
        int y= scanner.nextInt();
        int sum= x + y;
        System.out.println("Sum of x and y is : " +sum);


    }
}
