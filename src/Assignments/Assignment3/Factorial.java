// 4. Implement a program to find the factorial of a given number using a while loop.

package Assignments.Assignment3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number and do factorial of that number: " );
        int number= sc.nextInt();
        int i=1;
int fact= 1;
while( i <=  number) {
    fact = fact * i;
    i++;
}
            System.out.println("Factorial of " + number + " is " + fact);

        }
    }

// 5* 4* 3 * 2* 1=