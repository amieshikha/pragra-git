package March23.Practise;

import java.util.Scanner;

public class SwappingByOperators {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the first number");
        int x= scanner.nextInt();
        System.out.print("Enter the second number");
        int y= scanner.nextInt();
        System.out.println("Before Swapping the values of x and y are:");
        x = x-y;  // x= 10, y = 20
        y =x+y;
        x= y-x;
        System.out.print("After Swapping the values of x and y are:");
       }
}
