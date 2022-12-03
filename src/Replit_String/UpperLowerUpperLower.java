package Replit_String;

import java.util.Scanner;

public class UpperLowerUpperLower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        String result = "";

        for (int i = 0; i <= word.length() - 1; i++) {

            String a = ("" + word.charAt(i)).toLowerCase();

            if (i % 2 == 0) {
                result += a.toUpperCase();
            } else {
                result += a;
            }
        }

    }
}

