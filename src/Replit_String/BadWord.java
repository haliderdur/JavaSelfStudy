package Replit_String;
/*
Use `String methods` to take the given `str`, which has a bad word, and change the bad word into something nice. Print the fixed String

        > - Change the bad word `dumb` into `cool`
                    Ex:
                      Input:
                        You are so dumb

                      Output:
                        You are so cool
 */

import java.util.Scanner;

public class BadWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        String word2 = word.replace("dumb", "cool");
        System.out.println(word2);

        scan.close();
    }
}
