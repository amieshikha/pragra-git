/* 4. Implement a Java program that takes a day of the week as input and
 outputs whether it's a weekday or a weekend using a switch case.*/

package Assignments.Assignment2;

import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        System.out.println("Week days starts from Monday");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the week days (1 - 7) : ");
        int io= sc.nextInt();
        switch(io){
            case 1:
                System.out.println("Monday");
                System.out.println("It's a weekday and first day of week");
                break;
            case 2:
                System.out.println("Tuesday");
                System.out.println("It's a weekday and second day of week");
                break;
            case 3:
                System.out.println("Wednesday");
                System.out.println("It's a weekday and third day of week");
                break;
            case 4:
                System.out.println("Thursday");
                System.out.println("It's a weekday and fourth day of week");
                break;
            case 5:
                System.out.println("Friday");
                System.out.println("It's a weekday and fifth day of week");
                break;
            case 6:
                System.out.println("Saturday");
                System.out.println("It's a weekend and sixth day of week");
                break;
            case 7:
                System.out.println("Sunday");
                System.out.println("It's a weekend and last day of week");
                break;
            default:
                System.out.println("It's Invalid, please type again");
        }
    }
}
