package SelfStudy;

public class ExceptionDemo {
    public static void main(String[] args) {
       try{
           int[] num={1, 2, 3};

        System.out.println(num[4]);
    }
       //catch (Exception e) {
         //  System.out.println("Array out of range");

       //}
       finally{
           System.out.println("It will run automatically");
        }
}}
