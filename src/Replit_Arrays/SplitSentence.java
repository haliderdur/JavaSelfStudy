package Replit_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] words = sentence.split(" ");

        for (String each : words) {
            System.out.println(each);
        }

        input.close();
    }
}
