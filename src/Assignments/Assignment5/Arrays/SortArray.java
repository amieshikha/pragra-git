// ->sort the given array

package Assignments.Assignment5.Arrays;
public class SortArray {
    public static void main(String[] args) {
        int[] arr = {10, 30, 43, 54, 23, 543, 43, 32};
        System.out.println("Elements in an array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        int temp=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[i]){
                    temp= arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }
        }
        System.out.println("After sorting the elements in an array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }
    }
}
