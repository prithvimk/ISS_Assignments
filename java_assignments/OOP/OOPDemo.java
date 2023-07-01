package OOP;
// Abstraction: Shape interface
interface Shape {
    double calculateArea(); // Abstract method
    double calculatePerimeter(); // Abstract method
}

// Encapsulation: Rectangle class
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method Overriding: Implementing Shape interface methods
    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Getter and Setter for encapsulated attributes
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

// Inheritance: Square class extending Rectangle
class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

// Method Overloading: Calculator class
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class OOPDemo {
    public static void main(String[] args) {
        // Inheritance and Method Overriding: Rectangle
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        // Inheritance and Method Overriding: Square
        Square square = new Square(4);
        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Square Perimeter: " + square.calculatePerimeter());

        // Method Overloading: Calculator
        Calculator calculator = new Calculator();
        System.out.println("Addition (int): " + calculator.add(5, 3));
        System.out.println("Addition (double): " + calculator.add(5.5, 3.7));
    }
}
