package Replit.Replit_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Fuel {
    public static int refuels(ArrayList<Integer> deliveries, int gasTank) {

        int totalDelivery = 0;

        for (Integer each : deliveries) {
            totalDelivery += each;
        }
        if (totalDelivery % gasTank != 0) {
            return (totalDelivery / gasTank) + 1;
        } else {
            return totalDelivery / gasTank;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int fuel = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(refuels(list, fuel));

    }
}

