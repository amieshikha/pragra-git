// 1. Create a program that takes a character as input and determines if it's a vowel or a consonant.

package Assignments.Assignment1.VowelsConsonants.UserInput;

import java.util.Scanner;

public class Switch {
     public static void main(String[] args) {
         System.out.print("Enter the character");
         Scanner scanner = new Scanner(System.in);
         char c = scanner.next().charAt(0);
         switch (c) {
             case 'a':
             case 'A':
             case 'e':
             case 'E':
             case 'i':
             case 'I':
             case 'o':
             case 'O':
             case 'u':
             case 'U':
                 System.out.println(c + " is a vowel");
                 break;
             default:
                 System.out.println(c + " is a consonant");
         }
     }
    }

