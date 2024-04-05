package March30.Practise.NN;

public class Test {
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
// ***********
//        System.out.println("The first 10 natural numbers are");
//        do {
//            System.out.println(i);
//            sum = sum + i;
//            i++;
//        } while (i <= 10);
//        System.out.println("Sum of first 10 natural numbers are : " +sum);
//    }
//}