package Replit.Replit_String;

import java.util.Scanner;

public class BurgerOrChicken {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String order = s.next();

        if (order.equalsIgnoreCase("chicken")) {
            System.out.println("Your total is $9.75");
        } else if (order.equalsIgnoreCase("burger")) {
            System.out.println("Your total is $12.50");
        }
    }
}
