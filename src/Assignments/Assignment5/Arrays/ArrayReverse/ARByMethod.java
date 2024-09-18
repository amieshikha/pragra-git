package Assignments.Assignment5.Arrays.ArrayReverse;

public class ARByMethod {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Elements in an array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        arrayReverse(arr);
        System.out.println("  ");
        System.out.println("Array in reverse order");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void arrayReverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int temp;
        while (start < end) {
            temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }

    }
}

