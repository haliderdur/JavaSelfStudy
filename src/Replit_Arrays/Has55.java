package Replit_Arrays;

import java.util.Scanner;

public class Has55 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        boolean has55 = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 5) {
                if (nums[i + 1] == 5) {
                    has55 = true;
                }
            }
        }
        System.out.println(has55);
        input.close();
    }
}
