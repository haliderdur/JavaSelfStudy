package Replit_Methods;

import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array!!!");
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);

        scan.close();
    }

    public static void printUniqueNumbers(int[] nums) {

        for (int each : nums) {
            int frequency = 0;

            for (int element : nums) {
                if (each == element) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                System.out.println(each);
            }
        }

    }
}
