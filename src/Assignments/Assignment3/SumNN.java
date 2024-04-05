// 2. write java program to find the sum of first 10 natural numbers

package Assignments.Assignment3;

public class SumNN {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        System.out.println("The first 10 natural numbers are");
        while (i <= 10) {
            System.out.println(i);
            sum =sum +i;
            i++;
        }
        System.out.println("Sum of first 10 natural numbers are: " +sum);
    }
}
