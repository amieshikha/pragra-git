package Assignments.Assignment1.VowelsConsonants;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        char ch='e';
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }
}
