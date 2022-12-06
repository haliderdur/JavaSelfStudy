package Replit.Replit_String;

import java.util.Scanner;

/*
    Use `String methods` to change the given `word` to all uppercase characters and all lowercase characters.
    The value of `word` will be input from a Scanner, but you only need to interact with the String variable.

    Output in the following format:
            > word: $given word
            > uppercase: $given word as all uppercase
            > lowercase: $given word as all lowercase

                        Ex:
                          Input:
                                 jAVa

                          Output:
                            word: jAVa
                            uppercase: JAVA
                            lowercase: java
 */
public class CaseSensitivity {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();


        String upperCase = word.toUpperCase();
        String lowerCase = word.toLowerCase();

        System.out.println("word: " + word);
        System.out.println("uppercase: " + upperCase);
        System.out.println("lowercase: " + lowerCase);

        s.close();
    }
}
