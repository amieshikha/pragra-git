package March23.Practise;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args){
//        int x = -5;
//        if( x > 0){
//            System.out.println(x + " is positive number");
//        }
//        else{
//            System.out.println(x + " is negative number:"  + x );
//        }

        Scanner scanner= new Scanner(System.in);
        int x= scanner.nextInt();
        if (x> 0)
        {
            System.out.print
                    (x + " is positive number");
        }
        else {
            System.out.println(x + " is negative number");
        }
    }
}

// syntax--> set of rules we have to follow to write the program