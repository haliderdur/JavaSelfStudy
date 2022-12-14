package SelfStudy.Fun;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number for Fibonacci series: ");
        System.out.println(Arrays.toString(fibonacci(scan.nextInt())));

        scan.close();

    }

    public static int[] fibonacci(int index) {

        if (index == 0) {
            System.err.print(index + " is Invalid input");
            System.exit(0);
        } else if (index == 1) {
            System.out.print("Fibonacci series for " + index + " digit: ");
            System.out.println("[0]");
            System.exit(0);
        }

        int[] array = new int[index];
        array[0] = 0;
        array[1] = 1;

        for (int i = 0; i <= array.length - 3; i++) {
            array[i + 2] = array[i] + array[i + 1];
        }
        System.out.print("Fibonacci series for " + index + " digit: ");
        return array;
    }
}
