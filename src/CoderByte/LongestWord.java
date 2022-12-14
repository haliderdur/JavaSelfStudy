package CoderByte;


import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter words separated by space:");
        System.out.println(LongestWord(scan.nextLine()));
    }

    public static String LongestWord(String str) {

        int max = 0;
        String longest = "";

        String[] arr = str.split(" ");

        for (String each : arr) {
            if (each.length() > max) {
                max = each.length();
                longest = each;
            }
        }
        return longest;
    }
}


