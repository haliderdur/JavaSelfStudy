package Replit_Loop;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String answer = "";
        System.out.println("Please enter the guest's name:");
        String name = input.next();
        System.out.println("Do you want to enter another guest's name?");
        answer = input.next().toLowerCase();
        while (true) {
            if (!(answer.equals("yes"))) {
                System.out.println("Guests' list: " + name);
                System.exit(0);
            }
            if (answer.equals("yes")) {
                System.out.println("Please enter the guest's name:");
                name += ", " + input.next();
                System.out.println("Do you want to enter another guest's name?");
                answer = input.next().toLowerCase();
            } else {
                name += ", " + input.next();
                System.out.println("Guests' list: " + name);
                System.exit(0);
            }
        }
    }
}



