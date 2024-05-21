package SelfStudy.Fun.GroupStudy;

import com.sun.source.doctree.SeeTree;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {


        String str1 = "listen";
        String str2 = "silent";

        char[] chars1 = str1.toCharArray();
        Arrays.sort(chars1);

        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars2);

        if (Arrays.equals(chars1, chars2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }


}
