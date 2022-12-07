package SelfStudy.Fun;

// revArr({1, 2, 3, 4, 5}) -> {5, 4, 3, 2, 1}
// revArr({1})             -> {1}
// revArr({1, 2, 3})       -> {3, 2, 1}

import java.util.Arrays;

public class ArrayReverse {

    public static void revArr(int[] nums) {

        int[] result = new int[nums.length];
        int j = 0; // index of result array

        for (int i = nums.length - 1; i >= 0; i--) {
            result[j] = nums[i];
            j++; // increase result array index
        }

        System.out.println(Arrays.toString(result));

    }

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));

        revArr(array);


    }

}
