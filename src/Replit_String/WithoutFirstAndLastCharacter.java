package Replit_String;

import java.util.Scanner;

public class WithoutFirstAndLastCharacter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String firstChar = word.substring(1);
        String lastChar = word.substring(0, word.length() - 1);

        System.out.println("Without first letter: " + firstChar);
        System.out.println("Without last letter: " + lastChar);


    }
}
