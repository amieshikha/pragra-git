public class AnimalMain {
    public static void main(String[] args) {

        Animal animal= new Animal("Dog","Animal",4);
        System.out.println("Name of animal: " +animal.name);
        System.out.println("Family of animal: " +animal.family);
        System.out.println("Number of legs: " +animal.numberOfLegs);
        animal.sound();
        animal.run();
    }
}
