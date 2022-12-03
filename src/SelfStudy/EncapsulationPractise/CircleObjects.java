package SelfStudy.EncapsulationPractise;

public class CircleObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(4);
        System.out.println("PI value: " + Circle.PI);
        System.out.println("circle1: " + circle1);

        circle1.setRadius(10);
        System.out.println("New Radius: " + circle1.getRadius());
        System.out.println("New Area: " + circle1.calcArea());
        System.out.println("New Perimeter: " + circle1.calcPerimeter());

        System.out.println("----------------------------------------------------");

        Circle circle2 = new Circle(2);
        System.out.println("PI value: " + Circle.PI);
        System.out.println("circle2: " + circle2);

        circle2.setRadius(6);
        System.out.println("New Radius: " + circle2.getRadius());
        System.out.println("New Area: " + circle2.calcArea());
        System.out.println("New Perimeter: " + circle2.calcPerimeter());


    }
}
