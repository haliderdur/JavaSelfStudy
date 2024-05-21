package SelfStudy.Fun.GroupStudy;

import java.util.ArrayList;

public class HIghestFrequencyOfArrayElement {


    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 5, 6, 6, 6, 6, 6};

        int maxFreq = 0;
        int maxFreqElement = 0;

        ArrayList<Integer> list = new ArrayList<>();

// this nested loop is for finding highestFreq element and its freq
        for (int each : arr) {
            int count = 0;
            for (int num : arr) {
                if (each == num)
                    count++;
            }
            if (count > maxFreq) {
                maxFreq = count;
                maxFreqElement = each;
            }
        }
// this loop is for finding freq of all elements and comparing them with highestFreq
        for (int each : arr) {
            int count = 0;
            for (int num : arr) {
                if (each == num)
                    count++;
            }

            if (count == maxFreq && !list.contains(each))
                list.add(each);
        }

        System.out.println(list);
    }
}
