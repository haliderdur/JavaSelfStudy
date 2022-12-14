package SelfStudy.Fun;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveArrayIndex {

    public static void main(String[] args) {

        int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        ArrayList<Integer> list = new ArrayList<>();

        int[] result = new int[arr1.length - 1];

        for (int i = 0; i < arr1.length; i++) {
            list.add(arr1[i]);
        }

        list.remove(1);

        for (int j = 0; j < list.size(); j++) {
            result[j] = list.get(j);
        }

        System.out.println("Original numbers: " + Arrays.toString(arr1));
        System.out.println("Without index 1 : " + Arrays.toString(result));
    }

}
