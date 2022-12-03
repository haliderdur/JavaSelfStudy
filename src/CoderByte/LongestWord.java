package CoderByte;


public class LongestWord {
    public static String LongestWord(String sen) {

        int max = 0;
        String longest = "";

        for (int i = 0; i < sen.length(); i++) {
            char ch = sen.charAt(i);
            if (Character.isLetter(ch) || Character.isSpaceChar(ch)) {
                longest += ch;
            }
        }
        String[] arr = longest.split(" ");

        for (String each : arr) {
            if (each.length() > max) {
                max = each.length();
                longest = each;
            }
        }
        return longest;
    }
}


