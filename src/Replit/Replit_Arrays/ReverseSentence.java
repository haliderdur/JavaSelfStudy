package Replit.Replit_Arrays;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        String[] words = sentence.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
        }
        sentence = reversed.trim();
        System.out.println(sentence);

        input.close();
    }
}
