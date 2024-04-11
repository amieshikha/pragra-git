package April6;

public class Calculator {
    public int sum(int a, int b){
        return a + b;
    }
    public int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc= new Calculator();
        int sum= calc.sum(10, 20);
        System.out.println(sum);
    }
}
