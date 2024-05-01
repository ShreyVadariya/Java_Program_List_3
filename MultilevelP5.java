class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    
    void sound() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {
    
    void sound() {
        System.out.println("Puppy yelps");
    }
}

public class MultilevelP5 {
    public static void main(String[] args) {
        System.out.println("Name :- Vadariya Shrey M.");
        System.out.println("Er. No.:- 220130318054");
        Animal animal = new Animal();
        animal.sound();

        Dog dog = new Dog();
        dog.sound();

        Puppy puppy = new Puppy();
        puppy.sound();
    }
}