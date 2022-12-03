package Replit_Loop;

import java.util.Scanner;

public class EachLetter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            System.out.println(ch);
        }
        input.close();
    }
}
