package March19;

import java.util.Scanner;

public class AddDemo {
    public static void main(String[] args) {

//        int a1=10;
//        int a2=20;
//        int a3=70;
//        int sum= a1+a2+a3;
//        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(a3);
//        System.out.println("The sum of " +a1 + " , " + a2 + " and "  + a3 + " is:" +sum);
//    }
//}


// Print the values of a1 , a2 and a3 and then sum

// Output: The Addition of a1(10), a2(20) and a3(70) is sum(100)

        Scanner sc = new Scanner(System.in);
        System.out.print(" Value of a is ");
        int a = sc.nextInt();
        System.out.print(" Value of b is ");
        int b = sc.nextInt();
        System.out.print(" Value of c is ");
        int c = sc.nextInt();
        int sum = a + b + c;
        System.out.println("Addition of " + a + " , " + b + " and " + c + " is " + sum);
    }
}