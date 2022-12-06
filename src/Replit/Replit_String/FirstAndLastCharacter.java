package Replit.Replit_String;
/*
  Use `String methods` to find the first and last character of the given `word`.
  The value of the `word` will be input from a Scanner, but you only need to interact with the String variable.

  Output in the following format:
        > first letter: $first character of the word
        > last letter: $last character of the word

            Ex:
              Input:
                adobe

              Output:
                first letter: a
                last letter: e
 */

import java.util.Scanner;

public class FirstAndLastCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.println(word.substring(0,1) + word.substring(word.length()-1));

        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(word.length() - 1);

        System.out.println("first letter: " + firstLetter);
        System.out.println("last letter: " + lastLetter);

        scan.close();
    }
}
