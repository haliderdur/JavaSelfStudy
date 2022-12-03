package SelfStudy.VoidMethod_Parameters;

import java.util.Scanner;

/*
Task1: create a method that can calculate the area of a circle
 */
public class CircleArea {
    public static void main(String[] args) {
        circleArea(10);
        System.out.println();
        AreaOfCircle();
    }

    public static double circleArea(int radius) {

        double pi = 3.14;
        double result = pi * (radius * radius);
        System.out.println(result);

        return result;
    }


    public static void AreaOfCircle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius = input.nextInt();

        double pi = 3.14;
        double result = pi * (radius * radius);
        System.out.println("Area is: " + result);
        input.close();
    }
}
