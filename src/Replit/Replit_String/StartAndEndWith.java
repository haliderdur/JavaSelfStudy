package Replit.Replit_String;

import java.util.Scanner;

/*
Use `String methods` to check if the given `word` starts with the letter `a` and ends with the letter `e`.
Print two boolean values to represent each:
            > Starts with a: $boolean
            > Ends with e: $boolean
                    Ex:
                      Input:
                        apple

                      Output:
                        Starts with a: true
                        Ends with e: true
 */
public class StartAndEndWith {
    public static void main(String[] args) {

        //DO NOT TOUCH BELOW
        Scanner s = new Scanner(System.in);
        String word = s.next();

        //WRITE YOUR CODE BELOW
        boolean isStartsWith_a = word.startsWith("a");
        boolean isEndsWith_e = word.endsWith("e");

        System.out.println("Starts with a: " + isStartsWith_a);
        System.out.println("Ends with e: " + isEndsWith_e);

        s.close();

    }


}



