package Replit.Replit_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TimesTwo {
    public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums) {
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : nums) {
            result.add(each * 2);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }
        System.out.println(timesTwo(list));
    }


}
