package SelfStudy.Fun.GroupStudy;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {


        int num = 5;

        for (int i = num - 1; i > 1; i--) {
            num *= i;
        }
        System.out.println(num);

    }
}
