package SelfStudy.Fun.GroupStudy;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {


        int[] arr = {-1, 5, 2, 7, 3};

        for (int i = 0; i < arr.length; i++) {
            int temp = 0;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
