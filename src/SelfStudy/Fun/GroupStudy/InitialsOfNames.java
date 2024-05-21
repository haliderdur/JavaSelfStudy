package SelfStudy.Fun.GroupStudy;

import java.util.Arrays;

public class InitialsOfNames {

    public static void main(String[] args) {

        String[] names = {"Sezen Aksu", "Brad Pitt", "Tarkan Tevetoglu",
                "Cristiano Ronaldo 7", "Lionel Messi", "Lady Gaga"};

        String[] result = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            String str = "";

            String[] arr1 = names[i].split(" ");

            for (String each : arr1) {

                str += "" + each.charAt(0);
            }
            result[i] = str;
        }
        System.out.println(Arrays.toString(result));
    }
}

