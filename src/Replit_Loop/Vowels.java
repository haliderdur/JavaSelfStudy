package Replit_Loop;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print(ch);
            }
            input.close();
        }
    }
}
