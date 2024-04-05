//2. write a Java program to find the area of square

package Assignments.Assignment2;

import java.util.Scanner;

public class AreaS {
    public static void main(String[] args) {
        float as;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the side of square : ");
        float side= sc.nextFloat();
        as = side * side;
        System.out.print("Area of Square :" +as);
    }
}
