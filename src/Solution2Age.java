import java.util.Scanner;

public class Solution2Age {

    public static void main(String[] args) {
        System.out.print("Enter the age: ");
        Scanner scanner= new Scanner(System.in);
        int age= scanner.nextInt();
        if (age > 0 && age <=13) {
            System.out.println("It's a Child");
        }
        else if (age >= 13 && age <=19)
        {
            System.out.println("That person is Teenage");
        }
        else if (age >= 20 && age <=59)
        {
            System.out.println("That person is Adult");
        }
        else if (age >= 60)
        {
        System.out.println("That person is Senior");
        }
        else
        {
            System.out.println("Wrong data");
        }
}
}















//  Create a Java application that classifies age into categories. If the age is less than 13, print "Child". If it's between 13 and 19,
//  print "Teenager". For ages between 20 and 59, print "Adult". If the age is 60 or above, print "Senior".