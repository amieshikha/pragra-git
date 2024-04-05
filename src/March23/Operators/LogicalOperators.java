package March23.Operators;

public class LogicalOperators {
    public static void main(String[] args){
        int num1 = 20;
        int num2 = 10;
        int num3 = 25;
        int num4 = 20;
        System.out.println(num1 > num2 && num1 < num2);  // t f --> f
        System.out.println(num1 >= num2 && num1 < num2); // t f --> f
        System.out.println(num1 > num2 && num1 <= num3); // t t --> t
        System.out.println(num1 != num2 && num1 < num4); // t f--> f
        System.out.println(num1 > num2 || num1 < num2); // t f --> t
        System.out.println(num1 > num4 || num1 < num2); // f f --> f
        System.out.println(num1 <= num4 || num1 >= num4); // t t--> t
        System.out.println(num1 > num4 || num2 < num2); // f f--> f

    }
}
