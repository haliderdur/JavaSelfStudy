package SelfStudy.CustomMethods_ReturnPractise;

import java.util.Arrays;

/*
create a method named isAnagram that passes two String parameters,
the method returns true if the given two strings are anagram,
otherwise returns false
Ex:
        str1 = "cba"
        str2 = "bac";
        isAnagram(str1, str2) ====> true
 */
public class Anagram {
    public static void main(String[] args) {
        isAnagram("acrcear", "cracera");
    }

    public static boolean isAnagram(String str1, String str2) {

        char[] ch1 = str1.toCharArray(); // c,a,b
        char[] ch2 = str2.toCharArray(); // b,c,a
        Arrays.sort(ch1); // a,b,c
        Arrays.sort(ch2); // a,b,c

        boolean result = Arrays.equals(ch1, ch2);
        System.out.println(result);

        return result;
    }
}
