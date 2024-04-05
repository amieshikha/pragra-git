package March30.Practise.NN;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        int i = 1;
        int sum = 0;
        while(i <=num)
        {
            System.out.println(i);
            sum= sum+i;
            i++;
        }
        System.out.println("Addition of these numbers are: " + sum);
    }
}

// *********************
//
//        do {
//            System.out.println(i);
//            sum = sum + i;
//            i++;
//        } while (i <= num);
//        System.out.println(" Addition of the numbers are");
//    }
//}