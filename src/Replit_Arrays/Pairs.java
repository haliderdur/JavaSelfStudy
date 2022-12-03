package Replit_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = input.nextLine();
        }

        String couple = "";

        for (int i = 0; i < arr.length - 1; i++) {  // length: 8
            couple = arr[i] + ", " + arr[i + 1];
            System.out.println(couple);
        }

        input.close();

    }
}
