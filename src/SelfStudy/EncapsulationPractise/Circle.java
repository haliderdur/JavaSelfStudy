package SelfStudy.EncapsulationPractise;

/*
Create a class named Circle
    private variables: radius
    public variable: pi
    Encapsulate all the private fields
    1. radius of the circle can not be zero or negative
    Add a constructor that can set the radius of circle when circle object is created

    Methods:
        calcArea()
        calcPerimeter()
        toString()
 */
public class Circle {

    private double radius;
    public static double PI;

    public Circle(double radius) { // constructor
        setRadius(radius);
    }

    static {
        PI = 3.14;
    }

    public double getRadius() { // getter
        return radius;
    }

    public void setRadius(double radius) { // setter
        if (radius <= 0) {
            return;
        }
        this.radius = radius;
    }

    public double calcArea() {
        return PI * (radius * radius);
    }

    public double calcPerimeter() {
        return 2 * radius * PI;
    }

    public String toString() {
        return "Circle{" +
                "radius= " + radius +
                ", Area= " + calcArea() +
                ", Perimeter= " + calcPerimeter() +
                '}';
    }

}
