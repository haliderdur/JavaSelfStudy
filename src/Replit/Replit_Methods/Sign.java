package Replit.Replit_Methods;

import java.util.Scanner;

public class Sign {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        sign(n);
        in.close();
    }

    public static void sign(int n) {
        if (n == 0) {
            System.out.println("zero");
        } else if (n > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }


}
