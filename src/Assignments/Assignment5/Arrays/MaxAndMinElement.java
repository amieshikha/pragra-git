/* 1. Consider the given array
    number[] = 10,30,43,54,23,543,43,32

->find the maximum element

->find the minimum element */


package Assignments.Assignment5.Arrays;

public class MaxAndMinElement {
    public static void main(String[] args) {
        int[] arr = {10, 30, 43, 54, 23, 543, 43, 32};
        System.out.println("ELements in an array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Minimum is " + min + " and maximum is " + max);
    }
}
