// 3. Write a Java program that takes a user's age as input and determines whether they are eligible to vote or not.

package Assignments.Assignment2;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);
        System.out.println("Minimum required age for voting must be equal to or greater than 18 years");
        System.out.print("Enter the age of user: ");
 int age= sc.nextInt();
 if (age >= 18)
 {
     System.out.println("Age is greater than or equal to minimum requirement so user is eligible to vote");

 }
 else{
     System.out.println("Age is less than minimum requirement so user is not eligible to vote");
 }
    }
}
