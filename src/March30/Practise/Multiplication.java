package March30.Practise;

import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int prod = 0;
        System.out.print(" Enter the table which you want to see : ");
        int num = scanner.nextInt();
        System.out.println("Print the Table of: " + num);
        while (counter <= 10) {
            prod = num * counter;
            System.out.println(num + " *  " + counter + " = " + prod);
            counter++;
        }
        System.out.println("***End***");
    }
}

