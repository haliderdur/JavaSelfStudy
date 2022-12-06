package Replit.Replit_Methods;

import java.util.Scanner;

public class SimpleRoomBooking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));

        in.close();
    }

    public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {

        boolean result = false;

        if (isAvailable == false) {
            result = false;
        }

        if (isAvailable == true) {
            if (year != 2018) {
                result = false;
            } else if (month == 7 && (day >= 1 || day <= 8)) {
                result = false;
            } else {
                result = true;
            }
        }
        return result;
    }
}

