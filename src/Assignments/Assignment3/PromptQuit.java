// 5. Create a Java program that uses a do-while loop to continuously prompt the user for input until they enter 'q' to quit.

package Assignments.Assignment3;
import java.util.Scanner;

public class PromptQuit {
    public static void main(String[] args) {
        char c;
        Scanner sc= new Scanner(System.in);
        do {
            System.out.println("Enter the input");
            System.out.println("Press q / Q to exit ");
            c = sc.next().charAt(0);
        } while (!(c == 'q' || c == 'Q'));
    }
}

