package SelfStudy.VoidMethod_Parameters;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        calculator();
    }

    public static void calculator() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter your second number: ");
        double num2 = scan.nextDouble();
        System.out.println("Enter the math operator: ");
        String mathOperator = scan.next();

        double result = 0;

        if (!(mathOperator.equals("+")||mathOperator.equals("-")||mathOperator.equals("*")||mathOperator.equals("/"))){
            System.out.println("invalid operator");
        }
        if (mathOperator.equals("+")) {
            result = num1 + num2;
        }
        if (mathOperator.equals("-")) {
            result = num1 - num2;
        }
        if (mathOperator.equals("*")) {
            result = num1 * num2;
        }
        if (mathOperator.equals("/")) {
            result = num1 / num2;
        }
        System.out.println("result: " + result);


    }
}
