public class Animal {
    String name;
    String family;
    int numberOfLegs;
    public void sound(){
        System.out.println("Makes a sound");
    }
    public void run(){
        System.out.println("run");
    }

    public Animal(String name, String family, int numberOfLegs) {
        this.name = name;
        this.family = family;
        this.numberOfLegs = numberOfLegs;
    }
}
