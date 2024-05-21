package SelfStudy.Fun.GroupStudy;

import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args) {

        int n = 10;
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {

            if (i < 2) {
                array[i] = 1;
            } else {
                array[i] = array[i - 1] + array[i - 2];
            }
        }
        System.out.println(Arrays.toString(array));


    }

}
