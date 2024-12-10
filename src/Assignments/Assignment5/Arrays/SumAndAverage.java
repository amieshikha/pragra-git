/* ->find the sum of all the elements in array

->find average of all the elements in array */

package Assignments.Assignment5.Arrays;

public class SumAndAverage {
    public static void main(String[] args) {

            int[] arr = {10, 30, 43, 54, 23, 543, 43, 32};
            //int arr[] = new int[5];
            // Scanner sc = new Scanner(System.in);
            int sum = 0;
            double average= 0;
            System.out.println("Print all the elements of an array: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
                // arr[i] = sc.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                int length= arr.length;
                sum = sum + arr[i];
                average= sum / length;
            }
            System.out.println("The sum of array is:  " + sum);
            System.out.println("The average of array is: " + average);
        }
    }

