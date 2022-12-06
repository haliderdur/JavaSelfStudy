package Replit.Replit_Loop;

public class OddAndEven {
    public static void main(String[] args) {


        int num = 0;

        for (int j = 1; j <= 20; j++) {
            if (num % 2 != 0) {
                System.out.print(j + " ");
            }
            num++;
        }
        System.out.println();
        for (int i = 1; i <= 20; i++) {
            if (num % 2 == 0) {
                System.out.print(i + " ");
            }
            num++;
        }

    }
}