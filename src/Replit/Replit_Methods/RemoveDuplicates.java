package Replit.Replit_Methods;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }

    public static String uniqueChars(String str) { // mama
        String newStr = "";                        // ma

        for (int i = 0; i < str.length(); i++) { // ma
            if (!(newStr.contains("" + str.charAt(i)))) {
                newStr += str.charAt(i);
            }
        }
        return newStr;

    }
}
