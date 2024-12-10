package SelfStudy;

public class ThrowThrows {
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age is less than 18");
        } else {
            System.out.println("Age is more");
        }
    }

    public static void main(String[] args) throws Exception {
        checkAge(25);
    }
    }

