package Replit.Replit_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AppendPositiveSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));

    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list) {

        list.removeIf(p -> p <= 0);
        int sum = 0;
        for (Integer each : list) {
            sum += each;
        }
        list.add(sum);

        return list;
    }
}
