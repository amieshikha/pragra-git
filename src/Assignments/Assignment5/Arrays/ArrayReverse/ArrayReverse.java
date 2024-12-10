// 1. Consider the given array
//    number[] = 10,30,43,54,23,543,43,32

package Assignments.Assignment5.Arrays.ArrayReverse;
public class ArrayReverse {
    public static void main(String[] args) {
       // int[] arr = {10, 30, 43, 54, 23, 543, 43, 32};
        int[] arr= {10,20,30,40,50};
        int start= 0;
        int end= arr.length -1;
        int temp;
        System.out.println("Elements in an array");
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
        while(start < end) {
            temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        System.out.println("Printing the reversing elements");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);

            }

        }
    }
