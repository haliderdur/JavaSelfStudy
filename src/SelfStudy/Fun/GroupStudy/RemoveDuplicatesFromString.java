package SelfStudy.Fun.GroupStudy;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {

    public static void main(String[] args) {

        String str = "aaaaaaaaaaaaaaaabcaadddddbeeeef";

        String[] arr = str.split("");

        String result = "";

        for (String each : arr) {
            if (!result.contains(each)) {
                result += each;
            }
        }
        System.out.println(result);


        String str2 = "aaaaaaaaaaaaaaaabcaadddddbeeeef";

        Set<String> set = new HashSet<>();

        for (int i = 0; i < str2.length(); i++) {
            set.add("" + str2.charAt(i));
        }
        System.out.println(set);

    }
}
