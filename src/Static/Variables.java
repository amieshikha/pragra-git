package Static;
public class Variables {
    static int count = 0; // Static variable

    Variables() {
        count++;
    }

    public static void main(String[] args) {
        Variables c1 = new Variables();
        Variables c2 = new Variables();
        Variables c3 = new Variables();
        System.out.println("Total objects created: " + Variables.count); // Output: 3
    }
}
