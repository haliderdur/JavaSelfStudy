package Replit_Loop;

import java.util.Scanner;

public class CountHi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int count = 0;

        for (int i = 0; i <= str.length() - 2; i++) {
            String eachHi = str.substring(i, i + 2);
            if (eachHi.equals("hi")) {
                count++;
            }
        }
        System.out.println(count);
        scan.close();
    }
}
