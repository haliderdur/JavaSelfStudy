package Replit.Replit_String;

import java.util.Scanner;

public class HasJava {
    public static void main(String[] args) {

        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int a = word.indexOf("j");

        if (a == 1 || a == 0) {
            System.out.println(!exists);
        } else {
            System.out.println(exists);
        }

        scan.close();
    }

}

