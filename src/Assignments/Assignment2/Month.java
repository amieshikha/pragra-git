/* 5. Create a Java program that takes a numerical month input (1-12) and
      outputs the corresponding month name using a switch case. */

package Assignments.Assignment2;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        System.out.println("Week days starts from Monday");
        Scanner sc= new Scanner(System.in);
        System.out.print("Input the numerical month of the year (1 - 12) : ");
        int nm= sc.nextInt();
        switch(nm){
            case 1:
                System.out.println("January");
                System.out.println("It's the starting month of the year");
                break;
            case 2:
                System.out.println("February");
                System.out.println("It's the second month of the year");
                break;
            case 3:
                System.out.println("March");
                System.out.println("It's the third month of the year");
                break;
            case 4:
                System.out.println("April");
                System.out.println("It's the fourth month of the year");
                break;
            case 5:
                System.out.println("May");
                System.out.println("It's the fifth month of the year");
                break;
            case 6:
                System.out.println("June");
                System.out.println("It's the sixth month of the year");
                break;
            case 7:
                System.out.println("July");
                System.out.println("It's the seventh month of the year");
                break;
            case 8:
                System.out.println("August");
                System.out.println("It's the eighth month of the year");
                break;
            case 9:
                System.out.println("September");
                System.out.println("It's the ninth month of the year");
                break;

            case 10:
                System.out.println("October");
                System.out.println("It's the tenth month of the year");
                break;

            case 11:
                System.out.println("November");
                System.out.println("It's the eleventh and second last month of the year");
                break;

            case 12:
                System.out.println("December");
                System.out.println("It's the twelfth and the last month of the year");
                break;
            default:

            System.out.println("You typed invalid number , to know about months please type again");
        }
    }

    }
