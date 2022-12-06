package Replit.Replit_String;

import java.util.Scanner;

public class Middle_Characters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String middleCharOdd = " " + word.charAt(word.length() / 2);
        String middleCharEven = " " + word.charAt((word.length()-1) / 2) + middleCharOdd.trim();

        if (!(word.length() % 2 == 0)) {
            System.out.println(middleCharOdd.trim());
        } else {
            System.out.println(middleCharEven.trim());
        }

    }
}
