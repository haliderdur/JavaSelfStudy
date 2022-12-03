package Replit_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PopulateArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        populate(n);
    }

    public static void populate(int number) {

        int[] result = new int[number];

        for (int i = 1; i <= number; i++) {
            result[i-1] += i;
        }

        System.out.println(Arrays.toString(result));


    }
}
