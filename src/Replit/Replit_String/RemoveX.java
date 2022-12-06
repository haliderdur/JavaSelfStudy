package Replit.Replit_String;

import java.util.Scanner;

public class RemoveX {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.startsWith("x") || word.startsWith("X")) {
            word = word.substring(1);
        }
        if (word.endsWith("x") || word.endsWith("X")) {
            word = word.substring(0, word.length() - 1);

        }
        System.out.println(word);
    scan.close();
    }
}



/*
        if (word.startsWith("x") && word.endsWith("x")) {

            System.out.println(word1 + word1.charAt(word1.lastIndexOf(word1)));

        } else {

            System.out.println(word1);

        }
*/


        /*
                int totalChar = word.length();
        char lastChar = word.charAt(word.length()-1);

        if (word.startsWith("x") && word.endsWith("x")){
            System.out.println(word.substring(word.charAt(2),word.charAt(word.length()-1)));
        }else {
            System.out.println(word);
        }
         */



