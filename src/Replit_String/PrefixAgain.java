package Replit_String;

import java.util.Scanner;

public class PrefixAgain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        String ch = " " + str.charAt(0 + n);
        ch = ch.trim();
        String strSub = str.substring(0, n);

        for (int i = 0; i < str.length(); i++) {
            str = str.replaceFirst(strSub, "");
            if (str.contains(strSub)) {
                System.out.println(true);
                break;
            } else {
                System.out.println(false);
                break;
            }
        }

    }
}
