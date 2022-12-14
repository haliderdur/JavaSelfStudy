package SelfStudy.Fun;

import java.util.Scanner;

public class StringReverse {

    public static String reverseString(String str) {

        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {

            reversed.append(String.valueOf(str.charAt(i)));
        }

        System.out.println(reversed);
        return reversed.toString();

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Type a word");
        reverseString(input.nextLine());

        input.close();

    }
}
