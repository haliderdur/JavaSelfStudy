package SelfStudy.VoidMethod_Parameters;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        factorial();
    }

    public static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();

        int factorial = 1;

        while (number > 0) {
            factorial *= number;
            number--;
        }
        System.out.println("Factorial is: " + factorial);

        input.close();
    }

/*
        public static void factorial(int num){
        int result = 1;
        for (int i = 1 ; i <= num ; i++ ){
            for (int j = num ; j > 0 ; j--){
                result = result * num;
                num--;
            }
        }
        System.out.println(result);
    }
*/
}
