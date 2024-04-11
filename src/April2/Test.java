package April2;

import java.util.Scanner;

public class Test {
    // variables/ fields/ members variables
    String name;
    int id;
    // member functions/ methods
    public void showStudent(String name, int id){
        System.out.print(name);
        System.out.println( "/"       + id);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.showStudent("Shikha" , 01);
        System.out.println("Name / Id");

    }
}
