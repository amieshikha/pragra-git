package March30.Practise;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact= 1;
        int i= 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        while(i <= num) {
            fact = fact * i;
            i++;
        }
        System.out.print("Factorial of " + num + " is " + fact);

    }
    }
