package SelfStudy.Fun;

// isPal("anna")   -> true
// isPal("civic")  -> true
// isPal("apple")  -> false
// isPal("level")  -> true

public class isPalindrome {

    public static boolean isPalindrome(String str) {

        boolean result = false;

        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        if (str.equalsIgnoreCase(reversed.toString())) {
            result = true;
        }

        System.out.println(result);
        return result;

    }

    public static void main(String[] args) {
        isPalindrome("anna");
        isPalindrome("civic");
        isPalindrome("apple");
        isPalindrome("level");

    }
}
