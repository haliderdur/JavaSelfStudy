package Replit_Arrays;

import java.util.Scanner;

public class EachChar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str) { // aaa bb cccc

        String result = "";

        for (int j = 0; j < str.length(); j++) {
            int count = 0;
            char ch = str.charAt(j);

            for (int i = 0; i < str.length(); i++) {

                char each = str.charAt(i);

                if (ch == each) {
                    count++;
                }
            }
            if (result.contains("" + ch)) {
                continue;
            }
            result += count;
            result += ch;
        }

        return result;
    }
}
