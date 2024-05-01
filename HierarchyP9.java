class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Triangle extends Shape {
    
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}

public class HierarchyP9 {
    public static void main(String[] args) 
    {
        System.out.println("Name :- Vadariya Shrey M.");
        System.out.println("Er. No.:- 220130318054");
        Shape shape = new Shape();
        shape.draw();

        Circle circle = new Circle();
        circle.draw();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        Triangle triangle = new Triangle();
        triangle.draw();
    }
}