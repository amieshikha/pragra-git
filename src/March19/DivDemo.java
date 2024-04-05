package March19;// Division

import java.util.Scanner;

public class DivDemo {
    public static void main(String[] args) {
//        int a1=100;
//        int a2=20;
//        int div= a1/a2;
//        System.out.println(div);
//    }
//}

        Scanner sc = new Scanner(System.in);
        System.out.println("Value of a1 is :");
        int a1 = sc.nextInt();
        System.out.println("Value of a2 is :");
        int a2 = sc.nextInt();
        int Division = a1 / a2;
        System.out.println("Division of " + a1 + " and " + a2 + " is : " + Division);

    }
}