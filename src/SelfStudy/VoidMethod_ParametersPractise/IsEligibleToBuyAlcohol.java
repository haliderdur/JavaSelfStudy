package SelfStudy.VoidMethod_ParametersPractise;

import java.util.Scanner;

/*
Task1: create a method that can check if a person is eligible to buy alcohol
 */
public class IsEligibleToBuyAlcohol {
    public static void main(String[] args) {
        isEligible();
    }

    public static void isEligible() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();

        if (age >= 18) {
            System.out.println("Eligible to buy alcohol");
        } else {
            System.out.println("Not eligible to buy alcohol");
        }
        scan.close();
    }


}
