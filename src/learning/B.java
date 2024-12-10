package learning;

public class B extends A {
    public static void main(String[] args) {
        B b = new B();
        b.a();
    }
    @Override
    void abc() {
        System.out.println("Abstract method");
    }
}
