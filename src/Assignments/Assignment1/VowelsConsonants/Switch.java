package Assignments.Assignment1.VowelsConsonants;

public class Switch {
    public static void main(String[] args) {
                char ch = 'z';

                switch (ch) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        System.out.println(ch + " is vowel");
                        break;
                    case 'z':
                        break;
                    default:
                        System.out.println(ch + " is consonant");
                }
            }
}
