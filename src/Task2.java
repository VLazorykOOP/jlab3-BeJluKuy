// Абстрактний базовий клас Figure
abstract class Figure {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    @Override
    public String toString() {
        return "Figure";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        return true;
    }
}

// Клас Rectangle (прямокутник)
class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        Rectangle other = (Rectangle) obj;
        return width == other.width && height == other.height;
    }
}

// Клас Circle (коло)
class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        Circle other = (Circle) obj;
        return radius == other.radius;
    }
}

// Клас Trapezium (трапеція)
class Trapezium extends Figure {
    private double base1;
    private double base2;
    private double height;

    public Trapezium(double base1, double base2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base1 + base2) * height / 2;
    }

    @Override
    public double calculatePerimeter() {
        double side = Math.sqrt(Math.pow((base2 - base1) / 2, 2) + Math.pow(height, 2));
        return base1 + base2 + 2 * side;
    }

    @Override
    public String toString() {
        return "Trapezium";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        Trapezium other = (Trapezium) obj;
        return base1 == other.base1 && base2 == other.base2 && height == other.height;
    }
}

public class Task2 {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Rectangle(4, 5);
        figures[1] = new Circle(3);
        figures[2] = new Trapezium(6, 8, 4);

        for (Figure figure : figures) {
            double area = figure.calculateArea();
            double perimeter = figure.calculatePerimeter();

            System.out.println("Type: " + figure.toString());
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
            System.out.println();
        }
    }
}

