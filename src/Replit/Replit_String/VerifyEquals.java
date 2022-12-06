package Replit.Replit_String;

import java.util.Scanner;

/*
            Ex:
              Input:
                    java
                    jaVA

              Output:
                     false

            Ex:
              Input:
                    Java
                    Java

              Output:
                    true
 */
public class VerifyEquals {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner s = new Scanner(System.in);
        String word1 = s.next();
        String word2 = s.next();

        //WRITE YOUR CODE BELOW

        boolean isEqual = word1.equals(word2);
        /*
        to prevent case sensitivity
        boolean isEqual = word1.toLowerCase().equals(word2.toLowerCase());
        */
        System.out.println(isEqual);

    }
}
