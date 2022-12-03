package Replit_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Nanuk {
    public static boolean hunt(ArrayList<String> result, int wayStones, int boast) {

        ArrayList<Integer> huntings = new ArrayList<>(result.size());
        int totalHunt = 0;

        for (String eachHunt : result) {
            if (eachHunt.equals("nanuk")) {
                continue;
            }
            int a = Integer.parseInt(eachHunt);
            if (a >= 0) {
                huntings.add(a);
            }
        }

        for (Integer eachHunting : huntings) {
            totalHunt += eachHunting;
        }

        int nanukCount = 0;
        for (String eachNanuk : result) {
            if (eachNanuk.equals("nanuk")) {
                nanukCount++;
            }
        }

        if (nanukCount > wayStones || totalHunt < boast) {
            return false;
        } else {
            return true;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int stones = in.nextInt();
        int boast = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(hunt(list, stones, boast));

    }
}
