//1. write a Java program to calculate the area of circle

package Assignments.Assignment2;

import java.util.Scanner;

public class AreaC {
    public static void main(String[] args) {
        float pi=  3.14f;
        float ac;
        Scanner sc= new Scanner(System.in);
        System.out.print("Radius of circle is : ");
        float radius= sc.nextFloat();
        ac = pi * radius * radius;
        System.out.println("Area of circle is " + ac);

    }
}
