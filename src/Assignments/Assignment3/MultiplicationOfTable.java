// 6. write product table of a give number in specific format e.g. 5 * 1 = 5

package Assignments.Assignment3;

import java.util.Scanner;

public class MultiplicationOfTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        System.out.print("Enter the table which you want to see : ");
        int num = scanner.nextInt();
        System.out.println("Print the Table of: " + num);
        while (counter <= 10) {
            int prod = num * counter;
            System.out.println(num + " *  " + counter + " = " + prod);
            counter++;
        }
        System.out.println("*****End*****");
    }
}

