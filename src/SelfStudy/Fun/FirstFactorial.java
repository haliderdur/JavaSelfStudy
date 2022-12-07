package SelfStudy.Fun;

import java.util.Scanner;

public class FirstFactorial {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print(FirstFactorial(s.nextInt()));
    }

    public static int FirstFactorial(int num) {

        for (int i = num; i > 1; i--) {
            num *= i-1;
        }

        return num;
    }


}
