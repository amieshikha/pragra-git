// 3. write java program to find the sum of first n natural numbers

package Assignments.Assignment3;

import java.util.Scanner;

public class UserInputSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        int i = 1;
        int sum = 0;
        while(i <=num)
        {
            System.out.println(i);
            sum= sum+i;
            i++;
        }
        System.out.println("Addition of these numbers are: " + sum);
    }
}

