package Replit_String;

import java.util.Scanner;

/*
ex:
    input:
        Java
    output:
        Length is: 4
 */

public class FindTheLength {
    public static void main(String[] args) {

        //DO NOT TOUCH BELOW
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.next();

        // WRITE YOUR CODE BELOW

        int n1 = word.length();
        System.out.println("Length is: " + n1);

        input.close();
    }
}
