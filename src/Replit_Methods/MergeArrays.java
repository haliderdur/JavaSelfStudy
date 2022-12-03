package Replit_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {
    public static int[] merge(int[] a, int[] b) {

        int length = a.length + b.length;
        int[] newArr = new int[length];

        for (int i = 0; i < newArr.length; i++) {
            if (i < a.length) {
                newArr[i] = a[i];
            } else {
                newArr[i] = b[i - a.length];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[in.nextInt()];
        int[] nums2 = new int[in.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(merge(nums, nums2)));
    }
}
