package Replit_String;

import java.util.Scanner;

public class MergeWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        int a = word1.length();
        int b = word2.length();
        String z = "" + word1.charAt(0) + word2.charAt(0);
        String x = "" + word1.charAt(1) + word2.charAt(1);
        String c = "" + word1.charAt(2) + word2.charAt(2);


        if (a == 3 && b == 3) {
            System.out.println(z + x + c);
        } else {
            System.out.println("cannot merge");
        }
        scan.close();

    }
}
