package Replit.Replit_Statements;

import java.util.Scanner;

/*
sing `if statements` and `Scanner` write a program that will read three number inputs.
Then using those number determine which number is the middle number.
        Hint:
        1. Create an object of Scanner class.
        2. Declare int 3 variables
        3. Use Scanner to assign numbers from console into the variables
        4. Use if statements to find the middle number

Follow the exact flow from the examples below.
            Ex:
                Enter first number:
                14
            Enter second number:
                52
            Enter third number:
                25

            middle number is: 25
 */
public class FindMiddleNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();
        System.out.println("Enter third number:");
        int num3 = input.nextInt();

        String result = "";
        boolean isNum1Middle = num1 > num2 && num1 < num3 || num1 > num3 && num1 < num2;
        boolean isNum2Middle = num2 > num1 && num2 < num3 || num2 > num3 && num2 < num1;
        boolean isNum3Middle = num3 > num1 && num3 < num2 || num3 < num1 && num3 > num2;

        if (isNum1Middle) {
            result = "middle number is: " + num1;
        } else if (isNum2Middle) {
            result = "middle number is: " + num2;
        } else if (isNum3Middle) {
            result = "middle number is: " + num3;
        }
        System.out.println(result);

        input.close();
    }
}
