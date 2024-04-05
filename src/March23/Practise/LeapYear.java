package March23.Practise;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int x= scanner.nextInt();
        if(x%4== 0)
        {
            System.out.println("It's a Leap Year");
        }
        else {
            System.out.println("It's not a Leap Year");
        }
    }
}
