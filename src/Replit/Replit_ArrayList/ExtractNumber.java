package Replit.Replit_ArrayList;

import java.util.Scanner;

public class ExtractNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(extractNum(in.next()));
    }

    public static String extractNum(String s) {

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                result += ch;
            }
        }
        return result;

    }
}
