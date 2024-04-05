package March19;// Subtraction

import java.util.Scanner;

public class SubDemo {
    public static void main(String[] args) {
//        int a1= 20;
//        int a2= 10;
//        int sub= a1-a2;
//        System.out.println(sub);
//    }
//}

        Scanner sc = new Scanner(System.in);
        System.out.print(" Value of a1 is : ");
        int a1 = sc.nextInt();
        System.out.print(" Value of a2 is : ");
        int a2 = sc.nextInt();
        int sub = a1 - a2;
        System.out.println("Subtraction of " + a1 + " and " + a2 + " :" + sub);
    }
}