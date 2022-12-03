package Replit_Methods;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));
    }

    public static int max(int x, int y) {
        int max = 0;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        return max;
    }
}