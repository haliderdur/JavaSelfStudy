package Replit.Replit_Loop;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        //DO NOT TOUCH THESE LINES
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        //WRITE YOUR CODE HERE:

        int result = n;

        for (int i = n; i >= 1; i--) {  // 5 4 3 2 1
            result = result * i;  // 5*5, 5*4, 5*3, 5*2, 5*1
            //  25,   25*4,   (25*4)*3,   ((25*4)*3)*2,   (((25*4)*3))*2
        }
        System.out.println(result / n);  // loop runs total n times. so (/n) divide n

    }
}

