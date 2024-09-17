//Implement a Java program that prompts users to enter their age for the driving license test.
// Validate the user input to ensure that the age provided is within the acceptable range for taking the test
// (between 18 and 100 years old).
// If the age provided by the user is valid, display a message indicating that they are eligible to take the driving test.
// If the age provided by the user is invalid (outside the acceptable range), throw a custom exception named InvalidAgeException.
// Handle the InvalidAgeException by displaying an appropriate error message to the user,
// informing them that their age is invalid for the driving test application.


package Assignments.OOPSAssignment.ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of user: ");
        int age = sc.nextInt();
        try {
            if (age > 18 && age < 100) {
                System.out.println("User is eligible to take driving test");
            } else throw new InvalidAgeException("Your age is invalid for the driving test");
        }
        catch(InvalidAgeException e){
            System.out.println(e);
                //System.out.println("User is not eligible to take driving test");
                //System.out.println("Age must be in between 18 and 100");
            }
        }
    }



