package Replit.Replit_String;

import java.util.Scanner;

public class IndexOfA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();

        int a = word.indexOf("a");
        System.out.println("Index of a: " + a);

        s.close();
    }

}
