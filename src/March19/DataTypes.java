package March19;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args){
//    {
//
//        int x= 10;
//        boolean isRaining= true;
//        double salary= 2000.2;
//        System.out.println(x);
//        System.out.println(isRaining);
//        System.out.println(salary);
//    }
//}

    // by default dt is double then why error
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    boolean b = sc.nextBoolean();
    float c = sc.nextFloat();
    System.out.println("Value of Integer is : ");
    System.out.println(a);
    System.out.println("Value of Boolean is : ");
    System.out.println(b);
    System.out.println("Value of Float is : ");
    System.out.println(c);
}
}


