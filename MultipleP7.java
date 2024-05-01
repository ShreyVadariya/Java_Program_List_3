interface Animal {
    void eat();
    void sleep();
}

interface Flying {
    void fly();
}

// Class implementing Animal and Flying interfaces
class Bird implements Animal, Flying {
    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Bird is sleeping");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}

public class MultipleP7 {
    public static void main(String[] args) {
        System.out.println("Name :- Vadariya Shrey M.");
        System.out.println("Er. No.:- 220130318054");
        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}