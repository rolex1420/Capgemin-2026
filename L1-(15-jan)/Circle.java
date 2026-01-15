class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void displayResult() {
        System.out.println(calculateArea());
        System.out.println(calculateCircumference());
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        circle.displayResult();
    }
}
