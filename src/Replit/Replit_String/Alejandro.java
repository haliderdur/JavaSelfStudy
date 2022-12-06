package Replit.Replit_String;

import java.util.Scanner;

public class Alejandro {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String email = s.nextLine();

        if (email.contains("Alejandro") || email.contains("alejandro")) {
            if (email.contains("project")) {
                System.out.println("priority") ;
            } else {
                System.out.println("read");
            }
        } else {
            System.out.println("don't read");
        }
        s.close();

    }
}
