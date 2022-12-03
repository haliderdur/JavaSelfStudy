package Replit_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondElements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();  // 5
        int[] nums = new int[size];  // [1, 2, 3, 4, 5]
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }

        int secElement = nums[1];
        int lastSecElement = nums[nums.length - 2];

        System.out.println("Second Element: " + secElement);
        System.out.println("Second to Last Element: " + lastSecElement);

        scan.close();
    }
}
