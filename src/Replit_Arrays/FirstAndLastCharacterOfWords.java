package Replit_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastCharacterOfWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};


        for (String each : words) {
            each = "" + each.charAt(0) + each.charAt(each.length() - 1);
            System.out.println(each);
        }

        input.close();


    }
}
