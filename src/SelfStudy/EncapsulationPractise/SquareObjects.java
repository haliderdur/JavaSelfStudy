package SelfStudy.EncapsulationPractise;

public class SquareObjects {
    public static void main(String[] args) {

        Square square1 = new Square(5);
        System.out.println("square1 side = " + square1.getSide());
        System.out.println("square1 = " + square1);

        square1.setSide(10);
        System.out.println("square1 NEW side = " + square1.getSide());
        System.out.println("square1 = " + square1);


    }
}
