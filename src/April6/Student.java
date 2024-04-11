package April6;

public class Student {
    int id;
    String name;

    public Student() {
        System.out.println("Inside the default constructor");
    }

    public Student(int id) {

        this();
        System.out.println("Inside the id parameter constructor");
        this.id = id;
    }

    public Student(int id, String name) {
      this(101);
        System.out.println("Inside id, name parameter constructor");
      this.id = id;
        this.name = name;
    }

    public void printStundent(int id, String name) {

        System.out.println(id);
        System.out.println(name);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.printStundent(10, "Shikha");
    }
}
