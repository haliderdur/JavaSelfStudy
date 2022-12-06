package Replit.Replit_Methods;

import java.util.Scanner;

public class WordCount {

    public static int wordCount(String words) {

        int count = 1;
        /*
        int count = 0;
           String []length1 = words.split(" ");

        for (int i = 0; i < length1.length; i++){
            if(!length1[i].equals("")) {
                counter++;
            }
        }
      return count;
         */

        while (words.contains(" ")) {
            words = words.replaceFirst(" ", "").trim();
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }
}
