package Replit_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class CountDuplicateElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strs = new String[in.nextInt()];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));
    }

    public static int getDup(String[] arr) {

        int result = 0;

        for (int i = 0; i < arr.length; i++) {               //  [ 1 , 1 , 1 , 2 , 3 , 3 , 4]
            int count = 0;                                  //     3
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }
            if (count > 1) {
                result++;  // 1
            }
        }
        return result;
    }

}
