//package March23.DecisionMaking;
//
//public class Demo {
//    public static void main(String[] args) {
//        int x=10;
//            if (x > 10) {
//                System.out.println("Value of x i.e " + x + " is bigger... ");
//            }
//            else if (x < 10) {
//                System.out.println("Value of x i.e " + x + " is smaller... ");
//            }
//            else if (x == 10) {
//
//                System.out.println("Value of x i.e " + x + " is same... ");
//            } else {
//                System.out.println("Nothing found... ");
//            }
//        }
//    }
//
    package March23.DecisionMaking;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x= sc.nextInt();

        if (x > 10) {
            System.out.println("Value of x i.e " + x + " \n which is bigger... ");
        }
        else if (x < 10) {
            System.out.println("Value of x i.e " + x + " \n which is smaller... ");
        }
        else if (x == 10) {

            System.out.println("Value of x i.e " + x + " is same to the given input... ");
        } else {
            System.out.println("Nothing found... ");
        }
    }
}


