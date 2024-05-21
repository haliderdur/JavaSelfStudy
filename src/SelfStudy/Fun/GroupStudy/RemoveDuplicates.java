package SelfStudy.Fun.GroupStudy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {6, 7, 3, 3, 3, 2, 2, 8, 3, 4, 1, 6, 2, 3, 6, 8};
        ArrayList<Object> result = new ArrayList<>();

        for (int each : arr) {
            if (!(result.contains(each))) {
                result.add(each);
            }
        }
        System.out.println(result);


        int[] arr2 = {6, 7, 3, 3, 3, 2, 2, 8, 3, 4, 1, 6, 2, 3, 6, 8};
        Integer[] arr3 = new Integer[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            arr3[i] = arr2[i];
        }
        Set<Integer> setResult = new HashSet<>(Arrays.asList(arr3));
        System.out.println(setResult);



        int[] arr4 = {6, 7, 3, 3, 3, 2, 2, 8, 3, 4, 1, 6, 2, 3, 6, 8};
        Set<Integer> set2 = new HashSet<>();
        for (int each : arr4) {
            set2.add(each);
        }
        System.out.println(set2);
    }
}

