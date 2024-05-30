package CodingBat.Warmup1;

public class missingChar {

    /*
        Given a non-empty string and an int n, return a new string where the char at index n has been removed.
        The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

        missingChar("kitten", 1) → "ktten"
        missingChar("kitten", 0) → "itten"
        missingChar("kitten", 4) → "kittn"
     */

    public String missingChar(String str, int n) {

        if (n >= str.length()) {
            System.err.println("'n' can not be longer than given string");
            System.exit(1);
        }
        String front = str.substring(0, n);
        String back = str.substring(n + 1, str.length());
        return front + back;
    }

    public static void main(String[] args) {
        missingChar mc = new missingChar();
        System.out.println(mc.missingChar("Halid", 12));
    }
}
