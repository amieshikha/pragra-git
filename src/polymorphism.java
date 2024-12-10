class Polymorphism {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Polymorphism {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Polymorphism {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class Main {
    public static void main(String[] args) {
        Polymorphism myDog = new Polymorphism();
        Polymorphism myPig = new Pig();
        Dog myAnimal = new Dog();

        System.out.println("Sounds:" );
    myAnimal.animalSound(); myDog.animalSound(); myPig.animalSound();
    }
}
