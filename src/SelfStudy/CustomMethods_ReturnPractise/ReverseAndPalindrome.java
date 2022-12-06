package SelfStudy.CustomMethods_ReturnPractise;

/*
create a method named reverse that passes one string parameter,  the method can return the reversed string
    Ex:
    str = "Java";
    reverse(str) ==> avaJ
 */
public class ReverseAndPalindrome {
    public static void main(String[] args) {
        reversed("Java");
        System.out.println("-----------");
        isPalindrome("Level");
    }

    public static String reversed(String str) {
        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += "" + str.charAt(i);
        }
        System.out.println(reversedStr);
        return reversedStr;
    }

    /*
    By using the reverse method above to create another method named isPalindrome  that passes a String parameter, the method returns true if
    the string is palindrome, otherwise returns false
            Ex:
            str = "Level"
            isPalindrome(str) ===> true
    */
    public static boolean isPalindrome(String str) {

        boolean newStr = true;

        if (str.equalsIgnoreCase(reversed(str))) {
            newStr = true;
        } else {
            newStr = false;
        }
        System.out.println(newStr);
        return newStr;
    }


}
