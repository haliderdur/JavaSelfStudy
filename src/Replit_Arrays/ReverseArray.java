package Replit_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();
        }

        String temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        temp = arr[1];
        arr[1] = arr[arr.length - 2];
        arr[arr.length - 2] = temp;

        System.out.println(Arrays.toString(arr));

        input.close();

    }
}
