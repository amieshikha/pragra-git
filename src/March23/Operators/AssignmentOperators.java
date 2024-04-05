package March23.Operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int x = 10;
        x = x + 20;                  //30
        x += 20;                      //50
        System.out.println(x = x + 20);    //70
        System.out.println(x += 20);       //90
    }
}
