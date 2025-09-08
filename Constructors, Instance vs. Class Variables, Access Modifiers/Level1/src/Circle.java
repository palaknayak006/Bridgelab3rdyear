public class Circle {
     double radius;

    // Default constructor
    public Circle() {
        this(1.0); // calls parameterized constructor
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void display() {
        System.out.println("Radius: " + radius + ", Area: " + area());
    }
}
