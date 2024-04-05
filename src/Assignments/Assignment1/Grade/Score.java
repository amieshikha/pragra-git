// 3. You are tasked with developing a Java program that checks a student's grade based on their score. The grading system is as follows:
//
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//E: 0-59 (Fail)
//Write a Java program that takes the student's score as input and
//determines and displays the corresponding grade based on the above criteria.
//Ensure that the program handles invalid input gracefully and provides
//appropriate feedback.


package Assignments.Assignment1.Grade;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        System.out.println("Enter your score");
        Scanner scanner= new Scanner(System.in);
        int score= scanner.nextInt();
        if (score>= 90 && score<=100)
        {
            System.out.println("Congratulations, it's outstanding result, Keep it up");
            System.out.println("You got A+ grade");

        }
    else if (score>= 80 && score <=89)
    {
        System.out.println("Very Good Performance, Keep Rising ");
        System.out.println("You got A grade");
    }
else if (score>= 70 && score<=79)
        {
        System.out.println("Good Performance, Try More");
            System.out.println("You got B grade");
        }
        else if (score>= 60 && score<= 69)
        {
            System.out.println("Average, Try Hard");
            System.out.println("You got C grade, which is very low");
        }
        else if (score >= 0 && score <= 59)
        {
            System.out.println("Sorry! but you are fail, Better luck next time");
            System.out.println("You got no grade");
        }
        else {
            System.out.println("No-one can score less than 0 and greater than 100");
        }

                }
}

