package SelfStudy.Fun.GroupStudy;

public class LongestWord {

    public static void main(String[] args) {

        String str = "Java is a programming language";

        String[] arr = str.split(" ");

        // Longest Word
        int maxLength = Integer.MIN_VALUE;
        String longestWord = "";
        for (String each : arr) {
            if (each.length()>maxLength) {
                longestWord = each;
                maxLength = each.length();
            }
        }
        System.out.println(longestWord);


        // Shortest Word
        int minLength = Integer.MAX_VALUE;
        String shortestWord = "";

        for (String each : arr) {
            if (each.length() < minLength) {
                shortestWord = each;
                minLength = each.length();
            }
        }
        System.out.println(shortestWord);
    }

}
