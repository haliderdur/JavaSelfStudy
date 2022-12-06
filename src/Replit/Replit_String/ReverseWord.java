package Replit.Replit_String;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int a = word.length();
        String result ="";

        if (a < 5) {
            result = ("Too short!");
        } else if (a > 5) {
            result = ("Too long!");
        } else {
            result += word.charAt(4);
            result += word.charAt(3);
            result += word.charAt(2);
            result += word.charAt(1);
            result += word.charAt(0);
        }
        System.out.println(result);

    }
}
