package March19;// Multiplication

import java.util.Scanner;

public class ProDemo {
    public static void main(String[] args) {
//        int x= 10;
//        int y=20;
//        int pro= x * y;
//        System.out.println(pro);
//
//    }
//}

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x : ");
        int x = sc.nextInt();
        System.out.println("Enter the value of y : ");
        int y = sc.nextInt();
        int pro = x * y;
        System.out.println("Multiplication of " + x + " and " + y + " is :" + pro);

    }
}
